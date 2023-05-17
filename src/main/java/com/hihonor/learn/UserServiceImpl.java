package com.hihonor.learn;

public class UserServiceImpl implements UserService{

//    private UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
    private UserDao userDao;

    public UserDao getUserDao() {

        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void register(User user) {
        userDao.save(user);
    }

    public void login(String userName, String passWord) {
        userDao.queryUserByNameAndPassword(userName,passWord);
    }
}
