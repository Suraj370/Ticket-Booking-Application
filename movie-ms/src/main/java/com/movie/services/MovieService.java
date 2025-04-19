package com.movie.services;

import com.movie.entities.Movie;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MovieService {
    public Movie addMovie(Movie movie);
    public boolean updateMovie(Movie movie, int movieId);
    public boolean deleteMovie(int movieId);
    public List<Movie> searchMovieByName(String name);
    public List<Movie> searchMovieByGenre(String genre);
    public List<Movie> getAllMovie(Pageable pageable);
}
