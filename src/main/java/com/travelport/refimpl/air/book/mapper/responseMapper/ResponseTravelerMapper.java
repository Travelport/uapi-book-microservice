package com.travelport.refimpl.air.book.mapper.responseMapper;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.travelport.refimpl.air.book.models.PersonName;
import com.travelport.refimpl.air.book.models.Telephone;
import com.travelport.refimpl.air.book.models.Traveler;
import com.travelport.schema.common_v45_0.BookingTraveler;
import com.travelport.schema.common_v45_0.BookingTravelerName;
import com.travelport.schema.common_v45_0.PhoneNumber;

/**
 * The Class ResponseTravelerMapper.
 */
@Component
public class ResponseTravelerMapper {
  
  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(ResponseTravelerMapper.class);

  /**
   * @param bookingTravelers
   * @return
   */
  public List<Traveler> mapTravelers(List<BookingTraveler> bookingTravelers) {
    LOG.debug("Entered mapTravelers");

    List<Traveler> travelers = new ArrayList<Traveler>();
    for (BookingTraveler bookingTraveler : bookingTravelers) {
      Traveler traveler = new Traveler();
      traveler.setType("Traveler");
      traveler.setPassengerTypeCode(bookingTraveler.getTravelerType());
      traveler.setPersonName(mapPersonName(bookingTraveler.getBookingTravelerName()));
      traveler.setTelephone(mapTelephones(bookingTraveler.getPhoneNumber()));
      travelers.add(traveler);
    }
    return travelers;
  }

  /**
   * @param bookingTravelerName
   * @return
   */
  private PersonName mapPersonName(BookingTravelerName bookingTravelerName) {
    LOG.debug("Entered mapPersonName");

    PersonName personName = new PersonName();
    personName.setGiven(bookingTravelerName.getFirst());
    personName.setSurname(bookingTravelerName.getLast());
    return personName;
  }

  /**
   * @param phoneNumbers
   * @return
   */
  private List<Telephone> mapTelephones(List<PhoneNumber> phoneNumbers) {
    LOG.debug("Entered mapTelephones");

    List<Telephone> telephones = new ArrayList<Telephone>();
    for (PhoneNumber phoneNumber : phoneNumbers) {
      Telephone telephone = new Telephone();
      telephone.setType("Telephone");
      telephone.setCityCode(phoneNumber.getLocation());
      telephone.setCountryAccessCode(phoneNumber.getCountryCode());
      telephone.setAreaCityCode(phoneNumber.getAreaCode());
      telephone.setPhoneNumber(phoneNumber.getNumber());
      telephones.add(telephone);
    }
    return telephones;
  }
}
