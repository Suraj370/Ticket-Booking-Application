package com.movie.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking {

    @Id
    int bookingId;
    int userId;
    int movieId;
    int numOfSeats;
    LocalTime showTiming;
    double totalPrice;
    String bookingStatus;

}
