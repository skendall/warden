package org.kndl.warden.dao;

import java.util.List;

public abstract class AbstractDAO<T> {

    public abstract T getById(long id);

    public abstract List<T> get();

    public abstract void save(T obj);

    public abstract void delete(T obj);

}
