package com.example.onlinelearning.service.Impl;

import com.example.onlinelearning.dao.CourseMapper;
import com.example.onlinelearning.pojo.Course;
import com.example.onlinelearning.pojo.CourseExample;
import com.example.onlinelearning.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Integer save(Course course) {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format( now );
        course.setCouUploadTime(time);
        return courseMapper.insertSelective(course);
    }

    @Override
    public Integer delete(String[] courseids) {
        Integer r=1;
        for (String a:courseids){
            int demo=courseMapper.deleteByPrimaryKey(Integer.valueOf(a));
            if(demo==0){
                r=0;
            }
        }
        return r;
    }

    @Override
    public Integer update(Course course) {
        return courseMapper.updateByPrimaryKeySelective(course);
    }

    @Override
    public List<Course> getList(Map<?, ?> m) {
        CourseExample example=new CourseExample();
        CourseExample.Criteria criteria=example.createCriteria();
        example.setStart((Integer) m.get("start"));
        example.setLimit((Integer) m.get("limit"));
        Course course=(Course) m.get("search");
        if(course.getCouName()!=null&&course.getCouName()!=""){
            criteria.andCouNameLike("%"+course.getCouName()+"%");
        }
        return courseMapper.selectByExample(example);
    }

    @Override
    public Integer getTotal(Course course) {
        CourseExample example=new CourseExample();
        CourseExample.Criteria criteria=example.createCriteria();
        if(course.getCouName()!=null&&course.getCouName()!=""){
            criteria.andCouNameLike("%"+course.getCouName()+"%");
        }
        return courseMapper.countByExample(example);
    }

    @Override
    public Course getRecord(Course course) {
        return courseMapper.selectByPrimaryKey(course.getCouid());
    }

    public static void main(String[] args){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //可以方便地修改日期格式
        String hehe = dateFormat.format( now );
        System.out.println(hehe);
    }
}
