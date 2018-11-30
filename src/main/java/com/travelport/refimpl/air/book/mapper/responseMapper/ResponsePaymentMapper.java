package com.travelport.refimpl.air.book.mapper.responseMapper;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.travelport.refimpl.air.book.models.Amount;
import com.travelport.refimpl.air.book.models.FormOfPaymentIdentifier;
import com.travelport.refimpl.air.book.models.Identifier;
import com.travelport.refimpl.air.book.models.Payment;
import com.travelport.refimpl.air.book.models.Taxes;
import com.travelport.schema.air_v45_0.AirPricingInfo;
import com.travelport.schema.common_v45_0.Check;
import com.travelport.schema.common_v45_0.FormOfPayment;
import com.travelport.schema.universal_v45_0.UniversalRecord;

/**
 * The Class ResponsePaymentMapper.
 */
@Component
public class ResponsePaymentMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(ResponsePaymentMapper.class);
  
  /**
   * Map payments.
   *
   * @param universalRecord the universal record
   * @return the list
   */
  public List<Payment> mapPayments(UniversalRecord universalRecord) {
    LOG.debug("Entered mapPayments");

    List<FormOfPayment> formOfPayments = universalRecord.getFormOfPayment();
    List<AirPricingInfo> airPricingInfo =
        universalRecord.getAirReservation().get(0).getAirPricingInfo();

    List<Payment> payments = new ArrayList<Payment>();
    for (FormOfPayment formOfPayment : formOfPayments) {
      Payment payment = new Payment();
      payment.setType(formOfPayment.getType());
      payment.setFormOfPaymentIdentifier(mapFormOfPaymentIdentifier(formOfPayment));
      payment.setAmount(mapAmount(airPricingInfo));
      payment.setTaxes(mapTotalTaxes(airPricingInfo));
      payments.add(payment);
    }

    return payments;
  }

  /**
   * Map form of payment identifier.
   *
   * @param formOfPayment the form of payment
   * @return the form of payment identifier
   */
  private FormOfPaymentIdentifier mapFormOfPaymentIdentifier(FormOfPayment formOfPayment) {
    LOG.debug("Entered mapFormOfPaymentIdentifier");

    FormOfPaymentIdentifier formOfPaymentIdentifier = new FormOfPaymentIdentifier();
    Check check = formOfPayment.getCheck();
    if (check != null) {
      formOfPaymentIdentifier.setId(check.getCheckNumber());
      formOfPaymentIdentifier.setFormOfPaymentRef(formOfPayment.getKey());
      formOfPaymentIdentifier.setIdentifier(mapIdentifier(check));
    }
    return formOfPaymentIdentifier;
  }

  /**
   * Map identifier.
   *
   * @param check the check
   * @return the identifier
   */
  private Identifier mapIdentifier(Check check) {
    LOG.debug("Entered mapIdentifier");

    Identifier identifier = new Identifier();
    identifier.setValue(check.getRoutingNumber());
    identifier.setAuthority(check.getAccountNumber());
    return identifier;
  }

  /**
   * Map amount.
   *
   * @param airPricingInfos the air pricing infos
   * @return the amount
   */
  private Amount mapAmount(List<AirPricingInfo> airPricingInfos) {
    LOG.debug("Entered mapAmount");

    Amount amount = new Amount();
    amount.setValue(Double.parseDouble(airPricingInfos.get(0).getTotalPrice().substring(3)));
    amount.setCode(airPricingInfos.get(0).getTotalPrice().substring(0, 3));
    return amount;
  }

  /**
   * Map total taxes.
   *
   * @param airPricingInfo the air pricing info
   * @return the taxes
   */
  private Taxes mapTotalTaxes(List<AirPricingInfo> airPricingInfo) {
    LOG.debug("Entered mapTotalTaxes");

    Taxes taxes = new Taxes();
    taxes.setType("Taxes");
    taxes.setTotalTaxes(Double.parseDouble(airPricingInfo.get(0).getTaxes().substring(3)));
    return taxes;
  }
}
