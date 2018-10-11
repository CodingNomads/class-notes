package com.codingnomads.javafundamentals.architecture.presentation;

import com.codingnomads.javafundamentals.architecture.logic.Course;
import com.codingnomads.javafundamentals.architecture.logic.CoursesService;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private CoursesService coursesService;

    public Menu(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    public void startMenu() {
        boolean finish = false;
        int option = 0;
        while (!finish) {
            System.out.println("Hello I am Blockbuster: Who you gonna call?");
            System.out.println("1 - Show all Courses");
            System.out.println("0 - Exit");
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    finish = true;
                    break;
                case 1:
                    List<Course> allCourses = coursesService.getAllCourses();
                    System.out.println("The courses are: ");
                    for (Course course : allCourses) {
                        System.out.println(course);
                    }

                    break;
                default:
                    System.out.println("Thats not a valid option.");

            }
        }
        System.out.println("Hope you enjoyed our Blockbuster! Bye!");
    }
}
