package com.codingnomads.javafundamentals.architecture.logic;

import java.util.List;

public class CoursesService {

    private CoursesRepository coursesRepository;

    public CoursesService(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    public void save(Course course) {
        coursesRepository.save(course);

    }

    public List<Course> getAllCourses() {
        return coursesRepository.getAllCourses();
    }
}
