package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.Coursevo;
import com.example.onlinelearning.pojo.CoursevoExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface CoursevoMapper {
    int countByExample(CoursevoExample example);

    int insert(Coursevo record);

    int insertSelective(Coursevo record);

    List<Coursevo> selectByExample(CoursevoExample example);
}