package com.vytrack.step_definitions;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactPageStepdefs {

    @Then("the user should see following options")
    public void theUserShouldSeeFollowingOptions(List<String> expectedList) {

        System.out.println("expectedList = " + expectedList);
        BrowserUtils.waitFor(2);

        List<String> actualList = BrowserUtils.getElementsText(new DashBoardPage().menuOptions);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList,actualList);
    }

    @Given("the user logs in using following credentials")
    public void theUserLogsInUsingFollowingCredentials(Map<String,String> userInfoMap){
       new LoginPage().login(userInfoMap.get("username"),userInfoMap.get("password"));

    }
}
