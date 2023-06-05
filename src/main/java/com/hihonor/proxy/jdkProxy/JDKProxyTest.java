package com.hihonor.proxy.jdkProxy;

import com.hihonor.proxy.User;
import com.hihonor.proxy.UserService;
import com.hihonor.proxy.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyTest {
    public static void main(String[] args) {
        // 1、创建原始对象
        final UserService userService = new UserServiceImpl();

        // 2、JDK动态代理
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("log befor");
                Object ret = method.invoke(userService, args);
                System.out.println("log after");
                return ret;
            }
        };
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(JDKProxyTest.class.getClassLoader(), userService.getClass().getInterfaces(), handler);
        userServiceProxy.login("xieqiang","123123");
        userServiceProxy.register(new User("xieqiang","123123"));


    }
}
