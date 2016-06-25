package com.inspiracode.spoc.service;

import com.inspiracode.spoc.model.IBaseEntity;

public interface IBaseService<T extends IBaseEntity> extends IBaseReadOnlyService<T> {
	void add(T entity);
	void update (T entity);
	void delete (T entity);
}
