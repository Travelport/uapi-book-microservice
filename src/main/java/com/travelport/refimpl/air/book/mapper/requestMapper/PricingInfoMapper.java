package com.travelport.refimpl.air.book.mapper.requestMapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.travelport.refimpl.air.book.models.Offer;
import com.travelport.refimpl.air.book.models.Payment;
import com.travelport.refimpl.air.book.models.Product;
import com.travelport.refimpl.air.book.models.Traveler;
import com.travelport.refimpl.air.book.models.request.Brand;
import com.travelport.refimpl.air.book.models.request.FlightProduct;
import com.travelport.refimpl.air.book.models.request.FlightSegment;
import com.travelport.refimpl.air.book.models.request.PassengerFlight;
import com.travelport.refimpl.air.book.models.request.ReservationSummary;
import com.travelport.schema.air_v45_0.AirPricingInfo;
import com.travelport.schema.air_v45_0.BookingInfo;
import com.travelport.schema.air_v45_0.FareInfo;
import com.travelport.schema.air_v45_0.PassengerType;
import com.travelport.schema.air_v45_0.TypePricingMethod;

@Component
public class PricingInfoMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(PricingInfoMapper.class);

  /**
   * Map air pricing info.
   *
   * @param reservationSummary the reservation summary
   * @return the air pricing info
   */
  public AirPricingInfo mapAirPricingInfo(ReservationSummary reservationSummary) {
    LOG.debug("Entered mapAirPricingInfo");
    AirPricingInfo airPricingInfo = new AirPricingInfo();
    // TripServices has no Mapping for this
    airPricingInfo.setPricingMethod(TypePricingMethod.valueOf("AUTO"));

    List<Offer> offers = reservationSummary.getOffer();

    for (Offer offer : offers) {
      // setKey == airPricingInfoKey
      airPricingInfo.setKey(offer.getIdentifier().getValue());
      airPricingInfo.getFareInfo().addAll(mapFares(offer.getProduct()));
      airPricingInfo.getBookingInfo().addAll(mapBookingInfos(offer.getProduct()));
    }

    airPricingInfo.getPassengerType().add(mapPassengerType(reservationSummary.getTraveler()));

    // Not Required for response but if tax and fees are sent then airPricingInfo must be populated
    if (reservationSummary.getPayment() != null) {
      List<Payment> payments = reservationSummary.getPayment();
      for (Payment payment : payments) {
        if (payment.getTaxes() != null) {
          airPricingInfo.setTaxes(payment.getTaxes().getTotalTaxes().toString());
        }
        if (payment.getFees() != null) {
          airPricingInfo.setFees(payment.getFees().getTotalFees().toString());
        }
      }
    }
    return airPricingInfo;
  }

  /**
   * Map fares.
   *
   * @param products the products
   * @return the list
   */
  private List<FareInfo> mapFares(List<Product> products) {
    LOG.debug("Entered mapFare");
    List<FareInfo> fareInfos = new ArrayList<FareInfo>();

    for (int i = 0; i < products.size(); i++) {
      LOG.debug("Entered list of mapFares");
      List<PassengerFlight> passengerFlight = products.get(i).getPassengerFlight();
      List<FlightProduct> flightProduct = passengerFlight.get(i).getFlightProduct();
      List<FlightSegment> flightSegments = products.get(i).getFlightSegment();

      FareInfo fareInfo = new FareInfo();

      fareInfo.setKey(flightProduct.get(i).getBrand().getId());
      fareInfo.setFareBasis(flightProduct.get(i).getFareBasisCode());
      fareInfo.setPassengerTypeCode(passengerFlight.get(i).getPassengerTypeCode());

      fareInfo.setOrigin(flightSegments.get(i).getFlight().getDeparture().getLocation());
      fareInfo.setDestination(flightSegments.get(i).getFlight().getArrival().getLocation());

      LocalDate today = LocalDate.now();
      fareInfo.setEffectiveDate(today.toString());
      fareInfos.add(fareInfo);
    }

    return fareInfos;
  }

  /**
   * Map booking infos.
   *
   * @param products the products
   * @return the list
   */
  private List<BookingInfo> mapBookingInfos(List<Product> products) {
    LOG.debug("Entered mapBookingInfos");
    List<BookingInfo> bookingInfos = new ArrayList<BookingInfo>();
    for (int i = 0; i < products.size(); i++) {
      LOG.debug("Entering list of mapBookingInfos");
      List<FlightProduct> flightProducts =
          products.get(i).getPassengerFlight().get(i).getFlightProduct();
      Brand brand = flightProducts.get(i).getBrand();
      List<FlightSegment> flightSegments = products.get(i).getFlightSegment();
      BookingInfo bookingInfo = new BookingInfo();

      bookingInfo.setFareInfoRef(brand.getBrandRef());
      bookingInfo.setBookingCode(flightProducts.get(i).getClassOfService());
      bookingInfo.setCabinClass(flightProducts.get(i).getCabin());
      bookingInfo.setSegmentRef(flightSegments.get(i).getFlight().getId());
      bookingInfos.add(bookingInfo);
    }
    return bookingInfos;
  }

  /**
   * Map passenger type.
   *
   * @param travelers the travelers
   * @return the passenger type
   */
  private PassengerType mapPassengerType(List<Traveler> travelers) {
    LOG.debug("Entered mapPassengerType");
    PassengerType passengerType = new PassengerType();
    for (int i = 0; i < travelers.size(); i++) {
      passengerType.setCode(travelers.get(i).getPassengerTypeCode());
    }
    return passengerType;
  }
}
