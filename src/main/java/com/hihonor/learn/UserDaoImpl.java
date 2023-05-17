package com.hihonor.learn;

public class UserDaoImpl implements UserDao {
    public void save(User user) {
        System.out.println("insert into user = " + user);
    }

    public void queryUserByNameAndPassword(String userName, String password) {
        System.out.println("query user name = " + userName + "password = " + password);
    }
}
