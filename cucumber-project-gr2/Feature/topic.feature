Feature: Зaпочнете нова тема


Scenario: Започнете нова тема
Given Потребителят отваря формата за създаване на тема
When Писане на заглавна част за тема "Eclipse" 
And   Писане на съдържанието на темата "Какво мислите за Eclipse?"
And Клика на бутона за добавяне на тема
Then Получава съобщение "Темата е добавена успешно."

Scenario: Добавяне на тема без заглавна част
Given Потребителят отваря формата за създаване на тема
When   Писане на съдържанието на темата "Какво мислите за Eclipse?"
And Клика на бутона за добавяне на тема
Then Получава съобщение "Грешка. Не може да добавите тема без заглавна част."

Scenario: Добавяне на тема без съдържание
Given Потребителят отваря формата за създаване на тема
When Писане на заглавна част за тема "Eclipse" 
And Клика на бутона за добавяне на тема
Then Получава съобщение "Грешка. Не може да добавите тема без съдържание."

Scenario: Добавяне на тема без заглавна част и съдържание
Given Потребителят отваря формата за създаване на тема
When Клика на бутона за добавяне на тема
Then Получава съобщение "Грешка. Не може да добавите тема без заглавна част и съдържание."