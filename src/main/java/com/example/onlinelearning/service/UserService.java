package com.example.onlinelearning.service;

import com.example.onlinelearning.pojo.User;
import com.example.onlinelearning.pojo.UserRoleVo;
import com.example.onlinelearning.pojo.RoleCompetenceVo;

import java.util.List;

public interface UserService extends BaseService<User>{
    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 根据角色查询模块
     * @param role
     * @return
     */
    List<RoleCompetenceVo> selectModel(UserRoleVo role);

    /**
     * 根据用户查询角色
     * @param user
     * @return
     */
    List<UserRoleVo> selectRole(User user);

}
