package ro.ase.acs.cts.lab2;

public abstract class Account {
	public abstract void Deposit(double amount);
	public abstract void Withdraw(double amount) throws InsufficientFundsException;
	public abstract void Transfer(Account destination, double amount) 
		throws InsufficientFundsException, IllegalTransferException;
	public abstract double getBalance();
}
