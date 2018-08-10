package com.swa.qa.automation.page

import geb.Page


class FlightPricePage extends Page{ 

       static at = {
              waitFor(60){
                     title == 'Southwest Airlines - Trip and Price Details'
              }
       }

       static content = {
              continueBtn(to : PassengerInfo) {$("div.price--continue-button button.checkout-price-continue-button")}

       }
	   
       public clicktoContinueCheckout() {
              waitFor(30) {
                     continueBtn[0].click()
              }
       }
}
