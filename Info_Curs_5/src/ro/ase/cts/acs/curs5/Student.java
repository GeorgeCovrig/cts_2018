package ro.ase.cts.acs.curs5;

import ro.ase.cts.acs.curs5.exceptii.ExceptieVarstaStudent;

public class Student {
	
	public static final int VARSTA_MINIMA = 5;
	public static final int VARSTA_MAXIMA = 90;
	
	int varsta;
	
	public void setVarsta(int valoare) 
			throws ExceptieVarstaStudent{
		if(valoare >= VARSTA_MINIMA && valoare <= VARSTA_MAXIMA)
		this.varsta = valoare;
		else
			throw new ExceptieVarstaStudent();
	}

	public int getVarsta() {
		return varsta;
	}
	
	
}
