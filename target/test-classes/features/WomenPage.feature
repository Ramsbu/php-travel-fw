Feature: Women page validation

  Scenario Outline: Women page testing
    Given Clicking on women page tab and verify the result
    Then I verify the women Tab is clicked
    And I verify women tab with string comparision
    And I verify the Top tab is clicked
    And I verify the top tab with string comparision
    And I verify the t-shirt is clicked
    And I verify the categories
    And I select the "<size>"
    And I select color "<color>"
    And I select Compositions "<compositions>"

   Examples:
      | size | color  | compositions |
      | S    | Blue   | Cotton       |
      | M    | Orange | Cotton       |
      | L    | Blue   | Cotton       |

  Scenario: Add properties
    Given Clicking on women page tab and verify the result
    Then I verify the women Tab is clicked
    And i verify the Colorful Dress is clicked
    And i verify the stock


  Scenario Outline: Women page testing
    Given Clicking on women page tab and verify the result

    And I select dress type "<Properties>"

    Examples:
      | Properties     |
      | Colorful Dress |
      | Maxi Dress     |
      | Midi Dress     |
      | Short Dress    |
      | Short Sleeve   |

  Scenario Outline:Dresses tab testing
    Given Clicking on women page tab and verify the result
    And i click the dress tab
    And I verify the dress tab with result
    And I click the casual dresses
    And I click the "<dress size>"
    And  I click the "<dress color>"
    Examples:
      | dress size | dress color |
      | S          | Orange      |
      | M          | Orange      |
      | L          | Orange      |

  Scenario: Information tabs testing
    Given Clicking on women page tab and verify the result
    And i click the dress tab
    And I check the delivery tab















