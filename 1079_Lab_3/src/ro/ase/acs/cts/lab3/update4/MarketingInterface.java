package ro.ase.acs.cts.lab3.update4;

public interface MarketingInterface {
	public float computeClientAgeDiscount(int clientAge);
	public float applyDiscount(float price, float discount);
}
