package ro.ase.cts.acs.curs5.teste;

import junit.framework.TestCase;
import ro.ase.cts.acs.curs5.LibrarieMatematica;
import ro.ase.cts.acs.curs5.exceptii.ExceptieLibrarie;

public class TestCaseLibrarieMatematica extends TestCase {

	public TestCaseLibrarieMatematica(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	public void testMinimExistence(){
		int[] valori = null;
		try{
		LibrarieMatematica.min(valori);
		fail("Nu arunca exceptie");
		}
		catch(ExceptieLibrarie e){
			assertTrue(true);
		}
	}
	
	public void testMinimCardinalitateZero(){
		int[] valori = new int[0];
		try{
		LibrarieMatematica.min(valori);
		fail("Nu arunca exceptie");
		}
		catch(ExceptieLibrarie e){
			assertTrue(true);
		}
	}
	
	public void testMinimCardinalitateUnu(){
		int[] valori = {5};
		try{
		int minimObtinut = LibrarieMatematica.min(valori);
		
		assertEquals(5, minimObtinut);
		
		}
		catch(ExceptieLibrarie e){
			fail();
		}
	}
}
