package com.example.onlinelearning.service.Impl;

import com.example.onlinelearning.dao.CompetenceMapper;
import com.example.onlinelearning.dao.RoleCompetenceVoMapper;
import com.example.onlinelearning.dao.RoleMapper;
import com.example.onlinelearning.pojo.*;
import com.example.onlinelearning.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private CompetenceMapper competenceMapper;

    @Override
    public Integer getRolePermTotal(Role role) {
        return null;
    }

    @Override
    public void deletePerm(Integer roleId) {
        CompetenceKey key=new CompetenceKey();
        key.setRoleid(roleId);
        competenceMapper.deleteByPrimaryKey(key);
    }

    @Override
    public void savePer(Competence competence) {
        competenceMapper.insertSelective(competence);
    }

    @Override
    public Integer save(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids){
            int demo=roleMapper.deleteByPrimaryKey(Integer.valueOf(a));
            if(demo==0){
                r=0;
            }
        }
        return r;
    }

    @Override
    public Integer update(Role role) {
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public List<Role> getList(Map<?, ?> m) {
        RoleExample example=new RoleExample();
        example.setStart((Integer) m.get("start"));
        example.setLimit((Integer) m.get("limit"));
        return roleMapper.selectByExample(example);
    }

    @Override
    public Integer getTotal(Role role) {
        RoleExample example=new RoleExample();
        return roleMapper.countByExample(example);
    }

    @Override
    public Role getRecord(Role role) {
        return roleMapper.selectByPrimaryKey(role.getRoleid());
    }


}
