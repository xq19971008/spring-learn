package com.hihonor.proxy;

public class UserServiceProxyImpl implements UserService{

    UserService userService = new UserServiceImpl();

    public void register(User user) {
        System.out.println("加入日志功能");
        userService.register(user);
    }

    public void login(String userName, String password) {
        System.out.println("加入日志功能");
        userService.login(userName,password);
    }
}
