package ro.ase.acs.cts.lab2;

public class CurrentAccount extends BankAccount{
	
	public static final double MAX_CREDIT = 5000.0;
	
	public CurrentAccount(String id){
		super(id);
		this.balance = CurrentAccount.MAX_CREDIT;
	}

	@Override
	public void Deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void Withdraw(double amount) throws InsufficientFundsException {
		if(amount > this.balance)
			throw new InsufficientFundsException("Too much !");
		this.balance-=amount;
	}

	@Override
	public void Transfer(Account destination, double amount) 
			throws InsufficientFundsException, IllegalTransferException {
		
		if(this == destination)
			throw new IllegalTransferException();
		
		this.Withdraw(amount);
		destination.Deposit(amount);
			
	}
}
