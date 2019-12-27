package ua.nure.kn.popovych.db;

import java.util.Collection;

import ua.nure.kn.popovych.usermanagement.User;

public interface Dao<T> {
	    T create(T entity) throws DatabaseException;

	    void update(T entity) throws DatabaseException;

	    void delete(T entity) throws DatabaseException;

	    T find(Long id) throws DatabaseException;

	    Collection<T> findAll() throws DatabaseException;
	    
	    Collection<T> find(String firstName, String lastName) throws DatabaseException;

	    void setConnectionFactory(ConnectionFactory connectionFactory);

}
