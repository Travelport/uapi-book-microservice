package com.travelport.refimpl.air.book.mapper.responseMapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.apache.cxf.helpers.IOUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.travelport.refimpl.air.book.models.Offer;
import com.travelport.refimpl.air.book.models.Payment;
import com.travelport.refimpl.air.book.models.Traveler;
import com.travelport.refimpl.air.book.models.response.Response;
import com.travelport.schema.common_v45_0.BookingTraveler;
import com.travelport.schema.universal_v45_0.AirCreateReservationRsp;
import com.travelport.schema.universal_v45_0.UniversalRecord;

/**
 * The Class AirBookResponseMapperTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AirBookResponseMapperTest {

  /** The air book response mapper. */
  @Autowired
  AirBookResponseMapper airBookResponseMapper;

  /** The response payment mapper. */
  @MockBean
  ResponsePaymentMapper responsePaymentMapper;

  /** The response offer mapper. */
  @MockBean
  ResponseOfferMapper responseOfferMapper;

  /** The response traveler mapper. */
  @MockBean
  ResponseTravelerMapper responseTravelerMapper;

  /** The jaxb context. */
  static JAXBContext jaxbContext;

  /** The air create reservation rsp. */
  AirCreateReservationRsp airCreateReservationRsp = new AirCreateReservationRsp();

  /**
   * Populate response mapper args.
   *
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @Before
  public void populateResponseMapperArgs() throws IOException {
    String responseEnvelope = IOUtils.toString(getClass()
        .getResourceAsStream("/airCreateReservationResponse/airBookResponseMapperTest.xml"));
    try {
      // Needed for unmarshalling the service request
      jaxbContext = JAXBContext.newInstance(AirCreateReservationRsp.class);
      Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
      StringReader reader = new StringReader(responseEnvelope);
      // Cast SOAP string to service Request Object
      airCreateReservationRsp = (AirCreateReservationRsp) unmarshaller.unmarshal(reader);
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  /**
   * Test map book response basic.
   */
  @SuppressWarnings("unchecked")
  @Test
  public void testMapBookResponseBasic() {

    // Set up mock behaviors
    Mockito.when(responseOfferMapper.mapOffers(Mockito.any(AirCreateReservationRsp.class)))
        .thenReturn(new ArrayList<Offer>());
    Mockito
        .when(responseTravelerMapper
            .mapTravelers(Mockito.any(new ArrayList<BookingTraveler>().getClass())))
        .thenReturn(new ArrayList<Traveler>());
    Mockito.when(responsePaymentMapper.mapPayments(Mockito.any(UniversalRecord.class)))
        .thenReturn(new ArrayList<Payment>());

    // Call the class we are testing
    Response response = airBookResponseMapper.returnAirBook(airCreateReservationRsp);

    // Asserts
    assertNotNull(response);
    assertEquals(response.getReservationResponse().getTransactionId(),
        "18949BD20A07643BED7F90DBFB29F250");
  }
}

