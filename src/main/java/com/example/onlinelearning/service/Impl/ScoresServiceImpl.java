package com.example.onlinelearning.service.Impl;

import com.example.onlinelearning.dao.LearnscorevoMapper;
import com.example.onlinelearning.dao.ScoresMapper;
import com.example.onlinelearning.pojo.Learnscorevo;
import com.example.onlinelearning.pojo.LearnscorevoExample;
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
    @Autowired
    private LearnscorevoMapper learnscorevoMapper;

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
    public List<Learnscorevo> getList(Map<?, ?> m) {
        LearnscorevoExample example=new LearnscorevoExample();
        example.setStart((Integer) m.get("start"));
        example.setLimit((Integer) m.get("limit"));
        LearnscorevoExample.Criteria criteria=example.createCriteria();
        if(m.get("search")!=null){
            Learnscorevo scores=(Learnscorevo) m.get("search");
            if(scores.getCouName()!=null&&scores.getCouName()!=""){
                criteria.andCouNameLike("%"+scores.getCouName()+"%");
            }
            if(scores.getUsername()!=null&&scores.getUsername()!=""){
                criteria.andUsernameLike("%"+scores.getUsername()+"%");
            }
        }
        return learnscorevoMapper.selectByExample(example);
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

    public Integer getTotal(Learnscorevo learnscorevo) {
        LearnscorevoExample example=new LearnscorevoExample();
        LearnscorevoExample.Criteria criteria=example.createCriteria();
        if(learnscorevo.getCouName()!=null){
            criteria.andCouNameLike("%"+learnscorevo.getCouName()+"%");
        }
        if(learnscorevo.getUserid()!=null){
            criteria.andUsernameLike("%"+learnscorevo.getUsername()+"%");
        }
        return learnscorevoMapper.countByExample(example);
    }

    @Override
    public Scores getRecord(Scores scores) {
        return scoresMapper.selectByPrimaryKey(scores.getScoid());
    }
}
