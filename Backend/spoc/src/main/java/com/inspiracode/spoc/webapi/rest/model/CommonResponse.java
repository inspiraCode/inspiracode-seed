package com.inspiracode.spoc.webapi.rest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.inspiracode.spoc.model.IBaseEntity;
import com.inspiracode.spoc.model.ValidationError;

public class CommonResponse<T extends IBaseEntity> implements Serializable {
	private static final long serialVersionUID = 1L;

	public CommonResponse() {
		this.setSuccess(true);
	}

	public CommonResponse(T entity) {
		this();
		this.data.add(entity);
	}

	public CommonResponse(List<T> data) {
		this();
		this.data = data;
	}

	public CommonResponse(T data, List<ValidationError> validationErrorList) {
		this();
		this.data.add(data);
		this.validationError = validationErrorList;
	}

	public CommonResponse(String sError) {
		validationError.add(new ValidationError(sError));
		this.setSuccess(false);
	}

	private boolean success = true;
	private List<T> data = new ArrayList<>();
	private List<ValidationError> validationError = new ArrayList<>();

	/**
	 * @return the data
	 */
	public List<T> getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(List<T> data) {
		this.data = data;
	}

	/**
	 * @return the validationError
	 */
	public List<ValidationError> getValidationError() {
		return validationError;
	}

	/**
	 * @param validationError
	 *            the validationError to set
	 */
	public void setValidationError(List<ValidationError> validationError) {
		this.validationError = validationError;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success
	 *            the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
}
