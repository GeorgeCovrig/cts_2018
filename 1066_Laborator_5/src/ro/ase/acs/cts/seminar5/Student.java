package ro.ase.acs.cts.seminar5;

import java.util.Arrays;

public class Student {
	int varsta;
	String nume;
	int[] note;
	public Student(int varsta, String nume) {
		this.varsta = varsta;
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
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
		int suma = this.note[0];
		for(int i=1;i<this.note.length;i++){
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
