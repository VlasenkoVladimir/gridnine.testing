package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

public class SegmentCheckerImpl implements SegmentChecker {

    @Override
    public List<Flight> checkSegments(List<Flight> flightsList) {

        List<Flight> result = new ArrayList<>(0);

        for (Flight flight : flightsList) {
            List<Segment> segments = flight.getSegments();
            for (int i = 1; i < segments.size(); i++) {
                if (segments.get(i).getDepartureDate().isAfter(segments.get(i - 1).getArrivalDate())) {
                    result.add(flight);
                }
            }
        }

        return result;
    }
}
