package ro.ase.acs.cts.lab3.test;

import ro.ase.acs.cts.lab3.update4.DiscountManager;
import ro.ase.acs.cts.lab3.update4.MarketingStrategy2018;
import ro.ase.acs.cts.lab3.update4.MarketingStrategyInterface;
import ro.ase.acs.cts.lab3.update4.ProductType;

public class Test {

	public static void main(String[] args) {
		/*DiscountManager discountManager = 
				new DiscountManager(new MarketingStrategy2018());*/
		
		DiscountManager discountManager = 
				new DiscountManager(new MarketingStrategyInterface() {
					
					@Override
					public float computePriceOnProductDiscount(float price, float discount) {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public float computeClientDiscount(int timeSinceRegistration) {
						// TODO Auto-generated method stub
						return 0;
					}
				});
		
		try {
			float newPrice = 
					discountManager.computePriceWithDiscount(
							ProductType.LIMITED_STOCK, 100, 0);
			System.out.println("New price "+newPrice);
			
		} catch (Exception e) {
		}
	}

}
