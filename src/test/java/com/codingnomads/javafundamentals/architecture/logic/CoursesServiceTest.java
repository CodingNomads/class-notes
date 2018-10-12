package com.codingnomads.javafundamentals.architecture.logic;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CoursesServiceTest {

    private Course course1;
    private Course course2;
    private CoursesRepository coursesRepositoryMock;
    private CoursesService coursesService;

    @Before
    public void setUp() throws Exception {
        course1 = new Course();
        course1.setId(1);

        course2 = new Course();
        course2.setId(2);

        coursesRepositoryMock = Mockito.mock(CoursesRepository.class);
        coursesService = new CoursesService(coursesRepositoryMock);

    }

    @Test
    public void whenGettingAllCourses_shouldReturnAllCourses() {
        Course course1 = new Course();
        course1.setId(1);

        Course course2 = new Course();
        course2.setId(2);
        CoursesService coursesService = new CoursesService(new CoursesRepository() {
            @Override
            public void save(Course course) {
            }

            @Override
            public List<Course> getAllCourses() {
                return Arrays.asList(course1, course2);
            }
        });

        List<Course> allCourses = coursesService.getAllCourses();

        assertThat(allCourses).hasSize(2);
        assertThat(allCourses).contains(course1, course2);
    }

    @Test
    public void whenGettingAllCourses_shouldReturnAllCoursesWithMockito() {
        when(coursesRepositoryMock.getAllCourses()).thenReturn(Arrays.asList(course1, course2));

        List<Course> allCourses = coursesService.getAllCourses();

        assertThat(allCourses).hasSize(2);
        assertThat(allCourses).contains(course1, course2);
    }


    @Test
    public void whenSavingACourse_shouldSaveIntoRepository() {
        coursesService.save(course1);

        verify(coursesRepositoryMock).save(course1);
    }
}