package ro.ase.cts.acs.curs5;

import ro.ase.cts.acs.curs5.exceptii.ExceptieLibrarie;

public class LibrarieMatematica {
	
	public static int min(int[] valori) throws ExceptieLibrarie{
		
		if(valori == null)
			throw new ExceptieLibrarie();
		
		if(valori.length == 0)
			throw new ExceptieLibrarie();
		
		int minim = valori[0];
		for(int i=1;i<valori.length;i++)
			if(minim > valori[i])
				minim = valori[i];
		return minim;
		
	}
}
