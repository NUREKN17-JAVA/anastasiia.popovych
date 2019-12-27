package ua.nure.kn.popovych.db;

import java.sql.Connection;

public interface ConnectionFactory {
	Connection getConnection() throws DatabaseException;
}
