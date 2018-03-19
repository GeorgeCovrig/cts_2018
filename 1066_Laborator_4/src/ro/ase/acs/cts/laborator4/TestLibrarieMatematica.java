package ro.ase.acs.cts.laborator4;

import junit.framework.TestCase;

public class TestLibrarieMatematica extends TestCase {
	
	public void testSumaValoriNormale(){
		int valoareA = 2;
		int valoareB = 3;
		int rezultat = LibrarieMatematica.suma(valoareA, valoareB);
		
		int rezultatAsteptat = 6;
		
		assertEquals("test valori normale pentru suma",
				rezultatAsteptat, 
				rezultat);
	}
	
	public void testSumaValoriNormale2(){
		int valoareA = 2;
		int valoareB = 3;
		int rezultat = LibrarieMatematica.suma(valoareA, valoareB);
		
		int rezultatAsteptat = 5;
		
		assertEquals("test valori normale pentru suma",
				rezultatAsteptat, 
				rezultat);
	}
}
