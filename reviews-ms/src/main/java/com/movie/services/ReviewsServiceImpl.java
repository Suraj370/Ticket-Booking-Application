package com.movie.services;

import com.movie.entities.Reviews;
import com.movie.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReviewsServiceImpl implements ReviewsService {

    @Autowired
    ReviewsRepository repository;

    @Override
    public Reviews addReview(Reviews reviews) {
        return repository.save(reviews);
    }

    @Override
    public boolean updateReview(Reviews reviews, int id) {
       if(repository.findById(id).isPresent()){
           repository.save(reviews);
           return true;
       }
       return false;
    }

    @Override
    public boolean deleteReview(int id) {
        if(repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Reviews> getAllReview(int movieId) {
        return repository.findReviewsByMovieId(movieId);
    }
}
