Travelport uAPI Sessionless Air Book Reference Implementation Java
===============
### Overview:
The reference implementation was completed in Java using Spring Boot to connect with Travelport Universal API. The workflows these implementions are showcasing: air book, universal record cancel, and air ticketing. Minimum fields to complete this workflow have been done using best practices in Java, TDD, and restful web services. The implementation is meant as a starting point for anyone to consume uAPI and additional modifiers can be added for additional business needs. 


### Software requirements:
1. [Eclipse Oxygen](www.eclipse.org/oxygen/)
2. [Apache Maven 3.5.2](www.maven.apache.org/download/cgi)
3. [Spring boot](www.spring.io)
3. [Apache CXF 3.2.1](www.cxf.apache.org)
4. [Postman](www.getpostman.com)

### Credentials
1. Application.yml are the credentials that will need to be populated before sending a request
2. Directory location of application.yml: uAPIBook_Java\src\main\resources\application.yml
3. The five fields to populate are: username, password, branch, core, and endpoint

## Run project

### Travelport API type: uAPI [(Universal API)](https://support.travelport.com/webhelp/uapi/uAPI.htm)
* Version: 18.2
* Schema: v_45_0
* Workflow: [Sessionless Air Book](https://support.travelport.com/webhelp/uapi/uAPI.htm#Air/Air_Booking/Create_Air_Booking/Creating_Air_Bookings.htm)
* WSDL used for Air Book include: air_v45_0, common_v_45_0, and universal_v45_0

### Eclipse

1. Clone the project
2. Open Eclipse and import the project into the workspace
3. Open terminal on Eclipse: Go to Window/Show View/Terminal
4. CD (change directory) to the root folder of the project where the pom.xml lives
4. Run command "mvn install"
5. Run application.java as a "Java Application"  

#### Testing
1. All tests are located inside src/test
2. Run ...test.java by running as a "Junit Test"

### Postman  Air Book
1. Open postman and make a post request
2. URL set to: http://localhost:9000/Reservations
3. Set headers for the request with:
 	* Key set to: Content-Type
 	* Value set to: application/json
4. You can view the request schema at http://localhost:9000/swagger-ui.html
5. Example of a body for the request:

		{
		"ReservationSummary":{
		"id" : "reservation_1",
		"Offer" : [ {
		  "Identifier" : {
			"value" : "ULi+U7Q2BKAbOlFCAAAAA=="
		  },
		 	"Product" : [ {
				"FlightSegment" : [ {
					  "Flight" : {
					  "id" : "ULi+U7Q2BKAeOlFCAAAAA==",
					  "FlightRef" : "0",
					  "carrier" : "AA",
					  "number" : "416",
					  "Departure" : {
					  		"location" : "DEN",
					  		"date" : "2019-03-06",
					  		"time" : "19:59:00-07:00"
					  },
					  "Arrival" : {
					  		"location" : "LAX",
					  		"date" : "2019-03-06",
					  		"time" : "21:22:00-08:00"
					  		}
					  	}
					  },
					  {
		 			"Flight" : {
					"id" : "gULi+U7Q2BKAZOlFCAAAAA==",
					"FlightRef" : "0",
					"carrier" : "AA",
					"number" : "416",
					"Departure" : {
						"location" : "LAX",
						"date" : "2019-03-23",
						"time" : "15:45:00-07:00"
					},
					"Arrival" : {
						"location" : "DEN",
						"date" : "2019-03-23",
						"time" : "18:59:00-06:00"
						}
					  }
					} ],
					"PassengerFlight" : [ {
						"passengerTypeCode" : "ADT",
						"FlightProduct" : [ {
							"classOfService" : "K",
							"cabin" : "Economy",
							"fareBasisCode" : "1QFLEX",
							"Brand" : {
								"id" : "ULi+U7Q2BKAhOlFCAAAAA==",
								"BrandRef" : "ULi+U7Q2BKAhOlFCAAAAA=="
								}
							} ]
						},
					{
						"@type" : "PassengerFlight",
						"FlightProduct" : [ {
							"classOfService" : "K",
							"cabin" : "Economy",
							"fareBasisCode" : "1QFLEX",
							"Brand" : {
								"id" : "gULi+U7Q2BKAFPlFCAAAAA==",
								"BrandRef" : "gULi+U7Q2BKAFPlFCAAAAA=="
								}
							} ]
						} ]
					} ]
				} ],
		"Traveler" : [ {
			"dob" : "1985-04-20",
			"gender" : "Male",
			"passengerTypeCode" : "ADT",
			"PersonName" : {
			"Given" : "John",
			"Surname" : "Smith"
			},
		"Telephone" : [ {
			"@type" : "Telephone",
			"countryAccessCode" : "1",
			"areaCityCode" : "303",
			"phoneNumber" : "1234567",
			"cityCode" : "DEN"
			} ]
		} ],
		"FormOfPaymentCash" : [{
			"id" : "formOfPayment_1",
			"FormOfPaymentRef" : "formOfPayment_1",
			"cashInd" : true
		}],
		"Payment" : [ {
			"@type" : "Credit",
			"Amount" : {
				"value" : 348.40,
				"code" : "GBP"
				},
			"FormOfPaymentIdentifier" : {
				"id" : "formOfPaymentIdentifier",
				"FormOfPaymentRef" : "PDz8y7xu4hGdeB/wYIhwmw=="
				},
			"Taxes" : {
				"@type" : "Taxes",
				"TotalTaxes" : 34.4000
					}
				} ]
			}
		}
		
		
		
		
		
6. Click "Send"