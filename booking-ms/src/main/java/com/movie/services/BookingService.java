package com.movie.services;

import com.movie.entities.Booking;

import java.util.List;

public interface BookingService
{
    public Booking makeBooking(Booking booking);
    public List<Booking> getUsersBookings(int userId);
    boolean cancelBooking(int id);

}