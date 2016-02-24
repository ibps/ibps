package com.ibps.persistence.hibernate;

public class PersistenceException extends Exception {

	private static final long serialVersionUID = 1L;

	private String errorCode;

	private Exception e;

	public PersistenceException(Exception ex, String error) {
		this.errorCode = error;
		this.e = ex;
	}

	public PersistenceException(String error) {
		this.errorCode = error;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void printStackTrace() {
		if (e != null) {
			e.printStackTrace();
		}
	}


}
