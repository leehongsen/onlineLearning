package com.example.onlinelearning.service.Impl;

import com.example.onlinelearning.dao.ScoresMapper;
import com.example.onlinelearning.pojo.Scores;
import com.example.onlinelearning.pojo.ScoresExample;
import com.example.onlinelearning.service.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
@Service
public class ScoresServiceImpl implements ScoresService {
    @Autowired
    private ScoresMapper scoresMapper;

    @Override
    public Integer save(Scores scores) {
        return scoresMapper.insertSelective(scores);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids){
            int demo = scoresMapper.deleteByPrimaryKey(Integer.valueOf(a));
            if(demo==0){
                r=0;
            }
        }
        return r;
    }

    @Override
    public Integer update(Scores scores) {
        return scoresMapper.updateByPrimaryKeySelective(scores);
    }

    @Override
    public List<Scores> getList(Map<?, ?> m) {
        ScoresExample example=new ScoresExample();
        example.setStart((Integer) m.get("start"));
        example.setLimit((Integer) m.get("limit"));
        ScoresExample.Criteria criteria=example.createCriteria();
        if(m.get("search")!=null){
            Scores scores=(Scores) m.get("search");
            if(scores.getCouid()!=null){
                criteria.andCouidEqualTo(scores.getCouid());
            }
            if(scores.getUserid()!=null){
                criteria.andUseridEqualTo(scores.getUserid());
            }
        }
        return scoresMapper.selectByExample(example);
    }

    @Override
    public Integer getTotal(Scores scores) {
        ScoresExample example=new ScoresExample();
        ScoresExample.Criteria criteria=example.createCriteria();
        if(scores.getCouid()!=null){
            criteria.andCouidEqualTo(scores.getCouid());
        }
        if(scores.getUserid()!=null){
            criteria.andUseridEqualTo(scores.getUserid());
        }
        return scoresMapper.countByExample(example);
    }

    @Override
    public Scores getRecord(Scores scores) {
        return scoresMapper.selectByPrimaryKey(scores.getScoid());
    }
}
