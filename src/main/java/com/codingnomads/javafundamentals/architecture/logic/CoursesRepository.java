package com.codingnomads.javafundamentals.architecture.logic;

import com.codingnomads.javafundamentals.architecture.logic.Course;

import java.util.List;

public interface CoursesRepository {

    void save(Course course);

    List<Course> getAllCourses();
}
