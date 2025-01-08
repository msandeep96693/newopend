Feature: Dashboard Functionality

Background:				
Given user navigate to the application				
When user enter url as "https://v3opend.tech-active.com/auth/manage_opend"				
And user enter email address "admin@opend.com" and password "1234"				
And user click on login button				
And user verify the dashboard home page				
				
Scenario: Validate the campaign Tab  
When user validate campaign tab				
And user search by campaign name		
And user select All status dropdown				
And user select campaign dropdown				
And user select Date filter				
And user validate status name of campaign, open, click, sent data				
Then user successfully validated the campaign Tab				
