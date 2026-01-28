package com.jayant.QuickRide.repositories;

import com.jayant.QuickRide.entities.Driver;
import com.jayant.QuickRide.entities.Rating;
import com.jayant.QuickRide.entities.Ride;
import com.jayant.QuickRide.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

    List<Rating> findByRider(Rider rider);
    List<Rating> findByDriver(Driver driver);

    Optional<Rating> findByRide(Ride ride);
}
