@UI
Feature: SignInFeature
  Try to sign in with various credentials

  Scenario Outline: Sign in by username
    Given  I click "Sign in" link-button on Main page
    Then  current URL is: "https://imgur.com/signin?redirect=%2F"
    When  I sign in with username "<username>" and password "<pass>"
    Then  current URL is: "https://imgur.com/"
    And   username "<username_displayed>" is displayed

    Examples:
      | username  | pass     | username_displayed |
      | uiapitest | 6nov2021 | UiApiTest          |


  Scenario Outline: Sign in by email
    Given  I click "Sign in" link-button on Main page
    Then  current URL is: "https://imgur.com/signin?redirect=%2F"
    When  I sign in with username "<email>" and password "<pass>"
    Then  current URL is: "https://imgur.com/"
    And   username "<username_displayed>" is displayed

    Examples:
      | email               | pass     | username_displayed |
      | uiapitest@yandex.ru | 6nov2021 | UiApiTest          |