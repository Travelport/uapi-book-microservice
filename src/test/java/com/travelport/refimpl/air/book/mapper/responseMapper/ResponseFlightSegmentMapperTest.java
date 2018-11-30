package com.travelport.refimpl.air.book.mapper.responseMapper;

import static org.junit.Assert.assertEquals;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.travelport.refimpl.air.book.models.Departure;
import com.travelport.refimpl.air.book.models.request.Arrival;
import com.travelport.refimpl.air.book.models.request.Flight;
import com.travelport.refimpl.air.book.models.request.FlightSegment;
import com.travelport.schema.air_v45_0.TypeBaseAirSegment;

/**
 * The Class ResponseFlightSegmentMapperTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResponseFlightSegmentMapperTest {

  /** The response flight segment mapper. */
  @Autowired
  ResponseFlightSegmentMapper responseFlightSegmentMapper;

  /** The segment. */
  TypeBaseAirSegment segment = new TypeBaseAirSegment();

  /** The segments. */
  List<TypeBaseAirSegment> segments = new ArrayList<TypeBaseAirSegment>();

  /**
   * Populate flight segment mapper args.
   */
  @Before
  public void populateFlightSegmentMapperArgs() {

    segment.setKey("1gs6a5");
    segment.setGroup(1);
    segment.setCarrier("UA");
    segment.setFlightNumber("918");
    segment.setEquipment("14");
    segment.setOrigin("ICN");
    segment.setDestination("SFO");
    segment.setDepartureTime("2019-03-06T19:59:00.000-07:00");
    segment.setArrivalTime("2019-03-06T21:22:00.000-08:00");
    segment.setDistance(BigInteger.valueOf(20));
    segments.add(segment);
  }

  /**
   * Map flight segments test.
   */
  @Test
  public void mapFlightSegmentsTest() {
    List<FlightSegment> flightSegments = responseFlightSegmentMapper.mapFlightSegments(segments);
    Flight flight = flightSegments.get(0).getFlight();
    Departure departure = flight.getDeparture();
    Arrival arrival = flight.getArrival();
    assertEquals(1, Integer.parseInt(flight.getId()));
    assertEquals("UA", flight.getCarrier());
    assertEquals("918", flight.getNumber());
    assertEquals("ICN", departure.getLocation());
    assertEquals("2019-03-06", departure.getDate());
    assertEquals("19:59:00.000-07:00",
        departure.getTime().substring(0, 8) + ".000" + departure.getTime().substring(8));
    assertEquals("SFO", arrival.getLocation());
    assertEquals("2019-03-06", arrival.getDate());
    assertEquals("21:22:00.000-08:00",
        arrival.getTime().substring(0, 8) + ".000" + arrival.getTime().substring(8));
  }
}
