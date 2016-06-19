package com.inspiracode.spoc.webapi.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inspiracode.spoc.model.IBaseEntity;
import com.inspiracode.spoc.webapi.rest.model.CommonResponse;

public abstract class BaseRestController<T extends IBaseEntity> extends
		BaseReadOnlyRestController<T> {
	
	@RequestMapping(method = RequestMethod.POST)
	public CommonResponse add(@RequestBody T entity) {
		return new CommonResponse();
	}

	@RequestMapping(method = RequestMethod.PUT)
	public CommonResponse update(@RequestBody T entity) {
		return new CommonResponse();
	}

	@RequestMapping(method = RequestMethod.DELETE, value="{id}")
	public CommonResponse delete(@PathVariable("id") int id) {
		return new CommonResponse();
	}

	@RequestMapping(method = RequestMethod.POST, value="activate/{id}")
	public CommonResponse activate(@PathVariable("id") int id) {
		return new CommonResponse();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="deactivate/{id}")
	public CommonResponse deactivate(@PathVariable("id") int id) {
		return new CommonResponse();
	}
}