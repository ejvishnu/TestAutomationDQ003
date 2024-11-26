package org.stepdef;


import io.cucumber.java.*;
import org.utils.ReportingManager;

public class Hooks {


    @BeforeAll
    public static void featureCheckIn() {
        System.out.println("featureIn");
        ReportingManager.intializeReport();
    }

    @BeforeStep
    public static void stepCheckIn() {
        System.out.println("stepCheckIn");
    }

    @AfterStep
    public static void stepCheckOut() {
        System.out.println("stepCheckOut");
    }

    @After
    public static void scenarioCheckOut() {
        System.out.println("scenarioCheckOut");
    }

    @AfterAll
    public static void featureCheckOut() {
        ReportingManager.flushReport();
    }

    @Before
    public void scenarioCheckIn(Scenario scenario) {
        String scenarioName = scenario.getName();
        ReportingManager.extent.createTest(scenarioName);
    }

}
