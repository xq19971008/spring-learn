package com.hihonor.learn;

public class Person {

    private PersonDao personDao;


    private String userName;

    private String passWord;

    public Person() {
    }

    public Person(PersonDao personDao, String userName, String passWord) {
        this.personDao = personDao;
        this.userName = userName;
        this.passWord = passWord;
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void personAction() {
        this.personDao.speak();
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
