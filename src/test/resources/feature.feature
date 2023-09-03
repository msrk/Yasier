Feature: UI and Restassired




  Scenario: Add video to favorites
    Given go to video
    When add to favorties
    Then video is added

  Scenario: get movie
    Given we request movie 550
    Then we get 200 response