package com.example.onlinelearning.dao;

import com.example.onlinelearning.pojo.Competence;
import com.example.onlinelearning.pojo.CompetenceExample;
import com.example.onlinelearning.pojo.CompetenceKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface CompetenceMapper {
    int countByExample(CompetenceExample example);

    int deleteByPrimaryKey(CompetenceKey key);

    int insert(Competence record);

    int insertSelective(Competence record);

    List<Competence> selectByExample(CompetenceExample example);

    Competence selectByPrimaryKey(CompetenceKey key);

    int updateByPrimaryKeySelective(Competence record);

    int updateByPrimaryKey(Competence record);
}