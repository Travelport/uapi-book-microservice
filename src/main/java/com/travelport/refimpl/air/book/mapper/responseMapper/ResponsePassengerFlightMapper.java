package com.travelport.refimpl.air.book.mapper.responseMapper;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.travelport.refimpl.air.book.models.request.Brand;
import com.travelport.refimpl.air.book.models.request.FlightProduct;
import com.travelport.refimpl.air.book.models.request.PassengerFlight;
import com.travelport.schema.air_v45_0.AirPricingInfo;
import com.travelport.schema.air_v45_0.BookingInfo;
import com.travelport.schema.air_v45_0.FareInfo;

/**
 * The Class ResponsePassengerFlightMapper.
 */
@Component
public class ResponsePassengerFlightMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(ResponsePassengerFlightMapper.class);

  /**
   * Map passenger flights.
   *
   * @param airPricingInfos the air pricing infos
   * @return the list
   */
  public List<PassengerFlight> mapPassengerFlights(List<AirPricingInfo> airPricingInfos) {
    LOG.debug("Entered mapPassengerFlights");

    List<PassengerFlight> passengerFlights = new ArrayList<PassengerFlight>();

    for (int i = 0; i < airPricingInfos.size(); i++) {
      PassengerFlight passengerFlight = new PassengerFlight();
      passengerFlight.setFlightProduct(mapFlightProducts(airPricingInfos));
      passengerFlight
          .setPassengerTypeCode(airPricingInfos.get(i).getFareInfo().get(i).getPassengerTypeCode());
      passengerFlights.add(passengerFlight);
    }
    return passengerFlights;
  }

  /**
   * Map flight product.
   *
   * @param airPricingInfos the air pricing infos
   * @return the list
   */
  private List<FlightProduct> mapFlightProducts(List<AirPricingInfo> airPricingInfos) {
    LOG.debug("Entered mapFlightProducts");

    List<FlightProduct> flightProducts = new ArrayList<FlightProduct>();

    for (int i = 0; i < airPricingInfos.size(); i++) {
      List<BookingInfo> bookingInfos = airPricingInfos.get(i).getBookingInfo();
      List<FareInfo> fareInfos = airPricingInfos.get(i).getFareInfo();

      for (BookingInfo bookingInfo : bookingInfos) {
        FlightProduct flightProduct = new FlightProduct();
        flightProduct.setType("FlightProduct");
        flightProduct.setClassOfService(bookingInfo.getBookingCode());
        flightProduct.setCabin(bookingInfo.getCabinClass());
        flightProduct.setBrand(mapBrand(bookingInfo));
        flightProduct.setFareBasisCode(mapFareBasisCode(fareInfos.get(i)));

        flightProducts.add(flightProduct);
      }
    }
    return flightProducts;
  }

  /**
   * Map fare basis code.
   *
   * @param fareInfo the fare info
   * @return the string
   */
  private String mapFareBasisCode(FareInfo fareInfo) {
    LOG.debug("Entered mapFareBasisCode");

    String fareBasis;
    fareBasis = fareInfo.getFareBasis();
    return fareBasis;
  }

  /**
   * Map brand.
   *
   * @param bookingInfo the booking info
   * @return the brand
   */
  private Brand mapBrand(BookingInfo bookingInfo) {
    LOG.debug("Entered mapBrand");

    Brand brand = new Brand();
    brand.setBrandRef(bookingInfo.getSegmentRef());
    brand.setId(bookingInfo.getFareInfoRef());

    return brand;
  }
}
