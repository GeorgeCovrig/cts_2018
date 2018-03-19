package ro.ase.acs.cts.lab3.update2;

public class DiscountManager {
	public float computePriceWithDiscount(ProductType productType, float price, int clientAge) throws Exception {
		float newPrice = 0;
		float clientAgeDiscount = 0;
		if (clientAge > MarketingConstantValues.CLIENT_MAX_AGE)
			clientAgeDiscount = MarketingConstantValues.CLIENT_MAX_DISCOUNT;
		else
			clientAgeDiscount = (float) clientAge / 100;

		switch (productType) {
		case NEW_PRODUCT:
			newPrice = price;
			break;
		case OLD_PRODUCT:

			price -= MarketingConstantValues.OLD_DISCOUNT * price;
			newPrice = price - clientAgeDiscount * price;
			break;
		case LIMITED_STOCK_PRODUCT:

			price -= MarketingConstantValues.LIMITED_DISCOUNT * price;
			newPrice = price - clientAgeDiscount * price;

			break;
		case REFURBISHED_PRODUCT:
			price -= MarketingConstantValues.REFURBISHED_DISCOUNT * price;
			newPrice = price - clientAgeDiscount * price;

			break;
		default:
			throw new Exception("Unmanaged type");
		}

		return newPrice;
	}
}
