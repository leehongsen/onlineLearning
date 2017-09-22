package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.RoleCompetenceVo;
import com.example.onlinelearning.pojo.RoleCompetenceVoExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface RoleCompetenceVoMapper {
    int countByExample(RoleCompetenceVoExample example);

    int insert(RoleCompetenceVo record);

    int insertSelective(RoleCompetenceVo record);

    List<RoleCompetenceVo> selectByExample(RoleCompetenceVoExample example);
}