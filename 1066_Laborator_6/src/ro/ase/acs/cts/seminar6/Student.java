package ro.ase.acs.cts.seminar6;

import ro.ase.acs.cts.seminar6.exceptii.ExceptieLipsaNote;
import ro.ase.acs.cts.seminar6.exceptii.ExceptieNoteIncorecte;
import ro.ase.acs.cts.seminar6.exceptii.ExceptieVarsta;

public class Student {
	int varsta;
	String nume;
	int[] note;
	
	public static final int VARSTA_MINIMA = 10;
	public static final int VARSTA_MAXIMA = 100;
	
	public Student(int varsta, String nume) {
		this.varsta = varsta;
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) throws ExceptieVarsta{
		if(varsta>=VARSTA_MINIMA && varsta<=VARSTA_MAXIMA)
			this.varsta = varsta;
		else
			throw new ExceptieVarsta();
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setNote(int[] note) 
			throws ExceptieNoteIncorecte, ExceptieLipsaNote{
		
		if(note==null)
			throw new ExceptieLipsaNote();
		
		for(int i = 0; i<note.length ;i++)
			if(note[i] < 0 || note[i]>10)
				throw new ExceptieNoteIncorecte();
		this.note = note.clone();
	}
	
	public float calculeazaMedie() throws ExceptieLipsaNote{
		if(this.note==null)
			throw new ExceptieLipsaNote();
		if(this.note.length == 0)
			return 0;
		
		int suma = 0;
		for(int i=0;i<this.note.length;i++){
			suma += this.note[i];
		}
		return (float)suma/this.note.length;
	}
	
	public int getNota(int index) throws Exception{
		if(index >=0 && index < this.note.length)
			return this.note[index];
		else
			throw new Exception();
	}
}
