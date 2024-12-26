package org.stepdef;


import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.*;
import org.utils.ReportingManager;

public class Hooks {

    public static ExtentTest test;
    @BeforeAll
    public static void featureCheckIn() {
        System.out.println("featureIn");
        ReportingManager.intializeReport();
    }

    String scenarioName;

    @AfterStep
    public static void stepCheckOut() {
        System.out.println("stepCheckOut");
    }

    @BeforeStep
    public static void stepCheckIn() {


    }

    @After
    public void scenarioCheckOut(Scenario scenario) {
        if (scenario.isFailed()) {


            //screenshot
        }
    }

    @AfterAll
    public static void featureCheckOut() {
        ReportingManager.flushReport();
    }

    @Before
    public void scenarioCheckIn(Scenario scenario) {
        scenarioName = scenario.getName();
        test = ReportingManager.extent.createTest(scenarioName);
    }

}
