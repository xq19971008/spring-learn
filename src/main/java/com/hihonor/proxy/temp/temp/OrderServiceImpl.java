package com.hihonor.proxy.temp.temp;

import com.hihonor.proxy.Order;
import com.hihonor.proxy.OrderService;

public class OrderServiceImpl implements OrderService {
    public void register(Order order) {
        System.out.println("register order");
    }

    public void login(String userName, String password) {
        System.out.println("login order");
    }
}
