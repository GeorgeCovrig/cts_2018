package ro.ase.acs.cts.lab3.update4;

public class MarketingStrategy2018 
	implements MarketingInterface{

	public float computeClientAgeDiscount(int clientAge){
		float clientAgeDiscount = 0;
		if (clientAge > MarketingConstantValues.CLIENT_MAX_AGE)
			clientAgeDiscount = MarketingConstantValues.CLIENT_MAX_DISCOUNT;
		else
			clientAgeDiscount = (float) clientAge / 100;
		
		return clientAgeDiscount;
	}
	
	public float applyDiscount(float price, float discount){
		return price-= price*discount;
	}
}
