Feature: validate Index or Homepage functionality

  Scenario: Search for a product and verify the result
    Given I search with following details
      | ProductName |
      | Blouse      |

    Then I verify product "Blouse" is listed

  Scenario: Add product to cart
    Given I search with following details
      | ProductName |
      | Blouse      |

    Then I verify product "Blouse" is listed
    And Add product "Blouse" to the cart
    And I checkout the product
    And I delete the product

  Scenario: Add product to list view
    Given I search with following details
      | ProductName |
      | Blouse      |

    Then I verify product "Blouse" is listed
    And I switch to List view
    And Add product "Blouse" to the cart
    And I checkout the product
    And I delete the product


  Scenario Outline: Outine - Add product to list view
    Given I search with following details
      | ProductName |
      | <product>   |

    Then I verify product "<product>" is listed
    And I switch to List view
    And Add product "<product>" to the cart
    And I checkout the product
    And I delete the product

    Examples:
      | product                     |
      | Blouse                      |
      | Faded Short Sleeve T-shirts |






