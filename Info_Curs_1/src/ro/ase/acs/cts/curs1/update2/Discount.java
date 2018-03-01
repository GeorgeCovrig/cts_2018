package ro.ase.acs.cts.curs1.update2;

import java.util.NoSuchElementException;

public class Discount {
	
	public float AplicaDiscount(TipProdus tipProdus, float pret, int vechimeClientInAni)
	  {
		float pretCuDiscount = 0;
		float discountPentruLoialitateInProcente = (vechimeClientInAni > 10) ? (float)15/100 : (float)vechimeClientInAni/100; 
	    
		switch(tipProdus){
		case ProdusNou:
			pretCuDiscount = pret;
			break;
			
		case ProdusCuStocRedus:
			pretCuDiscount = (pret - (0.1f * pret)) - (discountPentruLoialitateInProcente * (pret - (0.1f * pret)));
			break;
			
		case ProdusGeneratieVeche:
			pretCuDiscount = (pret - (0.25f * pret)) - (discountPentruLoialitateInProcente * (pret - (0.25f * pret)));
			break;
			
		case Resigilat:
			pretCuDiscount = (pret - (0.35f * pret)) - (discountPentruLoialitateInProcente * (pret - (0.35f * pret)));
			break;
	
		default:
			throw new NoSuchElementException();
		}
		
	    return pretCuDiscount;
	  }
}
