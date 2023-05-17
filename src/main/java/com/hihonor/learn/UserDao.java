package com.hihonor.learn;

public interface UserDao {
    public void save(User user);

    public void queryUserByNameAndPassword(String userName, String password);
}
