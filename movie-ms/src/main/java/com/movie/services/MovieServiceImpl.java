package com.movie.services;

import com.movie.entities.Movie;
import com.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieRepository movieRepo;

    @Override
    public Movie addMovie(Movie movie) {
        return	movieRepo.save(movie);

    }

    @Override
    public boolean updateMovie(Movie movie, int movieId) {
        boolean res= false;
        if(movieRepo.findById(movieId).isPresent())
        {
            movieRepo.save(movie);
            res=true;
        }

        return res;
    }

    @Override
    public boolean deleteMovie(int movieId) {
        boolean res= false;
        if(movieRepo.findById(movieId).isPresent())
        {
            movieRepo.deleteById(movieId);
            res=true;
        }

        return res;
    }

    @Override
    public List<Movie> searchMovieByName(String name) {
        return movieRepo.findByName(name);

    }

    @Override
    public List<Movie> searchMovieByGenre(String genre) {
        return movieRepo.findByGenre(genre);

    }

    @Override
    public List<Movie> getAllMovie(Pageable pageable) {
        return movieRepo.findAllMovies(pageable);
    }
}
