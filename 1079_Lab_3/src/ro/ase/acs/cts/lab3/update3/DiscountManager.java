package ro.ase.acs.cts.lab3.update3;

public class DiscountManager {
	
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
	
	public float computePriceWithDiscount(ProductType productType, float price, int clientAge) throws Exception {
		float newPrice = 0;
		float clientAgeDiscount = 
				computeClientAgeDiscount(clientAge);


		switch (productType) {
		case NEW_PRODUCT:
			return price;
		case OLD_PRODUCT:

			price = applyDiscount(price, 
					MarketingConstantValues.OLD_DISCOUNT);
			break;
		case LIMITED_STOCK_PRODUCT:

			price = applyDiscount(price, 
					MarketingConstantValues.LIMITED_DISCOUNT);
			break;
		case REFURBISHED_PRODUCT:
			price = applyDiscount(price, 
					MarketingConstantValues.REFURBISHED_DISCOUNT);
			break;
		default:
			throw new Exception("Unmanaged type");
		}

		newPrice = price - clientAgeDiscount * price;
		return newPrice;
	}
}
