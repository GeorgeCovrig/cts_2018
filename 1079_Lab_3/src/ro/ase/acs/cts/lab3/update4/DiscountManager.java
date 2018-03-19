package ro.ase.acs.cts.lab3.update4;

public class DiscountManager {
	
	MarketingInterface marketing;
	
	public DiscountManager(MarketingInterface mk){
		if(mk == null)
			throw new NullPointerException();
		this.marketing = mk;
	}
	
	public float computePriceWithDiscount(ProductType productType, float price, int clientAge) throws Exception {
		float newPrice = 0;
		float clientAgeDiscount = 
				marketing.computeClientAgeDiscount(clientAge);


		switch (productType) {
		case NEW_PRODUCT:
			return price;
		case OLD_PRODUCT:

			price = marketing.applyDiscount(price, 
					MarketingConstantValues.OLD_DISCOUNT);
			break;
		case LIMITED_STOCK_PRODUCT:

			price = marketing.applyDiscount(price, 
					MarketingConstantValues.LIMITED_DISCOUNT);
			break;
		case REFURBISHED_PRODUCT:
			price = marketing.applyDiscount(price, 
					MarketingConstantValues.REFURBISHED_DISCOUNT);
			break;
		default:
			throw new Exception("Unmanaged type");
		}

		newPrice = price - clientAgeDiscount * price;
		return newPrice;
	}
}
