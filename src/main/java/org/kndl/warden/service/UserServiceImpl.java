package org.kndl.warden.service;

import org.kndl.warden.dao.UserDao;
import org.kndl.warden.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(long id) {
        return userDao.getById(id);
    }

    @Override
    public User storeUser(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        return userDao.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.get();
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }
}
