package com.example.onlinelearning.controller;

import com.example.onlinelearning.pojo.Coursevo;
import com.example.onlinelearning.pojo.Courseware;
import com.example.onlinelearning.service.CoursewareService;
import com.example.onlinelearning.utils.Json;
import com.example.onlinelearning.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("courseware")
public class CoursewareController extends BaseController{
    @Autowired
    private CoursewareService coursewareService;

    @RequestMapping("/getList")
    public PageResult getCoursewareList(Integer page, Integer limit, Coursevo courseware){
        PageResult pr = new PageResult();
        Map<String, Object> map = super.getSearchMap(page, limit, courseware);
        pr.setTotal(coursewareService.getTotal(courseware));
        pr.setRows(coursewareService.getList(map));
        pr.setMsg("成功接收课件数据！");
        pr.setSuccess(true);
        return pr;
    }

    @RequestMapping("/fileAdd")
    public Json addFile(HttpServletRequest request){
        Json json=new Json();
        List<MultipartFile> files = ((MultipartHttpServletRequest) request)
                .getFiles("file");
        String filepath="E:\\project\\onlineLearning\\src\\main\\resources\\static\\courseware\\";
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        String notes = "";
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    stream = new BufferedOutputStream(new FileOutputStream(
                            new File(filepath+file.getOriginalFilename())));
                    stream.write(bytes);
                    stream.close();
                    notes+=file.getOriginalFilename()+"-";
                } catch (Exception e) {
                    stream = null;
                    json.setSuccess(false);
                    json.setMsg("上传第"+i+"个课件文件失败，"+e.getMessage());
                    return json;
                }
            } else {
                json.setSuccess(false);
                json.setMsg("上传第"+i+"个文件失败，因为该文件是空文件。");
                return json;
            }
        }
        json.setSuccess(true);
        json.setMsg(notes);
        return json;
    }

    @RequestMapping("/add")
    public Json addCourseware(Courseware courseware){
        //设置上传时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String now=df.format(new Date());
        System.out.println(now);// new Date()为获取当前系统时间
        courseware.setCosUploadTime(now);

        //保存到数据库相关信息
        Integer r=coursewareService.save(courseware);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功加入课件！");
        }else {
            json.setSuccess(false);
            json.setMsg("加入课件失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/modify")
    public Json modifyCourse(Courseware courseware){
        Integer r=coursewareService.update(courseware);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功修改课件！");
        }else {
            json.setSuccess(false);
            json.setMsg("修改课件失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/delete")
    public Json deleteCourse(String cosid){
        String[] modelids=cosid.split(",");
        Integer r=coursewareService.delete(modelids);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功删除课件！");
        }else {
            json.setSuccess(false);
            json.setMsg("删除课件失败,请重新尝试！");
        }
        return json;
    }
}
