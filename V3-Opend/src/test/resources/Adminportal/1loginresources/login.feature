Feature: Login functionality




Scenario:  Login by valid credentials
Given user should navigate to the login page
When admin Enter url as "https://v3opend.tech-active.com/auth/admin_login"
And admin enter the valid email address "admin@opend.com"
And admin enter the valid password "1234"
And admin click on signin button
Then admin should able to login successfully
Then admin validate the dashboard page
#When admin click on admin person


#And admin click on logout button and close the browser

#Scenario: Login by invalid credentials
#And user enter the invalid email address "admin@ppppend.com"
#And user enter the invalid password "1111"
#Then user should get response message as "Email Id is not registered with us" and close the browser
#
#Scenario: Login by valid email and invalid password
#And user enter the valid email address "admin@opend.com"
#And user enter the invalid password "1111"
#Then user should get response message as "invalid password" and close the browser
#
#Scenario: Login by invalid email and valid password
#And user enter the invalid email address "admin@ppppend.com"
#And user enter the valid password "1234"
#Then user should get response message as "Email Id is not registered with us" and close the browser
#
#Scenario: Login by empty field
#And user donot enter email address ""
#And user donot enter password ""
#Then user should get response message as "Please enter a email id and password" and close the browser 
