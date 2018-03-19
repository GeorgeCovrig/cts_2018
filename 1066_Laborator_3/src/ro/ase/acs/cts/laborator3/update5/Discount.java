package ro.ase.acs.cts.laborator3.update5;

public class Discount {
	
	private InterfataMarketing marketing;
	
	public Discount(InterfataMarketing mk){
		if(mk == null)
			throw new NullPointerException();
		
		this.marketing = mk;
	}
	
	public float calculeazaPretCuDiscount(TipProdus tipProdus, 
			float pretProdus, int vechimeClientInAni) throws Exception
	  {
	    float pretCuDiscount = 0;
	    float discountClient = marketing.calculeazaDiscountClient(vechimeClientInAni); 
	    
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
	    
	    pretCuDiscount -= marketing.calculeazaValoareDiscount(pretCuDiscount,discountClient);
	    

	    return pretCuDiscount;
	  }
}
