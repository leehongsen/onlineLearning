package com.example.onlinelearning.controller;

import com.example.onlinelearning.pojo.Role;
import com.example.onlinelearning.service.RoleService;
import com.example.onlinelearning.utils.Json;
import com.example.onlinelearning.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/role")
public class RoleController extends BaseController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/getList")
    public PageResult getRoleList(Integer page, Integer rows, Role role){
        PageResult pr = new PageResult();
        Map<String, Object> map = super.getSearchMap(page, rows, role);
        pr.setTotal(roleService.getTotal(role));
        pr.setRows(roleService.getList(map));
        return pr;
    }

    @RequestMapping("/add")
    public Json addRole(Role role) {
        Integer r=roleService.save(role);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功加入角色！");
        }else {
            json.setSuccess(false);
            json.setMsg("加入角色失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/modify")
    public Json modifyRole(Role role){
        Integer r=roleService.update(role);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功修改角色！");
        }else {
            json.setSuccess(false);
            json.setMsg("修改角色失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/delete")
    public Json deleteRole(String[] roleid){
        Integer r=roleService.delete(roleid);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功删除角色！");
        }else {
            json.setSuccess(false);
            json.setMsg("删除角色失败,请重新尝试！");
        }
        return json;
    }
}