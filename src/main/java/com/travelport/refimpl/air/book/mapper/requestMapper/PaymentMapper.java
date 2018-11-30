package com.travelport.refimpl.air.book.mapper.requestMapper;

import com.travelport.refimpl.air.book.models.FormOfPaymentCash;
import com.travelport.refimpl.air.book.models.FormOfPaymentPaymentCard;
import com.travelport.refimpl.air.book.models.Payment;
import com.travelport.refimpl.air.book.models.PaymentCard;
import com.travelport.refimpl.air.book.models.request.ReservationSummary;
import com.travelport.schema.common_v45_0.CreditCard;
import com.travelport.schema.common_v45_0.FormOfPayment;
import java.util.List;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.slf4j.LoggerFactory;

/**
 * The Class PaymentMapper.
 */
@Component
public class PaymentMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(PaymentMapper.class);

  /**
   * Map payment.
   *
   * @param reservationSummary the reservation summary
   * @return the form of payment
   */
  public FormOfPayment mapPayment(ReservationSummary reservationSummary) {
    LOG.debug("Entered mapPayment");

    FormOfPayment formOfPayment = new FormOfPayment();

    if (reservationSummary.getFormOfPaymentPaymentCard() != null) {
      mapPaymentCard(reservationSummary.getFormOfPaymentPaymentCard(), formOfPayment);
    }

    if (reservationSummary.getFormOfPaymentCash() != null) {
      mapCash(reservationSummary.getFormOfPaymentCash(), formOfPayment);
    }
    List<Payment> payments = reservationSummary.getPayment();

    for (Payment payment : payments) {
      formOfPayment.setKey(payment.getFormOfPaymentIdentifier().getFormOfPaymentRef());
    }

    return formOfPayment;
  }

  /**
   * Map credit card.
   *
   * @param formOfPaymentPaymentCard the form of payment payment card
   * @param formOfPayment the form of payment
   */
  private void mapPaymentCard(FormOfPaymentPaymentCard formOfPaymentPaymentCard,
      FormOfPayment formOfPayment) {
    LOG.debug("Entered mapPaymentCard");
    if (formOfPaymentPaymentCard.getPaymentCard().getCardType() != null) {
      formOfPayment.setType(formOfPaymentPaymentCard.getPaymentCard().getCardType());
      formOfPayment.setCreditCard(mapCreditCard(formOfPaymentPaymentCard.getPaymentCard()));
    }
  }

  /**
   * Map cash.
   *
   * @param formOfPaymentsCash the form of payments cash
   * @param formOfPayment the form of payment
   */
  private void mapCash(List<FormOfPaymentCash> formOfPaymentsCash, FormOfPayment formOfPayment) {
    LOG.debug("Entered mapCash");
    if (formOfPaymentsCash != null) {
      if (formOfPaymentsCash.get(0).getCashInd() == true) {
        formOfPayment.setType("Cash");
      }
    }
  }

  /**
   * Map credit card.
   *
   * @param paymentCard the payment
   * @return the credit card
   */

  private CreditCard mapCreditCard(PaymentCard paymentCard) {
    LOG.debug("Entered mapCreditCard");
    CreditCard creditCard = new CreditCard();

    if (paymentCard != null) {
      creditCard.setNumber(paymentCard.getCardNumber().getEncryptedValue());
      creditCard.setType(paymentCard.getCardCode());
      creditCard.setCVV(paymentCard.getCardNumber().getAuthenticationMethod());

      XMLGregorianCalendar expDate = null;
      try {
        expDate =
            DatatypeFactory.newInstance().newXMLGregorianCalendar(paymentCard.getExpireDate());
      } catch (DatatypeConfigurationException e) {
        e.printStackTrace();
      }
      creditCard.setExpDate(expDate);
    }
    return creditCard;
  }
}
