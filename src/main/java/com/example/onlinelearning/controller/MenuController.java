package com.example.onlinelearning.controller;

import com.example.onlinelearning.pojo.Model;
import com.example.onlinelearning.service.MenuService;
import com.example.onlinelearning.utils.Json;
import com.example.onlinelearning.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Menu")
public class MenuController extends BaseController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/getList")
    public PageResult getMenuList(Integer page, Integer limit, Model model){
        PageResult pr = new PageResult();
        Map<String, Object> map = super.getSearchMap(page, limit, model);
        pr.setTotal(menuService.getTotal(model));
        pr.setRows(menuService.getList(map));
        pr.setMsg("成功接收数据！");
        pr.setSuccess(true);
        return pr;
    }

    @RequestMapping("/add")
    public Json addModel(Model model) {
        Integer r=menuService.save(model);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功加入功能！");
        }else {
            json.setSuccess(false);
            json.setMsg("加入功能失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/modify")
    public Json modifyModel(Model model){
        Integer r=menuService.update(model);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功修改功能！");
        }else {
            json.setSuccess(false);
            json.setMsg("修改功能失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/delete")
    public Json deleteModel(String modid){
        String[] modelids=modid.split(",");

        Integer r=menuService.delete(modelids);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功删除功能！");
        }else {
            json.setSuccess(false);
            json.setMsg("删除功能失败,请重新尝试！");
        }
        return json;
    }

    /*@RequestMapping("/getLike")
    public PageResult getLike(Integer page, Integer limit, Model model){
        PageResult pr = new PageResult();
        Map<String, Object> map = super.getSearchMap(page, limit, model);
        pr.setTotal(menuService.getTotal(model));
        pr.setRows(menuService.getLike(model));
        pr.setMsg("成功接收数据！");
        pr.setSuccess(true);
        return pr;
    }*/
}
