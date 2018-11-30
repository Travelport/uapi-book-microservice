package com.travelport.refimpl.air.book.mapper.responseMapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.travelport.refimpl.air.book.models.Price;
import com.travelport.refimpl.air.book.models.Tax;
import com.travelport.refimpl.air.book.models.response.AmountResponse;
import com.travelport.schema.air_v45_0.AirPricingInfo;
import com.travelport.schema.air_v45_0.FareInfo;
import com.travelport.schema.common_v45_0.TypeTaxInfo;

/**
 * The Class ResponsePriceMapperTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResponsePriceMapperTest {

  /** The response price mapper. */
  @Autowired
  ResponsePriceMapper responsePriceMapper;

  /** The adult info. */
  AirPricingInfo adultInfo = new AirPricingInfo();

  /** The air pricing infos. */
  List<AirPricingInfo> airPricingInfos = new ArrayList<AirPricingInfo>();

  /**
   * Populate price mapper args.
   */
  @Before
  public void populatePriceMapperArgs() {
    List<FareInfo> fareInfos = new ArrayList<FareInfo>();
    FareInfo fareInfo = new FareInfo();
    fareInfo.setPassengerTypeCode("ADT");
    fareInfos.add(fareInfo);

    adultInfo.getFareInfo().addAll(fareInfos);

    TypeTaxInfo typeTaxInfo = new TypeTaxInfo();
    typeTaxInfo.setAmount("USD21.00");
    typeTaxInfo.setCategory("AY");
    adultInfo.getTaxInfo().add(typeTaxInfo);

    adultInfo.setTaxes("USD27.00");
    adultInfo.setTotalPrice("USD142.00");
    airPricingInfos.add(adultInfo);
  }

  /**
   * Price mapper basic test.
   */
  @Test
  public void priceMapperBasicTest() {
    Price price = responsePriceMapper.mapPrice(airPricingInfos);
    AmountResponse amountResponse = price.getPriceBreakdown().get(0).getAmountResponse();
    Tax tax = amountResponse.getTaxes().getTax().get(0);
    assertEquals("USD", tax.getCurrencyCode());
    assertNotNull(price);
    assertEquals(Double.valueOf(21.00), tax.getValue());
    assertEquals("AY", tax.getTaxCode());
    assertEquals(Double.valueOf(27.00), amountResponse.getTaxes().getTotalTaxes());
    assertEquals(Double.valueOf(142.00), amountResponse.getBase());
    assertEquals(Double.valueOf(142.00), price.getTotalPrice());
    assertEquals("ADT", price.getPriceBreakdown().get(0).getRequestedPassengerType());
  }
}
