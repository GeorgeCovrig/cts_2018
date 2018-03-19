package ro.ase.acs.cts.lab3.update3;

public class DiscountManager {
	
	
	 public float computeClientDiscount(int timeSinceRegistration){
		 float clientDiscount = 0;
		    if(timeSinceRegistration > MarketingValues.MIN_CLIENT_AGE) 
		    	clientDiscount = MarketingValues.MAX_CLIENT_DISCOUNT;
		    else clientDiscount = (float)timeSinceRegistration/100; 
		    return clientDiscount;
	 }
	 
	 public float computePriceOnProductDiscount(float price, float discount){
		 return (price - (discount * price));
	 }
	
	 public float computePriceWithDiscount(ProductType productType, 
			 float price, int clientAge) throws Exception
	  {
	    float finalPrice = 0;
	    float clientDiscount = computeClientDiscount(clientAge);
	    
	    switch(productType){
	    	case NEW_PRODUCT:
	    		return price;
	    	case OLD_PRODUCT:
	    		price = computePriceOnProductDiscount(price, MarketingValues.OLD_DISCOUNT);
	    		break;
	    	case LIMITED_STOCK:
	    		price = computePriceOnProductDiscount(price, MarketingValues.LIMITED_DISCOUNT);
	    		break;
	    	case REFURBISHED_PRODUCT:
	    		price = computePriceOnProductDiscount(price, MarketingValues.REFURBISHED_DISCOUNT);
	    		break;
	    	default:
	    		throw new Exception("Unmanaged type");	
	    }
	    
	    finalPrice = price - clientDiscount * price;
	    return finalPrice;
	  }
}
