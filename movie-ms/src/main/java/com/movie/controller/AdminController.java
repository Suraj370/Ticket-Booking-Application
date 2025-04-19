package com.movie.controller;

import com.movie.entities.Movie;
import com.movie.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Movies/admin")
public class AdminController
{
    @Autowired
    MovieService service;


    @PostMapping("/add")
    public Movie addMovie(@RequestBody Movie Movie) {

        return service.addMovie(Movie);
    }

    @PutMapping("/update/{MovieId}")
    public boolean updateMovie(@RequestBody Movie Movie, @PathVariable int MovieId) {
        return service.updateMovie(Movie, MovieId);
    }

    @DeleteMapping("/delete/{MovieId}")
    public boolean deleteMovie(@PathVariable int id) {
        return service.deleteMovie(id);
    }


}
