package generator.mapper;

import generator.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 11645
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-04-11 15:01:03
* @Entity generator.domain.User
*/
//规划sql语句，在接口中定义两个sql语句抽象方法
public interface UserMapper extends BaseMapper<User> {
    // 插入操作

    /**
     * 插入用户的数据
     * @param user 用户的数据
     * @return 受影响的行数，增删改都有受影响的行数，根据返回值判断是否返回成功
     */
    @Override
    int insert(User user);
    //查询当前的用户名是否存在

    /**
     * 根据用户名查找用户的数据
     * @param username 用户名
     * @return 如果找到对应的用户则返回这个用户的数据，否则返回null值
     */
    User findByUsername(String username);
}




