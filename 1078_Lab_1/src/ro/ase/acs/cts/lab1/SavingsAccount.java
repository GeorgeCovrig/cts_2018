package ro.ase.acs.cts.lab1;

import javax.swing.plaf.InsetsUIResource;

public class SavingsAccount extends BankAccount implements Profitable{
	
	private static final double MIN_BALANCE = 100.0;
	
	public SavingsAccount(String id){
		super(id);
		this.balance = MIN_BALANCE;
	}

	@Override
	public void Withdraw(double amount) throws InsufficientFundsException {
		if(this.balance < amount+MIN_BALANCE)
			throw new InsufficientFundsException("Over limit");
		
	}

	@Override
	public void Deposit(double amount) {
		this.balance+=amount;
	}

	@Override
	public void Transfer(Account destination, double amount) throws IllegalTransferException, InsufficientFundsException {
		
		if(this == destination)
			throw new IllegalTransferException();
		
		this.Withdraw(amount);
		destination.Deposit(amount);
	}

	@Override
	public void addInterest(float interestInPercent) {
		this.balance*=(1 + interestInPercent/100.0f);
	}

}
