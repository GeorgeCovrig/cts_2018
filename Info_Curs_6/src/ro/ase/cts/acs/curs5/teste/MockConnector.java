package ro.ase.cts.acs.curs5.teste;

import ro.ase.cts.acs.curs5.InterfataConectorBDStudenti;

public class MockConnector implements InterfataConectorBDStudenti {

	boolean returnTrue;
	
	
	
	public MockConnector(boolean returnTrue) {
		this.returnTrue = returnTrue;
	}

	@Override
	public boolean insertStudent(String nume) {
		if(this.returnTrue)
			return true;
		else
			return false;
	}

}
