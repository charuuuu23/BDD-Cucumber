Feature: Validating payment functionality
@gpayTest
Scenario: Gpay integration is selected
Given user already has an account on gpay
When user id is correct
Then gpay message should be sent

@phonepeTest
Scenario: PhonePe integration is selected
Given user already has an account on PhonePe
When user id is correct
Then PhonePe message should be sent