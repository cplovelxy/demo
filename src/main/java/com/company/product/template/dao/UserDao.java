package com.company.product.template.dao;

import com.company.product.template.entity.User;
import com.company.product.template.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;


    public void saveUser(User user){
        userMapper.insert(user);
    }


}
