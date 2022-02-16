package com.example.springboot02.pojo;

public class log {
    private Integer id;
    private  String pwd;

    public log() {
    }

    public log(Integer id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "log{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
