package ro.ase.acs.cts.curs4;

public class Test {

	public static void main(String[] args) {

		int valoareA = 2;
		int valoareB = 3;
		int rezultat = LibrarieMatematica.suma(valoareA, valoareB);
		
		int rezultatAsteptat = 5;
		
		if(rezultat == rezultatAsteptat)
			System.out.println("Este ok !");
		else
			System.out.println("Avem o problema !");
		
	}

}
