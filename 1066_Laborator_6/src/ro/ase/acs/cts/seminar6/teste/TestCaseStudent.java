package ro.ase.acs.cts.seminar6.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.acs.cts.seminar6.Student;
import ro.ase.acs.cts.seminar6.exceptii.ExceptieLipsaNote;
import ro.ase.acs.cts.seminar6.exceptii.ExceptieNoteIncorecte;
import ro.ase.acs.cts.seminar6.exceptii.ExceptieVarsta;

public class TestCaseStudent {
	
	//fixture
	Student student;
	
	public static final long PERFORMANCE_LIMIT = 1000;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(23, "Gigel");
	}

	@After
	public void tearDown() throws Exception {
		student = null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaErrorValoarePreaMare() throws ExceptieVarsta{
		int varstaNoua = Student.VARSTA_MAXIMA+3;
		student.setVarsta(varstaNoua);
	}
	
	@Test
	public void testCalculMedieCardinalitateZero() throws ExceptieNoteIncorecte, ExceptieLipsaNote{
		int[] note = new int[0];
		student.setNote(note);
		
		float expectedValue = 0.0f;
		float medieStudent = student.calculeazaMedie();
		
		assertEquals(expectedValue,medieStudent,0.0f);
		
	}

	@Test
	public void testCalculMedieCardinalitateUnu() throws ExceptieNoteIncorecte, ExceptieLipsaNote{
		int[] note = {10};
		student.setNote(note);
		
		float expectedValue = 10.0f;
		float medieStudent = student.calculeazaMedie();
		
		assertEquals(expectedValue,medieStudent,0.0f);
		
	}
	
	@Test
	public void testCalculMedieTime() throws ExceptieNoteIncorecte, ExceptieLipsaNote{
		int[] note = {10,9,9,9,10,9,9,10,10,10};
		student.setNote(note);
		
		
		
		long start = System.currentTimeMillis();
		float rezultat = student.calculeazaMedie();
		long sfarsit = System.currentTimeMillis();
		
		if((sfarsit - start) >= PERFORMANCE_LIMIT)
			fail("Executie prea lenta");
		else
			assertTrue(true);
	
	}
	
	@Test(timeout = PERFORMANCE_LIMIT)
	public void testCalculMediePerformance() throws ExceptieNoteIncorecte, ExceptieLipsaNote{
		int[] note = {10,9,9,9,10,9,9,10,10,10};

		for(int i = 0;i<1000000000;i++)
			student = new Student(23, "Gigel");
		student.setNote(note);
		
		float rezultat = student.calculeazaMedie();

	}
	
	@Test
	public void testCalculMedieCrossCheck() throws ExceptieNoteIncorecte, ExceptieLipsaNote{
		int[] note = {10,10,9};
		
		student.setNote(note);
		
		float actualValue = student.calculeazaMedie();
		
		//rutina proprie pentru calcul medie
		float medie = (note[0]+note[1]+note[2])/3.0f;
		
		assertEquals(medie, actualValue,0.0f);
		
	}
	
	@Category(TesteRapide.class)
	@Test
	public void testSetVarstaInverse(){
		int varstaNoua = 20;
		
		try {
			student.setVarsta(varstaNoua);
			assertTrue(true);
		} catch (Exception e) {
			fail("Nu trebuia exceptie pentru valoare normala");
		}
	}
}
