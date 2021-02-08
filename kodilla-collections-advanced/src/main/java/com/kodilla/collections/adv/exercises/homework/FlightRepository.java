package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    static List<Flight> flights = new ArrayList<>();

    static void addFlight(String departure, String arrival){
        Flight newFlight = new Flight(departure, arrival);
        flights.add(newFlight);
    }

    static List<Flight> getFlightsTable(String localAirport){
        List<Flight> localFlights = new ArrayList<>();
        for (Flight flight : flights){
            if (flight.arrival.equals(localAirport) || flight.departure.equals(localAirport)) {
                localFlights.add(flight);
            }
        }
        return localFlights;
    }
}
