package com.example.onlinelearning.service;

import com.example.onlinelearning.pojo.Coursevo;
import com.example.onlinelearning.pojo.Courseware;

public interface CoursewareService extends BaseService<Courseware>{

    Integer getTotal(Coursevo oursevo);
}
