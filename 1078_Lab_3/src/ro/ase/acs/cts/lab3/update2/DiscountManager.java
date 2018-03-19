package ro.ase.acs.cts.lab3.update2;

public class DiscountManager {
	 public float computePriceWithDiscount(ProductType productType, 
			 float price, int clientAge) throws Exception
	  {
	    float finalPrice = 0;
	    float clientDiscount = 0;
	    if(clientAge > MarketingValues.MIN_CLIENT_AGE) 
	    	clientDiscount = MarketingValues.MAX_CLIENT_DISCOUNT;
	    else clientDiscount = (float)clientAge/100; 
	    
	    switch(productType){
	    	case NEW_PRODUCT:
	    		finalPrice = price;
	    		break;
	    	case OLD_PRODUCT:
	    		price -= (MarketingValues.OLD_DISCOUNT * price);
	    		finalPrice = price - clientDiscount * price;
	    		break;
	    	case LIMITED_STOCK:
	    		price -= (MarketingValues.LIMITED_DISCOUNT * price);
	    		finalPrice = price - clientDiscount * price;
	    		break;
	    	case REFURBISHED_PRODUCT:
	    		price -= (MarketingValues.REFURBISHED_DISCOUNT * price);
	    		finalPrice = price - clientDiscount * price;
	    		break;
	    	default:
	    		throw new Exception("Unmanaged type");	
	    }
	    
	    return finalPrice;
	  }
}
