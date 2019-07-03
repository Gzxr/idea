package com.oaec.teachingsystem.controller;

import com.oaec.teachingsystem.domain.Course;
import com.oaec.teachingsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    public CourseService courseService;

    @GetMapping("list")
    public String list(Model model) {
       List<Course> CourseList = courseService.findAllCourse();
       model.addAttribute("CourseList",CourseList);
       return "course/cindex";
    }

    @GetMapping("addCourse")
    public String addCourse(String cname,String content,Model model){
        Course course = new Course();
        course.setCname(cname);
        course.setContent(content);

        int i = courseService.createCourse(course);
        if(i>0){
            model.addAttribute("message","添加课程成功");
            return "";
        }else{
            model.addAttribute("error","添加课程失败");
            return "";
        }
    }

    @GetMapping("deleteCourse")
    public String deleteCourse(long id,Model model){
        int i = courseService.deleteCourse(id);
        if(i>0){
            model.addAttribute("message","删除课程成功");
            return "";
        }else{
            model.addAttribute("error","删除课程失败");
            return "";
        }
    }


}
