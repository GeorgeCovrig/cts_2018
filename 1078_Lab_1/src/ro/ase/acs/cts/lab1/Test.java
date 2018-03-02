package ro.ase.acs.cts.lab1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<BankAccount> accounts = new ArrayList<>();
		Banker bank = new Banker("BRD");
		
		try {
			
			
			accounts.add(bank.openAccount(AccountTypes.SAVINGS));
			accounts.add(bank.openAccount(AccountTypes.CURRENT));
			accounts.add(bank.openAccount(AccountTypes.SAVINGS));
			
			CurrentAccount creditCard = (CurrentAccount)accounts.get(1);
			SavingsAccount depositPension = (SavingsAccount)accounts.get(0);
			
			creditCard.Withdraw(1000);
			creditCard.Transfer(depositPension, 500);
			
			System.out.println("Credit card balance "+creditCard.getBalance());
			System.out.println("Pension savings "+depositPension.getBalance());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
