package com.codingnomads.javafundamentals.tdd;

public interface MovieRepository {
    Movie save(Movie movie);

    Movie getMovieByTitle(String movieTitle);

    Movie getBestRatedMovie();
}
