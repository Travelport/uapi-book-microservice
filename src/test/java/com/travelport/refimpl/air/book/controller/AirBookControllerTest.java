package com.travelport.refimpl.air.book.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.travelport.refimpl.air.book.models.request.Request;
import com.travelport.refimpl.air.book.models.response.ReservationResponse;
import com.travelport.refimpl.air.book.models.response.Response;
import com.travelport.refimpl.air.book.services.AirBookService;

/**
 * The Class AirBookControllerTest.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(AirBookController.class)

public class AirBookControllerTest {

  /** The mvc. */
  @Autowired
  private MockMvc mvc;

  /** The mock air book service. */
  @MockBean
  AirBookService mockAirBookService;

  /**
   * Test default controller response.
   *
   * @throws Exception the exception
   */
  @Test
  public void testDefaultControllerResponse() throws Exception {
    // Setup Mock vars and behavior
    ReservationResponse reservationResponse =
        new ReservationResponse(null, "txn24767", "mock_trace", null, null);
    Response mockResponse = new Response(reservationResponse);
    Request request = new Request();
    Mockito.when(mockAirBookService.getAirBook(Mockito.any(Request.class)))
        .thenReturn(mockResponse);

    // Call MockMvc and Assert the response has the appropriate values
    mvc.perform(MockMvcRequestBuilders.post("/reservations").accept(MediaType.APPLICATION_JSON)
        .contentType(MediaType.APPLICATION_JSON).content(asJsonString(request)))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(
            MockMvcResultMatchers.jsonPath("$.ReservationResponse.transactionId").value("txn24767"))
        .andExpect(
            MockMvcResultMatchers.jsonPath("$.ReservationResponse.traceId").value("mock_trace"));
  }

  /**
   * Test controller response 400.
   *
   * @throws Exception the exception
   */
  @Test
  public void testControllerResponse400() throws Exception {
    // Setup Mock vars and behavior
    Request request = new Request();

    // Call improper url and expect error
    mvc.perform(MockMvcRequestBuilders.post("/reservatios").accept(MediaType.APPLICATION_JSON)
        .contentType(MediaType.APPLICATION_JSON).content(asJsonString(request)))
        .andExpect(MockMvcResultMatchers.status().is4xxClientError());
  }

  /**
   * As json string.
   *
   * @param obj the obj
   * @return the string
   */
  public static String asJsonString(final Object obj) {
    try {
      final ObjectMapper mapper = new ObjectMapper();
      final String jsonContent = mapper.writeValueAsString(obj);
      return jsonContent;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
