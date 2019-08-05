package com.mvn.dao;


import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.mvn.entity.User;

public interface UserDao{
    
    public void save(User user); 

}
