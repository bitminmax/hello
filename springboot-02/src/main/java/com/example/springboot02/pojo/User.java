package com.example.springboot02.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private String  vip;
   private String Registrationtime;
    public User() {
    }

    public User(Integer id, String name, String pwd, String vip, String registrationtime) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.vip = vip;
        Registrationtime = registrationtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getRegistrationtime() {
        return Registrationtime;
    }

    public void setRegistrationtime(String registrationtime) {
        Registrationtime = registrationtime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", vip='" + vip + '\'' +
                ", Registrationtime=" + Registrationtime +
                '}';
    }
}
