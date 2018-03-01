package top.kylewang.service;

import top.kylewang.pojo.User;

/**
 * @author Kyle.Wang
 * 2018-03-01 11:47
 */
public interface UserService {

    /**
     * 根据用户名密码查询用户
     * @param username
     * @param password
     * @return
     */
    User findUserByUsernameAndPassword(String username,String password);

}
