package com.inspiracode.spoc.repository;

import org.hibernate.SessionFactory;

import com.inspiracode.spoc.model.IBaseEntity;

public abstract class BaseHibernateRepository<T extends IBaseEntity>
		extends BaseReadOnlyHibernateRepository<T> implements IBaseRepository<T> {

	public BaseHibernateRepository() {

	}

	public BaseHibernateRepository(Class<T> type, SessionFactory session) {
		super(type, session);		
	}

	public void add(T entity) {
		getHibernateTemplate().save(entity);
		getHibernateTemplate().flush();
	}

	public void update(T entity) {
		getHibernateTemplate().update(entity);
		getHibernateTemplate().flush();		
	}

	public void delete(T entity) {
		getHibernateTemplate().delete(entity);
		getHibernateTemplate().flush();		
	}	
}
