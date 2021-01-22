package com.sun.dao;

import com.sun.model.Account;
import com.sun.util.DButil;

import java.sql.SQLException;
import java.util.List;

public interface AccountDao {
    public int register(Account account);
}
