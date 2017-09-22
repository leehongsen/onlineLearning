package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.UserRoleVo;
import com.example.onlinelearning.pojo.UserRoleVoExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserRoleVoMapper {
    int countByExample(UserRoleVoExample example);

    int insert(UserRoleVo record);

    int insertSelective(UserRoleVo record);

    List<UserRoleVo> selectByExample(UserRoleVoExample example);
}