package com.travelport.refimpl.air.book.models;

import java.math.BigInteger;

public class ItineraryModel {
	private String key;
	private int group;
	private String carrier;
	private String flightNumber;
	private String origin;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private String classOfService;
	private String providerCode;
	private BigInteger flightTime;
	
	private String fareInfoKey;
	private String fareBasis;
	private String passengerCode;
	private String effectiveDate;
	
	private String cabinClass;
	
	public ItineraryModel()
	{
		
	}
	
	public ItineraryModel(
			String key,
			int group,
			String carrier,
			String flightNumber,
			String origin,
			String destination,
			String departureTime,
			String arrivalTime,
			String classOfService,
			String providerCode,
			BigInteger flightTime)
	{
		super();
		this.key = key;
		this.group = group;
		this.carrier = carrier;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.classOfService = classOfService;
		this.providerCode = providerCode;
		this.flightTime = flightTime;
	}
	
	public ItineraryModel(
			String fareInfoKey,
			String fareBasis,
			String passengerCode,
			String origin,
			String destination,
			String effectiveDate)
	{
		super();
		this.fareInfoKey = fareInfoKey;
		this.fareBasis = fareBasis;
		this.passengerCode = passengerCode;
		this.origin = origin;
		this.destination = destination;
		this.effectiveDate = effectiveDate;	
	}
	
	public ItineraryModel(
			String fareInfoKey,
			String classOfService,
			String cabinClass,
			String key)
	{
		super();
		this.fareInfoKey = fareInfoKey;
		this.classOfService = classOfService;
		this.cabinClass = cabinClass;
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	public String getProviderCode() {
		return providerCode;
	}

	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}

	public BigInteger getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(BigInteger flightTime) {
		this.flightTime = flightTime;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getClassOfService() {
		return classOfService;
	}

	public void setClassOfService(String classOfService) {
		this.classOfService = classOfService;
	}

	public String getFareInfoKey() {
		return fareInfoKey;
	}

	public void setFareInfoKey(String fareInfoKey) {
		this.fareInfoKey = fareInfoKey;
	}

	public String getFareBasis() {
		return fareBasis;
	}

	public void setFareBasis(String fareBasis) {
		this.fareBasis = fareBasis;
	}

	public String getPassengerCode() {
		return passengerCode;
	}

	public void setPassengerCode(String passengerCode) {
		this.passengerCode = passengerCode;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getCabinClass() {
		return cabinClass;
	}

	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}
	
	public String toString() {
		String contents = "\n{" +
				"\nGroup: " + this.group +
				"\nCarrier: " + this.carrier +
				"\nFlight number: " + this.flightNumber +
				"\nOrigin: " + this.origin +
				"\nDestination: " + this.destination +
				"\nDeparture time: " + this.departureTime +
				"\nArrival time: " + this.arrivalTime +
				"\nClass of service: " + this.classOfService +
				"\nProvider code: " + this.providerCode +
				"\nFlight time: " + this.flightTime +
				"\nFare info key: " + this.fareInfoKey +
				"\nFare basis: " + this.fareBasis +
				"\nPassenger code: " + this.passengerCode +
				"\nEffective date: " + this.effectiveDate +
				"\nCabin class: " + this.cabinClass + "}";
		
		return contents;
				
	}
}