package com.codingnomads.javafundamentals.architecture.data;

import com.codingnomads.javafundamentals.architecture.logic.Course;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCoursesRepository implements CoursesRepository{

    private List<Course> courseList = new ArrayList<>();

    @Override
    public void save(Course course) {
        courseList.add(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseList;
    }
}
