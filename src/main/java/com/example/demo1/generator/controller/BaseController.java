package com.example.demo1.generator.controller;


import com.example.demo1.generator.service.ex.*;
import com.example.demo1.generator.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

// 控制层基类
public class BaseController {
    /** 操作策成功状态码 */
    public static final int OK = 200;

    // 请求处理方法
    // 自动将异常对象传递给此方法的参数列表上
    @ExceptionHandler(ServiceException.class)// 用于统一处理抛出的异常
    public JsonResult<Void> handlerException(Throwable e){
        JsonResult<Void> result = new JsonResult<>(e);
        if(e instanceof UsernameDuplicatedException){
            result.setState(4000);
            result.setMsg("用户名被占用的异常");
        }else if(e instanceof InsertException){
            result.setState(5000);
            result.setMsg("插入数据时产生未知的异常");
        }else if(e instanceof UserNotFoundException){
            result.setState(5001);
            result.setMsg("用户数据不存在的异常");
        }else if(e instanceof PasswordNotMatchExecption){
            result.setState(5002);
            result.setMsg("密码不匹配的异常");
        }
        return result;
    }
}
