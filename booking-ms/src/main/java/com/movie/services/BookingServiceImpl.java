package com.movie.services;

import com.movie.entities.Booking;
import com.movie.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookingServiceImpl implements BookingService{

    @Autowired
    BookingRepository bookingRepo;


    @Override
    public Booking makeBooking(Booking booking) {
        return bookingRepo.save(booking);

    }

    @Override
    public List<Booking> getUsersBookings(int userId) {
        return 	bookingRepo.findByUserId(userId);
    }

    @Override
    public boolean cancelBooking(int id) {
        return bookingRepo.findById(id)
                .map(booking -> {
                    booking.setBookingStatus("CANCELLED");
                    bookingRepo.save(booking);
                    return true;
                })
                .orElse(false);
    }
}
