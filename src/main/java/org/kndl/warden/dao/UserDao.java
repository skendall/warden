package org.kndl.warden.dao;

import org.kndl.warden.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class UserDao extends AbstractDAO<User> {
    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public List<User> get() {
        return null;
    }

    @Override
    public void save(User obj) {

    }

    @Override
    public void delete(User obj) {

    }
}
