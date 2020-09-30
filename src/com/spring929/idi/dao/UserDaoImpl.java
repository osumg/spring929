package com.spring929.idi.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author osumg
 * @since 2020/9/29
 */
public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void login() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from account");
        System.out.println(maps);
        System.out.println("userdao login");
    }
}
