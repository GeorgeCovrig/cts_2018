/**
 * 
 */
package ro.ase.acs.cts.lab1;

import javax.swing.plaf.InsetsUIResource;

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
	 * @throws InsufficientFundsException 
	 * 
	 */
	public abstract void Withdraw(double amount) throws InsufficientFundsException;
	public abstract void Deposit(double amount);
	public abstract void Transfer(
			Account destination, double amount) 
					throws InsufficientFundsException, IllegalTransferException;
	public abstract double getBalance();
}
