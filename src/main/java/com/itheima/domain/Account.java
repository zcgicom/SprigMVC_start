package com.itheima.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Chen
 * @create 2020-06-20 10:27
 */
public class Account implements Serializable {
    private String username;
    private String password;
    private Double money;

//    private User user;//引用类的封装，需要在.jsp文件中使用“实体类名称.实体类变量名称”的格式进行提交
    private List<User> list;//使用List和Map集合进行参数封装时，RequestMapping注解的Path或value属性最好不要省略
    private Map<String,User> map;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    //包含有实体类
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

//    @Override
//    public String toString() {
//        return "Account{" +
//                "username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                ", money=" + money +
//                ", user=" + user +
//                '}';
//    }

    //含义集合的写法
    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
