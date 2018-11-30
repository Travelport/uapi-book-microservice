package com.travelport.refimpl.air.book.mapper.requestMapper;

import java.math.BigInteger;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.travelport.refimpl.air.book.models.Offer;
import com.travelport.refimpl.air.book.models.Product;
import com.travelport.refimpl.air.book.models.request.Flight;
import com.travelport.refimpl.air.book.models.request.FlightProduct;
import com.travelport.refimpl.air.book.models.request.FlightSegment;
import com.travelport.refimpl.air.book.models.request.PassengerFlight;
import com.travelport.refimpl.air.book.models.request.ReservationSummary;
import com.travelport.schema.air_v45_0.AirPricingSolution;
import com.travelport.schema.air_v45_0.TypeBaseAirSegment;

/**
 * The Class ProductMapper.
 */
@Component
public class ProductMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(ProductMapper.class);

  /** The pricing info mapper. */
  @Autowired
  PricingInfoMapper pricingInfoMapper;

  /** The core. */
  @Value("${air.core}")
  private String core;

  /**
   * Map air pricing solution.
   *
   * @param reservationSummary the reservation summary
   * @return the air pricing solution
   */
  public AirPricingSolution mapAirPricingSolution(ReservationSummary reservationSummary) {
    LOG.debug("Entered mapAirPricingSolution");
    AirPricingSolution airPricingSolution = new AirPricingSolution();
    List<Offer> offers = reservationSummary.getOffer();
    airPricingSolution.getAirSegment().addAll(mapAirSegment(offers));
    airPricingSolution.setKey(reservationSummary.getOffer().get(0).getIdentifier().getValue());
    airPricingSolution.getAirPricingInfo()
        .add(pricingInfoMapper.mapAirPricingInfo(reservationSummary));

    return airPricingSolution;
  }

  /**
   * Map air segment.
   *
   * @param offers the offers
   * @return the list
   */
  private List<TypeBaseAirSegment> mapAirSegment(List<Offer> offers) {
    List<TypeBaseAirSegment> segments = new ArrayList<TypeBaseAirSegment>();

    for (int i = 0; i < offers.size(); i++) {
      LOG.debug("Entered list of offers");
      List<Product> products = offers.get(i).getProduct();
      List<FlightSegment> flightSegments = products.get(i).getFlightSegment();

      for (int j = 0; j < flightSegments.size(); j++) {
        LOG.debug("Entered list of flight segments");
        List<PassengerFlight> passengerFlights = products.get(i).getPassengerFlight();
        Flight flight = flightSegments.get(j).getFlight();

        TypeBaseAirSegment segment = new TypeBaseAirSegment();
        segment.setKey(flight.getId());
        segment.setGroup(Integer.parseInt(flight.getFlightRef()));
        segment.setCarrier(flight.getCarrier());
        segment.setFlightNumber(flight.getNumber());
        segment.setOrigin(flight.getDeparture().getLocation());
        segment.setDestination(flight.getArrival().getLocation());
        segment.setDepartureTime(
            flight.getDeparture().getDate() + "T" + flight.getDeparture().getTime());
        segment.setArrivalTime(flight.getArrival().getDate() + "T" + flight.getArrival().getTime());
        segment.setClassOfService(mapClassOfService(passengerFlights.get(j)));
        segment.setProviderCode(core);
        segment.setFlightTime(
            calculateFlightTime(flight.getArrival().getDate() + "T" + flight.getArrival().getTime(),
                flight.getDeparture().getDate() + "T" + flight.getDeparture().getTime()));
        segments.add(segment);
      }
    }
    return segments;
  }

  /**
   * Calculate flight time.
   *
   * @param arrivalTime the arrival time
   * @param departureTime the departure time
   * @return the big integer
   */
  private BigInteger calculateFlightTime(String arrivalTime, String departureTime) {
    LOG.debug("Entered calculateFlightTime");
    OffsetDateTime arrival = OffsetDateTime.parse(arrivalTime);
    OffsetDateTime departure = OffsetDateTime.parse(departureTime);
    Duration duration = Duration.between(departure, arrival);
    String durationString = null;
    durationString = duration.toString().replaceAll("-", "");

    BigInteger bigIntDuration =
        new BigInteger(durationString.substring(2, 3) + durationString.substring(4, 6));
    return bigIntDuration;
  }

  /**
   * Map class of service.
   *
   * @param passengerFlight the passenger flight
   * @return the string
   */
  private String mapClassOfService(PassengerFlight passengerFlight) {
    LOG.debug("Entered mapClassOfService");
    List<FlightProduct> flightProducts = passengerFlight.getFlightProduct();
    String classOfService = null;
    for (int i = 0; i < flightProducts.size(); i++) {
      classOfService = (flightProducts.get(i).getClassOfService());
    }
    return classOfService;
  }
}
