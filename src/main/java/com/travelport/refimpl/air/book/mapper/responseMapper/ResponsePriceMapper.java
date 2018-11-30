package com.travelport.refimpl.air.book.mapper.responseMapper;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.travelport.refimpl.air.book.models.Price;
import com.travelport.refimpl.air.book.models.Tax;
import com.travelport.refimpl.air.book.models.Taxes;
import com.travelport.refimpl.air.book.models.response.AmountResponse;
import com.travelport.refimpl.air.book.models.response.PriceBreakdown;
import com.travelport.schema.air_v45_0.AirPricingInfo;
import com.travelport.schema.air_v45_0.FareInfo;
import com.travelport.schema.common_v45_0.TypeTaxInfo;

/**
 * The Class ResponsePriceMapper.
 */
@Component
public class ResponsePriceMapper {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(ResponsePriceMapper.class);
  
  /**
   * Map price.
   *
   * @param airPricingInfos the air pricing infos
   * @return the price
   */
  public Price mapPrice(List<AirPricingInfo> airPricingInfos) {
    LOG.debug("Entered mapPrice");

    Price price = new Price();
    price.setPriceBreakdown(mapPriceBreakDown(airPricingInfos));
    price.setTotalPrice(Double.parseDouble((airPricingInfos.get(0).getTotalPrice().substring(3))));

    return price;
  }

  /**
   * Map price break down.
   *
   * @param airPricingInfos the air pricing infos
   * @return the list
   */
  private List<PriceBreakdown> mapPriceBreakDown(List<AirPricingInfo> airPricingInfos) {
    LOG.debug("Entered mapPriceBreakDown");

    List<PriceBreakdown> priceBreakdowns = new ArrayList<PriceBreakdown>();

    for (int i = 0; i < airPricingInfos.size(); i++) {
      List<FareInfo> fareInfos = airPricingInfos.get(i).getFareInfo();
      for (AirPricingInfo airPricingInfo : airPricingInfos) {
        PriceBreakdown priceBreakdown = new PriceBreakdown();
        priceBreakdown.setType("PriceBreakdownAir");
        priceBreakdown.setRequestedPassengerType(fareInfos.get(i).getPassengerTypeCode());
        priceBreakdown.setAmountResponse(mapAmountResponse(airPricingInfo, airPricingInfos));
        priceBreakdowns.add(priceBreakdown);
      }
    }
    return priceBreakdowns;
  }

  /**
   * Map amount response.
   *
   * @param airPricingInfo the air pricing info
   * @param airPricingInfos the air pricing infos
   * @return the amount response
   */
  
  private AmountResponse mapAmountResponse(AirPricingInfo airPricingInfo,
      List<AirPricingInfo> airPricingInfos) {
    LOG.debug("Entered mapAmountResponse");

    AmountResponse amountResponse = new AmountResponse();
    amountResponse.setCurrencyCode(airPricingInfo.getTotalPrice().substring(0, 3));
    amountResponse.setBase(Double.parseDouble(airPricingInfo.getTotalPrice().substring(3)));
    amountResponse.setTaxes(mapTaxes(airPricingInfos));

    return amountResponse;
  }

  /**
   * Map taxes.
   *
   * @param airPricingInfos the air pricing infos
   * @return the taxes
   */
  private Taxes mapTaxes(List<AirPricingInfo> airPricingInfos) {
    LOG.debug("Entered mapTaxes");

    Taxes taxes = new Taxes();
    for (int i = 0; i < airPricingInfos.size(); i++) {
      taxes.setType("TaxesDetail");
      taxes.setTotalTaxes(Double.parseDouble(airPricingInfos.get(i).getTaxes().substring(3)));
      taxes.setTax(mapTaxs(airPricingInfos.get(i).getTaxInfo()));
    }
    return taxes;
  }

  /**
   * Map taxs.
   *
   * @param typeTaxInfos the type tax infos
   * @return the list
   */
  private List<Tax> mapTaxs(List<TypeTaxInfo> typeTaxInfos) {
    LOG.debug("Entered mapTaxs");

    List<Tax> taxs = new ArrayList<Tax>();
    for (TypeTaxInfo typeTaxInfo : typeTaxInfos) {
      Tax tax = new Tax();
      tax.setValue(Double.parseDouble(typeTaxInfo.getAmount().substring(3)));
      tax.setCurrencyCode(typeTaxInfo.getAmount().substring(0, 3));
      tax.setTaxCode(typeTaxInfo.getCategory());
      taxs.add(tax);
    }
    return taxs;
  }
}
