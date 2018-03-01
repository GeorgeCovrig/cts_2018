/**
 * 
 */
package ro.ase.acs.cts.lab1;

/**
 * @author Catalin
 * @version 1.0.0.1
 * @deprecated
 * @see 
 *
 */
public abstract class Account {
	/**
	 * 
	 * @param amount the amount of currency that you will deposit
	 * @return nothing
	 * 
	 */
	public abstract void Withdraw(double amount);
	public abstract void Deposit(double amount);
	public abstract void Transfer(
			Account destination, double amount);
	public abstract double getBalance();
}
