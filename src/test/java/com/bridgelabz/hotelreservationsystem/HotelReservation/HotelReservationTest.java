package com.bridgelabz.hotelreservationsystem.HotelReservation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HotelReservationTest {
	private static Hotel firstHotel, secondHotel, thirdHotel;
	private HotelReservation hotelReservation;

	@BeforeClass
	public static void initializeHotels() {
		firstHotel = new Hotel("Lakewood", 110, 90, 80, 80, 3);
		secondHotel = new Hotel("Bridgewood", 150, 50, 110, 50, 4);
		thirdHotel = new Hotel("Ridgewood", 220, 150, 100, 40, 5);
	}

	@Before
	public void setHotelReservation() {
		hotelReservation = new HotelReservation("11Sep2020", "12Sep2020");
	}

	@Test
	public void givenHotels_WhenAdded_ShouldReturnTheCheapestHotel() {
		hotelReservation.addHotelToHotelReservation(firstHotel);
		hotelReservation.addHotelToHotelReservation(secondHotel);
		hotelReservation.addHotelToHotelReservation(thirdHotel);
		String hotelName = hotelReservation.findTheCheapestHotel();
		Assert.assertEquals("Lakewood Bridgewood ", hotelName);
	}

	@Test
	public void givenHotels_WhenAdded_ShouldReturnTheCheapestBestRatedHotel() {
		hotelReservation.addHotelToHotelReservation(firstHotel);
		hotelReservation.addHotelToHotelReservation(secondHotel);
		hotelReservation.addHotelToHotelReservation(thirdHotel);
		String hotelName = hotelReservation.findTheCheapestBestRatedHotel();
		Assert.assertEquals("Bridgewood", hotelName);
	}

	@Test
	public void givenHotels_WhenAdded_ShouldReturnTheBestRatedHotel() {
		hotelReservation.addHotelToHotelReservation(firstHotel);
		hotelReservation.addHotelToHotelReservation(secondHotel);
		hotelReservation.addHotelToHotelReservation(thirdHotel);
		String hotelName = hotelReservation.findBestRatedHotel();
		Assert.assertEquals("Ridgewood", hotelName);
	}
}
