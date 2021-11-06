Feature: SignInFeature
  Try to sign in with various credentials

  Scenario Outline: Sign in with correct credentials
    Given open page "https://imgur.com/"
    When  click "Sign in" link-button on Main page
    Then  current URL is: "https://imgur.com/signin?redirect=%2F"
    When  enter username "<username>" and password "<pass>"
    And   click "Sign In" button on SignIn page
    Then  current URL is: "https://imgur.com/"
    And   username "<username_displayed>" is displayed

    Examples:
      | username  | pass     | username_displayed |
      | uiapitest | 6nov2021 | UiApiTest          |