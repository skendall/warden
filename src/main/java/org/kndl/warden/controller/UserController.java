package org.kndl.warden.controller;

import org.kndl.warden.domain.User;
import org.kndl.warden.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "v1/user.get", method = RequestMethod.GET)
    @ResponseBody
    public User userGet(@RequestParam long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "v1/user.create", method = RequestMethod.POST)
    @ResponseBody
    public User userCreate(@RequestParam String email, @RequestParam String password) {
        return userService.storeUser(email, password);
    }

}
