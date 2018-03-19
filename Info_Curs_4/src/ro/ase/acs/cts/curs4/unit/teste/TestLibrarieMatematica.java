package ro.ase.acs.cts.curs4.unit.teste;

import junit.framework.TestCase;
import ro.ase.acs.cts.curs4.LibrarieMatematica;

public class TestLibrarieMatematica extends TestCase {

	public TestLibrarieMatematica(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	public void testSumaValoriNormale(){
		int valoareA = 2;
		int valoareB = 3;
		int rezultat = LibrarieMatematica.suma(valoareA, valoareB);
		
		int rezultatAsteptat = 5;
		
		assertEquals("Verificare suma valori normale",rezultatAsteptat, rezultat);
	}
	
	public void testSumaValoriOpuse(){
		int valoareA = 2;
		int valoareB = -2;
		int rezultat = LibrarieMatematica.suma(valoareA, valoareB);
		
		int rezultatAsteptat = 0;
		
		assertEquals("Verificare suma valori opuse",rezultatAsteptat, rezultat);
	}
}
