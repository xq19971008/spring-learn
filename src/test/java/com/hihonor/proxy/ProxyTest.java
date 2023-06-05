package com.hihonor.proxy;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyTest {

    @Test
    public void test1() {
        UserServiceProxyImpl userServiceProxy = new UserServiceProxyImpl();
        User user = new User("xieqiang", "123123");
        userServiceProxy.register(user);
        userServiceProxy.login("xieqiang", "123123");
    }

    @Test
    public void tets2() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext4.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.register(new User("xieqiang","123123"));
        userService.login("xieqiang","123123");
    }

    @Test
    public void tets3() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext5.xml");
        OrderService orderService = (OrderService) ctx.getBean("orderService");
        OrderService orderService1 = (OrderService) ctx.getBean("orderService1");
        orderService.register(new Order());
        orderService1.register(new Order());
        orderService.login("xieqiang","123123");
        orderService1.login("xieqiang","123123");
    }


    @Test
    public void test4() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext6.xml");
        com.hihonor.proxy.factory.UserService userService = (com.hihonor.proxy.factory.UserService) ctx.getBean("userService");
        userService.login("xieqiang","123123");
        userService.register(new User("xieqiang","123123"));

    }

    @Test
    public void test5() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext7.xml");
        com.hihonor.proxy.Aspect.UserService userService = (com.hihonor.proxy.Aspect.UserService) ctx.getBean("userService");
//        userService.login("xieqiang","123123");
        userService.register(new User("xieqiang","123123"));

    }
}
