Feature: validating the automation exercise site

  @TestCase1  @RegisterUser
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

  @TestCase2  @LoginUserWithCorrectEmailAndPassword
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

  @TestCase3 @loginUserWithInCorrectEmailAndPassword
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

  @TestCase8 @VerifyAllProductsAndProductDetailsPage  @RegressionTest
    Scenario: Verify All Products And Product Details Page
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When Click on Products button
      Then Verify user is navigated to ALL PRODUCTS page successfully
      And The products list is visible
      When Click on View Product of first product
      And User is landed to product detail page
      Then Verify that details are visible product name category price availability condition brand

  @TestCase9  @SearchProduct  @RegressionTest
    Scenario: Search Product
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When Click on Products button
      Then Verify user is navigated to ALL PRODUCTS page successfully
      When Enter product name in search input and click search button
      Then Verify SEARCHED PRODUCTS is visible

  @TestCase10 @VerifySubscriptionInHomePage @RegressionTest
    Scenario: Verify Subscription in home page
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
#      And Scroll down to footer
      Then Verify text SUBSCRIPTION
      When Enter email address in input and click arrow button
      Then Verify success message You have been successfully subscribed is visible

  @TestCase11 @VerifySubscriptionInCartPage @RegressionTest
    Scenario: Verify Subscription In Cart Page
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When Click Cart button
#      And Scroll down to footer
      Then Verify text SUBSCRIPTION in Cart Page
      When Enter email address in input and click arrow button in Cart Page
      Then Verify success message You have been successfully subscribed is visible in Cart Page

  @TestCase12 @AddProductsInCart  @RegressionTest
    Scenario: Add Products In Cart
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When Click on Products button
      And Hover over first product and click Add to cart
      And Click Continue Shopping button
      And Hover over second product and click Add to cart
      And Click View Cart button
      Then Verify both products are added to Cart
      Then Verify their prices quantity and total price

  @TestCase13 @VerifyProductQuantityInCart  @RegressionTest
    Scenario: Verify Product Quantity In Cart
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When Click View Product for any product on home page
      Then Verify product detail is opened
      When Increase quantity
      And Click Add to cart button
      And Click View Cart button in Product Details Page
      Then Verify that product is displayed in cart page with exact quantity

  @TestCase14 @PlaceOrder_RegisterWhileCheckout
    Scenario: Product Order & Register While Checkout
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When Hover over first product and click Add to cart
      And Click View Cart button in Product Details Page
      Then Verify that cart page is displayed
      When Click Proceed To Checkout
      And Click Register_Login button
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
      When Click Cart button
      And Click Proceed To Checkout
      Then Verify Address Details and Review Your Order
      And Enter description in comment text area and click Place Order
      And Enter payment details Name on Card Card Number CVC Expiration date
      And Click Pay and Confirm Order button
      Then Verify success message Your order has been placed successfully
#      When Click Delete Account button
#      Then Verify that ACCOUNT DELETED is visible
#      And user clicks the Continue button

  @TestCase15 @PlaceOrder_RegisterBeforeCheckout
    Scenario: Product Order_RegisterBeforeCheckout
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
      When Hover over first product and click Add to cart
      And Click View Cart button in Product Details Page
      Then Verify that cart page is displayed
      When Click Proceed To Checkout
      Then Verify Address Details and Review Your Order
      And Enter description in comment text area and click Place Order
      And Enter payment details Name on Card Card Number CVC Expiration date
      And Click Pay and Confirm Order button
      Then Verify success message Your order has been placed successfully
#      When Click Delete Account button
#      Then Verify that ACCOUNT DELETED is visible
#      And user clicks the Continue button

  @TestCase16 @PlaceOrder_LoginBeforeCheckout
    Scenario: Place Order_Login Before Checkout
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When user Click on Signup Login button
      Then Verify Login to your account is visible
      When user Enter valid email address and valid password
      And user click on login button
      Then Verify that Logged in as username is visible
      When Hover over first product and click Add to cart
      And Click View Cart button in Product Details Page
      Then Verify that cart page is displayed
      And Click Proceed To Checkout
      Then Verify Address Details and Review Your Order
      And Enter description in comment text area and click Place Order
      And Enter payment details Name on Card Card Number CVC Expiration date
      And Click Pay and Confirm Order button
      Then Verify success message Your order has been placed successfully
#      When Click Delete Account button
#      Then Verify that ACCOUNT DELETED is visible
#      And user clicks the Continue button

  @TestCase17 @RemoveProductsFromCart @RegressionTest
    Scenario: Remove Products From Cart
#      Given user navigates to the test environment
      Then Verify that home page is visible successfully
      When Click on Products button
      And Hover over first product and click Add to cart
      And Click Continue Shopping button
      And Hover over second product and click Add to cart
      And Click View Cart button
      Then Verify that cart page is displayed
      When Click X button corresponding to particular product
      Then Verify that product is removed from the cart

