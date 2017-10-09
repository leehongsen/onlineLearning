package com.example.onlinelearning.service.Impl;

import com.example.onlinelearning.dao.RoleCompetenceVoMapper;
import com.example.onlinelearning.dao.UserMapper;
import com.example.onlinelearning.dao.UserRoleVoMapper;
import com.example.onlinelearning.pojo.*;
import com.example.onlinelearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
@Service
public class UserServiceImpl implements UserService {
    /**
     * make important
     */
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleVoMapper userRoleVoMapper;
    @Autowired
    private RoleCompetenceVoMapper roleCompetenceVoMapper;

    /**
     * 登录
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
        List<User> list=userMapper.selectByExample(example);
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }

    /**
     * 通过角色查询模块
     * @param role
     * @return
     */
    @Override
    public List<RoleCompetenceVo> selectModel(UserRoleVo role) {
        RoleCompetenceVoExample example=new RoleCompetenceVoExample();
        RoleCompetenceVoExample.Criteria criteria=example.createCriteria();
        criteria.andRoleidEqualTo(role.getRoleid());
        List<RoleCompetenceVo> list=roleCompetenceVoMapper.selectByExample(example);
        return list;
    }

    /**
     * 通过用户查询角色
     * @param user
     * @return
     */
    @Override
    public List<UserRoleVo> selectRole(User user) {
        UserRoleVoExample example=new UserRoleVoExample();
        UserRoleVoExample.Criteria criteria=example.createCriteria();
        criteria.andUseridEqualTo(user.getUserid());
        List<UserRoleVo> list=userRoleVoMapper.selectByExample(example);
        return list;
    }

    @Override
    public Integer save(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids) {
            int demo = userMapper.deleteByPrimaryKey(Integer.valueOf(a));
            if (demo == 0) {
                r = 0;
            }
        }
        return r;
    }

    @Override
    public Integer update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<User> getList(Map<?, ?> m) {
        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        example.setStart((Integer) m.get("start"));
        example.setLimit((Integer) m.get("limit"));
        User user=(User) m.get("search");
        if(user.getUsername()!=null&&user.getUsername()!=""){
            criteria.andUsernameLike("%"+user.getUsername()+"%");
        }
        return userMapper.selectByExample(example);
    }

    @Override
    public Integer getTotal(User user) {
        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        if(user.getUsername()!=null&&user.getUsername()!=""){
            criteria.andUsernameLike("%"+user.getUsername()+"%");
        }
        return userMapper.countByExample(example);
    }

    @Override
    public User getRecord(User user) {
        return null;
    }

    /*public List<User> getLike(User user) {
        UserExample example=new UserExample();
        UserExample.Criteria criteria=example.createCriteria();
        criteria.andUsernameLike(user.getUsername());
        return userMapper.selectByExample(example);
    }*/
}
