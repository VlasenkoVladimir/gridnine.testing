package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightFilter {

    List<Flight> findFlightBeforeDate(List<Flight> flightsList, LocalDateTime beforeDate);

    List<Flight> findFlightAfterDate(List<Flight> flightsList, LocalDateTime afterDate);

}
