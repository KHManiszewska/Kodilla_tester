package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlightRepository {

    static Set<Flight> flights = new HashSet<>();

    static void addFlight(String departure, String arrival){
        Flight newFlight = new Flight(departure, arrival);
        flights.add(newFlight);
    }

    static Set<Flight> getFlightsTable(String localAirport){
        Set<Flight> localFlights = new HashSet<>();
        for (Flight flight : flights){
            if (flight.arrival.equals(localAirport) || flight.departure.equals(localAirport)) {
                localFlights.add(flight);
            }
        }
        return localFlights;
    }
}
