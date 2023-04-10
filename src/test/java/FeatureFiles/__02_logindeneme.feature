Feature:  notification messages
  Given Navigate to OrangeHm
When Enter Usernames and passwords and click login button
Then User should login succesfully
And Navigate to  admin page
  Scenario: Create notification messages
    Given navigate to Site
    When Login as admin
    And click to Admin
    And click to Add