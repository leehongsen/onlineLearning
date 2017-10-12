package com.example.onlinelearning.controller;

import com.example.onlinelearning.pojo.Course;
import com.example.onlinelearning.service.CourseService;
import com.example.onlinelearning.utils.Json;
import com.example.onlinelearning.utils.PageResult;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("course")
public class CourseController extends BaseController{
    @Autowired
    private CourseService courseService;

    @RequestMapping("/getList")
    public PageResult getCourseList(Integer page, Integer limit, Course course){
        PageResult pr = new PageResult();
        Map<String, Object> map = super.getSearchMap(page, limit, course);
        pr.setTotal(courseService.getTotal(course));
        pr.setRows(courseService.getList(map));
        pr.setMsg("成功接收课程数据！");
        pr.setSuccess(true);
        return pr;
    }

    @RequestMapping("/fileAdd")
    public Json addFile(HttpServletRequest request){
        Json json=new Json();
        List<MultipartFile> files = ((MultipartHttpServletRequest) request)
                .getFiles("file");
        String filepath="E:\\project\\onlineLearning\\src\\main\\resources\\static\\video\\";
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
                    notes+=(file.getOriginalFilename()+"-");
                } catch (Exception e) {
                    stream = null;
                    json.setSuccess(false);
                    json.setMsg("上传第"+i+"个文件失败，"+e.getMessage());
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
        System.out.println(notes);
        return json;
    }

    @RequestMapping("/add")
    public Json addCourse(Course course){
        //设置上传时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String now=df.format(new Date());
        System.out.println(now);// new Date()为获取当前系统时间
        course.setCouUploadTime(now);

        //保存到数据库相关信息
        Integer r=courseService.save(course);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功加入课程！");
        }else {
            json.setSuccess(false);
            json.setMsg("加入课程失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/modify")
    public Json modifyCourse(Course course){
        Integer r=courseService.update(course);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功修改课程！");
        }else {
            json.setSuccess(false);
            json.setMsg("修改课程失败,请重新尝试！");
        }
        return json;
    }

    @RequestMapping("/delete")
    public Json deleteCourse(String couid){
        String[] modelids=couid.split(",");

        Integer r=courseService.delete(modelids);
        Json json=new Json();
        if (r>0){
            json.setSuccess(true);
            json.setMsg("成功删除课程！");
        }else {
            json.setSuccess(false);
            json.setMsg("删除课程失败,请重新尝试！");
        }
        return json;
    }
}
