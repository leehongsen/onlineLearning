package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.Model;
import com.example.onlinelearning.pojo.ModelExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ModelMapper {
    int countByExample(ModelExample example);

    int deleteByPrimaryKey(Integer modid);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByExample(ModelExample example);

    Model selectByPrimaryKey(Integer modid);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}