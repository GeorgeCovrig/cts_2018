package ro.ase.cts.acs.curs5.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.cts.acs.curs5.LibrarieStudenti;
import ro.ase.cts.acs.curs5.exceptii.ExceptieLibrarie;

public class TestCaseLibrarieStudent {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMockIntoareTrue() throws ExceptieLibrarie {
		MockConnector myMock = new MockConnector(true);
		
		LibrarieStudenti.conector = myMock;
		
		int expectedResult = 1;
		int actual = 
				LibrarieStudenti.salvareBazaDate("Gigel");
		assertEquals(expectedResult, actual);
	}

}
