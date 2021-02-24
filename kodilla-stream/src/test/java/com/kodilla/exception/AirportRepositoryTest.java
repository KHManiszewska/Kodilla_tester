package com.kodilla.exception;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportRepositoryTest {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        System.out.println(isWarsawInUse);
        // then
        assertTrue(isWarsawInUse);
    }

    @Test
    public void testIsAirportInUse_withException() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        AirportNotFoundException exeption = assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUse("Vienna"));
        // boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
        // then
        assertEquals("Airport Does Not Exist", exeption.getMessage());
    }
}