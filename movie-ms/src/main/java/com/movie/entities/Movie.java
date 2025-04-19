package com.movie.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie {
    @Id
    int movieId;
    String name;
    String description;
    String genre;
    LocalTime duration;
    LocalDate releaseDate;
    String showTimings;
    @OneToMany
    @Transient
    List<Reviews> reviews;



}
