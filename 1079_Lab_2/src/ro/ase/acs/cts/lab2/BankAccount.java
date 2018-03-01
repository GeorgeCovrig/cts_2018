package ro.ase.acs.cts.lab2;

public abstract class BankAccount extends Account{
	protected double balance;
	protected final String id;
	
	public BankAccount(String id){
		this.id = id;
	}
	
	@Override
	final public double getBalance(){
		return this.balance;
	}
}
