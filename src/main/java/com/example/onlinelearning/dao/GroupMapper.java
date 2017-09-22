package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.Group;
import com.example.onlinelearning.pojo.GroupExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface GroupMapper {
    int countByExample(GroupExample example);

    int deleteByPrimaryKey(Integer groupid);

    int insert(Group record);

    int insertSelective(Group record);

    List<Group> selectByExample(GroupExample example);

    Group selectByPrimaryKey(Integer groupid);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
}