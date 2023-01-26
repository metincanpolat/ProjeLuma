#Senaryo ;
  #1- siteyi açınız
  #2- username ve password u gönderin ve login butonuna tıklayın
  #3- login olduğunuzu doğrulayın

Feature:Login Functionality

  Scenario Outline: Login to Luma website TC-01
    Given Navigate to Luma
    When Enter username as "<userName>" and password as "<password>"and click Login button
    Then User should login successfully
    Examples:
      | userName            | password     |
      | abc@technostudy.com | abc123ABC123 |

  Scenario: Login to Luma website nagative TC-02
    Given Navigate to Luma
    When User send valid Username and invalid Password and click login button
      |username|abc@technostudy.com|
      |password|abc123ABC123invalid|
    Then User should not be able to login

  Scenario: Login to Luma website nagative TC-03
    Given Navigate to Luma
    When User send invalid Username and valid Password and click login button
      |username|invalid@technostudy.com|
      |password|abc123ABC123|
    Then User should not be able to login