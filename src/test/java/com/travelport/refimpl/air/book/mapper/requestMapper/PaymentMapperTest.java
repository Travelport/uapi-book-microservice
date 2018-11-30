package com.travelport.refimpl.air.book.mapper.requestMapper;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.travelport.refimpl.air.book.models.CardNumber;
import com.travelport.refimpl.air.book.models.FormOfPaymentIdentifier;
import com.travelport.refimpl.air.book.models.FormOfPaymentPaymentCard;
import com.travelport.refimpl.air.book.models.Identifier;
import com.travelport.refimpl.air.book.models.Payment;
import com.travelport.refimpl.air.book.models.PaymentCard;
import com.travelport.refimpl.air.book.models.request.ReservationSummary;
import com.travelport.schema.common_v45_0.CreditCard;
import com.travelport.schema.common_v45_0.FormOfPayment;

/**
 * The Class PaymentMapperTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentMapperTest {

  /** The payment mapper. */
  @Autowired
  PaymentMapper paymentMapper;

  /**
   * Map form of payment test.
   */
  @Test
  public void mapFormOfPaymentTest() {

    FormOfPaymentIdentifier formOfPaymentIdentifier =
        new FormOfPaymentIdentifier(null, "14225", null);
    Payment payment =
        new Payment(null, null, null, null, null, formOfPaymentIdentifier, null, null, null);
    CardNumber cardNumber = new CardNumber(null, null, null, null, "4111111111111111", null, null,
        null, "123", null, null);


    PaymentCard paymentCard = new PaymentCard(null, null, null, "2035-12", null, null, null,
        "Credit", "MC", null, null, null, cardNumber, null, null);
    FormOfPaymentPaymentCard formOfPaymentPaymentCard =
        new FormOfPaymentPaymentCard(null, null, null, paymentCard, null, null, null, null);
    ReservationSummary reservationSummary = new ReservationSummary(null, null, null, null, null,
        null, null, formOfPaymentPaymentCard, Arrays.asList(payment), null, null, null);
    FormOfPayment formOfPayment = paymentMapper.mapPayment(reservationSummary);

    assertEquals("Credit", formOfPayment.getType());
    assertEquals("14225", formOfPayment.getKey());

    CreditCard creditCard = formOfPayment.getCreditCard();
    assertEquals("4111111111111111", creditCard.getNumber());
    assertEquals("123", creditCard.getCVV());
    assertEquals("MC", creditCard.getType());
    assertEquals("2035-12", creditCard.getExpDate().toString());
  }
}
