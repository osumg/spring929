package com.spring929.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * </p>
 *
 * @author osumg
 * @since 2020/9/30
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
//    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void giveAge(String giver, String winner) {
        jdbcTemplate.update("update account set usex=usex-1 where uid=?", giver);
        int i = 1 / 0;
        jdbcTemplate.update("update account usex=usex+1 where uid=?", winner);
    }
}
