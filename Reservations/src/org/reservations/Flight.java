package org.reservations;

public class Flight
	{

	private String	departureCity;
	private String	arrivalCity;
	private int	flightNumber;
	public Flight()
	{
		 departureCity = "Unknown Departure City";
	 arrivalCity = "Unknown Departure City";
		 flightNumber = 100;
	}
	public String getDepartureCity()
		{
				return departureCity;
		}
	public void setDepartureCity(String departureCity)
		{
				this.departureCity = departureCity;
		}
	public String getArrivalCity()
		{
				return arrivalCity;
		}
	public void setArrivalCity(String arrivalCity)
		{
				this.arrivalCity = arrivalCity;
		}
	public int getFlightNumber()
		{
				return flightNumber;
		}
	public void setFlightNumber(int flightNumber)
		{
				this.flightNumber = flightNumber;
		}
	
	

	}
