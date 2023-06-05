package com.hihonor.proxy.cglibProxy;

import com.hihonor.proxy.User;
import com.hihonor.proxy.cglibProxy.UserService;
import com.hihonor.proxy.UserServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyTest {

    public static void main(final String[] args) {
        // 1、创建原始对象
        final UserService userService = new UserService();
        // 2、通过cglib方式创建代理对象
        Enhancer enhancer = new Enhancer();

        enhancer.setClassLoader(CglibProxyTest.class.getClassLoader());
        enhancer.setSuperclass(userService.getClass());

        MethodInterceptor methodInterceptor = new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("log before");
                Object ret = method.invoke(userService, objects);
                System.out.println("log after");
                return ret;
            }
        };

        enhancer.setCallback(methodInterceptor);
        UserService service = (UserService) enhancer.create();
        service.login("xieqiang","123123");
        service.register(new User("xieqiang","123123"));
    }
}
