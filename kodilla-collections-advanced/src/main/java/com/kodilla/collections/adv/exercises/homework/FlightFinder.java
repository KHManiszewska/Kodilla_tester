package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    static List<Flight> findFlightsFrom(String departure){
        List<Flight> flights = FlightRepository.getFlightsTable(departure);
        List<Flight> flightsFrom = new ArrayList<>();
        for (Flight flight : flights){
            if (flight.departure == departure)
                flightsFrom.add(flight);
        }
        return flightsFrom;
    }
    static List<Flight> findFlightsTo(String arrival){
        List<Flight> flights = FlightRepository.getFlightsTable(arrival);
        List<Flight> flightsTo = new ArrayList<>();
        for (Flight flight : flights){
            if (flight.arrival == arrival)
                flightsTo.add(flight);
        }
        return flightsTo;
    }
}
