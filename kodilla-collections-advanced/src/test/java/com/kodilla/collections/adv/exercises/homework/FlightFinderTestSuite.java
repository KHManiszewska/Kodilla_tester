package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {
    String localAirport = "Warsaw";
    String toAirport1 = "Berlin";
    String toAirport2 = "New York";
    String toAirport3 = "Tokyo";
    String fromAirport1 = "Paris";
    String fromAirport2 = "Tokyo";
    String fromAirport3 = "London";
    String fromAirport4 = "Lisbon";

    @Test
    public void findFlightsFrom(){


        FlightRepository.addFlight(localAirport, toAirport1);
        FlightRepository.addFlight(localAirport, toAirport2);
        FlightRepository.addFlight(localAirport, toAirport3);
        FlightRepository.addFlight(fromAirport1, localAirport);
        FlightRepository.addFlight(fromAirport2, localAirport);
        FlightRepository.addFlight(fromAirport3, localAirport);
        FlightRepository.addFlight(fromAirport4, localAirport);
        FlightRepository.addFlight(fromAirport1, toAirport1);
        FlightRepository.addFlight(fromAirport2, toAirport2);

        List<Flight> fromFlights = FlightFinder.findFlightsFrom(localAirport);
        assertEquals(3, fromFlights.size());
        assertEquals(9, FlightRepository.flights.size());
        assertEquals(FlightRepository.flights.get(2).arrival, toAirport3);
        assertEquals(fromFlights.get(1).arrival, toAirport2);
    }
    @Test
    public void findFlightsTo(){


        // FlightRepository.addFlight(localAirport, toAirport1);
        // FlightRepository.addFlight(localAirport, toAirport2);
        // FlightRepository.addFlight(localAirport, toAirport3);
        // FlightRepository.addFlight(fromAirport1, localAirport);
        // FlightRepository.addFlight(fromAirport2, localAirport);
        // FlightRepository.addFlight(fromAirport3, localAirport);
        // FlightRepository.addFlight(fromAirport4, localAirport);
        // FlightRepository.addFlight(fromAirport1, toAirport1);
        // FlightRepository.addFlight(fromAirport2, toAirport2);

        List<Flight> toFlights = FlightFinder.findFlightsTo(localAirport);
        assertEquals(4, toFlights.size());
        assertEquals(9, FlightRepository.flights.size());
        assertEquals(toFlights.get(3).departure, fromAirport4);

    }

}