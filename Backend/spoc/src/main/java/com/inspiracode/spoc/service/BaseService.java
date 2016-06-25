package com.inspiracode.spoc.service;

import com.inspiracode.spoc.model.IBaseEntity;
import com.inspiracode.spoc.repository.IBaseRepository;

public abstract class BaseService<T extends IBaseEntity> extends BaseReadOnlyService<T> implements IBaseService<T> {

	private IBaseRepository<T> repository;
	public BaseService(){
		
	}
	
	public BaseService(IBaseRepository<T> repository){
		super(repository);
		this.repository = repository;
	}
	
	public void add(T entity) {
		repository.add(entity);
	}

	public void update(T entity) {
		repository.update(entity);
	}

	public void delete(T entity) {
		repository.delete(entity);
	}
}
