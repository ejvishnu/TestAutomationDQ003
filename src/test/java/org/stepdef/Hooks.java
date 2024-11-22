package org.stepdef;

import io.cucumber.java.*;

public class Hooks {



    @BeforeAll
    public static void featureCheckIn()
    {
     System.out.println("featureCheckIn");
    }

    @Before
    public static void scenarioCheckIn()
    {
        System.out.println("scenarioCheckIn");
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
        System.out.println("featureCheckOut");
    }

}
