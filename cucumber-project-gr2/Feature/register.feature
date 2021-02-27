
@tag
Feature: Регистрация на потребител
  Scenario Outline: Регистрация на потребител
    Given Потребителя отваря екрана за регистрация
    When Въведете потребителско име"<username>"
    And Въведете парола"<password>"
     And Въведете втора парола"<password2>"
      And Въведете електронна поща "<email>"
       And Натисне върху бутона за регистрация
    Then Вижда съобщение "<expectedMessage>"

    Examples: 
      |username|password|password2|email|expectedMessage|
      |user1|password|password|test@test.com|Успешно се регистрирахте|
      |user2|password|password|test@test.com|Потребителското име е заето|
      ||password|password|test@test.com|Въведете потребителско име|
      |user1|password|password||Въведете електронна поща|
			|user1|password|password123|test@test.com|Въведете еднакви пароли|
      |user1|password||test@test.com|Потвърдете паролата|
     