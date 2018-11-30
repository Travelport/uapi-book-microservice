package com.travelport.refimpl.air.book.mapper.requestMapper;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.travelport.refimpl.air.book.models.PersonName;
import com.travelport.refimpl.air.book.models.Telephone;
import com.travelport.refimpl.air.book.models.Traveler;
import com.travelport.schema.common_v45_0.BookingTraveler;
import com.travelport.schema.common_v45_0.PhoneNumber;

/**
 * The Class TravelerMapperTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TravelerMapperTest {

  /** The traveler mapper. */
  @Autowired
  TravelerMapper travelerMapper;

  /**
   * Map booking traveler name test.
   */
  @Test
  public void mapBookingTravelerNameTest() {
    PersonName personName = new PersonName(null, null, "James", null, "Smith");
    Telephone telephone = new Telephone(null, null, "1", "303", "4152444", null, null, null);
    List<Telephone> telephones = new ArrayList<Telephone>(Arrays.asList(telephone));
    Traveler traveler = new Traveler(null, null, null, "1985-12-20", "Female", null, null, null,
        null, personName, null, telephones, null, null, null, null, null);
    BookingTraveler bookingTraveler = travelerMapper.mapBookingTraveler(Arrays.asList(traveler));
    String freeText = bookingTraveler.getSSR().get(0).getFreeText();
    PhoneNumber phoneNumber = bookingTraveler.getPhoneNumber().get(0);
    assertEquals("1", phoneNumber.getCountryCode());
    assertEquals("303", phoneNumber.getAreaCode());
    assertEquals("4152444", phoneNumber.getNumber());
    assertEquals("James", bookingTraveler.getBookingTravelerName().getFirst());
    assertEquals("Smith", bookingTraveler.getBookingTravelerName().getLast());
    assertEquals("20DEC85", freeText.substring(4, 11));
    assertEquals("F", freeText.substring(12, 13));
  }
}
