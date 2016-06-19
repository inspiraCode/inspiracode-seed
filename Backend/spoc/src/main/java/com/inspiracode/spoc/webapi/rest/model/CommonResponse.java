package com.inspiracode.spoc.webapi.rest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.inspiracode.spoc.model.IBaseEntity;

public class CommonResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	public CommonResponse() {
		this.error = false;
		this.responseDescription = "OK";
	}

	public CommonResponse(List<IBaseEntity> data) {
		this();
		this.data = data;
	}

	public CommonResponse(String responseDescription) {
		this.responseDescription = responseDescription;
		this.error = true;
	}

	private Boolean error = false;
	private String responseDescription;
	private List<IBaseEntity> data = new ArrayList<IBaseEntity>();

	/**
	 * @return the error
	 */
	public Boolean getError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(Boolean error) {
		this.error = error;
	}

	/**
	 * @return the responseDescription
	 */
	public String getResponseDescription() {
		return responseDescription;
	}

	/**
	 * @param responseDescription
	 *            the responseDescription to set
	 */
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	/**
	 * @return the data
	 */
	public List<IBaseEntity> getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(List<IBaseEntity> data) {
		this.data = data;
	}
}
