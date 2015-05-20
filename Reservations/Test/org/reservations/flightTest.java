package org.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class flightTest
	{

		@Test
		public void test()
			{
Flight testFlight1 = new Flight();
				
				assertEquals("Unknown Departure City", testFlight1.getDepartureCity());
				assertEquals("Unknown Departure City", testFlight1.getArrivalCity());
				assertEquals(100,testFlight1.getFlightNumber());
				
			}

	}
