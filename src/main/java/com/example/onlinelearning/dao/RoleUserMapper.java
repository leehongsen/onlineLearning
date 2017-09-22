package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.RoleUserExample;
import com.example.onlinelearning.pojo.RoleUserKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface RoleUserMapper {
    int countByExample(RoleUserExample example);

    int deleteByPrimaryKey(RoleUserKey key);

    int insert(RoleUserKey record);

    int insertSelective(RoleUserKey record);

    List<RoleUserKey> selectByExample(RoleUserExample example);
}