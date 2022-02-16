package com.example.springboot02.Controller;

import com.example.springboot02.dao.mapper;
import com.example.springboot02.pojo.User;
import com.example.springboot02.utlis.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;

@Controller
public class indexController {
 static Integer userid=null;
    @RequestMapping("/user/login")

    public String longin(@RequestParam("id") Integer id, @RequestParam("pwd") String pwd) {
        mapper mapper = Utils.Mapper();
        String loginpwd = mapper.Login(id);

        if (loginpwd.equals(pwd)){
            userid=id;
            return "loginOk";

        }
            return "longinNo";
    }
    @RequestMapping("/user/login/my")
    public String my(Model model){
        if (userid!=null){
            User user = Utils.Mapper().user(userid);
            model.addAttribute("user",user);
            return "my";
        }else {
            return "longinNo";
        }

 }
@RequestMapping("/shouYe")
    public String shouYe(Model model) throws IOException {
        if(userid!=null){
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\test.txt")))) {
                String ch;
                String HTML = "";
                while ((ch = reader.readLine()) != null) {

                    HTML += "<h3>" + ch + "<h3>";
                    model.addAttribute("HTML", HTML);

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return "shouYe";
        }else {
            return "longinNo";
        }

}
}

