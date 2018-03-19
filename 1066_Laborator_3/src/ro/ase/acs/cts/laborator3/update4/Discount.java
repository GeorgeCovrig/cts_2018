package ro.ase.acs.cts.laborator3.update4;

public class Discount {
	
	private float calculeazaDiscountClient(int vechimeClientInAni){
		if(vechimeClientInAni > ConstanteDiscount.VECHIME_MINIMA)
			return ConstanteDiscount.DISCOUNT_MAXIM_VECHIME;
		else return (float)vechimeClientInAni/100;
	}
	
	private float calculeazaValoareDiscount(float pret, float discount){
		return pret*discount;
	}
	
	public float calculeazaPretCuDiscount(TipProdus tipProdus, 
			float pretProdus, int vechimeClientInAni) throws Exception
	  {
	    float pretCuDiscount = 0;
	    float discountClient = this.calculeazaDiscountClient(vechimeClientInAni); 
	    
	    switch(tipProdus){
	    	case PRODUS_ULTIMA_GENERATIE:
	    		pretCuDiscount = pretProdus;
	    		return pretCuDiscount;
	    	case PRODUS_GENERATIE_VECHE:
	    		pretCuDiscount = (pretProdus - (ConstanteDiscount.DISCOUNT_GENERATIE_VECHE * pretProdus));
	    		break;
	    	case PRODUS_CU_STOC_LIMITAT:
	    		pretCuDiscount = (pretProdus - (ConstanteDiscount.DISCOUNT_STOC_LIMITAT * pretProdus));
	    		break;
	    	case PRODUS_RESIGILIAT:
	    		pretCuDiscount = (pretProdus - (ConstanteDiscount.DISCOUNT_RESIGILAT * pretProdus));
	    		break;
	    	default:
	    		throw new Exception("Tip neimplementat");
	    }
	    
	    pretCuDiscount -= calculeazaValoareDiscount(pretCuDiscount,discountClient);
	    

	    return pretCuDiscount;
	  }
}
