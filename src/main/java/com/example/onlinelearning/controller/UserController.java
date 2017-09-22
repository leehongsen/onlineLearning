package com.example.onlinelearning.controller;

import com.example.onlinelearning.pojo.*;
import com.example.onlinelearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

@Controller

public class UserController extends BaseController {
    @Autowired
    private UserService service;


    @RequestMapping("/login")
    @ResponseBody
    public User login(User user, HttpSession session){

        User u=service.login(user);

        if(u!=null){
            session.setAttribute("userinfo",u);
            return u;
        }
        return u;
    }

    @RequestMapping("/dologin")
    public String dologin(){
        return "index";
    }

    @RequestMapping("/selectModel")
    @ResponseBody
    public List<Model> selectModel(HttpSession session){
        User user=(User)session.getAttribute("userinfo");
        List<UserRoleVo> userRoleVo=service.selectRole(user);
        TreeSet<com.example.onlinelearning.pojo.Model> list=new TreeSet
                <com.example.onlinelearning.pojo.Model>(new ModelSort());
        if (userRoleVo!=null){
            for(UserRoleVo a:userRoleVo){
                List<RoleCompetenceVo> roleCompetenceVo=service.selectModel(a);
                if(roleCompetenceVo!=null){
                    for(RoleCompetenceVo b:roleCompetenceVo){
                        com.example.onlinelearning.pojo.Model e=new
                                com.example.onlinelearning.pojo.Model();
                        e.setModCD(b.getModCD());
                        e.setModDes(b.getModDes());
                        e.setModid(b.getModid());
                        e.setModName(b.getModName());
                        e.setModUrl(b.getModUrl());
                        e.setParMod(b.getParMod());
                        list.add(e);
                    }
                }
            }
        }
        List<com.example.onlinelearning.pojo.Model> modellist=new
                ArrayList<com.example.onlinelearning.pojo.Model>();
        for (com.example.onlinelearning.pojo.Model r:list){
            if(r.getParMod()==0){
                modellist.add(r);
                for (com.example.onlinelearning.pojo.Model flag:list){
                    if(flag.getParMod()==r.getModid()){
                        modellist.add(flag);
                    }
                }
            }
        }
        return modellist;
    }

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo(HttpSession session){
        return (User)session.getAttribute("userinfo");
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout(HttpSession session){
        session.removeAttribute("userinfo");
        return "已登出";
    }
}
