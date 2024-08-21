Feature: Dashboard Functionality

Background:				
Given user should navigate to the application				
When user should enter url as "https://v3opend.tech-active.com/auth/manage_opend"				
And user should enter email address "admin@opend.com" and password "1234"				
And user should click on login button				
And user should verify the dashboard home page				
				
Scenario: Validate the campaign Tab
When user validate campaign tab				
And user should search by campaign name	
#And user should validate the table data by search		
And user should select All status dropdown				
And user should select campaign status dropdown				
And user should select Date filter				
And user should validate status name of campaign, open, click, sent data				
Then user should successfully validated the campaign Tab				
