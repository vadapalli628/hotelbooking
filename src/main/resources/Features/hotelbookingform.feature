Feature: Save Hotel booking

	Background: Launch browser and open the hotel booking form Page
	
		Given User launch a browser
		And User opens URL "http://hotel-test.equalexperts.io/"
    

  @regression
   Scenario Outline: Create a booking and save successfully
  
    Given the form firstname as "<firstName>"
    And surName as "<surName>"
    And price as "<price>"
    And check-inDate as "<check_inDate>"
    And check-outDate as "<check_outDate>"
    When clicks on Save Button
    Then Successfully displays the booking record
    And close browser
    
    Examples: 
    |firstName|surName|price|check_inDate|check_outDate|
    |Test1|Test2|300|2021-04-10|2021-05-10|

 @regression
 Scenario: Delete the booking with Surname and FirstName
  Given the form firstname Test1
  And surName as Test2
  When clicks on Delete Button
  Then Successfully deletes the booking record of surname

