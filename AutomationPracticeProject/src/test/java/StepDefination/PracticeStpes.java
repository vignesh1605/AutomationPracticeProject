package StepDefination;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.ConfigPropertyReader;
import utils.TestContext;

public class PracticeStpes {

    private TestContext testContext;
    int productId;
    public PracticeStpes(TestContext testContext){
        this.testContext = testContext;
    }

//    @Given("user navigates to the test environment")
//    public void userNavigatesToTheTestEnvironment(){
//        testContext.getDriver();
//    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String expectedPageTitle = "Automation Exercise";
        String actualPageTitle = testContext.pageObjectManager.getHomepage().getHomePageTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);

    }

    @When("user Click on Signup Login button")
    public void userClickOnSignupLoginButton() {
        testContext.pageObjectManager.getHomepage().clickonSignupButton();

    }

    @Then("Verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {

        boolean signUpFormStatus = testContext.pageObjectManager.getLoginSignupPage().newUsersignupFormIsVisible();
        Assert.assertTrue(signUpFormStatus);
    }

    @When("Enter name and email address")
    public void enterNameAndEmailAddress() {

        testContext.pageObjectManager.getLoginSignupPage().userEntersTheNameAndEmail();

    }

    @And("click signup button")
    public void clickSignupButton() {

        testContext.pageObjectManager.getLoginSignupPage().userClicksTheSignupButton();

    }


    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {

        boolean status = testContext.pageObjectManager.getLoginSignupPage().enterAccountInformationFormIsVisible();
        Assert.assertTrue(status);
    }

    @When("Fill details of Title Name Email Password Date of birth")
    public void fillDetailsOfTitleNameEmailPasswordDateOfBirth() {
        testContext.pageObjectManager.getLoginSignupPage().userEntersTheAccountInformationDetails();

    }

    @And("Select checkbox Sign up for our newsletter")
    public void selectCheckboxSignUpForOurNewsletter() {

        testContext.pageObjectManager.getLoginSignupPage().userClicksTheSignupForOurNewsletterCheckbox();

    }

    @And("Select checkbox Receive special offers from our partners")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {

        testContext.pageObjectManager.getLoginSignupPage().userClicksTheReceiveSpecialOffersFromOurPartnersCheckbox();

    }

    @When("Fill details First name Last name Company Address Country State City Zipcode Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber() {

        testContext.pageObjectManager.getLoginSignupPage().userEntersTheAddressInformationDetails();


    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {

        testContext.pageObjectManager.getLoginSignupPage().userClicksTheCreateAccountButton();
    }

    @Then("Verify that ACCOUNT CREATED is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {

        String expectedAccountCreatedMessage = "Congratulations! Your new account has been successfully created!";
        String actualAccountCreatedMessage = testContext.pageObjectManager.getLoginSignupPage().userReadsTheAccountCreatedMessage();
        Assert.assertEquals(expectedAccountCreatedMessage, actualAccountCreatedMessage);

    }

    @And("Click Continue button")
    public void clickContinueButton() {

        testContext.pageObjectManager.getLoginSignupPage().userClicksTheContinueButton();

    }

    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {

        String expectedLoggedInName = ConfigPropertyReader.getConfigPropertyValues("name");
        String actualLoggedInName = testContext.pageObjectManager.getLoginSignupPage().userReadsTheLoggedInNameIsVisible();
        Assert.assertEquals(expectedLoggedInName, actualLoggedInName);
    }

    @When("Click Delete Account button")
    public void clickDeleteAccountButton() {

        testContext.pageObjectManager.getLoginSignupPage().userClicksTheDeleteAccountButton();

    }

    @Then("Verify that ACCOUNT DELETED is visible")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        String expectedDeletedMessage = "Your account has been permanently deleted!";
        String actualDeletedMessage = testContext.pageObjectManager.getLoginSignupPage().userReadsTheAccountDeletedMessage();
        Assert.assertEquals(expectedDeletedMessage, actualDeletedMessage);

    }

    @And ("user clicks the Continue button")
    public void userClicksTheContinueButton() {

        testContext.pageObjectManager.getLoginSignupPage().userClicksTheContinueButton();
        String expectedPageTitle = "Automation Exercise";
        String actualPageTitle = testContext.pageObjectManager.getHomepage().getHomePageTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }

    @Then("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {

       boolean logInFormStatus = testContext.pageObjectManager.getLoginSignupPage().verifyLoginToYourAccountIsVisible();
       Assert.assertTrue(logInFormStatus);

    }

    @When("user Enter valid email address and valid password")
    public void userEnterTheValidEmailAddressAndValidPassword() {

        testContext.pageObjectManager.getLoginSignupPage().userEnterTheValidEmailAddressAndValidPassword();

    }

    @And("user click on login button")
    public void userClickOnLoginButton() {

        testContext.pageObjectManager.getLoginSignupPage().userClickOnLoginButton();

    }

    @Then("Verify error Your email or password is incorrect is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {

        String expectedInvalidEmailOrPasswordErrorMessage ="Your email or password is incorrect!";
        String actualInvalidEmailOrPasswordErrorMessage = testContext.pageObjectManager.getLoginSignupPage().userReadsTheInvalidEmainOrPasswordTextIsVisible();
        Assert.assertEquals(expectedInvalidEmailOrPasswordErrorMessage, actualInvalidEmailOrPasswordErrorMessage);

    }

    @And("user clicks the logout button")
    public void userClicksTheLogoutButton() {
        testContext.pageObjectManager.getLoginSignupPage().userClicksTheLogoutButton();

    }

    @Then("Verify error Email Address already exist is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {

        String expectedEmailAddressAlreadyExist = "Email Address already exist!";
        String actualEmailAddressAlreadyExist = testContext.pageObjectManager.getLoginSignupPage().userVerifyErrorEmailAddressAlreadyExistIsVisible();
        Assert.assertEquals(expectedEmailAddressAlreadyExist, actualEmailAddressAlreadyExist);
    }

    @When("user Enter invalid email address and invalid password")
    public void userEnterInvalidEmailAddressAndInvalidPassword() {

        testContext.pageObjectManager.getLoginSignupPage().userEntertheInvalidEmailAddressAndInvalidPassword();


    }

    @When("Click on Contact Us button")
    public void clickOnContactUsButton() {

        testContext.pageObjectManager.getHomepage().clickOnContactUsButton();

    }

    @Then("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {

        String expectedDivText = "GET IN TOUCH";
        String actualDivText = testContext.pageObjectManager.getContactUsPage().getGetInTouchIsVisibleText();
        Assert.assertEquals(expectedDivText, actualDivText);

    }

    @When("Enter name email subject and message")
    public void enterNameEmailSubjectAndMessage() {

        testContext.pageObjectManager.getContactUsPage().userEntersTheName();
        testContext.pageObjectManager.getContactUsPage().userEntersTheEmail();
        testContext.pageObjectManager.getContactUsPage().userEntersTheSubject();
        testContext.pageObjectManager.getContactUsPage().userEntersTheMessage();

    }

    @And("Upload file")
    public void uploadFile() {

        testContext.pageObjectManager.getContactUsPage().userUploadsTheFile();

    }

    @And("Click Submit button")
    public void clickSubmitButton() {

        testContext.pageObjectManager.getContactUsPage().userClicksTheSubmitButton();

    }

    @And("Click OK button")
    public void clickOKButton() {

        testContext.pageObjectManager.getContactUsPage().userClicksTheOkButtonInAlert();

    }

    @Then("Verify success message Success Your details have been submitted successfully is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {

        String expectedAlertAcceptSuccessMessage = "Success! Your details have been submitted successfully.";
        String actualAlertAcceptSuccessMessage = testContext.pageObjectManager.getContactUsPage().userReadsTheSuccessMessageAfterTheAlertAccept();
        Assert.assertEquals(expectedAlertAcceptSuccessMessage, actualAlertAcceptSuccessMessage);
    }

    @When("Click Home button")
    public void clickHomeButton() {
        testContext.pageObjectManager.getContactUsPage().userClicksTheHomeButton();
    }

    @Then("verify that landed to home page successfully")
    public void verifyThatLandedToHomePageSuccessfully() {
        String expectedPageTitle = "Automation Exercise";
        String actualPageTitle = testContext.pageObjectManager.getHomepage().getHomePageTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }

    @And("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        testContext.pageObjectManager.getHomepage().clickOnTestCasesButton();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {

        boolean isTestCasesPageVisible= testContext.pageObjectManager.getHomepage().getTestCasesPageIsVisible();
        Assert.assertTrue(isTestCasesPageVisible);
    }

    @When("Click on Products button")
    public void clickOnProductsButton() {
        testContext.pageObjectManager.getHomepage().userClicksTheProductsButton();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        String expectedPageTitle = "Automation Exercise - All Products";
        String actualPageTitle = testContext.pageObjectManager.getProductsPage().userGetProductsPageTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);

    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
        boolean flag = testContext.pageObjectManager.getProductsPage().userGetProductsListVisible();
        Assert.assertTrue(flag);
    }

    @When("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {

        productId = Integer.parseInt(ConfigPropertyReader.getConfigPropertyValues("productId"));
        testContext.pageObjectManager.getProductsPage().userClicksTheViewProductForTheFirstProduct(productId);

    }

    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        String expectedCurrentProductUrl = "https://automationexercise.com/product_details/"+productId;
        String actualCurrentProductUrl = testContext.pageObjectManager.getProductsPage().userGetTheCurrentUrlForSelectedProduct();
        Assert.assertEquals(expectedCurrentProductUrl, actualCurrentProductUrl);
    }

    @Then("Verify that details are visible product name category price availability condition brand")
    public void verifyThatDetailsAreVisibleProductNameCategoryPriceAvailabilityConditionBrand() {

        boolean isProductNameVisible = testContext.pageObjectManager.getProductsPage().userChecksTheProductNameIsAvailable();
        boolean isProductCategoryVisible = testContext.pageObjectManager.getProductsPage().userChecksTheProductCategoryIsAvailable();
        boolean isProductPriceAvailable = testContext.pageObjectManager.getProductsPage().userChecksTheProductPriceIsAvailable();
        boolean isProductAvailabilityAvailable = testContext.pageObjectManager.getProductsPage().userChecksTheProductAvailabilityIsAvailable();
        boolean isProductConditionAvailable = testContext.pageObjectManager.getProductsPage().userChecksTheProductConditionIsAvailable();
        boolean isProductBrandAvailable = testContext.pageObjectManager.getProductsPage().userChecksTheProductBrandIsAvailable();

        Assert.assertTrue(isProductNameVisible);
        Assert.assertTrue(isProductCategoryVisible);
        Assert.assertTrue(isProductPriceAvailable);
        Assert.assertTrue(isProductAvailabilityAvailable);
        Assert.assertTrue(isProductConditionAvailable);
        Assert.assertTrue(isProductBrandAvailable);
    }

    @When("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
        testContext.pageObjectManager.productsPage.userEnterTheProductName();
        testContext.pageObjectManager.productsPage.userClickTheSearchButton();
    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(testContext.pageObjectManager.productsPage.userGetSearchedProductsText());
    }

    @Then("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        Assert.assertTrue(testContext.pageObjectManager.getHomepage().userVerifyTheSubscriptionText());
    }

    @When("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
        testContext.pageObjectManager.getHomepage().userEntersTheSubscriptionEmailAdress();
        testContext.pageObjectManager.getHomepage().userClicksTheSubscriptionArrowButton();
    }

    @Then("Verify success message You have been successfully subscribed is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertTrue(testContext.pageObjectManager.getHomepage().userVerifyTheSubscriptionSuccessMessageIsVisible());
    }

    @When("Click Cart button")
    public void clickCartButton() {
        testContext.pageObjectManager.getHomepage().userClicksTheCartButton();
    }

    @Then("Verify text SUBSCRIPTION in Cart Page")
    public void verifyTextSUBSCRIPTIONInCartPage() {
        Assert.assertTrue(testContext.pageObjectManager.getCartPage().userVerifyTheSubscriptionText());
    }

    @When("Enter email address in input and click arrow button in Cart Page")
    public void enterEmailAddressInInputAndClickArrowButtonInCartPage() {
        testContext.pageObjectManager.getCartPage().userEntersTheSubscriptionEmailAdress();
        testContext.pageObjectManager.getCartPage().userClicksTheSubscriptionArrowButton();
    }

    @Then("Verify success message You have been successfully subscribed is visible in Cart Page")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisibleInCartPage() {
        Assert.assertTrue(testContext.pageObjectManager.getCartPage().userVerifyTheSubscriptionSuccessMessageIsVisible());
    }

    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        testContext.pageObjectManager.getProductsPage().userHoverTheFirstProductAndClickAddToCart();
    }

    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        testContext.pageObjectManager.getProductsPage().userClickContinueShoppingButton();
    }

    @And("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        testContext.pageObjectManager.getProductsPage().userHoverTheSecondProductAndClickAddToCart();
    }

    @And("Click View Cart button")
    public void clickViewCartButton() {
        testContext.pageObjectManager.getProductsPage().userclicksTheViewCartButton();

    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        boolean flag = testContext.pageObjectManager.getProductsPage().userVerifyTheBothProductsAreAddedToCart();
        Assert.assertTrue(flag);
    }

    @Then("Verify their prices quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        boolean flag = testContext.pageObjectManager.getProductsPage().userVerifyTheirPricesQuantityAndTotalPrice();
        Assert.assertTrue(flag);
    }

    @When("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        testContext.pageObjectManager.getHomepage().userClicksTheViewProductButton();
    }

    @Then("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        String expectedPageTitle = "Automation Exercise - Product Details";
        String actualPageTitle = testContext.pageObjectManager.getProductDetailsPage().userVerifyTheProductDetailsPageTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }

    @When("Increase quantity")
    public void increaseQuantityTo() {
        int productQuantity;
        productQuantity = Integer.parseInt(ConfigPropertyReader.getConfigPropertyValues("productQuantity"));
        testContext.pageObjectManager.getProductDetailsPage().userIncreaseTheQuantity(productQuantity);
    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {
        testContext.pageObjectManager.getProductDetailsPage().userClicksTheAddToCartButton();
    }

    @And("Click View Cart button in Product Details Page")
    public void clickViewCartButtonInProductDetailsPage() {
        testContext.pageObjectManager.getProductDetailsPage().userClicksTheViewCartButton();
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        int expectedProductQuantity;
        int actualProductQuantity;
        expectedProductQuantity = Integer.parseInt(ConfigPropertyReader.getConfigPropertyValues("productQuantity"));
        actualProductQuantity = Integer.parseInt(testContext.pageObjectManager.getProductDetailsPage().userVerifyTheAddedQuantity());
        Assert.assertEquals(expectedProductQuantity, actualProductQuantity);
    }
}