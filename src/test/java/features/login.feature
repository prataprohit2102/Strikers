Feature: Test Login Functionality

Background: Adding a new movie
    
    When User loads the url in browser

Scenario: Admin login functionality
	And User clicks on login link
	And User enters username as "<username>" and password as "<PW>"
	And Clicks login
    Then User should be able to see add new movie link

Scenario Outline: Enter username and password
    And User clicks on login link
	And User enters "<username>" and password "<PW>"
	And Clicks login
    Then User should be able to see add new movie link
    And as user clicks on add new movie link, the movie detail page should be displayed
    Then User enters the title as "<title>" director as "<director>" description as "<description>" catogories as "<categories>" url as "<url>" rating as "<rating>"
    And clicks save
    Then movie details should be saved
    Examples:
     |username       | PW  |title|director|description|categories|url|rating|
     | abc@bc.com | 123 |Nagarro's'Life|NagarroEmployee|comedy|
