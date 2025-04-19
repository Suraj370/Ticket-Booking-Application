package com.movie.controller;

import com.movie.entities.Movie;
import com.movie.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Movies/user")
public class UserController
{

    @Autowired
    MovieService service;



    @GetMapping("/all")
    public List<Movie> getAllMovie(@RequestParam(defaultValue="0") int page,
                                   @RequestParam(defaultValue="5") int size,
                                   @RequestParam(defaultValue="price") String sortBy,
                                   @RequestParam(defaultValue="true") boolean ascending) {

        Sort sort = ascending ? Sort.by(sortBy).ascending() :  Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(page, size,sort);
        return  service.getAllMovie(pageable);
    }




    @GetMapping("/search")
    public List<Movie> searchMovieByName(@RequestParam String eventName) {

        return service.searchMovieByName(eventName);
    }

}