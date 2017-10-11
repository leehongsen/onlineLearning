package com.example.onlinelearning.service.Impl;

import com.example.onlinelearning.dao.CoursevoMapper;
import com.example.onlinelearning.dao.CoursewareMapper;
import com.example.onlinelearning.pojo.Coursevo;
import com.example.onlinelearning.pojo.CoursevoExample;
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
    @Autowired
    private CoursevoMapper coursevoMapper;

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
    public List<Coursevo> getList(Map<?, ?> m) {
        CoursevoExample example=new CoursevoExample();
        CoursevoExample.Criteria criteria=example.createCriteria();
        example.setStart((Integer) m.get("start"));
        example.setLimit((Integer) m.get("limit"));
        if( m.get("search")!=null){
            Coursevo courseware=(Coursevo) m.get("search");
            if(courseware.getCosName()!=null&&courseware.getCosName()!=""){
                criteria.andCosNameLike("%"+courseware.getCosName()+"%");
            }
            if(courseware.getCouName()!=null&&courseware.getCouName()!=""){
                criteria.andCouNameLike("%"+courseware.getCosName()+"%");
            }
        }
        return coursevoMapper.selectByExample(example);
    }

    @Override
    public Integer getTotal(Coursevo oursevo) {
        CoursevoExample example=new CoursevoExample();
        CoursevoExample.Criteria criteria=example.createCriteria();
        if(oursevo.getCosName()!=null&&oursevo.getCosName()!=""){
            criteria.andCosNameLike("%"+oursevo.getCosName()+"%");
        }
        if(oursevo.getCouName()!=null&&oursevo.getCouName()!=""){
            criteria.andCouNameLike("%"+oursevo.getCosName()+"%");
        }
        return coursevoMapper.countByExample(example);
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
