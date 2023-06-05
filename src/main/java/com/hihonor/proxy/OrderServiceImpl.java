package com.hihonor.proxy;

import com.hihonor.proxy.annotation.Log;

public class OrderServiceImpl implements OrderService{
    public void register(Order order) {
        System.out.println("register order");
    }

    @Log
    public void login(String userName, String password) {
        System.out.println("login order");
    }
}
