package com.jayant.QuickRide.services;

import com.jayant.QuickRide.dto.DriverDto;
import com.jayant.QuickRide.dto.RiderDto;
import com.jayant.QuickRide.entities.Ride;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
