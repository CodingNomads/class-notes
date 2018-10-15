package com.codingnomads.javafundamentals.tdd;

public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie getMovieByTitle(String movieTitle) {
        return movieRepository.getMovieByTitle(movieTitle);
    }

    public Movie getBestRatedMovie() {
        return movieRepository.getBestRatedMovie();
    }
}
