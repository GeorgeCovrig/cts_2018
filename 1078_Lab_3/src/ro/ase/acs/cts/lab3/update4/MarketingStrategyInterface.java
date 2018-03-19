package ro.ase.acs.cts.lab3.update4;

public interface MarketingStrategyInterface {
	 public float computeClientDiscount(int timeSinceRegistration);
	 public float computePriceOnProductDiscount(float price, float discount);
}
