package com.example.demo1.generator.service;

import com.example.demo1.generator.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 11645
* @description 针对表【user】的数据库操作Service
* @createDate 2023-04-11 15:01:03
*/
public interface IUserService extends IService<User> {
    /**
     * 用户注册方法
     * @param user 用户的数据对象
     */
    void reg(User user);
}
