package com.hihonor.convert;

import com.hihonor.Convert.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/ApplicationContext2.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

    }
}
