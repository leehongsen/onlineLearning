package com.example.onlinelearning.service.Impl;

import com.example.onlinelearning.dao.CoursewareMapper;
import com.example.onlinelearning.pojo.Courseware;
import com.example.onlinelearning.pojo.CoursewareExample;
import com.example.onlinelearning.service.CoursewareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@Service
public class CoursewareServiceImpl implements CoursewareService{
    @Autowired
    private CoursewareMapper coursewareMapper;

    @Override
    public Integer save(Courseware courseware) {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format( now );
        courseware.setCosUploadTime(time);
        return coursewareMapper.insertSelective(courseware);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids){
            int demo=coursewareMapper.deleteByPrimaryKey(Integer.valueOf(a));
            if(demo==0){
                r=0;
            }
        }
        return r;
    }

    @Override
    public Integer update(Courseware courseware) {
        return coursewareMapper.updateByPrimaryKeySelective(courseware);
    }

    @Override
    public List<Courseware> getList(Map<?, ?> m) {
        CoursewareExample example=new CoursewareExample();
        CoursewareExample.Criteria criteria=example.createCriteria();
        example.setStart((Integer) m.get("start"));
        example.setLimit((Integer) m.get("limit"));
        Courseware courseware=(Courseware) m.get("search");
        if(courseware.getCosName()!=null&&courseware.getCosName()!=""){
            criteria.andCosNameLike("%"+courseware.getCosName()+"%");
        }
        return coursewareMapper.selectByExample(example);
    }

    @Override
    public Integer getTotal(Courseware courseware) {
        CoursewareExample example=new CoursewareExample();
        CoursewareExample.Criteria criteria=example.createCriteria();
        if(courseware.getCosName()!=null&&courseware.getCosName()!=""){
            criteria.andCosNameLike("%"+courseware.getCosName()+"%");
        }
        return coursewareMapper.countByExample(example);
    }

    @Override
    public Courseware getRecord(Courseware courseware) {
        return coursewareMapper.selectByPrimaryKey(courseware.getCosid());
    }
}
