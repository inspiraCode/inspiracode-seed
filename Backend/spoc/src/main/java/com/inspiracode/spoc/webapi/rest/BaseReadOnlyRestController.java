package com.inspiracode.spoc.webapi.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inspiracode.spoc.model.IBaseEntity;
import com.inspiracode.spoc.webapi.rest.model.CommonResponse;

/**
 * 
 * @author Inspiracode
 *
 * @param <T>
 */

@CrossOrigin
public abstract class BaseReadOnlyRestController<T extends IBaseEntity> {

	@RequestMapping(method = RequestMethod.GET)
	public CommonResponse getAll() {
		// TODO Generate Service Connector
		return new CommonResponse();
	}

	@RequestMapping(method = RequestMethod.GET, value="{id}")
	public CommonResponse getById(@PathVariable("id") int id) {
		// TODO Generate Service Connector
		return new CommonResponse();
	}
}