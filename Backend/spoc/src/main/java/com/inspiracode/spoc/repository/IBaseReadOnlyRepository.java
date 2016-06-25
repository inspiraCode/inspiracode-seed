package com.inspiracode.spoc.repository;

import java.util.List;

import com.inspiracode.spoc.model.IBaseEntity;

public interface IBaseReadOnlyRepository<T extends IBaseEntity> {
	T getById(int id);
	List<T> getAll();
}
