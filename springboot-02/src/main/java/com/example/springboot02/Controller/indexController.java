package com.example.springboot02.Controller;

import com.example.springboot02.dao.mapper;
import com.example.springboot02.utlis.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class indexController {
    @RequestMapping("/user/login")

    public String longin(Model model,@RequestParam("id")Integer id,@RequestParam("pwd")String pwd) {
        mapper mapper = Utils.Mapper();
        String loginpwd = mapper.Login(id);
        if (loginpwd.equals(pwd)){
            return "loginOk";
        }
            return "longinNo";


    }
}

