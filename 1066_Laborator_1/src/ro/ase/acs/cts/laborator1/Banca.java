package ro.ase.acs.cts.laborator1;

public class Banca {
	private final String denumire;
	private int NEXT_ID = 0;
	
	public Banca(String denumire){
		this.denumire = denumire;
	}
	
	private String genereazaIBAN(){
		NEXT_ID+=1;
		return this.denumire+NEXT_ID;
	}
	
	public ContBancar deschideCont(TipConturi tip) throws Exception{
		String iban = this.genereazaIBAN();
		switch(tip){
		case CREDIT:
			return new ContCredit(iban);
		case DEPOZIT:
			return new ContDepozitLaVedere(iban);
		default:
			throw new Exception();	
		}
	}
}
