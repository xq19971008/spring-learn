package com.hihonor.proxy.Aspect;

import com.hihonor.proxy.User;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class UserServiceImpl implements UserService, ApplicationContextAware {
    private ApplicationContext context;

    public void login(String name, String password) {
        System.out.println("name is " + name + ",password is " + password);
    }

    public void register(User user) {
        System.out.println("strat register" + user.toString());
        UserService userService = (UserService) context.getBean("userService");
        userService.login(user.getUserName(),user.getPassword());
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
