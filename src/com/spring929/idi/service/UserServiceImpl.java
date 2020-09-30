package com.spring929.idi.service;

import com.spring929.idi.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author osumg
 * @since 2020/9/29
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public void login() {
        userDao.login();
        System.out.println("login service");
    }
}
