package org.kndl.warden.service;

import org.kndl.warden.domain.User;

import java.util.List;

public interface UserService {
    public User getUserById(long id);
    public void storeUser(User user);
    public List<User> getUsers();
    public void deleteUser(User user);
}
