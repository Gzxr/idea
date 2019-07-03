package com.oaec.teachingsystem.service.impl;

import com.oaec.teachingsystem.domain.Course;
import com.oaec.teachingsystem.mapper.CourseMapper;
import com.oaec.teachingsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseserviceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    public List<Course> findAllCourse() {
        return courseMapper.findAllCourse();
    }

    public Course findCourseById(long id) {
        return courseMapper.findCourseById(id);
    }

    public int createCourse(Course course) {
        return courseMapper.createCourse(course);
    }

    public int updateCourse(Course course) {
        return courseMapper.updateCourse(course);
    }

    public int deleteCourse(long id) {
        return 0;
    }
}
