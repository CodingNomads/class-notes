package com.codingnomads.javafundamentals.architecture.data;

import com.codingnomads.javafundamentals.architecture.logic.Course;
import com.codingnomads.javafundamentals.architecture.logic.CoursesRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DbCoursesRepository implements CoursesRepository {

    @Override
    public void save(Course course) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(createConnectionUrl());
            preparedStatement = connection.prepareStatement("insert into  college.courses (course_name, description, credits, department) " +
                    "values (?, ?, ?, ?)");
            preparedStatement.setString(1, course.getCourseName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setInt(3, course.getCredits());
            preparedStatement.setString(4, course.getDepartment());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("There was an error");
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Course> getAllCourses() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(createConnectionUrl());
            resultSet = connection.createStatement().executeQuery("select * from college.courses;");

            return transformToCourseList(resultSet);

        } catch (Exception e) {
            System.out.println("There was an error");
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return Collections.emptyList();
    }

    private List<Course> transformToCourseList(ResultSet resultSet) throws SQLException {
        List<Course> courseList = new ArrayList<>();
        while (resultSet.next()) {
            Course course = new Course();
            course.setId(resultSet.getInt("id"));
            course.setCourseName(resultSet.getString("course_name"));
            course.setDescription(resultSet.getString("description"));
            course.setCredits(resultSet.getInt("credits"));
            course.setDepartment(resultSet.getString("department"));
            courseList.add(course);
        }
        return courseList;
    }


    private String createConnectionUrl() {
        String host = "localhost";
        String dbName = "college";
        String user = "roi";
        String password = "roi";
        return "jdbc:mysql://" + host + "/" + dbName + "?" + "user=" + user + "&password=" + password + "&useSSL=false&allowPublicKeyRetrieval=true";
    }
}
