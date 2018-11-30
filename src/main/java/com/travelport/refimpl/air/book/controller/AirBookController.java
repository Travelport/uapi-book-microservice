package com.travelport.refimpl.air.book.controller;


import javax.validation.Valid;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.travelport.refimpl.air.book.models.request.Request;
import com.travelport.refimpl.air.book.models.response.Response;
import com.travelport.refimpl.air.book.services.AirBookService;
import com.travelport.service.universal_v45_0.AirFaultMessage;
import com.travelport.service.universal_v45_0.AvailabilityFaultMessage;

/**
 * The Class AirBookController.
 */
@RestController
@Api(value = "AirCreateReservation Microservice")
public class AirBookController {

  /** The air book service. */
  @Autowired
  private AirBookService airBookService;

  /**
   * @param uAPIAirBookService
   */
  @Autowired
  AirBookController(AirBookService uAPIAirBookService) {
    this.airBookService = uAPIAirBookService;
  }

  /** The Constant LOG. */
  private static final Logger LOG = LoggerFactory.getLogger(AirBookController.class);

  /**
   * Index.
   *
   * @param request the request
   * @return the response
   * @throws AirFaultMessage the air fault message
   * @throws AvailabilityFaultMessage the availability fault message
   */
  @ApiOperation(value = "Maps the model to a AirCreateReservationReq and executes a UAPI request",
      response = Response.class)
  @RequestMapping(value = "/reservations", method = RequestMethod.POST)
  public Response index(@Valid @RequestBody Request request)
      throws AirFaultMessage, AvailabilityFaultMessage {

    LOG.debug("Enter book controller, map to /reservations");
    Response response = airBookService.getAirBook(request);
    return response;
  }
}
