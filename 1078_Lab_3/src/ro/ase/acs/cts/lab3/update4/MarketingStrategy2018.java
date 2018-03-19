package ro.ase.acs.cts.lab3.update4;

public class MarketingStrategy2018 implements MarketingStrategyInterface{
	
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
}
