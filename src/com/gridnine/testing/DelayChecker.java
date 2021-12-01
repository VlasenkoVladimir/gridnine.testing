package com.gridnine.testing;

import java.util.List;

public interface DelayChecker {

    List<Flight> delayIsLessThen(List<Flight> flightsList, int delay);

}
