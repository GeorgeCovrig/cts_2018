package ro.ase.cts.acs.curs5;

import ro.ase.cts.acs.curs5.exceptii.ExceptieLibrarie;

public class LibrarieStudenti {
	
	public static InterfataConectorBDStudenti conector;
	
	public static int salvareBazaDate(String nume) 
			throws ExceptieLibrarie{
		if(conector.insertStudent(nume))
			return 1;
		else
			return 0;
	}
	
	public static void salvareEmail(
			int idStudent,String emailStudent){
		
	}
}
