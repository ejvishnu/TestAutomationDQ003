package org.stepdef;


import io.cucumber.java.*;
import org.utils.ReportingManager;

public class Hooks {

Scenario scenario;

    @BeforeAll
    public static void featureCheckIn()
    {
     ReportingManager.intializeReport();
    }

    @Before
    public void scenarioCheckIn(Scenario scenario)
    {
        String scenarioName = scenario.getName();
    }

    @BeforeStep
    public static void stepCheckIn()
    {
        System.out.println("stepCheckIn");
    }

    @AfterStep
    public static void stepCheckOut()
    {
        System.out.println("stepCheckOut");
    }




    @After
    public static void scenarioCheckOut()
    {
        System.out.println("scenarioCheckOut");
    }

    @AfterAll
    public static void featureCheckOut()
    {
       ReportingManager.flushReport();
    }

}
