$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionalTests/Confirm.feature");
formatter.feature({
  "name": "I want to confirm the purchase order",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "name": "I enter the \u003citemnumber\u003e of the purchase order",
  "keyword": "Then "
});
formatter.step({
  "name": "I save the purchase order",
  "keyword": "And "
});
formatter.step({
  "name": "I confirm the order",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "itemnumber"
      ]
    },
    {
      "cells": [
        "1000"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the browser and launch the Dynamics url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I entered the valid credentials",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I can see the dashboard page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "name": "I enter the 1000 of the purchase order",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I save the purchase order",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I confirm the order",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:src/test/resources/functionalTests/Creation.feature");
formatter.feature({
  "name": "Purchaseorder operations",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Filling mandatory details in purchase order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "name": "I fill the vendor \u003cvendorname\u003e and  site \u003csite\u003e of the purchase order",
  "keyword": "Then "
});
formatter.step({
  "name": "I click the ok button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "vendorname",
        "site"
      ]
    },
    {
      "cells": [
        "1000",
        "1"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the browser and launch the Dynamics url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I entered the valid credentials",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I can see the dashboard page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Filling mandatory details in purchase order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "name": "I fill the vendor 1000 and  site 1 of the purchase order",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click the ok button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:src/test/resources/functionalTests/Home.feature");
formatter.feature({
  "name": "Dashboard operation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Open the browser and launch the Dynamics url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I entered the valid credentials",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I can see the dashboard page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Steps done in dashboard",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "name": "I click the navigation panel",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click the accounts payable",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click the all purchase orders",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I can see the purchase order page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:src/test/resources/functionalTests/Login.feature");
formatter.feature({
  "name": "Purchase order creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Open the browser and launch the Dynamics url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I entered the valid credentials",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I can see the dashboard page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});