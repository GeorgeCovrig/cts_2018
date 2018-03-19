package ro.ase.acs.cts.lab3.update4;

public class DiscountManager {
	
	MarketingStrategyInterface marketing;
	
	public DiscountManager(MarketingStrategyInterface mk){
		if(mk == null)
			throw new NullPointerException();
		this.marketing = mk;
	}
	
	 public float computePriceWithDiscount(ProductType productType, 
			 float price, int clientAge) throws Exception
	  {
	    float finalPrice = 0;
	    float clientDiscount = marketing.computeClientDiscount(clientAge);
	    
	    switch(productType){
	    	case NEW_PRODUCT:
	    		return price;
	    	case OLD_PRODUCT:
	    		price = marketing.computePriceOnProductDiscount(price, MarketingValues.OLD_DISCOUNT);
	    		break;
	    	case LIMITED_STOCK:
	    		price = marketing.computePriceOnProductDiscount(price, MarketingValues.LIMITED_DISCOUNT);
	    		break;
	    	case REFURBISHED_PRODUCT:
	    		price = marketing.computePriceOnProductDiscount(price, MarketingValues.REFURBISHED_DISCOUNT);
	    		break;
	    	default:
	    		throw new Exception("Unmanaged type");	
	    }
	    
	    finalPrice = price - clientDiscount * price;
	    return finalPrice;
	  }
}
