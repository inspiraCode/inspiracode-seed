package com.inspiracode.spoc.service;

import java.util.List;

import com.inspiracode.spoc.model.IBaseEntity;
import com.inspiracode.spoc.model.ValidationError;
import com.inspiracode.spoc.repository.IBaseRepository;

public abstract class BaseService<T extends IBaseEntity> extends
		BaseReadOnlyService<T> implements IBaseService<T> {

	private IBaseRepository<T> repository;

	public BaseService() {

	}

	public BaseService(IBaseRepository<T> repository) {
		super(repository);
		this.repository = repository;
	}

	public List<ValidationError> add(T entity) {
		List<ValidationError> validationResult = validate(entity);
		if (validationResult.isEmpty()) {
			repository.add(entity);
		}
		return validationResult;
	}

	public List<ValidationError> update(T entity) {
		List<ValidationError> validationResult = validate(entity);
		if (validationResult.isEmpty()) {
			repository.update(entity);
		}
		return validationResult;
	}

	public void delete(T entity) {
		repository.delete(entity);
	}
}
