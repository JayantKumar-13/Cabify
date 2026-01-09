package com.jayant.QuickRide.utils;

import com.jayant.QuickRide.dto.PointDto;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.PrecisionModel;

public class GeometryUtil {

    public static Point createPoint(PointDto pointDto) {             // Creating Point from PointDto
        GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);      //SRID for earth = 4326
        Coordinate coordinate = new Coordinate(pointDto.getCoordinates()[0],
                pointDto.getCoordinates()[1]
        );
        return geometryFactory.createPoint(coordinate);
    }

    //Coordinates()[0] -> Longitude , Coordinates()[1] -> Latitude
}
