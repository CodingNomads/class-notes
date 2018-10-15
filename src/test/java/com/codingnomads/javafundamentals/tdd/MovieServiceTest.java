package com.codingnomads.javafundamentals.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MovieServiceTest {


    public static final String MOVIE_NAME = "movie to create";
    public static final int VALID_ID = 1;
    public static final int INVALID_ID = -1;
    public static final String VALID_MOVIE_TITLE = "VALID_MOVIE_TITLE";
    public static final double BEST_RATING = 4.98;
    private MovieRepository movieRepositoryMock;
    private MovieService movieService;

    @Before
    public void setUp() throws Exception {
        movieRepositoryMock = mock(MovieRepository.class);
        movieService = new MovieService(movieRepositoryMock);
    }

    @Test
    public void whenCreatingAMovie_shouldCreateAMovieAndReturnTheCreatedMovie() {
        Movie movieToCreate = createMovieWith(INVALID_ID);
        Movie createdMovieFromRepo = createMovieWith(VALID_ID);
        when(movieRepositoryMock.save(movieToCreate)).thenReturn(createdMovieFromRepo);

        Movie createdMovie = movieService.createMovie(movieToCreate);

        assertThat(createdMovie.getId()).isEqualTo(VALID_ID);
        assertThat(createdMovie.getTitle()).isEqualTo(MOVIE_NAME);
    }

    @Test
    public void whenRetrievingAMovieByTitle_shouldReturnTheMovieWithTheSameTitle() {
        Movie movieFromRepo = new Movie();
        movieFromRepo.setTitle(VALID_MOVIE_TITLE);
        when(movieRepositoryMock.getMovieByTitle(VALID_MOVIE_TITLE)).thenReturn(movieFromRepo);

        Movie retrievedMovie = movieService.getMovieByTitle(VALID_MOVIE_TITLE);

        assertThat(retrievedMovie.getTitle()).isEqualTo(VALID_MOVIE_TITLE);
    }

    @Test
    public void whenRetrievingTheBestRatedMovie_shouldReturnTheBestRatedMovie() {
        //given
        Movie bestRatedMovie = new Movie();
        bestRatedMovie.setRating(BEST_RATING);
        when(movieRepositoryMock.getBestRatedMovie()).thenReturn(bestRatedMovie);
        //when
        Movie movie = movieService.getBestRatedMovie();
        //then
        assertThat(movie.getRating()).isEqualTo(BEST_RATING);

    }

    private Movie createMovieWith(int id) {
        Movie createdMovieFromRepo = new Movie();
        createdMovieFromRepo.setId(id);
        createdMovieFromRepo.setTitle(MOVIE_NAME);
        return createdMovieFromRepo;
    }
}