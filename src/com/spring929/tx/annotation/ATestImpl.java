package com.spring929.tx.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *
 * </p>
 *
 * @author osumg
 * @since 2020/9/30
 */
@Component("aTest")
public class ATestImpl implements ATest{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    @Override
    public void giveAge(String giver, String winner) {
        jdbcTemplate.update("update account set usex=usex-1 where uid=?", giver);
        int i = 1 / 0;
        jdbcTemplate.update("update account usex=usex+1 where uid=?", winner);
    }
}
