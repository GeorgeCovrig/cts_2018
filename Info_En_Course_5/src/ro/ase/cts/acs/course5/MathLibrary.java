package ro.ase.cts.acs.course5;

import ro.ase.cts.acs.course5.exceptions.MyLibraryException;

public class MathLibrary {
	
	public static int min(int[] values) throws MyLibraryException{
		
		int minimum = values[0];
		for(int i=1;i<values.length;i++)
			if(minimum > values[i])
				minimum = values[i];
		return minimum;
		
	}
}
