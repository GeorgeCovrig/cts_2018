package ro.ase.cts.acs.curs5.teste;

import junit.framework.TestCase;
import ro.ase.cts.acs.curs5.Student;
import ro.ase.cts.acs.curs5.exceptii.ExceptieVarstaStudent;

public class TestCaseStudent extends TestCase {

	Student student;
	static final int VARSTA_INITIALA = 20; 
	
	public TestCaseStudent(String name) {
		super(name);
		
	}

	protected void setUp() throws Exception {
		super.setUp();
		student = new Student();
		student.setVarsta(VARSTA_INITIALA);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		student = null;
	}
	
	public void testSetVarstaRangeValoriNormale() throws Exception{
		int varstaNoua = 23;
		
		student.setVarsta(varstaNoua);
		
		int varstaModificata = student.getVarsta();
		
		assertEquals("setVarsta nu merge pentru valori normale",
				varstaNoua,varstaModificata);
	}
	
	public void testSetVarstaLimiteValoareMinima() throws Exception{
		int varstaNoua = Student.VARSTA_MINIMA;
		
		student.setVarsta(varstaNoua);
		
		int varstaModificata = student.getVarsta();
		
		assertEquals("setVarsta nu merge pentru valori normale",
				varstaNoua,varstaModificata);
	}
	
	public void testSetVarstaLimiteValoareMaxima() throws Exception{
		int varstaNoua = Student.VARSTA_MAXIMA;
		
		student.setVarsta(varstaNoua);
		
		int varstaModificata = student.getVarsta();
		
		assertEquals("setVarsta nu merge pentru valori normale",
				varstaNoua,varstaModificata);
	}
	
	public void testSetVarstaLimiteValoareSubMinim() throws Exception{
		int varstaNoua = -56;
		
		try{
			student.setVarsta(varstaNoua);
			fail("Functia nu arunca exceptie");
		}
		catch(ExceptieVarstaStudent e){
			assertTrue(true);
		}
		
	
	}
	
	public void testSetVarstaLimiteValoarePesteMaxim() throws Exception{
		int varstaNoua = 91;
		
		try{
			student.setVarsta(varstaNoua);
			fail("Functia nu arunca exceptie");
		}
		catch(ExceptieVarstaStudent e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("Arunca alta exceptie");
		}
		
	
	}

}
