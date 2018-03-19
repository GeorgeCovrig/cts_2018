package ro.ase.acs.cts.lab3.update1;

public class DiscountManager {
	 public float computePriceWithDiscount(ProductType productType, 
			 float price, int clientAge) throws Exception
	  {
	    float finalPrice = 0;
	    float clientDiscount = (clientAge > MarketingValues.MIN_CLIENT_AGE) ? MarketingValues.MAX_CLIENT_DISCOUNT : (float)clientAge/100; 
	    
	    switch(productType){
	    	case NEW_PRODUCT:
	    		finalPrice = price;
	    		break;
	    	case OLD_PRODUCT:
	    		finalPrice = (price - (MarketingValues.OLD_DISCOUNT * price)) - clientDiscount * (price - (MarketingValues.OLD_DISCOUNT * price));
	    		break;
	    	case LIMITED_STOCK:
	    		finalPrice = (price - (MarketingValues.LIMITED_DISCOUNT * price)) - clientDiscount * (price - (MarketingValues.LIMITED_DISCOUNT * price));
	    		break;
	    	case REFURBISHED_PRODUCT:
	    		finalPrice = (price - (MarketingValues.REFURBISHED_DISCOUNT * price)) - clientDiscount * (price - (MarketingValues.REFURBISHED_DISCOUNT * price));
	    		break;
	    	default:
	    		throw new Exception("Unmanaged type");	
	    }
	    
	    return finalPrice;
	  }
}
