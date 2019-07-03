package com.oaec.teachingsystem.mapper;

import com.oaec.teachingsystem.domain.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {
    List<Course> findAllCourse();

    Course findCourseById(long id);

    int createCourse(Course course);

    int updateCourse(Course course);

    int deleteCourse(long id);

}
