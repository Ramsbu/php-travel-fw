$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/IndexPage.feature");
formatter.feature({
  "line": 1,
  "name": "validate Index or Homepage functionality",
  "description": "",
  "id": "validate-index-or-homepage-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7799538671,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Search for a product and verify the result",
  "description": "",
  "id": "validate-index-or-homepage-functionality;search-for-a-product-and-verify-the-result",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I search with following details",
  "rows": [
    {
      "cells": [
        "ProductName"
      ],
      "line": 5
    },
    {
      "cells": [
        "Blouse"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I verify product \"Blouse\" is listed",
  "keyword": "Then "
});
formatter.match({
  "location": "IndexPageSteps.searchProduct(IndexDTO\u003e)"
});
formatter.result({
  "duration": 1224805130,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 18
    }
  ],
  "location": "IndexPageSteps.isProductListed(String)"
});
formatter.result({
  "duration": 68626540,
  "status": "passed"
});
formatter.after({
  "duration": 95906,
  "status": "passed"
});
formatter.before({
  "duration": 1408980621,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Add product to cart",
  "description": "",
  "id": "validate-index-or-homepage-functionality;add-product-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I search with following details",
  "rows": [
    {
      "cells": [
        "ProductName"
      ],
      "line": 12
    },
    {
      "cells": [
        "Blouse"
      ],
      "line": 13
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I verify product \"Blouse\" is listed",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Add product \"Blouse\" to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I checkout the product",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I delete the product",
  "keyword": "And "
});
formatter.match({
  "location": "IndexPageSteps.searchProduct(IndexDTO\u003e)"
});
formatter.result({
  "duration": 857288226,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 18
    }
  ],
  "location": "IndexPageSteps.isProductListed(String)"
});
formatter.result({
  "duration": 61002795,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 13
    }
  ],
  "location": "IndexPageSteps.addProductToCart(String)"
});
formatter.result({
  "duration": 820023592,
  "status": "passed"
});
formatter.match({
  "location": "IndexPageSteps.iCheckoutTheProduct()"
});
formatter.result({
  "duration": 1103203551,
  "status": "passed"
});
formatter.match({
  "location": "IndexPageSteps.iDeleteTheProduct()"
});
formatter.result({
  "duration": 1314057428,
  "status": "passed"
});
formatter.after({
  "duration": 19257,
  "status": "passed"
});
formatter.before({
  "duration": 1371185862,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Add product to list view",
  "description": "",
  "id": "validate-index-or-homepage-functionality;add-product-to-list-view",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I search with following details",
  "rows": [
    {
      "cells": [
        "ProductName"
      ],
      "line": 22
    },
    {
      "cells": [
        "Blouse"
      ],
      "line": 23
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I verify product \"Blouse\" is listed",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I switch to List view",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Add product \"Blouse\" to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I checkout the product",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I delete the product",
  "keyword": "And "
});
formatter.match({
  "location": "IndexPageSteps.searchProduct(IndexDTO\u003e)"
});
formatter.result({
  "duration": 849662215,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 18
    }
  ],
  "location": "IndexPageSteps.isProductListed(String)"
});
formatter.result({
  "duration": 70208606,
  "status": "passed"
});
formatter.match({
  "location": "IndexPageSteps.switchTOListView()"
});
formatter.result({
  "duration": 146825523,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 13
    }
  ],
  "location": "IndexPageSteps.addProductToCart(String)"
});
formatter.result({
  "duration": 916980815,
  "status": "passed"
});
formatter.match({
  "location": "IndexPageSteps.iCheckoutTheProduct()"
});
formatter.result({
  "duration": 735859202,
  "status": "passed"
});
formatter.match({
  "location": "IndexPageSteps.iDeleteTheProduct()"
});
formatter.result({
  "duration": 1128502633,
  "status": "passed"
});
formatter.after({
  "duration": 16613,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 32,
  "name": "Outine - Add product to list view",
  "description": "",
  "id": "validate-index-or-homepage-functionality;outine---add-product-to-list-view",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 33,
  "name": "I search with following details",
  "rows": [
    {
      "cells": [
        "ProductName"
      ],
      "line": 34
    },
    {
      "cells": [
        "\u003cproduct\u003e"
      ],
      "line": 35
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I verify product \"\u003cproduct\u003e\" is listed",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I switch to List view",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Add product \"\u003cproduct\u003e\" to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I checkout the product",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I delete the product",
  "keyword": "And "
});
formatter.examples({
  "line": 43,
  "name": "",
  "description": "",
  "id": "validate-index-or-homepage-functionality;outine---add-product-to-list-view;",
  "rows": [
    {
      "cells": [
        "product"
      ],
      "line": 44,
      "id": "validate-index-or-homepage-functionality;outine---add-product-to-list-view;;1"
    },
    {
      "cells": [
        "Blouse"
      ],
      "line": 45,
      "id": "validate-index-or-homepage-functionality;outine---add-product-to-list-view;;2"
    },
    {
      "cells": [
        "Faded Short Sleeve T-shirts"
      ],
      "line": 46,
      "id": "validate-index-or-homepage-functionality;outine---add-product-to-list-view;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1350964871,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Outine - Add product to list view",
  "description": "",
  "id": "validate-index-or-homepage-functionality;outine---add-product-to-list-view;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 33,
  "name": "I search with following details",
  "matchedColumns": [
    0
  ],
  "rows": [
    {
      "cells": [
        "ProductName"
      ],
      "line": 34
    },
    {
      "cells": [
        "Blouse"
      ],
      "line": 35
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I verify product \"Blouse\" is listed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I switch to List view",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Add product \"Blouse\" to the cart",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I checkout the product",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I delete the product",
  "keyword": "And "
});
formatter.match({
  "location": "IndexPageSteps.searchProduct(IndexDTO\u003e)"
});
formatter.result({
  "duration": 871158298,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 18
    }
  ],
  "location": "IndexPageSteps.isProductListed(String)"
});
formatter.result({
  "duration": 106228733,
  "status": "passed"
});
formatter.match({
  "location": "IndexPageSteps.switchTOListView()"
});
formatter.result({
  "duration": 106890255,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 13
    }
  ],
  "location": "IndexPageSteps.addProductToCart(String)"
});
formatter.result({
  "duration": 927154366,
  "status": "passed"
});
formatter.match({
  "location": "IndexPageSteps.iCheckoutTheProduct()"
});
formatter.result({
  "duration": 761736360,
  "status": "passed"
});
formatter.match({
  "location": "IndexPageSteps.iDeleteTheProduct()"
});
formatter.result({
  "duration": 1114740549,
  "status": "passed"
});
formatter.after({
  "duration": 18123,
  "status": "passed"
});
formatter.before({
  "duration": 1378367081,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Outine - Add product to list view",
  "description": "",
  "id": "validate-index-or-homepage-functionality;outine---add-product-to-list-view;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 33,
  "name": "I search with following details",
  "matchedColumns": [
    0
  ],
  "rows": [
    {
      "cells": [
        "ProductName"
      ],
      "line": 34
    },
    {
      "cells": [
        "Faded Short Sleeve T-shirts"
      ],
      "line": 35
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I verify product \"Faded Short Sleeve T-shirts\" is listed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I switch to List view",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Add product \"Faded Short Sleeve T-shirts\" to the cart",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I checkout the product",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I delete the product",
  "keyword": "And "
});
formatter.match({
  "location": "IndexPageSteps.searchProduct(IndexDTO\u003e)"
});
formatter.result({
  "duration": 947912654,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 18
    }
  ],
  "location": "IndexPageSteps.isProductListed(String)"
});
formatter.result({
  "duration": 81215102,
  "status": "passed"
});
formatter.match({
  "location": "IndexPageSteps.switchTOListView()"
});
formatter.result({
  "duration": 103905097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 13
    }
  ],
  "location": "IndexPageSteps.addProductToCart(String)"
});
formatter.result({
  "duration": 780958271,
  "status": "passed"
});
formatter.match({
  "location": "IndexPageSteps.iCheckoutTheProduct()"
});
formatter.result({
  "duration": 740320325,
  "status": "passed"
});
formatter.match({
  "location": "IndexPageSteps.iDeleteTheProduct()"
});
formatter.result({
  "duration": 1133220512,
  "status": "passed"
});
formatter.after({
  "duration": 23033,
  "status": "passed"
});
formatter.uri("features/WomenPage.feature");
formatter.feature({
  "line": 1,
  "name": "Women page validation",
  "description": "",
  "id": "women-page-validation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Women page testing",
  "description": "",
  "id": "women-page-validation;women-page-testing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Clicking on women page tab and verify the result",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I verify the women Tab is clicked",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I verify women tab with string comparision",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I verify the Top tab is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify the top tab with string comparision",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the t-shirt is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify the categories",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select the \"\u003csize\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select color \"\u003ccolor\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select Compositions \"\u003ccompositions\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "women-page-validation;women-page-testing;",
  "rows": [
    {
      "cells": [
        "size",
        "color",
        "compositions"
      ],
      "line": 15,
      "id": "women-page-validation;women-page-testing;;1"
    },
    {
      "cells": [
        "S",
        "White",
        "Cotton"
      ],
      "line": 16,
      "id": "women-page-validation;women-page-testing;;2"
    },
    {
      "cells": [
        "M",
        "Black",
        "Polyester"
      ],
      "line": 17,
      "id": "women-page-validation;women-page-testing;;3"
    },
    {
      "cells": [
        "L",
        "Orange",
        "Viscose"
      ],
      "line": 18,
      "id": "women-page-validation;women-page-testing;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1413939397,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Women page testing",
  "description": "",
  "id": "women-page-validation;women-page-testing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Clicking on women page tab and verify the result",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I verify the women Tab is clicked",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I verify women tab with string comparision",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I verify the Top tab is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify the top tab with string comparision",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the t-shirt is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify the categories",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select the \"S\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select color \"White\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select Compositions \"Cotton\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "WomenPageSteps.clickingOnWomenPageTabAndVerifyTheResult()"
});
formatter.result({
  "duration": 2396787010,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheWomenTabIsClicked()"
});
formatter.result({
  "duration": 225669036,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyWomenTabWithStringComparision()"
});
formatter.result({
  "duration": 65038385,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheTopTabIsClicked()"
});
formatter.result({
  "duration": 1196380807,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheTopTabWithStringComparision()"
});
formatter.result({
  "duration": 90065231,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheTShirtIsClicked()"
});
formatter.result({
  "duration": 212412910,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheCategories()"
});
formatter.result({
  "duration": 711445925,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S",
      "offset": 14
    }
  ],
  "location": "WomenPageSteps.iSelectThe(String)"
});
formatter.result({
  "duration": 108558409,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "White",
      "offset": 16
    }
  ],
  "location": "WomenPageSteps.iSelectColor(String)"
});
formatter.result({
  "duration": 10001636060,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 10 seconds waiting for Element located by{By.xpath: //a[contains(@href ,\u0027color\u0027) and contains(.,\u0027White\u0027)]} to be displayed\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-CK1BJ5Q\u0027, ip: \u0027192.168.1.68\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:292)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:261)\r\n\tat com.phptravels.core.GSFluentWait.ifElementIsNotDisplayed(GSFluentWait.java:37)\r\n\tat com.phptravels.core.pages.WomenPage.selectColor(WomenPage.java:59)\r\n\tat com.phptravels.steps.WomenPageSteps.iSelectColor(WomenPageSteps.java:62)\r\n\tat ✽.And I select color \"White\"(features/WomenPage.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cotton",
      "offset": 23
    }
  ],
  "location": "WomenPageSteps.iSelectCompositions(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 445213704,
  "status": "passed"
});
formatter.before({
  "duration": 1426000478,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Women page testing",
  "description": "",
  "id": "women-page-validation;women-page-testing;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Clicking on women page tab and verify the result",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I verify the women Tab is clicked",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I verify women tab with string comparision",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I verify the Top tab is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify the top tab with string comparision",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the t-shirt is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify the categories",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select the \"M\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select color \"Black\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select Compositions \"Polyester\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "WomenPageSteps.clickingOnWomenPageTabAndVerifyTheResult()"
});
formatter.result({
  "duration": 1208495882,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheWomenTabIsClicked()"
});
formatter.result({
  "duration": 76089058,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyWomenTabWithStringComparision()"
});
formatter.result({
  "duration": 32440655,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheTopTabIsClicked()"
});
formatter.result({
  "duration": 975254452,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheTopTabWithStringComparision()"
});
formatter.result({
  "duration": 57828847,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheTShirtIsClicked()"
});
formatter.result({
  "duration": 143457497,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheCategories()"
});
formatter.result({
  "duration": 1001353629,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M",
      "offset": 14
    }
  ],
  "location": "WomenPageSteps.iSelectThe(String)"
});
formatter.result({
  "duration": 135288903,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Black",
      "offset": 16
    }
  ],
  "location": "WomenPageSteps.iSelectColor(String)"
});
formatter.result({
  "duration": 577374345,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Polyester",
      "offset": 23
    }
  ],
  "location": "WomenPageSteps.iSelectCompositions(String)"
});
formatter.result({
  "duration": 70985,
  "status": "passed"
});
formatter.after({
  "duration": 41534,
  "status": "passed"
});
formatter.before({
  "duration": 595051570,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Women page testing",
  "description": "",
  "id": "women-page-validation;women-page-testing;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Clicking on women page tab and verify the result",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I verify the women Tab is clicked",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I verify women tab with string comparision",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I verify the Top tab is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify the top tab with string comparision",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the t-shirt is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify the categories",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select the \"L\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select color \"Orange\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select Compositions \"Viscose\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "WomenPageSteps.clickingOnWomenPageTabAndVerifyTheResult()"
});
formatter.result({
  "duration": 1317063731,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheWomenTabIsClicked()"
});
formatter.result({
  "duration": 75240255,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyWomenTabWithStringComparision()"
});
formatter.result({
  "duration": 25764262,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheTopTabIsClicked()"
});
formatter.result({
  "duration": 962381949,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheTopTabWithStringComparision()"
});
formatter.result({
  "duration": 56966829,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheTShirtIsClicked()"
});
formatter.result({
  "duration": 108479118,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iVerifyTheCategories()"
});
formatter.result({
  "duration": 1052222896,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "L",
      "offset": 14
    }
  ],
  "location": "WomenPageSteps.iSelectThe(String)"
});
formatter.result({
  "duration": 167726160,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Orange",
      "offset": 16
    }
  ],
  "location": "WomenPageSteps.iSelectColor(String)"
});
formatter.result({
  "duration": 139625424,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Viscose",
      "offset": 23
    }
  ],
  "location": "WomenPageSteps.iSelectCompositions(String)"
});
formatter.result({
  "duration": 52106,
  "status": "passed"
});
formatter.after({
  "duration": 16613,
  "status": "passed"
});
});