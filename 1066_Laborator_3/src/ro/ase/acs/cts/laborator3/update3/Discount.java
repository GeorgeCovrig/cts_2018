package ro.ase.acs.cts.laborator3.update3;

public class Discount {
	
	
	
	public float calculeazaPretCuDiscount(TipProdus tipProdus, 
			float pretProdus, int vechimeClientInAni) throws Exception
	  {
	    float pretCuDiscount = 0;
	    float discountClient = (vechimeClientInAni > ConstanteDiscount.VECHIME_MINIMA) ? ConstanteDiscount.DISCOUNT_MAXIM_VECHIME : (float)vechimeClientInAni/100; 
	    
	    switch(tipProdus){
	    	case PRODUS_ULTIMA_GENERATIE:
	    		pretCuDiscount = pretProdus;
	    		break;
	    	case PRODUS_GENERATIE_VECHE:
	    		pretCuDiscount = (pretProdus - (ConstanteDiscount.DISCOUNT_GENERATIE_VECHE * pretProdus));
	    		pretCuDiscount -= (discountClient * pretCuDiscount);
	    		break;
	    	case PRODUS_CU_STOC_LIMITAT:
	    		pretCuDiscount = (pretProdus - (ConstanteDiscount.DISCOUNT_STOC_LIMITAT * pretProdus));
	    		pretCuDiscount -= (discountClient * pretCuDiscount);
	    		break;
	    	case PRODUS_RESIGILIAT:
	    		pretCuDiscount = (pretProdus - (ConstanteDiscount.DISCOUNT_RESIGILAT * pretProdus));
	    		pretCuDiscount -= (discountClient * pretCuDiscount);
	    		break;
	    	default:
	    		throw new Exception("Tip neimplementat");
	    }
	    

	    return pretCuDiscount;
	  }
}
