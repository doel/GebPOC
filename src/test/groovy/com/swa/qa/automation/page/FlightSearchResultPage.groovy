package com.swa.qa.automation.page;

import geb.Page

class FlightSearchResultPage  extends Page{
	
	//static url = "/air/booking"
	
	static at = {                
              waitFor(60){
                           title == "Southwest Airlines - Select Flights"
                     }
              }

       public static content= {                  
                     flightPrice { $("#air-booking-fares-0-11 div.fare-button_primary-blue button.fare-button--button") }
                     //flightPrice { $("#air-booking-fares-0-1 div",1,"button") }        
                     flightPriceDetails {$(".select-detail--drawer")}             
                     priceContinue { $("#air-booking-fare-drawer-1-0 button.air-booking-jump-link") }
                     airBookingContinue(to : FlightPricePage) { $("div.search-results--actions button#air-booking-product-1") }
       }


       public clickToPrice() {
              waitFor(60) {
                     flightPrice.click()
              }
       }

       public clickToContinue() {
              waitFor{
                    airBookingContinue.displayed
              }        
         

       }

      

      

}

 