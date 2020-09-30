package com.spring929;

import com.spring929.idi.controller.UserController;
import com.spring929.idi.dao.UserDao;
import com.spring929.idi.service.UserService;
import com.spring929.tx.annotation.ATest;
import com.spring929.tx.dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @author osumg
 * @since 2020/9/29
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ATest bean = (ATest) applicationContext.getBean("aTest");
        bean.giveAge("1", "2");
    }
}
