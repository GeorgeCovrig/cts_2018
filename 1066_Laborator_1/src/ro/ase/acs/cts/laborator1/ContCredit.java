package ro.ase.acs.cts.laborator1;

public class ContCredit extends ContBancar{
	
	public static final double MAX_CREDIT = 5000.0;
	
	public ContCredit(String id){
		super(id);
		this.balanta = MAX_CREDIT;
	}

	@Override
	public void Extrage(double valoare) throws ExceptieFonduriInsuficiente {
		if(this.balanta >= valoare)
			this.balanta-= valoare;
		else
			throw new ExceptieFonduriInsuficiente("Valoare prea mare");
	}

	@Override
	public void Depune(double valoare) {
		this.balanta+=valoare;
	}

	@Override
	public void Transfer(Cont destinatie, double valoare) 
			throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
		
		if(destinatie == this)
			throw new ExceptieTransferIlegal();
		
		this.Extrage(valoare);
		destinatie.Depune(valoare);
		
	}
	
}
