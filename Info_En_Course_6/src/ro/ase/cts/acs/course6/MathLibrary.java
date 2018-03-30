package ro.ase.cts.acs.course6;

import ro.ase.cts.acs.course6.exceptions.MyLibraryException;

public class MathLibrary {
	
	public static int min(int[] values) throws MyLibraryException{
		
		if(values.length == 0)
			throw new MyLibraryException();
		
		int minimum = values[0];
		for(int i=1;i<values.length;i++)
			if(minimum > values[i])
				minimum = values[i];
		return minimum;
	}
	
	public static int[] sort(int[] values) throws MyLibraryException{
		
		if(values==null)
			throw new MyLibraryException();
		
		int[] result = values.clone();
		
		boolean keepGoing = true;
		while(keepGoing){
			keepGoing = false;
			for(int i=0;i<result.length-1;i++)
				if(result[i] > result[i+1]){
					int temp = result[i];
					result[i] = result[i+1];
					result[i+1] = temp;
					keepGoing = true;
				}
		}
		return result;
	}
}
