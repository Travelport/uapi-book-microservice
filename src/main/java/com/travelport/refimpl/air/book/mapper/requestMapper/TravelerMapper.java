package com.travelport.refimpl.air.book.mapper.requestMapper;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.travelport.refimpl.air.book.models.Telephone;
import com.travelport.refimpl.air.book.models.Traveler;
import com.travelport.schema.common_v45_0.BookingTraveler;
import com.travelport.schema.common_v45_0.BookingTravelerName;
import com.travelport.schema.common_v45_0.PhoneNumber;
import com.travelport.schema.common_v45_0.SSR;

/**
 * The Class TravelerMapper.
 */
@Component
public class TravelerMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(TravelerMapper.class);

  /**
   * Map booking traveler.
   *
   * @param travelers the travelers
   * @return the booking traveler
   */
  public BookingTraveler mapBookingTraveler(List<Traveler> travelers) {
    LOG.debug("Entered mapBookingTraveler");

    BookingTraveler bookingTraveler = new BookingTraveler();

    bookingTraveler.setBookingTravelerName(mapBookingTravelerName(travelers));
    bookingTraveler.getPhoneNumber().addAll(mapPhoneNumber(travelers));
    // No mapping for SSR (Special Service Request) in Trip Services
    bookingTraveler.getSSR().addAll(mapSSR(travelers));

    return bookingTraveler;
  }

  /**
   * @param travelers
   * @return
   */
  private List<SSR> mapSSR(List<Traveler> travelers) {
    LOG.debug("Entered mapSSR");

    List<SSR> ssrs = new ArrayList<SSR>();

    for (Traveler traveler : travelers) {
      SSR ssr = new SSR();

      ssr.setFreeText(
          "////" + mapDOB(traveler.getDob()) + "/" + traveler.getGender().substring(0, 1)
              + "//" + traveler.getPersonName().getSurname().toUpperCase() + "/"
              + traveler.getPersonName().getGiven().toUpperCase());
      ssr.setKey("1");
      ssr.setType("DOCS");
      ssr.setStatus("HK");
      ssrs.add(ssr);
    }
    return ssrs;
  }

  /**
   * @param month
   * @return
   */
  private String mapDOB(String dob) {
    LOG.debug("Entered mapDOB");
    LocalDate date = LocalDate.parse(dob);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyy", Locale.ENGLISH);
    return date.format(formatter).toString().toUpperCase();
  }

  /**
   * Map booking traveler name.
   *
   * @param travelers the travelers
   * @return the booking traveler name
   */
  private BookingTravelerName mapBookingTravelerName(List<Traveler> travelers) {
    LOG.debug("Entered mapBookingTravelerName");
    BookingTravelerName bookingTravelerName = new BookingTravelerName();

    for (Traveler traveler : travelers) {
      bookingTravelerName.setFirst(traveler.getPersonName().getGiven());
      bookingTravelerName.setLast(traveler.getPersonName().getSurname());
    }
    return bookingTravelerName;
  }

  /**
   * Map phone number.
   *
   * @param travelers the travelers
   * @return the list
   */
  private List<PhoneNumber> mapPhoneNumber(List<Traveler> travelers) {
    LOG.debug("Entered mapPhoneNumber");
    List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

    for (int i = 0; i < travelers.size(); i++) {

      List<Telephone> telephone = travelers.get(i).getTelephone();
      for (Telephone travelerTelephone : telephone) {
        LOG.debug("Entered list of mapPhoneNumber");
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setLocation(travelerTelephone.getCityCode());
        phoneNumber.setCountryCode(travelerTelephone.getCountryAccessCode());
        phoneNumber.setAreaCode(travelerTelephone.getAreaCityCode());
        phoneNumber.setNumber(travelerTelephone.getPhoneNumber());
        phoneNumbers.add(phoneNumber);
      }
    }
    return phoneNumbers;
  }
}
