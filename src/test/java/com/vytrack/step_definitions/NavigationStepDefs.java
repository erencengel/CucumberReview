package com.vytrack.step_definitions;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationStepDefs {

    @When("the user navigates to {string}, {string}")
    public void the_user_navigates_to(String tabName, String moduleName) {
        new DashBoardPage().navigateToModule(tabName,moduleName);
        BrowserUtils.waitFor(5);

    }

    @Then("the title should be {string}")
    public void theTitleShouldBe(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
