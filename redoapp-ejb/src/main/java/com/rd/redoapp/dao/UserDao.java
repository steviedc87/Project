package com.rd.redoapp.dao;

import javax.ejb.Local;

import com.rd.redoapp.User;
import com.rd.redoapp.dao.common.Dao;

@Local
public interface UserDao extends Dao<User> {

	User findByUsername(String username);

}
