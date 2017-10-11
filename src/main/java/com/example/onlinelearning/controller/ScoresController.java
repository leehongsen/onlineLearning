package com.example.onlinelearning.controller;

import com.example.onlinelearning.pojo.Scores;
import com.example.onlinelearning.service.ScoresService;
import com.example.onlinelearning.utils.Json;
import com.example.onlinelearning.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/scores")
public class ScoresController extends BaseController {
    @Autowired
    private ScoresService scoresService;

    @RequestMapping("/getList")
    public PageResult getMenuList(Integer page, Integer limit, Scores scores){
        PageResult pr = new PageResult();
        Map<String, Object> map = super.getSearchMap(page, limit, scores);
        pr.setTotal(scoresService.getTotal(scores));
        pr.setRows(scoresService.getList(map));
        pr.setMsg("成功接收成绩数据！");
        pr.setSuccess(true);
        return pr;
    }

    @RequestMapping("/add")
    public Json addModel(Scores scores) {
        Integer r=scoresService.save(scores);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功加入成绩！");
        }else {
            json.setSuccess(false);
            json.setMsg("加入成绩失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/modify")
    public Json modifyModel(Scores scores){
        Integer r=scoresService.update(scores);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功修改成绩！");
        }else {
            json.setSuccess(false);
            json.setMsg("修改成绩失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/delete")
    public Json deleteModel(String scores){
        String[] modelids=scores.split(",");

        Integer r=scoresService.delete(modelids);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功删除成绩！");
        }else {
            json.setSuccess(false);
            json.setMsg("删除成绩失败,请重新尝试！");
        }
        return json;
    }
}
