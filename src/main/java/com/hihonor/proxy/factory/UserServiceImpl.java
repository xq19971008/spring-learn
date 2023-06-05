package com.hihonor.proxy.factory;

import com.hihonor.proxy.User;

public class UserServiceImpl implements UserService{
    public void login(String name, String password) {
        System.out.println("name is " + name + ",password is " + password);
    }

    public void register(User user) {
        System.out.println("strat register" + user.toString());
    }
}
