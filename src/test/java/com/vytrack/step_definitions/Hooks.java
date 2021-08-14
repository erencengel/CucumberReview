package com.vytrack.step_definitions;


import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

   @Before
    public void setUp(){
       System.out.println("Running @Before Code");
       Driver.get().manage().window().maximize();
       Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   }

   @After
    public void tearDown(Scenario scenario){
       if(scenario.isFailed()){
           final byte[]screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
           scenario.attach(screenshot,"image/png",scenario.getName()+ "_screenshot");
       }
       System.out.println("Running @After Code");
       Driver.closeDriver();
   }

    @Before("@calculator")
    public void setUpCalculator(){
        System.out.println("Running @Before Code only for @calculator tag");
    }

    @After("@calculator")
    public void tearDownCalculator(){
        System.out.println("Running @After Code only for @calculator tag");
    }

}
