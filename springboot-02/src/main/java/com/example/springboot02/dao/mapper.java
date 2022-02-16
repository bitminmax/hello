package com.example.springboot02.dao;

import com.example.springboot02.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface mapper {
    //查询员工信息
    public List<User> getUser(Integer id);
    //删除员工
    public String delete();
    //增加员工
    public User update();
    //修改员工信息
    public  void insert();
   //登录操作
    public  String Login(Integer id);

    //我的信息
    public User user(Integer id);

}
