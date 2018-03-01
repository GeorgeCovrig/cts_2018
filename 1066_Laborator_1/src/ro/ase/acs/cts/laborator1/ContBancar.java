package ro.ase.acs.cts.laborator1;

public abstract class ContBancar extends Cont{
	protected double balanta;
	protected final String id;
	
	public ContBancar(String id){
		//shadowing
		this.id = id;
		this.balanta = 0;
	}
	
	@Override
	final public double getBalanta(){
		return this.balanta;
	}
	
	
}
