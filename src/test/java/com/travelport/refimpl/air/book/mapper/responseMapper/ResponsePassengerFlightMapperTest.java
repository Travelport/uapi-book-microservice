package com.travelport.refimpl.air.book.mapper.responseMapper;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.travelport.refimpl.air.book.models.request.Brand;
import com.travelport.refimpl.air.book.models.request.FlightProduct;
import com.travelport.refimpl.air.book.models.request.PassengerFlight;
import com.travelport.schema.air_v45_0.AirPricingInfo;
import com.travelport.schema.air_v45_0.BookingInfo;
import com.travelport.schema.air_v45_0.FareInfo;

/**
 * The Class ResponsePassengerFlightMapperTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResponsePassengerFlightMapperTest {

  /** The response passenger flight mapper. */
  @Autowired
  ResponsePassengerFlightMapper responsePassengerFlightMapper;

  /** The air pricing info. */
  AirPricingInfo airPricingInfo = new AirPricingInfo();

  /** The air pricing infos. */
  List<AirPricingInfo> airPricingInfos = new ArrayList<AirPricingInfo>();

  /**
   * Populate passenger flight mapper args.
   */
  @Before
  public void populatePassengerFlightMapperArgs() {
    List<BookingInfo> bookingInfos = new ArrayList<BookingInfo>();
    BookingInfo bookingInfo = new BookingInfo();

    bookingInfo.setBookingCode("K");
    bookingInfo.setCabinClass("Economy");
    bookingInfo.setSegmentRef("faMOTc7Q2BKAQAkDAAAAAA=");
    bookingInfo.setFareInfoRef("daMOTc7Q2BKAQAkDAAAAAA=");
    bookingInfos.add(bookingInfo);

    FareInfo fareInfo = new FareInfo();
    fareInfo.setFareBasis("4HC153");

    airPricingInfo.getFareInfo().add(fareInfo);
    airPricingInfo.getBookingInfo().addAll(bookingInfos);
    airPricingInfos.add(airPricingInfo);
  }

  /**
   * Passenger flight mapper test.
   */
  @Test
  public void passengerFlightMapperTest() {
    List<PassengerFlight> passengerFlights =
        responsePassengerFlightMapper.mapPassengerFlights(airPricingInfos);
    FlightProduct flightProduct = passengerFlights.get(0).getFlightProduct().get(0);
    Brand brand = flightProduct.getBrand();
    assertEquals("FlightProduct", flightProduct.getType());
    assertEquals("K", flightProduct.getClassOfService());
    assertEquals("Economy", flightProduct.getCabin());
    assertEquals("faMOTc7Q2BKAQAkDAAAAAA=", brand.getBrandRef());
    assertEquals("daMOTc7Q2BKAQAkDAAAAAA=", brand.getId());
    assertEquals("4HC153", flightProduct.getFareBasisCode());
  }
}
