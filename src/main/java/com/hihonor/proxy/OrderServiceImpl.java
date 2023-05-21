package com.hihonor.proxy;

public class OrderServiceImpl implements OrderService{
    public void register(Order order) {
        System.out.println("register order");
    }

    public void login(String userName, String password) {
        System.out.println("login order");
    }
}
