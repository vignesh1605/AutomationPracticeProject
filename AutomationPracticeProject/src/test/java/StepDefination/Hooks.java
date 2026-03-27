package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.TestContext;

public class Hooks {

    private TestContext testContext;

    public Hooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void setUp() {
        testContext.initializeDriver();  // Driver starts here
    }

    @After
    public void tearDown() {
        testContext.quitDriver();  // Driver closes here
    }

}
