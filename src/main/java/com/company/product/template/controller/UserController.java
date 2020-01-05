package com.company.product.template.controller;


import com.company.product.template.dao.UserDao;
import com.company.product.template.entity.User;
import io.swagger.annotations.*;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cp
 * @since 2019-12-15
 */
@RestController
@RequestMapping("/template/user")
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RedissonClient redissonClient;

    @ApiOperation(value = "用户信息", response = User.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "head" , dataTypeClass = String.class),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回信息")
    })
    @RequestMapping(method = RequestMethod.POST , value = "/add")
    public User test(@RequestBody User user) {
        userDao.saveUser(user);
        return user;
    }


    @ApiOperation(value = "redis测试", response = User.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "head" , dataTypeClass = String.class),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回信息")
    })
    @RequestMapping(method = RequestMethod.POST , value = "/redis")
    public User redis(@RequestBody User user) {
        RBucket<User> rBucket = redissonClient.getBucket("redis-user");
        rBucket.set(user);
        User user1 = rBucket.get();
        return user;
    }

}
