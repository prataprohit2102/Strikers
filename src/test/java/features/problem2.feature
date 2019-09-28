Feature: Login as a user

Background: Adding a new movie
    
    When User loads the url in browser

Scenario Outline: succesfull login through new user
    And User clicks on login link
    And User enters "<username>" and password "<PW>"
	And Clicks login
	Then User should see movies link is present