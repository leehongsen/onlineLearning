package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.Classgroupvo;
import com.example.onlinelearning.pojo.ClassgroupvoExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ClassgroupvoMapper {
    int countByExample(ClassgroupvoExample example);

    int insert(Classgroupvo record);

    int insertSelective(Classgroupvo record);

    List<Classgroupvo> selectByExample(ClassgroupvoExample example);
}