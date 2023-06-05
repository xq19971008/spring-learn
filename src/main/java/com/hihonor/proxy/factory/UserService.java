package com.hihonor.proxy.factory;

import com.hihonor.proxy.User;

public interface UserService {
    public void login(String name,String password);

    public void register(User user);
}
