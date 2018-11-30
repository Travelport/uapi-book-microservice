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
import com.travelport.refimpl.air.book.models.FormOfPaymentIdentifier;
import com.travelport.refimpl.air.book.models.Identifier;
import com.travelport.refimpl.air.book.models.Payment;
import com.travelport.schema.air_v45_0.AirPricingInfo;
import com.travelport.schema.air_v45_0.AirReservation;
import com.travelport.schema.common_v45_0.Check;
import com.travelport.schema.common_v45_0.FormOfPayment;
import com.travelport.schema.universal_v45_0.UniversalRecord;

/**
 * The Class ResponsePaymentMapperTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResponsePaymentMapperTest {

  /** The response payment mapper. */
  @Autowired
  ResponsePaymentMapper responsePaymentMapper;

  /** The universal record. */
  UniversalRecord universalRecord = new UniversalRecord();

  /**
   * Populate response payment mapper args.
   */
  @Before
  public void populateResponsePaymentMapperArgs() {
    FormOfPayment formOfPayment = new FormOfPayment();
    List<FormOfPayment> formOfPayments = new ArrayList<FormOfPayment>();
    formOfPayment.setType("FormOfPayment");
    formOfPayment.setKey("1uyT643");

    Check check = new Check();
    check.setAccountNumber("12423");
    check.setRoutingNumber("34421232");
    check.setCheckNumber("23");
    formOfPayment.setCheck(check);

    formOfPayments.add(formOfPayment);
    universalRecord.getFormOfPayment().addAll(formOfPayments);

    List<AirPricingInfo> airPricingInfos = new ArrayList<AirPricingInfo>();
    AirPricingInfo airPricingInfo = new AirPricingInfo();
    airPricingInfo.setTotalPrice("USD453.65");
    airPricingInfo.setTaxes("USD17.98");

    airPricingInfos.add(airPricingInfo);

    AirReservation airReservation = new AirReservation();
    universalRecord.getAirReservation().add(airReservation);
    airReservation.getAirPricingInfo().addAll(airPricingInfos);
  }

  /**
   * Payment mapper basic test.
   */
  @Test
  public void paymentMapperBasicTest() {
    List<Payment> payment = responsePaymentMapper.mapPayments(universalRecord);
    FormOfPaymentIdentifier formOfPaymentIdentifier = payment.get(0).getFormOfPaymentIdentifier();
    Identifier identifier = formOfPaymentIdentifier.getIdentifier();
    assertEquals("FormOfPayment", payment.get(0).getType());
    assertEquals("453.65", payment.get(0).getAmount().getValue().toString());
    assertEquals("17.98", payment.get(0).getTaxes().getTotalTaxes().toString());
    assertEquals("12423", identifier.getAuthority());
    assertEquals("34421232", identifier.getValue());
    assertEquals("23", formOfPaymentIdentifier.getId());
    assertEquals("1uyT643", formOfPaymentIdentifier.getFormOfPaymentRef());
  }

}
