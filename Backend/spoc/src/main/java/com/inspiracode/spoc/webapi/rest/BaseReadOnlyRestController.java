package com.inspiracode.spoc.webapi.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inspiracode.spoc.model.IBaseEntity;
import com.inspiracode.spoc.service.IBaseReadOnlyService;
import com.inspiracode.spoc.webapi.rest.model.CommonResponse;

/**
 * 
 * @author Inspiracode
 *
 * @param <T>
 */

@CrossOrigin
public abstract class BaseReadOnlyRestController<T extends IBaseEntity> {

	// Injectable instance
	public BaseReadOnlyRestController() {

	}

	private IBaseReadOnlyService<T> service;

	// A service must be configured for this to work
	public BaseReadOnlyRestController(IBaseReadOnlyService<T> service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public CommonResponse<T> getAll() {
		return new CommonResponse<T>(service.getAll());
	}

	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public CommonResponse<T> getById(@PathVariable("id") int id) {
		return new CommonResponse<T>(service.getById(id));
	}
}