package com.example.onlinelearning.service;

import com.example.onlinelearning.pojo.Competence;
import com.example.onlinelearning.pojo.Model;
import com.example.onlinelearning.pojo.Role;

import java.util.List;

public interface RoleService extends BaseService<Role>{
    public Integer getRolePermTotal(Role role); //获得角色权限总数
    void deletePerm(Integer roleId); //删除角色权限列表
    public void savePer(Competence competence);//保存权限

}
