package com.inspiracode.spoc.model;

import java.io.Serializable;

public class ValidationError implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String code;
	private String description;
	private String origin;
	private ErrorLevel errorLevel;

	public static enum ErrorLevel {
		INFO, WARNING, CRITICAL
	}

	public ValidationError() {

	}

	public ValidationError(String code, String description, String origin,
			ErrorLevel errorLevel) {
		super();
		this.code = code;
		this.description = description;
		this.origin = origin;
		this.errorLevel = errorLevel;
	}
	
	public ValidationError(String description) {
		super();
		this.code = "";
		this.description = description;
		this.origin = "";
		this.errorLevel = ErrorLevel.INFO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ValidationError [code=" + code + ", description=" + description
				+ ", origin=" + origin + ", errorLevel=" + errorLevel + "]";
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the errorLevel
	 */
	public ErrorLevel getErrorLevel() {
		return errorLevel;
	}

	/**
	 * @param errorLevel
	 *            the errorLevel to set
	 */
	public void setErrorLevel(ErrorLevel errorLevel) {
		this.errorLevel = errorLevel;
	}

}
