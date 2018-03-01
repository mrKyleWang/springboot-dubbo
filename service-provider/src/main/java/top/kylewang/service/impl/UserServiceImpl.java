package top.kylewang.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import top.kylewang.pojo.User;
import top.kylewang.service.UserService;

/**
 * @author Kyle.Wang
 * 2018-03-01 12:04
 */
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        User user = new User();
        user.setId(9527);
        user.setUsername(username);
        user.setPassword(password);
        user.setDescription("我是一名java开发工程师,我自豪!");
        return user;
    }
}
