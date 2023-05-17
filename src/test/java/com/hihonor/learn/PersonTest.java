package com.hihonor.learn;

import com.hihonor.construct.Customer;
import com.hihonor.factoryBean.ConnectionFactory;
import com.hihonor.life.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class PersonTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person.toString());
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");

        // 通过这种方式获得对象，就不需要强制类型转换
//        Person person = ctx.getBean("person", Person.class);
//        System.out.println(person.toString());

        // 只指定类名，Spring的配置文件中只能有一个bean是这个类型。
//        Person bean = ctx.getBean(Person.class);
//        System.out.println(ctx.toString());

        // 获取 Spring 配置文件中所有的 bean 标签的 id 值
//        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
//        for (String item : beanDefinitionNames) {
//            System.out.println(item);
//
//        }

        // 根据类型获得 Spring 配置文件中对应的 id 值。
//        String[] beanNamesForType = ctx.getBeanNamesForType(Person.class);
//        for (String item : beanNamesForType) {
//            System.out.println(item);
//
//        }

        // 用于判断是否存在指定 id 值的 bean，不能判断 name 值
//        if (ctx.containsBeanDefinition("person2")) {
//            System.out.println("true");
//        }else {
//            System.out.println("flase");
//        }

        // 用于判断是否存在指定 id 值的 bean，也可以判断 name 值。
//        if (ctx.containsBean("p")){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }

    }

    @Test
    public void test3(){
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
//        Person bean = ctx.getBean(Person.class);
//        System.out.println(bean);

//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
//        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
//        for (String item : beanDefinitionNames) {
//            System.out.println(item);
//
//        }

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
//        Person p1 = ctx.getBean("p1", Person.class);
//        System.out.println(p1);

//         用于判断是否存在指定 id 值的 bean，不能判断 name 值
        if (ctx.containsBeanDefinition("p1")) {
            System.out.println("true");
        }else {
            System.out.println("flase");
        }

//         用于判断是否存在指定 id 值的 bean，也可以判断 name 值。
        if (ctx.containsBean("p1")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        Cat cat = ctx.getBean("cat", Cat.class);
        System.out.println(cat);
    }

    @Test
    public void test5(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        Person person = ctx.getBean("person", Person.class);
        person.setUserName("xieqiang");
        person.setPassWord("123123");
        System.out.println(person.toString());
    }

    @Test
    public void test6(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        Person person = ctx.getBean("person", Person.class);
        System.out.println(person.toString());
    }

    @Test
    public void test7(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        User user = ctx.getBean("user", User.class);
        System.out.println(user.toString());
    }

    @Test
    public void test8() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.register(new User("xieqiang"));
    }

    @Test
    public void test9() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.register(new User("xieqiang"));
    }

    @Test
    public void test10() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        User user2 = ctx.getBean("user2", User.class);
        System.out.println(user2.toString());
    }

    @Test
    public void test11() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        Customer customer1 = ctx.getBean("customer", Customer.class);
        Customer customer2 = ctx.getBean("customer", Customer.class);
        System.out.println(customer1);
        System.out.println(customer2);
    }

    @Test
    public void test12() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        Connection conn = ctx.getBean("conn", Connection.class);
        Connection conn1 = ctx.getBean("conn", Connection.class);
        System.out.println(conn);
        System.out.println(conn1);
    }

    @Test
    public void test13() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        ConnectionFactory connectionFactory = ctx.getBean("&conn", ConnectionFactory.class);
        System.out.println(connectionFactory);
    }

    @Test
    public void test14() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        Connection connection = ctx.getBean("conn2", Connection.class);
        System.out.println(connection);
    }

    @Test
    public void test15() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext.xml");
        Student student = ctx.getBean("student", Student.class);
        ctx.close();
    }

    @Test
    public void test16() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext1.xml");
        Connection conn = (Connection) ctx.getBean("conn");
        System.out.println(conn);
    }
}
