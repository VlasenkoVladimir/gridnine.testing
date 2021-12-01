package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Flight> flightList = FlightBuilder.createFlights();

        System.out.println("Show flights after now: ");
        System.out.println(new FlightFilterImpl().findFlightAfterDate(flightList, LocalDateTime.now()));

        System.out.println("--------------------------------------------------");

        System.out.println("Show flights with correct departure / arrival date");
        System.out.println(new SegmentCheckerImpl().checkSegments(flightList));

        System.out.println("---------------------------------------------------");

        System.out.println("Show flights with delay is less then 2 hours");
        System.out.println(new DelayCheckerImpl().delayIsLessThen(flightList, 2));
    }
}
