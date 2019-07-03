package com.oaec.teachingsystem.service;

import com.oaec.teachingsystem.domain.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAllCourse();

    Course findCourseById(long id);

    int createCourse(Course course);

    int updateCourse(Course course);

    int deleteCourse(long id);
}
