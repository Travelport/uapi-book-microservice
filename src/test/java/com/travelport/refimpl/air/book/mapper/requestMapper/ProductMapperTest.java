package com.travelport.refimpl.air.book.mapper.requestMapper;

import static org.junit.Assert.assertEquals;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.travelport.refimpl.air.book.models.Departure;
import com.travelport.refimpl.air.book.models.Fees;
import com.travelport.refimpl.air.book.models.Identifier;
import com.travelport.refimpl.air.book.models.Offer;
import com.travelport.refimpl.air.book.models.Payment;
import com.travelport.refimpl.air.book.models.Product;
import com.travelport.refimpl.air.book.models.Taxes;
import com.travelport.refimpl.air.book.models.Traveler;
import com.travelport.refimpl.air.book.models.request.Arrival;
import com.travelport.refimpl.air.book.models.request.Brand;
import com.travelport.refimpl.air.book.models.request.Flight;
import com.travelport.refimpl.air.book.models.request.FlightProduct;
import com.travelport.refimpl.air.book.models.request.FlightSegment;
import com.travelport.refimpl.air.book.models.request.PassengerFlight;
import com.travelport.refimpl.air.book.models.request.ReservationSummary;
import com.travelport.refimpl.air.book.models.response.PaymentCardAuthorizationSummary;
import com.travelport.schema.air_v45_0.AirPricingInfo;
import com.travelport.schema.air_v45_0.AirPricingSolution;
import com.travelport.schema.air_v45_0.BookingInfo;
import com.travelport.schema.air_v45_0.FareInfo;
import com.travelport.schema.air_v45_0.TypeBaseAirSegment;

/**
 * The Class ProductMapperTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductMapperTest {

  /** The product mapper. */
  @Autowired
  ProductMapper productMapper;

  /**
   * Map air pricing solution test.
   */
  @Test
  public void mapAirPricingSolutionTest() {
    Brand brand = new Brand(null, "dksi33wq9", "rewR34aQ!==", null, null, null, null);
    FlightProduct flightProduct =
        new FlightProduct("dksi33wq9", null, "K", "Economy", "2QFLEX", null, brand);
    List<FlightProduct> flightProducts = new ArrayList<FlightProduct>(Arrays.asList(flightProduct));
    PassengerFlight passengerFlight = new PassengerFlight(null, null, "ADT", flightProducts);
    List<PassengerFlight> passengerFlights =
        new ArrayList<PassengerFlight>(Arrays.asList(passengerFlight));

    Departure departure = new Departure(null, "ICN", "2040-05-06", "19:59:00-07:00");
    Arrival arrival = new Arrival(null, "SFO", "2040-05-06", "21:22:00-08:00");
    Flight flight = new Flight(null, "ay7e8", "0", null, null, null, "UA", "777", null, null, null,
        null, departure, arrival, null);
    FlightSegment flightSegment = new FlightSegment(null, null, null, null, null, flight);
    List<FlightSegment> flightSegments = new ArrayList<FlightSegment>(Arrays.asList(flightSegment));

    Product product =
        new Product(null, null, null, null, null, null, flightSegments, passengerFlights);
    List<Product> products = new ArrayList<Product>(Arrays.asList(product));
    Identifier identifier = new Identifier("dksi33wq9", null);
    PaymentCardAuthorizationSummary paymentCardAuthorizationSummary =
        new PaymentCardAuthorizationSummary(null, "LtkoDd3WSdW20aXZvl4/cw==", null, null, null,
            null, "PDz8y7xu4hGdeB/wYIhwmw==", null);
    Offer offer = new Offer(null, null, null, identifier, products, null, null,
        paymentCardAuthorizationSummary);
    List<Offer> offers = new ArrayList<Offer>(Arrays.asList(offer));

    Traveler traveler = new Traveler(null, null, null, null, null, "ADT", null, null, identifier,
        null, null, null, null, null, null, null, null);
    List<Traveler> travelers = new ArrayList<Traveler>(Arrays.asList(traveler));


    Fees fees = new Fees(null, 7.61);
    Taxes taxes = new Taxes(null, 42.81, null);
    Payment payment = new Payment(null, null, null, null, null, null, null, fees, taxes);
    List<Payment> payments = new ArrayList<Payment>(Arrays.asList(payment));

    ReservationSummary reservationSummary = new ReservationSummary(null, null, offers, travelers,
        null, null, null, null, payments, null, null, null);

    AirPricingSolution airPricingSolution = productMapper.mapAirPricingSolution(reservationSummary);

    AirPricingInfo airPricingInfo = airPricingSolution.getAirPricingInfo().get(0);
    assertEquals("dksi33wq9", airPricingInfo.getKey());

    FareInfo fareInfo = airPricingInfo.getFareInfo().get(0);

    assertEquals("dksi33wq9", fareInfo.getKey());
    assertEquals("2QFLEX", fareInfo.getFareBasis());
    assertEquals("ADT", fareInfo.getPassengerTypeCode());

    BookingInfo bookingInfo = airPricingInfo.getBookingInfo().get(0);
    assertEquals("K", bookingInfo.getBookingCode());
    assertEquals("Economy", bookingInfo.getCabinClass());
    assertEquals("rewR34aQ!==", bookingInfo.getFareInfoRef());

    TypeBaseAirSegment airSegment = airPricingSolution.getAirSegment().get(0);
    assertEquals("ICN", airSegment.getOrigin());
    assertEquals(BigInteger.valueOf(223), airSegment.getFlightTime());
    assertEquals("2040-05-06", airSegment.getDepartureTime().substring(0, 10));
    assertEquals("19:59:00-07:00", airSegment.getDepartureTime().substring(11));
    assertEquals("SFO", airSegment.getDestination());
    assertEquals("2040-05-06", airSegment.getArrivalTime().substring(0, 10));
    assertEquals("21:22:00-08:00", airSegment.getArrivalTime().substring(11));
    assertEquals("ay7e8", airSegment.getKey());
    assertEquals("0", String.valueOf(airSegment.getGroup()));
    assertEquals("UA", airSegment.getCarrier());
    assertEquals("777", airSegment.getFlightNumber());

    assertEquals("ADT", airPricingInfo.getPassengerType().get(0).getCode());

    assertEquals(7.61, Double.parseDouble(airPricingInfo.getFees()), 0);
    assertEquals(42.81, Double.parseDouble(airPricingInfo.getTaxes()), 0);
  }
}
