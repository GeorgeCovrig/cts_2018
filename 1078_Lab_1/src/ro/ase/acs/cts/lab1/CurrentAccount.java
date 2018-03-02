package ro.ase.acs.cts.lab1;

import javax.swing.plaf.InsetsUIResource;

public class CurrentAccount extends BankAccount{
	
	private static final double MAX_CREDIT = 5000.0;
	
	public CurrentAccount(String id){
		super(id);
		this.balance = MAX_CREDIT;
	}

	@Override
	public void Withdraw(double amount) throws InsufficientFundsException {
		if(this.balance < amount)
			throw new InsufficientFundsException("Too expensive");
		this.balance-=amount;
	}

	@Override
	public void Deposit(double amount) {
		this.balance+=amount;
	}

	@Override
	public void Transfer(Account destination, double amount) 
			throws InsufficientFundsException, IllegalTransferException {
		
		if(this == destination)
			throw new IllegalTransferException();
		
		this.Withdraw(amount);
		destination.Deposit(amount);
	
	}
	
	public static double getCreditLimit(){
		return CurrentAccount.MAX_CREDIT;
	}
}
