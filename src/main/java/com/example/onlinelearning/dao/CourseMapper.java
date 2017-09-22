package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.Course;
import com.example.onlinelearning.pojo.CourseExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface CourseMapper {
    int countByExample(CourseExample example);

    int deleteByPrimaryKey(Integer couid);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(Integer couid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}