@loginTest
Feature:Validating Login Functionality

Scenario Outline:Test Successful login case
Given User is on the login screen
When user provides correct username
|charu23|
#And user provides correct password=<password>
#Then User must login 
#But error should not be there


 Examples:
|username|
|"charu@23"|
|"charu@13"|
|"charu@12"|