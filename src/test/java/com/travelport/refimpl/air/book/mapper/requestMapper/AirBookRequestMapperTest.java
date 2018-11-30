package com.travelport.refimpl.air.book.mapper.requestMapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.travelport.refimpl.air.book.models.Departure;
import com.travelport.refimpl.air.book.models.FormOfPaymentIdentifier;
import com.travelport.refimpl.air.book.models.Identifier;
import com.travelport.refimpl.air.book.models.Offer;
import com.travelport.refimpl.air.book.models.Payment;
import com.travelport.refimpl.air.book.models.PersonName;
import com.travelport.refimpl.air.book.models.Product;
import com.travelport.refimpl.air.book.models.Telephone;
import com.travelport.refimpl.air.book.models.Traveler;
import com.travelport.refimpl.air.book.models.request.Arrival;
import com.travelport.refimpl.air.book.models.request.Brand;
import com.travelport.refimpl.air.book.models.request.Flight;
import com.travelport.refimpl.air.book.models.request.FlightProduct;
import com.travelport.refimpl.air.book.models.request.FlightSegment;
import com.travelport.refimpl.air.book.models.request.PassengerFlight;
import com.travelport.refimpl.air.book.models.request.Request;
import com.travelport.refimpl.air.book.models.request.ReservationSummary;
import com.travelport.refimpl.air.book.models.response.PaymentCardAuthorizationSummary;
import com.travelport.schema.common_v45_0.BookingTraveler;
import com.travelport.schema.universal_v45_0.AirCreateReservationReq;

/**
 * The Class AirBookRequestMapperTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AirBookRequestMapperTest {

  /** The product mapper. */
  @MockBean
  ProductMapper productMapper;

  /** The traveler mapper. */
  @MockBean
  TravelerMapper travelerMapper;

  /** The payment mapper. */
  @MockBean
  PaymentMapper paymentMapper;

  /** The air book request mapper. */
  @Autowired
  AirBookRequestMapper airBookRequestMapper;
  Brand brand = new Brand(null, "dksi33wq9", null, null, null, null, null);
  FlightProduct flightProduct =
      new FlightProduct("dksi33wq9", null, "K", "Economy", "2QFLEX", null, brand);
  List<FlightProduct> flightProducts = new ArrayList<FlightProduct>(Arrays.asList(flightProduct));
  PassengerFlight passengerFlight = new PassengerFlight(null, null, "ADT", flightProducts);
  List<PassengerFlight> passengerFlights =
      new ArrayList<PassengerFlight>(Arrays.asList(passengerFlight));

  Traveler traveler = new Traveler("Traveler", null, null, null, null, "ADT", null, null, null,
      new PersonName(null, null, "James", null, "Smith"), null,
      Arrays.asList(new Telephone(null, null, "1", "303", "4152444", null, null, null)), null, null,
      null, null, null);
  List<Traveler> travelers = new ArrayList<Traveler>(Arrays.asList(traveler));

  Payment payment = new Payment("Payment", null, null, null, null,
      new FormOfPaymentIdentifier(null, "14225", new Identifier("4281312", "13324123")), null, null,
      null);
  List<Payment> payments = new ArrayList<Payment>();

  Departure departure = new Departure(null, "ICN", "2040-05-06", "19:59:00-07:00");
  Arrival arrival = new Arrival(null, "SFO", "2040-05-06", "21:22:00-08:00");
  Flight flight = new Flight("Flight", "ay7e8", "0", null, null, null, "UA", "777", null, null,
      null, null, departure, arrival, null);
  List<Flight> flights = new ArrayList<Flight>(Arrays.asList(flight));

  FlightSegment flightSegment = new FlightSegment("Flight", null, null, null, null, flight);
  List<FlightSegment> flightSegments = new ArrayList<FlightSegment>(Arrays.asList(flightSegment));

  Product product =
      new Product("Product", null, null, null, null, null, flightSegments, passengerFlights);
  List<Product> products = new ArrayList<Product>(Arrays.asList(product));

  Identifier identifier = new Identifier("dksi33wq9", null);
  PaymentCardAuthorizationSummary paymentCardAuthorizationSummary =
      new PaymentCardAuthorizationSummary(null, "LtkoDd3WSdW20aXZvl4/cw==", null, null, null, null,
          "PDz8y7xu4hGdeB/wYIhwmw==", null);

  Offer offer = new Offer("Offer", null, null, identifier, products, null, null,
      paymentCardAuthorizationSummary);
  List<Offer> offers = new ArrayList<Offer>(Arrays.asList(offer));

  ReservationSummary reservationSummary = new ReservationSummary("ReservationSummary", null, offers,
      travelers, null, null, null, null, payments, null, null, null);

  Request dummyRequest = new Request(reservationSummary);

  /**
   * Request mappet test.
   */
  @Test
  public void requestMappetTest() {
    when(productMapper.mapAirPricingSolution(null)).thenReturn(null);
    when(travelerMapper.mapBookingTraveler(null)).thenReturn(new BookingTraveler());
    when(paymentMapper.mapPayment(null)).thenReturn(null);

    AirCreateReservationReq airCreateReservationReq = airBookRequestMapper.getAirBook(dummyRequest);

    assertNotNull(airCreateReservationReq);
    assertEquals("UAPI",
        airCreateReservationReq.getBillingPointOfSaleInfo().getOriginApplication());
    assertEquals("ACTIVE", airCreateReservationReq.getActionStatus().get(0).getType());
    assertEquals("T*", airCreateReservationReq.getActionStatus().get(0).getTicketDate());
  }
}
