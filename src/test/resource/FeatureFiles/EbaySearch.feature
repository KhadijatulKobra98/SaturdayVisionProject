@regression @smoke @SKYW-15
Feature: Ebay Search Functionality


	Scenario: Search for shoes

		Given Open Ebay Homepage

		When Search for shoes

		Then Item list should have only shoes related products