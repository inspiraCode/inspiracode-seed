package com.inspiracode.spoc.service;

import java.util.List;

import com.inspiracode.spoc.model.IBaseEntity;

public interface IBaseReadOnlyService<T extends IBaseEntity> {
	T getById(int id);
	List<T> getAll();
}
