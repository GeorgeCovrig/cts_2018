package ro.ase.acs.cts.curs1.update4;

import java.util.NoSuchElementException;

public class Discount {
	
	public float aplicaDiscount(float pret, float discount){
		return pret - (ValoriDiscount.DISCOUNT_PRODUS_STOC_REDUS * pret);
	}
	
	public float AplicaDiscount(TipProdus tipProdus, float pret, int vechimeClientInAni)
	  {
		float pretCuDiscount = 0;
		float discountPentruLoialitateInProcente = (vechimeClientInAni > 10) ? ValoriDiscount.DISCOUNT_MAXIM : (float)vechimeClientInAni/100; 
	    
		switch(tipProdus){
		case ProdusNou:

			pretCuDiscount = aplicaDiscount(pret, ValoriDiscount.DISCOUNT_ZERO);
			break;
		case ProdusCuStocRedus:
			pretCuDiscount = aplicaDiscount(pret, ValoriDiscount.DISCOUNT_PRODUS_STOC_REDUS);
			pretCuDiscount = pretCuDiscount - (discountPentruLoialitateInProcente * aplicaDiscount(pret, ValoriDiscount.DISCOUNT_PRODUS_STOC_REDUS));
			break;
		case ProdusGeneratieVeche:
			pretCuDiscount = aplicaDiscount(pret, ValoriDiscount.DISCOUNT_PRODUS_VECHI);
			pretCuDiscount = pretCuDiscount - (discountPentruLoialitateInProcente * aplicaDiscount(pret, ValoriDiscount.DISCOUNT_PRODUS_VECHI));
			break;
			
		case Resigilat:
			pretCuDiscount = aplicaDiscount(pret, ValoriDiscount.DISCOUNT_RESIGILAT);
			pretCuDiscount = pretCuDiscount - (discountPentruLoialitateInProcente * aplicaDiscount(pret, ValoriDiscount.DISCOUNT_RESIGILAT));
			break;
			
		default:
			throw new NoSuchElementException();
		}
		
	    return pretCuDiscount;
	  }
}
