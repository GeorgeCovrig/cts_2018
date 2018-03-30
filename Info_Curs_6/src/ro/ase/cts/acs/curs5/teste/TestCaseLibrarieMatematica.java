package ro.ase.cts.acs.curs5.teste;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.cts.acs.curs5.LibrarieMatematica;
import ro.ase.cts.acs.curs5.exceptii.ExceptieLibrarie;

public class TestCaseLibrarieMatematica {
	
	public static final int DURATA_MINIMA = 1;

	int[] valoriTime;
	
	@Before
	public void setUp() throws Exception {
		valoriTime = new int[100000];
		Random rand = new Random();
		for(int i=0;i<100000;i++)
			valoriTime[i] = rand.nextInt(1000);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
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
	
	@Test
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
	
	@Test
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
	
	@Test
	public void testMinimOrderingSortateCrescator() throws ExceptieLibrarie{
		int[] valori = {-4,67,90,145};
		
		int expectedMin = -4;
		
		int actualMin = 
				LibrarieMatematica.min(valori);
		
		assertEquals(expectedMin, actualMin);
		
	}
	
	@Test
	public void testMinimOrderingSortateDescrescator() throws ExceptieLibrarie{
		int[] valori = {167,134,90,8,-4};
		
		int expectedMin = -4;
		
		int actualMin = 
				LibrarieMatematica.min(valori);
		
		assertEquals(expectedMin, actualMin);
		
	}
	
	@Test(expected = ExceptieLibrarie.class)
	public void testReferenceNull() throws ExceptieLibrarie{
		int[] valori = null;
		
		LibrarieMatematica.min(valori);
	}
	
	@Test
	public void testReferenceModificariExterne() throws ExceptieLibrarie{
		int[] valori = {-5,6,7,8};
		int expectedMin = -5;
		
		int actualMin = LibrarieMatematica.min(valori);
		
		valori[0] = -10;
		
		assertEquals(expectedMin, actualMin);
	}
	
	@Test
	public void testReferenceModificariExterne2() throws ExceptieLibrarie{
		int[] valori = {-5,6,7,8};
		
		LibrarieMatematica math = 
				new LibrarieMatematica();
		math.setValori(valori);
		
		int expectedValoareIndexZero = -5;

		valori[0] = -10;
		
		int actualValoareIndexZero = math.getValoare(0);
		
		assertEquals(expectedValoareIndexZero, actualValoareIndexZero);
	}
	
	@Test
	public void testPerformanceMin() throws ExceptieLibrarie{
		int[] valori = new int[100000];
		Random rand = new Random();
		for(int i=0;i<100000;i++)
			valori[i] = rand.nextInt(1000);
		
		long start = System.currentTimeMillis();
		LibrarieMatematica.min(valori);
		long finish = System.currentTimeMillis();
		
		if((finish-start)>=DURATA_MINIMA)
			fail("Dureaza prea mult");
		else
			assertTrue(true);
	}
	
	@Test(timeout = 1)
	public void testPerformanceMinJunit4() throws ExceptieLibrarie{
		valoriTime = new int[100000];
		Random rand = new Random();
		for(int i=0;i<100000;i++)
			valoriTime[i] = rand.nextInt(1000);
		LibrarieMatematica.min(valoriTime);
	}
	
	
}
