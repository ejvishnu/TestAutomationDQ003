package org.stepdef;

import org.junit.Assert;
import org.testng.annotations.Test;

public class B {

    @Test
    public void test1() {
        System.out.println("test1 triggered");
        Assert.fail();
    }

    @Test
    public void test2() {

        System.out.println("test2 triggered");
    }



}
