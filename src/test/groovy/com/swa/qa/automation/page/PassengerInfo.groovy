package com.swa.qa.automation.page;

import geb.Page
 

class PassengerInfo extends Page{
	       static at = {
              waitFor(30){
                     title == 'Southwest Airlines - Passenger and Payment Information'
              }
       }

      

       static content = {
              firstName {$("#passengerFirstName-0")}
              lastName {$("#passengerLastName-0")}          
              birthMonth {$("#passengerDateOfBirthMonth-0")}
              chooseMonth {$("#passengerDateOfBirthMonth-0--item-2")}
              birthDay {$("#passengerDateOfBirthDay-0")}
              chooseDay {$("#passengerDateOfBirthDay-0--item-3")}
              birthYear {$("#passengerDateOfBirthYear-0")}
              chooseYear {$("#passengerDateOfBirthYear-0--item-30")}
              selectGender {$("#passengerGender-0")}
              chooseGender {$("#passengerGender-0--item-1")}
              contactEmail {$("#contactEmailAddress")}
              /*creditCardType {$("#creditCardType")}
              creditCardNumber {$("#creditCardNumber")}*/
       }

      public enterPassengerInfo() {
              firstName.value("Test")
              lastName.value("Test")
              birthMonth.click()
              chooseMonth.click()
              birthDay.click()
              chooseDay.click()
              selectGender.click()
              chooseGender.click()
              contactEmail.value("test@cognizant.com")
             /*$('#birthMonth').click()
             $('#birthMonth').find("option").find{ it.value() == "4-Apr" }.click()*/
       }
}

 
