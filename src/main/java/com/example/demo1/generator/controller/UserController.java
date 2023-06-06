package com.example.demo1.generator.controller;

import com.example.demo1.generator.domain.User;
import com.example.demo1.generator.service.IUserService;
import com.example.demo1.generator.service.ex.InsertException;
import com.example.demo1.generator.service.ex.UsernameDuplicatedException;
import com.example.demo1.generator.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class UserController extends BaseController{
    @Autowired
    private IUserService userService;
    //1
    // 2
    // 3
    /**
     *
     * 1、接收数据方式，请求处理方法的参数列表设置为pojo类型来接收前端的数据
     * SpringBoot会将前端的url地址中的参数名和pojo类的属性名进行比较，如果这两个名称相同，则将值注入到pojo类中对应的属性上
     */
    @PostMapping("/users/reg")
//    @RequestBody // 表明此方法的响应结果以json格式进行数据响应以给前端
    public JsonResult<Void> reg(User user){
        userService.reg(user);
        return new JsonResult<>(OK);
    }

    /**
     *
     * 2、接收数据方式，请求处理方法的参数列表设置为非pojo类型
     * SpringBoot会直接将请求的参数名和方法的参数名直接进行比较，如果名称相同，则自动完成值的依赖注入
     */
//    @PostMapping("/users/login")
//    public JsonResult<User> login(String username,String password){
//        User data = userService.login(username,password);
//        return new JsonResult<User>(OK,data);
//    }


}
