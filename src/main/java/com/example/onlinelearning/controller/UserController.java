package com.example.onlinelearning.controller;

import com.example.onlinelearning.pojo.*;
import com.example.onlinelearning.service.UserService;
import com.example.onlinelearning.utils.Json;
import com.example.onlinelearning.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

@Controller

public class UserController extends BaseController {
    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    @ResponseBody
    public User login(User user, HttpSession session){

        User u=userService.login(user);

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
        List<UserRoleVo> userRoleVo=userService.selectRole(user);
        TreeSet<com.example.onlinelearning.pojo.Model> list=new TreeSet
                <com.example.onlinelearning.pojo.Model>(new ModelSort());
        if (userRoleVo!=null){
            for(UserRoleVo a:userRoleVo){
                List<RoleCompetenceVo> roleCompetenceVo=userService.selectModel(a);
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
        List<Model> listdemo=new ArrayList<Model>();
        listdemo.addAll(list);
        List<com.example.onlinelearning.pojo.Model> modellist=super.getMenu(listdemo);
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

    @RequestMapping("users/getList")
    @ResponseBody
    public PageResult getRoleList(Integer page, Integer limit, User user){
        PageResult pr = new PageResult();
        Map<String, Object> map = super.getSearchMap(page, limit, user);
        pr.setTotal(userService.getTotal(user));
        pr.setRows(userService.getList(map));
        pr.setSuccess(true);
        pr.setMsg("返回数据成功！");
        return pr;
    }

    @RequestMapping("/users/add")
    @ResponseBody
    public Json addRole(User user) {
        Integer r=userService.save(user);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功加入用户！");
        }else {
            json.setSuccess(false);
            json.setMsg("加入用户失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/users/modify")
    @ResponseBody
    public Json modifyRole(User user){
        Integer r=userService.update(user);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功修改用户！");
        }else {
            json.setSuccess(false);
            json.setMsg("修改用户失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/users/delete")
    @ResponseBody
    public Json deleteRole(String userid){
        String[] userids=userid.split(",");

        Integer r=userService.delete(userids);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功删除用户！");
        }else {
            json.setSuccess(false);
            json.setMsg("删除用户失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/users/getRoleByUser")
    @ResponseBody
    public List<UserRoleVo> getRoleByUser(User user){
        return userService.selectRole(user);
    }

    //设置跳转关键方法
    @RequestMapping("/toMenu")
    public String toMenu(){
        return "view/menuTable";
    }

    @RequestMapping("/toRole")
    public String toRole(){
        return "view/roleTable";
    }

    @RequestMapping("/toUser")
    public String toUser(){
        return "view/usersTable";
    }

    @RequestMapping("/toCourse")
    public String toCourse(){
        return "view/courseTable";
    }

    @RequestMapping("/toRoleMenu")
    public String toRoleMenu(){ return "view/roleMenuTable"; }

    @RequestMapping("/toUserRole")
    public String toUserRole(){ return "view/userRoleTable"; }

    @RequestMapping("/toGroup")
    public String toGroup(){ return "view/groupTable"; }

    @RequestMapping("/toScores")
    public String toScores(){ return "view/scoresTable"; }

    @RequestMapping("/toCourseware")
    public String toCourseware(){return "view/coursewareTable";}


}