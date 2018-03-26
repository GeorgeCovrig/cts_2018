package ro.ase.acs.cts.seminar5.teste;

import junit.framework.TestCase;
import ro.ase.acs.cts.seminar5.ExceptieLipsaNote;
import ro.ase.acs.cts.seminar5.ExceptieNoteIncorecte;
import ro.ase.acs.cts.seminar5.Student;

public class TestCaseStudent extends TestCase {
	
	//fixture
	Student student;
	public static final int VARSTA_INITIALA = 20;
	public static final String NUME_INITIAL = "Gigel";
	
	public TestCaseStudent(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		student = new Student(VARSTA_INITIALA, NUME_INITIAL);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		student = null;
	}

	public void testCalculMedieConformance() 
			throws ExceptieLipsaNote, ExceptieNoteIncorecte{
		//definire valori intrare
		int[] note = {9,9,10};
		student.setNote(note);
		
		float medieAsteptata = 9.33f;
		
		//apel functie testata
		float rezultatObtinut = student.calculeazaMedie();
		
		//verificam rezultat
		assertEquals("Test conformance - valori normale"
				,medieAsteptata, rezultatObtinut, 0.01);
		
	}
	
	public void testSetNoteRange(){
		int[] noteIntrare = {-1,12,10};
		
		try {
			student.setNote(noteIntrare);
			fail("Nu arunca exceptie pentru note gresite");
		} catch (ExceptieNoteIncorecte e) {
			assertTrue(true);
		}
		catch(Exception e){
			fail("Arunca alt tip de exceptie");
		}
	}
	
	public void testSetNoteLimite() throws ExceptieLipsaNote{
		int[] noteIntrare = {0,10};
		
		try {		
			student.setNote(noteIntrare);	
		} catch (ExceptieNoteIncorecte e) {
			fail("Genereaza exceptie pe limite");
		}
	}
	
	public void testSetNoteReference(){
		int[] noteIntrare = {10,10};

		try {		
			student.setNote(noteIntrare);	
			noteIntrare[0] = 5;
			
			assertEquals(10, student.getNota(0));
			
		} catch (ExceptieNoteIncorecte e) {
			fail("Genereaza exceptie pentru valori normale");
		}
		catch(Exception e){
			fail("Genereaza alta exceptie");
		}
	}
	
	public void testSetNoteExistence(){
		int[] noteNoi = null;
		
		try {
			student.setNote(noteNoi);
			fail("Lipsa exceptie");
		} catch (ExceptieNoteIncorecte e) {
			fail("Nu primesc exceptia asteptata");
		}
		catch(ExceptieLipsaNote e){
			assertTrue(true);
		}
	}
}
