package com.swa.qa.automation.page;

import geb.Page


class SWHomePage extends Page {
	static url = "/"
	
	static at = { 
		
		title == "Southwest Airlines | Book Flights & More - Wanna Get Away?" 
	}
	
	static content = {
		heading { $("h1").text() }
		errorHeading { $(".error-label").text() }
		//earchField { $("input[name=q]") }
		airCityDepartureField{ $("input[id=air-city-departure]") }
		airCityArrivalField { $("input[id=air-city-arrival]") }
		
		oneWay {$("#trip-type-one-way")}
		
		dept_date {$("#air-date-departure")}
		
		//searchButton(to: GoogleResultsPage, searchTerm:searchField.value()) { $("input[value='Google Search']") }
		
			searchButton(to: FlightSearchResultPage) {$("#jb-booking-form-submit-button")}
			
		
		/*flightPrice {$("#air-booking-fares-0-1 .fare-button fare-button_primary-blue select-detail--fare button")}
		priceContinue {$("#air-booking-fare-drawer-1-0 button .actionable--text")}
		airBooingContinue {$("#air-booking-product-1")}*/
		
		
		
	}
	
	/*void clickToPrice() {
		flightPrice.click();
	}*/
}






	


