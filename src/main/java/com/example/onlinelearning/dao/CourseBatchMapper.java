package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.CourseBatchExample;
import com.example.onlinelearning.pojo.CourseBatchKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface CourseBatchMapper {
    int countByExample(CourseBatchExample example);

    int deleteByPrimaryKey(CourseBatchKey key);

    int insert(CourseBatchKey record);

    int insertSelective(CourseBatchKey record);

    List<CourseBatchKey> selectByExample(CourseBatchExample example);
}