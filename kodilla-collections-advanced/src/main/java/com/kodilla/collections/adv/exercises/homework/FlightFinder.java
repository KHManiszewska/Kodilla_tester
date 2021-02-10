package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlightFinder {

    static Set<Flight> findFlightsFrom(String departure){
        Set<Flight> flights = FlightRepository.getFlightsTable(departure);
        Set<Flight> flightsFrom = new HashSet<>();
        for (Flight flight : flights){
            if (flight.departure.equals(departure))
                flightsFrom.add(flight);
        }
        return flightsFrom;
    }
    static Set<Flight> findFlightsTo(String arrival){
        Set<Flight> flights = FlightRepository.getFlightsTable(arrival);
        Set<Flight> flightsTo = new HashSet<>();
        for (Flight flight : flights){
            if (flight.arrival.equals(arrival))
                flightsTo.add(flight);
        }
        return flightsTo;
    }
}
