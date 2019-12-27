package ua.nure.kn.popovych.agent;

import ua.nure.kn.popovych.db.DatabaseException;

public class SearchException extends Exception {
	
	public SearchException(DatabaseException e) {
		// TODO Auto-generated constructor stub
		e.printStackTrace();
	}

}
