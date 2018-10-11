package com.codingnomads.javafundamentals.architecture;

import com.codingnomads.javafundamentals.architecture.data.DbCoursesRepository;
import com.codingnomads.javafundamentals.architecture.data.InMemoryCoursesRepository;
import com.codingnomads.javafundamentals.architecture.logic.Course;
import com.codingnomads.javafundamentals.architecture.logic.CoursesService;

import java.util.List;

public class Application {


    public static void main(String[] args) {
        //InMemoryCoursesRepository inMemoryCoursesRepository = new InMemoryCoursesRepository();
        DbCoursesRepository dbCoursesRepository = new DbCoursesRepository();
        CoursesService coursesService = new CoursesService(dbCoursesRepository);

        Course course = createCourse("Java", "Software engineering", "A cool course", 10);
        Course course2 = createCourse("C#", "Software engineering", "Another cool course", 10);

        coursesService.save(course);
        coursesService.save(course2);

        List<Course> courseList = coursesService.getAllCourses();
        System.out.println("All the courses are " + courseList);


    }

    private static Course createCourse(String courseName, String description, String department, int credits) {
        Course course = new Course();
        course.setCourseName(courseName);
        course.setDescription(description);
        course.setDepartment(department);
        course.setCredits(credits);
        return course;
    }
}
