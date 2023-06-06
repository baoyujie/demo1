package com.example.demo1.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo1.generator.domain.User;
import com.example.demo1.generator.service.IUserService;
import com.example.demo1.generator.mapper.UserMapper;
import com.example.demo1.generator.service.ex.InsertException;
import com.example.demo1.generator.service.ex.UsernameDuplicatedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
* @author 11645
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-04-11 15:01:03
*/
// @Service注解将当前类的对象交给Spring来管理，自动创建对象以及对象的维护
@Resource
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void reg(User user) {
        // 通过user参数获取传递过来的username
        String username = user.getUsername();
        //调用findByUsername(username) 判断用户是否被注册过
        User result = userMapper.findByUsername(username);
        // 判断结果集是否为null，是则可以注册，否则抛出异常
        if(result != null){
            // 抛出异常
            throw new UsernameDuplicatedException("用户名已被注册");
        }

        // 补全数据
        user.setCreatedUser(user.getUsername());
        user.setModifiedUser(user.getUsername());
        Date date = new Date();
        user.setCreatedTime(date);
        user.setModifiedTime(date);
        // 执行注册业务逻辑
        int rows = userMapper.insert(user);

        if(rows != 1){
            throw new InsertException("在用户注册过程中，产生了未知异常");
        }
    }
}




