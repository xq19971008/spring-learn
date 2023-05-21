package com.hihonor.beanpost;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext3.xml");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car.toString());
    }
}
