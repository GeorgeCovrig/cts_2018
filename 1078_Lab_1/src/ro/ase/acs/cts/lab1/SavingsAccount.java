package ro.ase.acs.cts.lab1;

public class SavingsAccount extends BankAccount{
	
	private static final double MIN_BALANCE = 100.0;
	
	public SavingsAccount(String id){
		super(id);
		this.balance = MIN_BALANCE;
	}

	@Override
	public void Withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Transfer(Account destination, double amount) {
		// TODO Auto-generated method stub
		
	}

}
