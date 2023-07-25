@makemytripTest
Feature: Testing Make My Trip

Scenario: Make My Trip Login
Given User is on the makemytrip login
When user enters phonenumber "1234567890"
And user clicks continue
Then otp is sent "123452"
And otp is validated