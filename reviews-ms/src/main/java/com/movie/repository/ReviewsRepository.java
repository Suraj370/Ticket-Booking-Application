package com.movie.repository;

import com.movie.entities.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public  interface ReviewsRepository extends JpaRepository<Reviews, Integer>
{

    List<Reviews> findReviewsByMovieId(int movieId);


}
