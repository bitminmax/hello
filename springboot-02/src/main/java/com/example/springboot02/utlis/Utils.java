package com.example.springboot02.utlis;

import com.example.springboot02.dao.mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
@Component
public class Utils {
    static SqlSessionFactory build =null;
    static {
        String str="mybatis.xml";
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream(str);
            build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public  static  mapper Mapper(){
        return build.openSession().getMapper(mapper.class);
    }
}
