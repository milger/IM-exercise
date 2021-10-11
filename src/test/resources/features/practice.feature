Feature: The easiest way to find a car

  Scenario Outline: Models displayed for specific make
    Given I have visited to Cars Direct page
    When I click on "New Cars" button
      And select the "<MAKE NAME>" make
      And click Find Your Next Car
    Then "<MODEL NAME>" model <EXPECTATION> in the list

    Examples:
    | MAKE NAME | EXPECTATION             |MODEL NAME |
    | Honda     | should be displayed     |Insight    |
    | MINI      | should not be displayed |Insight    |