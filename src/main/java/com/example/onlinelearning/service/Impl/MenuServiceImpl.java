package com.example.onlinelearning.service.Impl;

import com.example.onlinelearning.dao.ModelMapper;
import com.example.onlinelearning.dao.RoleCompetenceVoMapper;
import com.example.onlinelearning.pojo.*;
import com.example.onlinelearning.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private RoleCompetenceVoMapper roleCompetenceVoMapper;

    @Override
    public Integer save(Model model) {
        return modelMapper.insertSelective(model);
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
        ModelExample example=new ModelExample();
        example.setStart((Integer) m.get("start"));
        example.setLimit((Integer) m.get("limit"));
        ModelExample.Criteria criteria=example.createCriteria();
        if(m.get("search")!=null){
            Model model=(Model) m.get("search");
            if(model.getModName()!=null&&model.getModName()!=""){
                criteria.andModNameLike("%"+model.getModName()+"%");
            }
        }
        return modelMapper.selectByExample(example);
    }

    @Override
    public Integer getTotal(Model model) {
        ModelExample example=new ModelExample();
        ModelExample.Criteria criteria=example.createCriteria();
        if(model.getModName()!=null&&model.getModName()!=""){
            criteria.andModNameLike("%"+model.getModName()+"%");
        }
        return modelMapper.countByExample(example);
    }

    @Override
    public Model getRecord(Model model) {
        return modelMapper.selectByPrimaryKey(model.getModid());
    }


    public List<Model> getMenuByRole(Role role) {
        RoleCompetenceVoExample example=new RoleCompetenceVoExample();
        RoleCompetenceVoExample.Criteria criteria=example.createCriteria();
        criteria.andRoleidEqualTo(role.getRoleid());
        List<RoleCompetenceVo> list=roleCompetenceVoMapper.selectByExample(example);
        List<Model> models=new ArrayList();
        if(list!=null){
            for(RoleCompetenceVo a:list){
                Model mo=new Model();
                mo.setModid(a.getModid());
                mo.setNotes(a.getNotes());
                mo.setModCD(a.getModCD());
                mo.setModDes(a.getModDes());
                mo.setModName(a.getModName());
                mo.setModUrl(a.getModUrl());
                mo.setParMod(a.getParMod());
                models.add(mo);
            }
        }
        return models;
    }
}
