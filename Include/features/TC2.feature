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
Feature: Cpanel chỉ setting nội dung thông báo -> Gửi thông báo thành công
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario outline
    Given Cpanel chi setting noi dung thong bao
    When Mo widget ban hang
    And Click vao icon chuong
    Then Kiem tra noi dung thong bao

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
    