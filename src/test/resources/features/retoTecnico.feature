@stories
  Feature: Technical Challenge
    User must register at utest
  @scenario1
  Scenario: Register on the website utest
    Given The user wants to register in utest
    When The user fills the form
    |strFirstName   |strLastName   |strEmail               |strBirthMonth |strBirthDay |strBirthYear |strCity          |strPostal |strCountry  |strYourComputer |strVersion  |strLanguage   |strYourMobil   |strModel       |strOperating      |strPassword     |
    |Camilo          |Henao  |camilo0481986@hotmail.com|April      |10       |1991      |Medellin |050004   |Colombia    |Windows         |10 64-bit   |English - Spanish      |Huawei         |Y6 Prime (2019)|Android 8.0 (Oreo)|Cubodehielo048@|
    Then User completes registration successfully
    |strVerify     |
    |Step 4:       |