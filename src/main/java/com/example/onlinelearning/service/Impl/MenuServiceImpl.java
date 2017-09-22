package com.example.onlinelearning.service.Impl;

import com.example.onlinelearning.dao.ModelMapper;
import com.example.onlinelearning.pojo.Model;
import com.example.onlinelearning.pojo.ModelExample;
import com.example.onlinelearning.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Integer save(Model model) {
        return modelMapper.insert(model);
    }

    @Override
    public Integer delete(String[] ids) {
        Integer r=1;
        for (String a:ids){
           int demo = modelMapper.deleteByPrimaryKey(Integer.valueOf(a));
           if(demo==0){
               r=0;
           }
        }
        return r;
    }

    @Override
    public Integer update(Model model) {
        return modelMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public List<Model> getList(Map<?, ?> m) {
        return null;
    }

    @Override
    public Integer getTotal(Model model) {
        ModelExample example=new ModelExample();
        return modelMapper.countByExample(example);
    }

    @Override
    public Model getRecord(Model model) {
        return modelMapper.selectByPrimaryKey(model.getModid());
    }
}
