package com.inspiracode.spoc.service;

import java.util.List;

import com.inspiracode.spoc.model.IBaseEntity;
import com.inspiracode.spoc.repository.IBaseReadOnlyRepository;

public abstract class BaseReadOnlyService<T extends IBaseEntity> implements
		IBaseReadOnlyService<T> {
	private IBaseReadOnlyRepository<T> repository;

	public BaseReadOnlyService() {
	}

	public BaseReadOnlyService(IBaseReadOnlyRepository<T> repository) {
		this.setRepository(repository);
	}

	/**
	 * @return the repository
	 */
	public IBaseReadOnlyRepository<T> getRepository() {
		return repository;
	}

	/**
	 * @param repository the repository to set
	 */
	public void setRepository(IBaseReadOnlyRepository<T> repository) {
		this.repository = repository;
	}

	public T getById(int id) {
		return repository.getById(id);
	}

	public List<T> getAll() {
		return repository.getAll();
	}
	
	
}
