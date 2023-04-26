@fidelityAskQuestions
@test3
Feature: Fidelity Ask Questions page and functionality 

#Descriptions: details about the test

Background: 
Given user opens chrome browser_
When user is on fidelity main page
 

Scenario: Validate ASk Question Link on main page

#Given user opens chrome browser_
#When user is on fidelity main page
Then user click on customer service link
And user closes the browser

Scenario: Validate ASk Question Link on main page2
Then user click on customer service link
Then user click on login link

#Scenario: Validate ASk Question Link on main pag3
#Then user click on customer service link
#Then user click on login link
Then user validate ask questions link
#And user closes the browser

#Scenario: Validate ASk Question Link on main pag4
#Then user click on customer service link
#Then user click on login link
#Then user validate ask questions link
Then user click on ask questions link
And user closes the browser