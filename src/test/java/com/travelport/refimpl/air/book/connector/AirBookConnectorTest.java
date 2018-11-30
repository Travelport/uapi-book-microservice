package com.travelport.refimpl.air.book.connector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.travelport.schema.universal_v45_0.AirCreateReservationReq;
import com.travelport.schema.universal_v45_0.AirCreateReservationRsp;
import com.travelport.service.universal_v45_0.AirCreateReservationPortType;
import com.travelport.service.universal_v45_0.AirService;
import com.travelport.service.universal_v45_0.AvailabilityFaultMessage;

/**
 * The Class AirBookConnectorTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AirBookConnectorTest {

  /** The air book connector. */
  @Autowired
  AirBookConnector airBookConnector;

  /**
   * U API service contructor test.
   */
  @Test
  public void uAPIServiceContructorTest() {
    assertTrue(airBookConnector.airCreateReservation instanceof AirCreateReservationPortType);
    assertTrue(airBookConnector.air instanceof AirService);
  }

  /**
   * Call air book test.
   */
  @Test
  @Ignore
  public void callAirBookTest() {
    AirCreateReservationReq uapiReq = new AirCreateReservationReq();
    AirCreateReservationRsp uapiRsp = new AirCreateReservationRsp();
    try {
      Mockito.when(airBookConnector.airCreateReservation.service(uapiReq)).thenReturn(uapiRsp);
    } catch (AvailabilityFaultMessage e) {
      e.printStackTrace();
    } catch (com.travelport.service.universal_v45_0.AirFaultMessage e) {
      e.printStackTrace();
    }
    assertEquals(uapiRsp, airBookConnector.callAirBook(uapiReq));
  }
}
