package com.company.product.template.service.impl;

import com.company.product.template.entity.User;
import com.company.product.template.mapper.UserMapper;
import com.company.product.template.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cp
 * @since 2019-12-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
