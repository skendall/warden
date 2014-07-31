package org.kndl.warden.config;

import org.kndl.warden.dao.UserDao;
import org.kndl.warden.service.UserService;
import org.kndl.warden.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

}
