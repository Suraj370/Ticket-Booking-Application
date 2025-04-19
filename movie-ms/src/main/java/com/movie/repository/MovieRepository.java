package com.movie.repository;

import com.movie.entities.Movie;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Integer>
{

    List<Movie> findByName(String name);

    List<Movie> findByGenre(String genre);

    List<Movie> findAllMovies(Pageable pageable);

}
