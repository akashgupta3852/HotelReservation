package com.bridgelabz.hotelreservationsystem.HotelReservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelTest {
	@Test
	public void givenLakewoodRateDetailsWhenAddedShouldReturnTrue() {
		Hotel hotel = new Hotel("Lakewood", 110, 90, 3);
		boolean result = (hotel.getWeekdayRate() == 110) && (hotel.getWeekendRate() == 90) && (hotel.getRating() == 3);
		Assert.assertTrue(result);
	}

	@Test
	public void givenBridgewoodRateDetailsWhenAddedShouldReturnTrue() {
		Hotel hotel = new Hotel("Bridgewood", 150, 50, 4);
		boolean result = (hotel.getWeekdayRate() == 150) && (hotel.getWeekendRate() == 50) && (hotel.getRating() == 4);
		Assert.assertTrue(result);
	}

	@Test
	public void givenRidgewoodRateDetailsWhenAddedShouldReturnTrue() {
		Hotel hotel = new Hotel("Ridgewood", 220, 150, 5);
		boolean result = (hotel.getWeekdayRate() == 220) && (hotel.getWeekendRate() == 150) && (hotel.getRating() == 5);
		Assert.assertTrue(result);
	}
}
