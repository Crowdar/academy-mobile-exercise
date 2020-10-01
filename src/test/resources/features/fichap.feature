Feature: As a potential client i want to interact with the mobile application

  Scenario Outline: The user starts the application, log in to the app, starts a day, changes your password, ends a day  and log out of the app.
    Given The app is loaded correctly.
    When The user logs in the application  with: <email>, <password>
    Then Home page is displayed.

    When The user starts the day
    Then Timekeeper is displayed

    When The user ends the day
    Then Home page is displayed.

    #When The user change your name: <new_name>
    Then The user log out of the app.
    And Login page is displayed.

@Fichap
    Examples:
      | email                    | password |
      | luisjivillalba@gmail.com | asd123   |