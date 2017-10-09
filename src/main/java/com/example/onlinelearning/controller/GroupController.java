package com.example.onlinelearning.controller;

import com.example.onlinelearning.pojo.Group;
import com.example.onlinelearning.service.GroupService;
import com.example.onlinelearning.utils.Json;
import com.example.onlinelearning.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Menu")
public class GroupController extends BaseController{
    @Autowired
    private GroupService groupService;

    @RequestMapping("/getList")
    public PageResult getMenuList(Integer page, Integer limit, Group group){
        PageResult pr = new PageResult();
        Map<String, Object> map = super.getSearchMap(page, limit, group);
        pr.setTotal(groupService.getTotal(group));
        pr.setRows(groupService.getList(map));
        pr.setMsg("成功接收批次数据！");
        pr.setSuccess(true);
        return pr;
    }

    @RequestMapping("/add")
    public Json addModel(Group group) {
        Integer r=groupService.save(group);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功加入批次！");
        }else {
            json.setSuccess(false);
            json.setMsg("加入批次失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/modify")
    public Json modifyModel(Group group){
        Integer r=groupService.update(group);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功修改批次！");
        }else {
            json.setSuccess(false);
            json.setMsg("修改批次失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/delete")
    public Json deleteModel(String groupid){
        String[] modelids=groupid.split(",");

        Integer r=groupService.delete(modelids);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功删除批次！");
        }else {
            json.setSuccess(false);
            json.setMsg("删除批次失败,请重新尝试！");
        }
        return json;
    }
}
