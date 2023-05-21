package com.hihonor.proxy;

public class UserServiceImpl implements UserService{
    public void register(User user) {
        System.out.println("用户完成了注册" + user.toString());
    }

    public void login(String userName, String password) {
        System.out.println("用户完成了登陆，账号密码分别为：" + userName + "/" + password);
    }
}
