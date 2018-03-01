package ro.ase.acs.cts.lab2;

public class Banker {
	String name;
	private int nextId;
	
	public Banker(String name){
		this.name = name;
		this.nextId = 0;
	}
	
	public BankAccount OpenAccount(AccountTypes type) throws Exception{
		this.nextId+=1;
		switch (type) {
		case SAVINGS:
			return new SavingsAccount(this.name+nextId);
		case CURRENT:
			return new CurrentAccount(this.name+nextId);
		default:
			throw new Exception();
		}
	}
}
