package ro.ase.cts.acs.course5;

import ro.ase.cts.acs.course5.exceptions.MyLibraryException;

public class StudentLibrary {
	
	private static DBConnectorInterface connector;
	
	public static void setDBConnector(DBConnectorInterface con){
		if(con!=null)
			connector = con;
		else
			throw new NullPointerException();
	}
	
	public static int DBSave(Student student) 
			throws MyLibraryException{
		if(connector.insertStudent(student))
			return 1;
		else
			return 0;
	}
	
	public static void DBSaveEmail(
			Student student,String emailStudent){
		
	}
}
