package ro.ase.acs.cts.laborator1;

public class ContDepozitLaVedere 
	extends ContBancar implements Profitabil{
	
	public static final float BALANTA_MINIMA = 100;
	
	public ContDepozitLaVedere(String id){
		super(id);
		this.balanta = BALANTA_MINIMA;
	}

	@Override
	public void Extrage(double valoare) throws ExceptieFonduriInsuficiente {
		if(this.balanta-valoare < BALANTA_MINIMA)
			throw new ExceptieFonduriInsuficiente("Eroare");
		else
			this.balanta-=valoare;
	}

	@Override
	public void Depune(double valoare) {
		this.balanta+=valoare;
	}

	@Override
	public void Transfer(Cont destinatie, double valoare) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
		if(this == destinatie)
			throw new ExceptieTransferIlegal();
		this.Extrage(valoare);
		destinatie.Depune(valoare);
	}

	@Override
	public void AdaugaDobanda(float dobandaInProcente) {
		this.balanta*= (dobandaInProcente/100.0+1);
	}

}
