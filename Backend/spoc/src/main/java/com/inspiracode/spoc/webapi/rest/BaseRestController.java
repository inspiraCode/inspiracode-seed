package com.inspiracode.spoc.webapi.rest;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inspiracode.spoc.model.IBaseEntity;
import com.inspiracode.spoc.model.ValidationError;
import com.inspiracode.spoc.service.IBaseService;
import com.inspiracode.spoc.webapi.rest.model.CommonResponse;

public abstract class BaseRestController<T extends IBaseEntity> extends
		BaseReadOnlyRestController<T> {

	public BaseRestController() {

	}

	private IBaseService<T> service;

	public BaseRestController(IBaseService<T> service) {
		super(service);
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.POST)
	public CommonResponse<T> add(@RequestBody T entity) {
		List<ValidationError> validationErrorList = service.add(entity);
		return new CommonResponse<T>(entity, validationErrorList);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public CommonResponse<T> update(@RequestBody T entity) {
		List<ValidationError> validationErrorList = service.update(entity);
		return new CommonResponse<T>(entity, validationErrorList);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public CommonResponse<T> delete(@PathVariable("id") int id) {
		try {
			service.delete(service.getById(id));	
		} catch (Exception e) {
			return new CommonResponse<T>(e.getMessage());
		}
		return new CommonResponse<T>();
	}

	@RequestMapping(method = RequestMethod.POST, value = "activate/{id}")
	public CommonResponse<T> activate(@PathVariable("id") int id) {
		return new CommonResponse<T>();
	}

	@RequestMapping(method = RequestMethod.POST, value = "deactivate/{id}")
	public CommonResponse<T> deactivate(@PathVariable("id") int id) {
		return new CommonResponse<T>();
	}
}