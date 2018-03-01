package ro.ase.acs.cts.lab1;

public class CurrentAccount extends BankAccount{
	
	private static final double MAX_CREDIT = 5000.0;
	
	public CurrentAccount(String id){
		super(id);
		
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
	
	public static double getCreditLimit(){
		return CurrentAccount.MAX_CREDIT;
	}
}
