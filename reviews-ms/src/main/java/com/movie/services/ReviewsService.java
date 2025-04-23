package com.movie.services;

import com.movie.entities.Reviews;

import java.util.List;

public interface ReviewsService
{
    public Reviews addReview(Reviews reviews);
    public boolean updateReview(Reviews reviews,int id);
    public boolean deleteReview(int id);
    public List<Reviews> getAllReview(int movieId);

}
