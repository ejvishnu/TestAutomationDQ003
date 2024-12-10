package org.stepdef;

import org.testng.annotations.Test;

public class Test2 {

    @Test(dataProvider = "testData", dataProviderClass = Test1.class)
    public void testExternalData(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
