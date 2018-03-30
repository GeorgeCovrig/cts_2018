package ro.ase.cts.acs.curs5.teste;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.acs.curs5.Student;
import ro.ase.cts.acs.curs5.exceptii.ExceptieVarstaStudent;

public class TestCaseStudent {

	Student student;
	static final int VARSTA_INITIALA = 20; 
	

	@Before
	public void setUp() throws ExceptieVarstaStudent {
		student = new Student();
		student.setVarsta(VARSTA_INITIALA);
	}

	@After
	public void tearDown() throws Exception {
		student = null;
	}
	
	@Test
	public void testSetVarstaRangeValoriNormale() throws Exception{
		int varstaNoua = 23;
		
		student.setVarsta(varstaNoua);
		
		int varstaModificata = student.getVarsta();
		
		assertEquals("setVarsta nu merge pentru valori normale",
				varstaNoua,varstaModificata);
	}
	
	@Test
	public void testSetVarstaLimiteValoareMinima() throws Exception{
		int varstaNoua = Student.VARSTA_MINIMA;
		
		student.setVarsta(varstaNoua);
		
		int varstaModificata = student.getVarsta();
		
		assertEquals("setVarsta nu merge pentru valori normale",
				varstaNoua,varstaModificata);
	}
	
	@Test
	public void testSetVarstaLimiteValoareMaxima() throws Exception{
		int varstaNoua = Student.VARSTA_MAXIMA;
		
		student.setVarsta(varstaNoua);
		
		int varstaModificata = student.getVarsta();
		
		assertEquals("setVarsta nu merge pentru valori normale",
				varstaNoua,varstaModificata);
	}
	
	@Test
	public void testSetVarstaLimiteValoareSubMinim() throws Exception{
		int varstaNoua = -56;
		
		try{
			student.setVarsta(varstaNoua);
			fail("Functia nu arunca exceptie");
		}
		catch(ExceptieVarstaStudent e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("Functia arunca alta exceptie");
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
	
	@Test
	public void testConstructorInverse(){
		student  = new Student();
		
		assertNotNull(student);
		
	}

}
