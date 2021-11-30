package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightFilter {

    List<Flight> findBeforeDate(List<Flight> flightsList, LocalDateTime beforeDate);

    List<Flight> findAfterDate(List<Flight> flightsList, LocalDateTime afterDate);

    List<Flight> findBetweenDate(List<Flight> flightsList, LocalDateTime firstDate, LocalDateTime secondDate);

}
