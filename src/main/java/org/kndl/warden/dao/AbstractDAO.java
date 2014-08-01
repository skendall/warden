package org.kndl.warden.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractDAO<T> {

    @Autowired
    private SessionFactory sessionFactory;

    SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public abstract T getById(long id);

    public abstract List<T> get();

    public abstract T save(T obj);

    public abstract void delete(T obj);

}
