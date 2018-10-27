

Feature: Fb page login
  


  Scenario: Login of fb page
    Given User is in fb log in page
    When The user enters userid and password
    |gmbalasubramanian96@gmail.com|veralevel@|
    And The user clicks submit button
    Then The user should see thee home page of fb

 