package ro.ase.acs.cts.laborator4;

import junit.framework.TestCase;

public class TestStudent extends TestCase {

	//fixture
	Student student;
	
	protected void setUp() throws Exception {
		super.setUp();
		
		student = new Student();
		student.setVarsta(20);
		System.out.println("Apel inainte de test");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		student = null;	
		System.out.println("Apel dupa test");
	}
	
	public void testSetVarstaValoriNormale(){
		
		
		int valoareNoua = 21;
		try {
			
			student.setVarsta(valoareNoua);
			
		} catch (Exception e) {
			fail("Arunca exceptie, desi nu trebuie");
		}
		
		int valoareModificata = student.getVarsta();
		
		assertEquals("Test setVarsta cu valori normale",
				valoareNoua, valoareModificata);
		
	}
	
	public void testSetVarstaValoriPreaMari(){
		
		
		int valoareNoua = 200;
		try{
			student.setVarsta(valoareNoua);
			fail("setVarsta() nu genereaza exceptie");
		}
		catch(Exception ex){
			assertTrue(true);
		}
		

		
	}


}
