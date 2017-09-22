package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.Courseware;
import com.example.onlinelearning.pojo.CoursewareExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface CoursewareMapper {
    int countByExample(CoursewareExample example);

    int deleteByPrimaryKey(Integer cosid);

    int insert(Courseware record);

    int insertSelective(Courseware record);

    List<Courseware> selectByExample(CoursewareExample example);

    Courseware selectByPrimaryKey(Integer cosid);

    int updateByPrimaryKeySelective(Courseware record);

    int updateByPrimaryKey(Courseware record);
}