@regression @smoke @us-248
Feature: Ebay Cart Funcionality

Description: User should be able to add items in cart

  Background :
         Given open Ebay Homepage
         
  Scenario: Ebay cart functionality
          Given Search for Shirt
          When Select the first shirt on item list
          And Select Size
          And Select Men Size
          And Select Shade
          And Select Quantity
          Then Add to shopping cart
  
        