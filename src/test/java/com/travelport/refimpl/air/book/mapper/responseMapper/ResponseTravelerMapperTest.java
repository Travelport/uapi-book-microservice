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
import com.travelport.refimpl.air.book.models.PersonName;
import com.travelport.refimpl.air.book.models.Telephone;
import com.travelport.refimpl.air.book.models.Traveler;
import com.travelport.schema.common_v45_0.BookingTraveler;
import com.travelport.schema.common_v45_0.BookingTravelerName;
import com.travelport.schema.common_v45_0.PhoneNumber;

/**
 * The Class ResponseTravelerMapperTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResponseTravelerMapperTest {

  /** The response traveler mapper. */
  @Autowired
  ResponseTravelerMapper responseTravelerMapper;

  /** The booking traveler. */
  BookingTraveler bookingTraveler = new BookingTraveler();

  /** The booking travelers. */
  List<BookingTraveler> bookingTravelers = new ArrayList<BookingTraveler>();

  /**
   * Populate traveler mapper args.
   */
  @Before
  public void populateTravelerMapperArgs() {
    PhoneNumber phoneNumber = new PhoneNumber();
    List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
    phoneNumber.setLocation("NYC");
    phoneNumber.setCountryCode("1");
    phoneNumber.setAreaCode("305");
    phoneNumber.setNumber("3141592");
    phoneNumbers.add(phoneNumber);

    bookingTraveler.getPhoneNumber().addAll(phoneNumbers);

    BookingTravelerName bookingTravelerName = new BookingTravelerName();
    bookingTravelerName.setFirst("Joe");
    bookingTravelerName.setLast("Smith");
    bookingTraveler.setBookingTravelerName(bookingTravelerName);

    bookingTraveler.setTravelerType("ADT");
    bookingTravelers.add(bookingTraveler);
  }

  /**
   * Traveler mapper basic test.
   */
  @Test
  public void travelerMapperBasicTest() {
    List<Traveler> traveler = responseTravelerMapper.mapTravelers(bookingTravelers);
    Telephone telephone = traveler.get(0).getTelephone().get(0);
    PersonName personName = traveler.get(0).getPersonName();
    assertEquals("NYC", telephone.getCityCode());
    assertEquals("1", telephone.getCountryAccessCode());
    assertEquals("305", telephone.getAreaCityCode());
    assertEquals("3141592", telephone.getPhoneNumber());
    assertEquals("Joe", personName.getGiven());
    assertEquals("Smith", personName.getSurname());
    assertEquals("ADT", traveler.get(0).getPassengerTypeCode());
  }
}
