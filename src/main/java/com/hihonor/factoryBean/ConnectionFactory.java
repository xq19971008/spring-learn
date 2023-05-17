package com.hihonor.factoryBean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory implements FactoryBean<Connection> {
    private String driver;
    private String url;
    private String userName;
    private String passWord;

    // 用于书写复杂对象的创建代码
    public Connection getObject() throws Exception {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, userName, passWord);
        return conn;
    }

    // 返回创建的复杂对象的类型
    public Class<?> getObjectType() {
        return Connection.class;
    }


    // 是否单单例
    public boolean isSingleton() {
        return true;
    }

    public String getDriver() {

        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
}
