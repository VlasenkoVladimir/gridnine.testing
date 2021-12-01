package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

public class DelayCheckerImpl implements DelayChecker {

    @Override
    public List<Flight> delayIsLessThen(List<Flight> flightsList, int delay) {

        List<Flight> result = new ArrayList<>(0);

        for (Flight flight : flightsList) {
            List<Segment> segments = flight.getSegments();
            for (int i = 1; i < segments.size(); i++) {
                if (segments.get(i - 1).getArrivalDate().plusHours(delay).isBefore(segments.get(i).getDepartureDate())) {
                    result.add(flight);
                }
            }
        }

        return result;
    }
}
