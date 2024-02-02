@Regression
Feature: Lime shopping web
#Scenario: Verify using valid credentials
#Given  User enter browser "Chrome"
#When User enter url "url"
#And  User user name ""
#And User pass ""
#And Close the browser
#
#Scenario Outline: Inta login
#Given  User enter browser "Chrome"
#When User enter url "url"
#And  User user name <Username>
#And User pass <password>
#And Close the browser
#
#Examples:
   #|Username|Password|
   #| abs    | 123    |
   #| kju    | 452    |
   #| absty  | 021    |
   #| kjuhj  | 987    |
   #| abk    | 247    |
   #| kjm    | 327    |
Scenario: lime lunch
Given User enter url "https://www.limeroad.com/"
When User click men or woman
And mouse over to kids
And click on dress and frocks
And click on 1st dress
And select the size
And click add to cart
