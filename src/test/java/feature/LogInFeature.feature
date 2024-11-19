Feature: Login functionality of Demo Web Shop Application

Background:
	Given Open the browser
	And Launch the URL

Scenario Outline: Login functionality with valid and invalid inputs
When Click on Login button
And Enter the email <email>
And Enter the password <password>
And Click login button
Then Home page should be displayed

Examples:
|email|password|
|leema1803@gmail.com|leema.123|
|leema|leema.123|

