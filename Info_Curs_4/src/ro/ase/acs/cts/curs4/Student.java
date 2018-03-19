package ro.ase.acs.cts.curs4;


public class Student {
	public static final int VARSTA_MAXIMA = 150;
	int varsta;

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) throws Exception {
		if(varsta  > VARSTA_MAXIMA)
			throw new Exception();
		this.varsta = varsta;
	}
}
