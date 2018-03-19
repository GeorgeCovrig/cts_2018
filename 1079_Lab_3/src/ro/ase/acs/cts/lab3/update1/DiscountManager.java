package ro.ase.acs.cts.lab3.update1;

public class DiscountManager {
	 public float computePriceWithDiscount(
			 ProductType productType, float price, int clientAge) throws Exception
	  {
	    float newPrice = 0;
	    float clientAgeDiscount = (clientAge > 10) ? (float)15/100 : (float)clientAge/100; 
	    
	    switch(productType){
	    case NEW_PRODUCT:
	    	newPrice = price;
	    	break;
	    case OLD_PRODUCT:
	    	newPrice = (price - (0.1f * price)) - clientAgeDiscount * (price - (0.1f * price));
	    	break;
	    case LIMITED_STOCK_PRODUCT:
	    	newPrice = (price - (0.25f * price)) - clientAgeDiscount * (price - (0.25f * price));
	    	break;    	
	    case REFURBISHED_PRODUCT:
	    	newPrice = (price - (0.35f * price)) - clientAgeDiscount * (price - (0.35f * price));
	    	break;
	    default:
	    	throw new Exception("Unmanaged type");	
	    }
	    
	    
	    return newPrice;
	  }
}
