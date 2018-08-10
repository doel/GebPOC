package com.swa.qa.automation.test;

import geb.spock.GebReportingSpec
import com.swa.qa.automation.page.SWHomePage
import com.swa.qa.automation.page.FlightSearchResultPage
import com.swa.qa.automation.page.FlightPricePage
import com.swa.qa.automation.page.PassengerInfo
import spock.lang.Stepwise


class FlightSearchPageIT extends GebReportingSpec{               

                def setup()
                {
                  to SWHomePage

                }

                def "SouthWest Flight Search Oneway"() {

                                given: "I'm at the SWA Home Page"
                                at SWHomePage
                                report "SothWest Home Page" // take a report of the SW homepage
                                when: "I search with valid details"

                                oneWay.click()
                                airCityDepartureField = "DAL"
                                airCityArrivalField = "LGA"
                                dept_date="08/21"                               

                                then : "Click to search flight"
                                searchButton.click()

                                then: "I'm at the flight search page "
                                at FlightSearchResultPage                           
                                 clickToPrice()                          
                                 //Going to Next Page   
                                 clickToContinue()                            
                                 airBookingContinue.click()


                                 then : "I'am at Flight Price page"
                                  at FlightPricePage
                                     clicktoContinueCheckout()

                                               

								and : "I am at Passenger details page "
                                       at PassengerInfo
									   enterPassengerInfo()
                }

                /*def "SouthWest Flight Search Roundway"(){

                                when : "I'm at the flight search page "
                                at FlightSearchResultPage
                                then : "Click on flight fare details"
                                flightPrice.click()   
                                then: "Click on Continue"
                                priceContinue.click()
                                and: "Click on continue to navigate"
                                airBooingContinue.click()

                }*/

}

 