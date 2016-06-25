package com.inspiracode.spoc.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.inspiracode.spoc.model.IBaseEntity;

public abstract class BaseReadOnlyHibernateRepository<T extends IBaseEntity>
		extends HibernateDaoSupport implements IBaseReadOnlyRepository<T> {

	private Class<T> type;
	
	public BaseReadOnlyHibernateRepository() {

	}

	public BaseReadOnlyHibernateRepository(Class<T> type, SessionFactory session) {
		this.type = type;
		setSessionFactory(session);
	}

	public T getById(int id) {
		//return get hibernateTemplate.get(type, id);
		return getHibernateTemplate().get(type, id);
	}

	public List<T> getAll() {
		return getHibernateTemplate().loadAll(type);
	}

}
