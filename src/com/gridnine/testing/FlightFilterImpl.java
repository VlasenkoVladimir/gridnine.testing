package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFilterImpl implements FlightFilter {

    @Override
    public List<Flight> findBeforeDate(List<Flight> flightsList, LocalDateTime beforeDate) {


        return null;
    }

    @Override
    public List<Flight> findAfterDate(List<Flight> flightsList, LocalDateTime afterDate) {

        return flightsList.stream().flatMap(flight -> flight.getSegments().removeIf(segment -> segment.getDepartureDate().isBefore(afterDate))).collect(Collectors.toList());
//        return flightsList.stream().peek(flight -> flight.getSegments().removeIf(afterDate)).collect(Collectors.toList());
    }

    @Override
    public List<Flight> findBetweenDate(List<Flight> flightsList, LocalDateTime firstDate, LocalDateTime secondDate) {


        return null;
    }
}
