package com.inspiracode.spoc.repository;

import com.inspiracode.spoc.model.IBaseEntity;

public interface IBaseRepository<T extends IBaseEntity> extends IBaseReadOnlyRepository<T> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
}
