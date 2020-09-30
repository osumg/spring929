package com.spring929.idi.controller;

import com.spring929.idi.service.UserService;

/**
 * <p>
 *
 * </p>
 *
 * @author osumg
 * @since 2020/9/29
 */
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void login() {
        userService.login();
        System.out.println("controller login");
    }

}
