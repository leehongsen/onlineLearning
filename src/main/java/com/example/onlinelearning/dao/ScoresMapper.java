package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.Scores;
import com.example.onlinelearning.pojo.ScoresExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ScoresMapper {
    int countByExample(ScoresExample example);

    int deleteByPrimaryKey(Integer scoid);

    int insert(Scores record);

    int insertSelective(Scores record);

    List<Scores> selectByExample(ScoresExample example);

    Scores selectByPrimaryKey(Integer scoid);

    int updateByPrimaryKeySelective(Scores record);

    int updateByPrimaryKey(Scores record);
}