package com.travelport.refimpl.air.book.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.travelport.refimpl.air.book.connector.AirBookConnector;
import com.travelport.refimpl.air.book.mapper.requestMapper.AirBookRequestMapper;
import com.travelport.refimpl.air.book.mapper.responseMapper.AirBookResponseMapper;
import com.travelport.refimpl.air.book.models.request.Request;
import com.travelport.refimpl.air.book.models.response.Response;
import com.travelport.schema.universal_v45_0.AirCreateReservationReq;
import com.travelport.schema.universal_v45_0.AirCreateReservationRsp;
import com.travelport.service.universal_v45_0.AirFaultMessage;

/**
 * The Class AirBookService.
 */
@Service
public class AirBookService {

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(AirBookService.class);

  /** The air book request mapper. */
  @Autowired
  AirBookRequestMapper airBookRequestMapper;

  /** The air book response mapper. */
  @Autowired
  AirBookResponseMapper airBookResponseMapper;

  /** The air book connector. */
  @Autowired
  AirBookConnector airBookConnector;

  /**
   * @param request
   * @return
   * @throws AirFaultMessage
   */
  public Response getAirBook(Request request) throws AirFaultMessage {
    LOG.debug("Model sent to mapper to get a response");
    AirCreateReservationReq airCreateReservationReq = airBookRequestMapper.getAirBook(request);
    Response response = new Response();
    AirCreateReservationRsp airCreateReservationRsp =
        airBookConnector.callAirBook(airCreateReservationReq);
    response = airBookResponseMapper.returnAirBook(airCreateReservationRsp);

    return response;
  }
}
