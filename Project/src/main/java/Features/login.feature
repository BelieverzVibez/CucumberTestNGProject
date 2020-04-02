Feature: Facebook scenario

@Smoke
Scenario Outline: Facebook login

Given user launch browser
Then user enters "<username>" and "<password>"
Then user clicks on login button


Examples:
	| username             | password  |
	| selva.raj24@yahoo.in | Gmail@1234 |
	
	@Regression
Scenario Outline: Facebook login

Given user launch browser
Then user enters "<username>" and "<password>"
Then user clicks on login button


Examples:
	| username             | password  |
	| selva.raj24@yahoo.in | Gmail@1234 |
	