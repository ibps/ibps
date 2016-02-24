package com.ibps.persistence.hibernate;

import org.hibernate.Session;

public interface IPersistenceManager {

	public Session openSessionAndBeginTransaction() throws PersistenceException;

	/**
	 * closes a Hibernate Session
	 * 
	 * @throws PersistenceException
	 */
	public void closeAndCommitSession() throws PersistenceException;

}
