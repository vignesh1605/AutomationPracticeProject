Feature: validating the automation exercise site

  @TestCase1  @RegisterUser @RegressionTest
    Scenario: Register User
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When user Click on Signup Login button
      Then Verify New User Signup is visible
      When Enter name and email address
      And click signup button
      Then Verify that ENTER ACCOUNT INFORMATION is visible
      When Fill details of Title Name Email Password Date of birth
      And Select checkbox Sign up for our newsletter
      And Select checkbox Receive special offers from our partners
      When Fill details First name Last name Company Address Country State City Zipcode Mobile Number
      And Click Create Account button
      Then Verify that ACCOUNT CREATED is visible
      And Click Continue button
      Then Verify that Logged in as username is visible
#      When Click Delete Account button
#      Then Verify that ACCOUNT DELETED is visible
#      And user clicks the Continue button

  @TestCase2  @LoginUserWithCorrectEmailAndPassword @RegressionTest
    Scenario: Login User With Correct Email And Password
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When user Click on Signup Login button
      Then Verify Login to your account is visible
      When user Enter valid email address and valid password
      And user click on login button
      Then Verify that Logged in as username is visible
#      And Click Delete Account button
#      Then Verify that ACCOUNT DELETED is visible

  @TestCase3 @loginUserWithInCorrectEmailAndPassword @RegressionTest
    Scenario: login User With InCorrect Email And Password
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When user Click on Signup Login button
      Then Verify Login to your account is visible
      When user Enter invalid email address and invalid password
      And user click on login button
      Then Verify error Your email or password is incorrect is visible

  @TestCase4  @LogoutUser @RegressionTest
    Scenario: logout User functionality
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When user Click on Signup Login button
      Then Verify Login to your account is visible
      When user Enter valid email address and valid password
      And user click on login button
      Then Verify that Logged in as username is visible
      And user clicks the logout button
      Then Verify Login to your account is visible

  @TestCase5  @RegisterUserWithExistingEmail  @RegressionTest
    Scenario: Register User With Existing Users
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When user Click on Signup Login button
      Then Verify New User Signup is visible
      When Enter name and email address
      And click signup button
      Then Verify error Email Address already exist is visible

  @TestCase6  @ContactUsForm @RegressionTest
    Scenario: Contact Us Form
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When Click on Contact Us button
      Then Verify GET IN TOUCH is visible
      When Enter name email subject and message
      And Upload file
      And Click Submit button
      And Click OK button
      Then Verify success message Success Your details have been submitted successfully is visible
      When Click Home button
      Then verify that landed to home page successfully

  @TestCase7  @VerifyTestCasePage @RegressionTest
    Scenario: Verify TestCase Page
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      And Click on Test Cases button
      Then Verify user is navigated to test cases page successfully









