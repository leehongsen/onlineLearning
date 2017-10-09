package com.example.onlinelearning.service.Impl;

import com.example.onlinelearning.dao.GroupMapper;
import com.example.onlinelearning.pojo.Group;
import com.example.onlinelearning.pojo.GroupExample;
import com.example.onlinelearning.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupMapper groupMapper;

    @Override
    public Integer save(Group group) {
        return groupMapper.insertSelective(group);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids){
            int demo = groupMapper.deleteByPrimaryKey(Integer.valueOf(a));
            if(demo==0){
                r=0;
            }
        }
        return r;
    }

    @Override
    public Integer update(Group group) {
        return groupMapper.updateByPrimaryKeySelective(group);
    }

    @Override
    public List<Group> getList(Map<?, ?> m) {
        GroupExample example=new GroupExample();
        example.setStart((Integer) m.get("start"));
        example.setLimit((Integer) m.get("limit"));
        GroupExample.Criteria criteria=example.createCriteria();
        if(m.get("search")!=null){
            Group group=(Group) m.get("search");
            if(group.getGroupName()!=null&&group.getGroupName()!=""){
                criteria.andGroupNameLike("%"+group.getGroupName()+"%");
            }
        }
        return groupMapper.selectByExample(example);
    }

    @Override
    public Integer getTotal(Group group) {
        GroupExample example=new GroupExample();
        GroupExample.Criteria criteria=example.createCriteria();
        if(group.getGroupName()!=null&&group.getGroupName()!=""){
            criteria.andGroupNameLike("%"+group.getGroupName()+"%");
        }
        return groupMapper.countByExample(example);
    }

    @Override
    public Group getRecord(Group group) {
        return groupMapper.selectByPrimaryKey(group.getGroupid());
    }
}
