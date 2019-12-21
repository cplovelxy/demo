package com.company.product.template.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.company.product.template.entity.User;
import com.company.product.template.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cp
 * @since 2019-12-21
 */
@RestController
@RequestMapping("/template/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;


    @RequestMapping(method = RequestMethod.POST , path = "/save")
    public void save(){
        User user = new User();
        user.setPassword("xx");
        user.setAvatarUrl("xx");
        user.setDeviceId("xx");
        user.setDeviceModel("xx");
        user.setEmail("xx");
        user.setMac("xx");
        user.setName("xx");
        user.setNickName("xx");
        user.setPhone("xx");
        user.setRegisterIp("xx");
        user.setRegisterTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        user.setStatus(1);
        user.setRegisterType(1);
        user.setRegisterFrom("xx");

        userMapper.insert(user);
    }


    @RequestMapping(method = RequestMethod.POST , path = "/select")
    public List<User> select(){
       return userMapper.selectList(new QueryWrapper());
    }

}
