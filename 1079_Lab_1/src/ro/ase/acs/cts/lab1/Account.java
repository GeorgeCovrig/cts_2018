/**
 * 
 */
package ro.ase.acs.cts.lab1;

/**
 * @author Catalin
 * @version 1.0
 * @deprecated
 * 
 *
 */
public abstract class Account {
	public abstract void Deposit(double amount);
	public abstract void Withdraw(double amount);
	public abstract void Transfer(
			Account destination,double amount);
	public abstract double getBalance();
	
	
}
