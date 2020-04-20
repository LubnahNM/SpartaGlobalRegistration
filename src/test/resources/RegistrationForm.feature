Feature: When on the registration, the user can see details they need to fill
  Scenario: User is on registration page and they forget to fill in their name
    Given I am on the registration page
    When I forget to input information
    Then I will be notified to input my name

  Scenario: User is on registration page and enters the wrong name
    Given I am on the registration page
    When I accidentally type my name with a number
    Then I will be notified to input my name


  Scenario: User is on registration page and they forgot to fill in their last name
    Given I am on the registration page
    When I forget to input information
    Then I will be notified to input my last name

  Scenario: User is on registration page and they incorrectly fill in their last name
    Given I am on the registration page
    When I accidentally type number in my lastname
    Then I will be notified to input my last name

  Scenario: User is on registration page and they forgot to fill in their age
    Given I am on the registration page
    When  I forget to input information
    Then I will be notified to input my age

  Scenario: User is on registration page and they incorrectly fill in their age
    Given I am on the registration page
    When  I accidentally enter a negative age
    Then I will be notified to input my age

  Scenario: User is on registration page and they forgot to fill in their address
    Given I am on the registration page
    When  I forget to input information
    Then I will be notified to input my address

  Scenario: User is on registration page and they fill in the wrong address
    Given I am on the registration page
    When  I input a wrong character type in the address
    Then I will be notified to input my address

  Scenario: User is on registration page and they forgot to fill in their postcode
    Given I am on the registration page
    When  I forget to input information
    Then I will be notified to input my postcode

  Scenario: User is on registration page and they forgot to fill in their email
    Given I am on the registration page
    When  I forget to input information
    Then I will be notified to input my email address

  Scenario: User is on registration page and they incorrectly fill in their email
    Given I am on the registration page
    When  I fill in my email in an incorrect format
    Then I will be notified to input my email address

  Scenario: User is on registration page and they forgot to fill in their phone number
    Given I am on the registration page
    When  I forget to input information
    Then I will be notified to input my phone number

  Scenario: User is on registration page and they incorrectly enter their phone number
    Given I am on the registration page
    When  I enter a invalid number
    Then I will be notified to input my phone number

  Scenario: User is on registration page and they should be able to select their gender
    Given I am on the registration page
    When  I forget to input information
    Then  I can select that I am a female