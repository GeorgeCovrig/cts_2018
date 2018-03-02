package ro.ase.acs.cts.lab1;

public class Banker {
	private String name;
	private int nextId;
	
	public Banker(String name){
		this.name = name;
		this.nextId = 0;
	}
	
	public BankAccount openAccount(AccountTypes type) throws Exception {
		this.nextId+=1;
		
		switch (type) {
		case SAVINGS:
			return new SavingsAccount(this.name + this.nextId);
		case CURRENT:
			return new CurrentAccount(this.name + this.nextId);
		default:
			throw new Exception("Not managed type");
		}
	}
}
