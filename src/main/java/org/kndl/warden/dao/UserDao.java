package org.kndl.warden.dao;

import org.kndl.warden.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
public class UserDao extends AbstractDAO<User> {

    @Override
    public User getById(long id) {
        return (User)getSessionFactory().getCurrentSession().byId(User.class).load(id);
    }

    @Override
    public List<User> get() {
        return new ArrayList<>();
    }

    @Override
    public User save(User obj) {
        Long id = (Long)getSessionFactory().getCurrentSession().save(obj);
        obj.setId(id);
        return obj;
    }

    @Override
    public void delete(User obj) {
        getSessionFactory().getCurrentSession().delete(obj);
    }

}
