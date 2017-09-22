package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.LearningRecord;
import com.example.onlinelearning.pojo.LearningRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface LearningRecordMapper {
    int countByExample(LearningRecordExample example);

    int deleteByPrimaryKey(Integer leaid);

    int insert(LearningRecord record);

    int insertSelective(LearningRecord record);

    List<LearningRecord> selectByExample(LearningRecordExample example);

    LearningRecord selectByPrimaryKey(Integer leaid);

    int updateByPrimaryKeySelective(LearningRecord record);

    int updateByPrimaryKey(LearningRecord record);
}