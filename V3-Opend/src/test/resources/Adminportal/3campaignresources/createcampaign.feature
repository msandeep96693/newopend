Feature: Create a campaign			
					
Background:					
Given Admin navigate to the opend application				
When Admin Enter url as "https://v3opend.tech-active.com/auth/admin_login"				
And Admin Enter email address "admin@opend.com" and password "1234"				
And click on login button				
Then admin redirected to the dashboard page 				
					
Scenario: Create a campaign					
When click on campaign from left navigation bar					
And scroll the page into downward direction					
And click on advertiser from advertiser dropdown					
And Enter a campaign name					
And select a campaign group					
And select a advertiser cost type radio button					
And select a country from campaign country dropdown					
And select a audience type from audience type dropdown					
And select a campaign sector from campaign sector dropdown					
And select a publisher from publisher dropdown					
And select a publisher cost type radio button					
And select a suppression from suppression dropdown					
And click on proceed button for next page					
Then validate the second page by Name of a page					
					
#second step					
When Enter name into subject textfield					
And scroll the page1					
And Enter name into preheader textfield					
And scroll the page2					
And click on creative button					
And wait and select first template from a list and wait					
And scroll the page3					
And click on save creative checkbox					
And select group from creative group dropdown					
And Enter creative name					
And click on next button					
Then Admin should validate the third page by name of a page					
					
#Third step					
When scroll the page into upward direction					
And Enter min age as 30					
And Enter max ae as 75					
And select location from location dropdown					
And select region from region dropdown					
And select email domains randomly					
And select include email domain from dropdown					
And select advance option randomly					
And select email status dropdown					
And click and select month, year and day (182 days)					
And fetch the CPM Cost, Age group, Gender					
And clikc on Next button					
Then validate the fourth page by name of a page					
					
#fourth step					
When wait initially					
When Enter open data into textfield					
And Enter other data into textfield					
And select a email deliverability					
And select a Email scheduling					
And select a start date and end date					
And select a start time					
And select a selected days checkbox					
And click on Start campaign or scheduled campaign					
Then Admin should verify the response message					
When click on admin person					
And click on logout and close the browser					
					
					