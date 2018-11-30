package com.travelport.refimpl.air.book.mapper.responseMapper;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.travelport.refimpl.air.book.models.Departure;
import com.travelport.refimpl.air.book.models.request.Arrival;
import com.travelport.refimpl.air.book.models.request.Flight;
import com.travelport.refimpl.air.book.models.request.FlightSegment;
import com.travelport.schema.air_v45_0.TypeBaseAirSegment;

/**
 * The Class ResponseFlightSegmentMapper.
 */
@Component
public class ResponseFlightSegmentMapper {

  private static final Logger LOG = LoggerFactory.getLogger(ResponseFlightSegmentMapper.class);

  /**
   * Map flight segments.
   *
   * @param segments the segments
   * @return the list
   */
  public List<FlightSegment> mapFlightSegments(List<TypeBaseAirSegment> segments) {
    LOG.debug("Entered mapFlightSegments");

    List<FlightSegment> flightSegments = new ArrayList<FlightSegment>();
    for (TypeBaseAirSegment segment : segments) {
      FlightSegment flightSegment = new FlightSegment();
      flightSegment.setFlight(mapFlight(segment));

      flightSegments.add(flightSegment);
    }
    return flightSegments;
  }

  /**
   * Map flight.
   *
   * @param segment the segment
   * @return the flight
   */
  private Flight mapFlight(TypeBaseAirSegment segment) {
    LOG.debug("Entered mapFlight");

    Flight flight = new Flight();
    flight.setFlightRef(segment.getKey());
    flight.setId(String.valueOf(segment.getGroup()));
    flight.setCarrier(segment.getCarrier());
    flight.setNumber(segment.getFlightNumber());
    flight.setDeparture(mapDeparture(segment));
    flight.setArrival(mapArrival(segment));
    flight.setDuration(calculateFlightTime(segment.getArrivalTime(), segment.getDepartureTime()));
    if (segment.getDistance() != null) {
      flight.setDistance(segment.getDistance().intValue());
    }

    return flight;
  }

  /**
   * Calculate flight time.
   *
   * @param arrivalTime the arrival time
   * @param departureTime the departure time
   * @return the string
   */
  private String calculateFlightTime(String arrivalTime, String departureTime) {
    LOG.debug("Entered calculateFlightTime");

    OffsetDateTime arrival = OffsetDateTime.parse(arrivalTime);
    OffsetDateTime departure = OffsetDateTime.parse(departureTime);
    Duration connectionDuration = Duration.between(departure, arrival);
    return connectionDuration.toString().replaceAll("-", "");
  }

  /**
   * Map departure.
   *
   * @param segment the segment
   * @return the departure
   */
  private Departure mapDeparture(TypeBaseAirSegment segment) {
    LOG.debug("Entered mapDeparture");

    Departure departure = new Departure();
    departure.setLocation(segment.getOrigin());
    departure.setDate(segment.getDepartureTime().substring(0, 10));
    departure.setTime(segment.getDepartureTime().substring(11, 19)
        + segment.getDepartureTime().substring(23, 29));

    return departure;
  }

  /**
   * Map arrival.
   *
   * @param segment the segment
   * @return the arrival
   */
  private Arrival mapArrival(TypeBaseAirSegment segment) {
    LOG.debug("Entered mapArrival");

    Arrival arrival = new Arrival();
    arrival.setLocation(segment.getDestination());
    arrival.setDate(segment.getArrivalTime().substring(0, 10));
    arrival.setTime(
        segment.getArrivalTime().substring(11, 19) + segment.getArrivalTime().substring(23, 29));

    return arrival;
  }
}
