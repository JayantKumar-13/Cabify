package com.jayant.QuickRide.entities;

import jakarta.persistence.*;
import lombok.*;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(indexes = {
        @Index(name = "idx_driver_vehicle_id" , columnList = "vehicleId")              // Indexing on vehicle ID
})
//Indexes are made to perform a query on a column , to make our apis faster
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne                              // Each Driver is a single User
    @JoinColumn(name = "user_id")                   // foreign Key
    private User user;
    private Double rating;
    private Boolean available;

    private String vehicleId;

    // Geometry for Hibernate to identify it as Spatial
    @Column(columnDefinition = "Geometry(Point,4326)")     // 4326 -> We are dealing with earth locations
    private Point currentLocation;

}
