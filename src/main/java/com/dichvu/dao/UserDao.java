package com.dichvu.dao;

import com.dichvu.model.User;
import org.springframework.data.repository.CrudRepository;


public interface  UserDao extends CrudRepository<User, Integer> {

}
