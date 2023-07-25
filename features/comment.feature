
Feature: Validating comment functionality

@tag1 @tag3
Scenario: comment section one is working
Given user is logged in
When user enters comment
Then comment must be posted

@tag1
Scenario: comment section two is working
Given user is logged in two
When user enters comment two
Then comment must be posted two