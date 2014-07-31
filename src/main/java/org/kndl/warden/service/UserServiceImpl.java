package org.kndl.warden.service;

import org.kndl.warden.dao.UserDao;
import org.kndl.warden.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public User getUserById(long id) {
        return dao.getById(id);
    }

    @Override
    public void storeUser(User user) {
        dao.save(user);
    }

    @Override
    public List<User> getUsers() {
        return dao.get();
    }

    @Override
    public void deleteUser(User user) {
        dao.delete(user);
    }
}
