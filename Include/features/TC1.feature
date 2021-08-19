#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Cpanel có setting nội dung và link thông báo-> gửi thông báo thành công
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario outline
    Given Cpanel co setting noi dung va link thong bao
    When Vao widget giao hang tren KV
    And Click vao chuong
    And Click vao link trong thong bao 
    Then Kiem tra noi dung va link thong bao

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
 