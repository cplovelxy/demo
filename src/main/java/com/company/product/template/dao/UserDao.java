package com.company.product.template.dao;

import com.company.product.template.entity.User;
import com.company.product.template.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;


    public void saveUser(User user) throws InterruptedException {
        long time = (long) (Math.random() * 20000);
        System.out.println("当前线程"+ Thread.currentThread().getName() + "阻塞时间为："+time);
        Thread.sleep(time);
        userMapper.insert(user);
    }


}
