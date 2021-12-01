package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFilterImpl implements FlightFilter {

    @Override
    public List<Flight> findFlightBeforeDate(List<Flight> flightsList, LocalDateTime beforeDate) {

        return flightsList.stream().filter(flight -> flight.getSegments()
                .get(0)
                .getDepartureDate()
                .isBefore(beforeDate))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findFlightAfterDate(List<Flight> flightsList, LocalDateTime afterDate) {

        List<Flight> result = new ArrayList<>(0);
        for (Flight flight : flightsList) {
            List<Segment> segments = flight.getSegments();
            if (segments.get(0).getDepartureDate().isAfter(afterDate)) {
                result.add(flight);
            }
        }

        return result;
    }

}
