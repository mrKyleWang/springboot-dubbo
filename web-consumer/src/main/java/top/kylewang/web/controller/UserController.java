package top.kylewang.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.kylewang.pojo.User;
import top.kylewang.service.UserService;

/**
 * @author Kyle.Wang
 * 2018-03-01 12:08
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/user")
    public User findUser(String username,String password){
        User user = userService.findUserByUsernameAndPassword(username, password);
        return user;
    }
}
