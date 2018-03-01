package ro.ase.acs.cts.lab1;

public abstract class BankAccount extends Account {
	protected double balance;
	protected final String id; 
	
	public BankAccount(String id){
		//shadowing
		//id = id;
		
		this.id = id;
	}
	
	@Override
	public double getBalance(){
		return this.balance;
	}
}
