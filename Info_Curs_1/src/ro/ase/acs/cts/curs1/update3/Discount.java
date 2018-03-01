package ro.ase.acs.cts.curs1.update3;

import java.util.NoSuchElementException;

public class Discount {
	
	public float AplicaDiscount(TipProdus tipProdus, float pret, int vechimeClientInAni)
	  {
		float pretCuDiscount = 0;
		float discountPentruLoialitateInProcente = (vechimeClientInAni > 10) ? ValoriDiscount.DISCOUNT_MAXIM : (float)vechimeClientInAni/100; 
	    
		switch(tipProdus){
		case ProdusNou:
			pretCuDiscount = pret;
			break;
		case ProdusCuStocRedus:
			pretCuDiscount = pret - (ValoriDiscount.DISCOUNT_PRODUS_STOC_REDUS * pret);
			pretCuDiscount = pretCuDiscount - (discountPentruLoialitateInProcente * (pret - (ValoriDiscount.DISCOUNT_PRODUS_STOC_REDUS * pret)));
			break;
		case ProdusGeneratieVeche:
			pretCuDiscount = pret - (ValoriDiscount.DISCOUNT_PRODUS_VECHI * pret);
			pretCuDiscount = pretCuDiscount - (discountPentruLoialitateInProcente * (pret - ValoriDiscount.DISCOUNT_PRODUS_VECHI * pret));
			break;
			
		case Resigilat:
			pretCuDiscount = pret - (ValoriDiscount.DISCOUNT_RESIGILAT * pret);
			pretCuDiscount = pretCuDiscount - (discountPentruLoialitateInProcente * (pret - (ValoriDiscount.DISCOUNT_RESIGILAT * pret)));
			break;
			
		default:
			throw new NoSuchElementException();
		}
		
	    return pretCuDiscount;
	  }
}
