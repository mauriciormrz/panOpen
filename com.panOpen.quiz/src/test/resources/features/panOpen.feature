#Author: ramirezmauricio@hotmail.com
#https://github.com/panOpen-team/automation-assignment/invitations

#old_faculty_email: automation+1@panopen.com
#old_faculty_password: 123123123

#Faculty
#automation_faculty_email: automation@panopen.com
#automation_faculty_password: 123123123

#Student
#automation_student_email: automation+2@panopen.com
#automation_student_password: 123123123

@Regresion
Feature: Quiz panOpen
  The goal of this assignment is to gauge your ability to quickly prototype a useful test case 
  for a realistic scenario in panOpen using cucumber and automation tools.

  @Scenario_1
  Scenario Outline: My Classes page
    Given User logs in "as faculty" with email "automation+1@panopen.com" and pass "123123123"
    When User clicks create a class
    And Users fills the form
    | <Class Name> | <Start Date> | <End Date>    | <M> | <T> | <W> | <TH> | <F>  | <S> | <SU> | <Start Time> | <End Time> |
    Then Class should be properly saved

    Examples: 
      | Class Name | Start Date | End Date    | M | T | W | TH | F  | S | SU | Start Time | End Time |
      | Test       | 11/14/2018 | 11/14/2019  | 1 | 0 | 1 | 0  | 1  | 0 | 0  | 7:00 am    | 8:45 am  |
      
      
	@Scenario_2
	Scenario Outline: Due Date for assessments
	  Given User logs in "as faculty" with email "automation@panopen.com" and pass "123123123"
	  When Set due date for assessments
	  | <Class Name> | <Assessment> | <Activity> | <Due month> | <Due day> |  <Due year> | <Due hour> | <Due minute> | <am-pm> |
	  Then User logs out
	  
	      Examples: 
	    | Class Name                | Assessment                           | Activity    | Due month | Due day |  Due year | Due hour | Due minute | am-pm |
	    | Active Class for testing  | Chapter 01 - Introduction to Biology | rich text 1 | 11        | 25      | 2019      | 7        |  00        | am    |
      



