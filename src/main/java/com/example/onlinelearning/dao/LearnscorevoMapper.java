package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.Learnscorevo;
import com.example.onlinelearning.pojo.LearnscorevoExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface LearnscorevoMapper {
    int countByExample(LearnscorevoExample example);

    int insert(Learnscorevo record);

    int insertSelective(Learnscorevo record);

    List<Learnscorevo> selectByExample(LearnscorevoExample example);
}