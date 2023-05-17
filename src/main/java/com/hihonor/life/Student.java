package com.hihonor.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student  implements InitializingBean, DisposableBean {
    private String name;

    public Student() {
        System.out.println("new student");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void destroy() throws Exception {
        System.out.println("distory:" + this.name);
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("new Student " + this.name);
    }

    public void myDestory() {
        System.out.println("my distory:" + this.name);
    }
}
