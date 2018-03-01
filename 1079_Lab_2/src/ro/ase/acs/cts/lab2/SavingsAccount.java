package ro.ase.acs.cts.lab2;

public class SavingsAccount extends BankAccount implements Profitable{
	
	public static final double MIN_BALANCE = 100.0;
	
	public SavingsAccount(String id){
		super(id);
		this.balance = MIN_BALANCE;
	}

	@Override
	public void Deposit(double amount) {
		this.balance+=amount;
	}

	@Override
	public void Withdraw(double amount) throws InsufficientFundsException {
		if(this.balance < amount + MIN_BALANCE)
			throw new InsufficientFundsException("You don't have it");
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

	@Override
	public void AddInterest(float interestInPercent) {
		this.balance*=(1+interestInPercent/100.0f);
	}
}
