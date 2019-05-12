

Feature: To add customer  

  Scenario: On sucessful filling of the details the customer ID should be generated 
    Given The user is in the home page 
    And The user clicks on the Add Customer button 
    When The user enters all the details 
    And clicks submmit 
    Then the customer Id should be generated 


