package ro.ase.acs.cts.laborator3.update2;

public class Discount {
	
	
	
	public float calculeazaPretCuDiscount(TipProdus tipProdus, 
			float pretProdus, int vechimeClientInAni) throws Exception
	  {
	    float pretCuDiscount = 0;
	    float discountClient = (vechimeClientInAni > 10) ? (float)15/100 : (float)vechimeClientInAni/100; 
	    
	    switch(tipProdus){
	    	case PRODUS_ULTIMA_GENERATIE:
	    		pretCuDiscount = pretProdus;
	    		break;
	    	case PRODUS_GENERATIE_VECHE:
	    		pretCuDiscount = (pretProdus - (0.1f * pretProdus)) - discountClient * (pretProdus - (0.1f * pretProdus));
	    		break;
	    	case PRODUS_CU_STOC_LIMITAT:
	    		pretCuDiscount = (pretProdus - (0.25f * pretProdus)) - discountClient * (pretProdus - (0.25f * pretProdus));
	    		break;
	    	case PRODUS_RESIGILIAT:
	    		pretCuDiscount = (pretProdus - (0.35f * pretProdus)) - discountClient * (pretProdus - (0.35f * pretProdus));
	    		break;
	    	default:
	    		throw new Exception("Tip neimplementat");
	    }
	    

	    return pretCuDiscount;
	  }
}
