package com.hihonor.construct;

public class Customer {
    private String name;

    private String age;

    private int salary;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Customer(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }
}
