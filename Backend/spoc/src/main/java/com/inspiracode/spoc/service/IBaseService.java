package com.inspiracode.spoc.service;

import java.util.ArrayList;
import java.util.List;

import com.inspiracode.spoc.model.IBaseEntity;
import com.inspiracode.spoc.model.ValidationError;

public interface IBaseService<T extends IBaseEntity> extends
		IBaseReadOnlyService<T> {
	List<ValidationError> add(T entity);

	List<ValidationError> update(T entity);

	void delete(T entity);

	default List<ValidationError> validate(T entity) {
		return new ArrayList<ValidationError>();
	}
}
