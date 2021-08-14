package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDef {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        String username = ConfigurationReader.get("driver_username");
        String pasword = ConfigurationReader.get("driver_password");
        new LoginPage().login(username,pasword);

    }

    @Then("the user should able to login")
    public void the_user_should_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals("Dashboard",actualTitle);
    }

    @When("the user enters the {string} and {string}")
    public void theUserEntersTheAnd(String username, String password) {
        new LoginPage().login(username,password);
    }

    @When("the user logged in as {string}")
    public void theUserLoggedInAs(String userType) {
        String username,password;
        switch (userType){
            case "storeManager":
                username = ConfigurationReader.get("store_manager_username");
                password = ConfigurationReader.get("store_manager_password");
                break;
            case "driver":
                username = ConfigurationReader.get("driver_username");
                password = ConfigurationReader.get("driver_password");
                break;
            case "salesManager":
                username = ConfigurationReader.get("sales_manager_username");
                password = ConfigurationReader.get("sales_manager_password");
                break;
            default:
                username=null;
                password=null;
        }
        new LoginPage().login(username,password);
    }
}
