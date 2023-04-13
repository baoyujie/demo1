package com.example.demo1.mapper;


import generator.domain.User;
import generator.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

// 标注当前类是测试类，不会随项目打包
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;
    /**
     * 单元测试方式 就可以单独独立运行，不用启动整个项目，可以做单元测试。提示代码测试效率
     * 1、必须被Test注解修饰
     * 2、返回值类型必须是void
     * 3、方法的参数列表不指定任何类型
     * 4、方法的访问修饰符必须是public
     */
    @Test
    public void insert(){
        User user = new User();
        user.setUsername("tim");
        user.setPassword("123");
        int rows = userMapper.insert(user);
        System.out.println(rows);
    }

    @Test
    public void findByUsername(){
        User user = userMapper.findByUsername("tim");
        System.out.println(user);
    }
}
