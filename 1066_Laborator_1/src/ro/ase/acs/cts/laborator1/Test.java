package ro.ase.acs.cts.laborator1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Banca banca = new Banca("BCR");
		ArrayList<ContBancar> conturi = new ArrayList<>();
		
		try {
			conturi.add(banca.deschideCont(TipConturi.CREDIT));
			conturi.add(banca.deschideCont(TipConturi.DEPOZIT));
			conturi.add(banca.deschideCont(TipConturi.CREDIT));
			
			ContBancar depozit = conturi.get(1);
			ContBancar cardCredit = conturi.get(0);
			
			cardCredit.Extrage(200);
			depozit.Depune(1000);
			depozit.Transfer(cardCredit, 200);
			
			System.out.println("Card credit "+cardCredit.getBalanta());
			System.out.println("Card debit "+depozit.getBalanta());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
