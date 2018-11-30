package com.travelport.refimpl.air.book.connector;

import javax.xml.ws.BindingProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.travelport.schema.universal_v45_0.AirCreateReservationReq;
import com.travelport.schema.universal_v45_0.AirCreateReservationRsp;
import com.travelport.service.universal_v45_0.AirCreateReservationPortType;
import com.travelport.service.universal_v45_0.AirFaultMessage;
import com.travelport.service.universal_v45_0.AirService;
import com.travelport.service.universal_v45_0.AvailabilityFaultMessage;

/**
 * The Class AirBookConnector.
 */
@Component
public class AirBookConnector {

  private static final Logger LOG = LoggerFactory.getLogger(AirBookConnector.class);

  /** The username. */
  @Value("${air.username}")
  private String username;

  /** The password. */
  @Value("${air.password}")
  private String password;

  /** The endpoint. */
  @Value("${air.endpoint}")
  private String endpoint;

  /** The branch. */
  @Value("${air.branch}")
  private String branch;

  /** The air create reservation. */
  public AirCreateReservationPortType airCreateReservation;

  /** The air. */
  public AirService air;

  /**
   * Instantiates a new air book connector.
   */
  @Autowired
  public AirBookConnector() {
    this.air = new com.travelport.service.universal_v45_0.AirService();
    this.airCreateReservation = air.getAirCreateReservationPort();
  }

  /**
   * Call air book.
   *
   * @param airCreateReservationReq the air create reservation req
   * @return the air create reservation rsp
   */
  @SuppressWarnings("restriction")
  public AirCreateReservationRsp callAirBook(AirCreateReservationReq airCreateReservationReq) {
    addParametersToProvider((BindingProvider) airCreateReservation);
    AirCreateReservationRsp airCreateResponse = new AirCreateReservationRsp();

    try {
      airCreateResponse = airCreateReservation.service(airCreateReservationReq);
    } catch (AvailabilityFaultMessage e) {
      e.printStackTrace();
    } catch (AirFaultMessage e) {
      e.printStackTrace();
    }
    return airCreateResponse;
  }

  /**
   * Adds the parameters to provider.
   *
   * @param provider the provider
   */
  @SuppressWarnings("restriction")
  private void addParametersToProvider(BindingProvider provider) {

    LOG.debug("Username: " + username);
    LOG.debug("Endpoint: " + endpoint);
    LOG.debug("Branch: " + branch);

    provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
    provider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
    provider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
    provider.getRequestContext().put("schema-validation-enabled", "false");
  }
}
