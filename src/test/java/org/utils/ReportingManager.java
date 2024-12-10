package org.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.Test;

public class ReportingManager {


    public static ExtentReports extent;
    public static ExtentSparkReporter spark;


    public static void intializeReport() {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter("src/test/java/org/Reports/Spark.html");
        extent.attachReporter(spark);
    }

    public static void flushReport() {
        extent.flush();
    }

    @Test
    public void dummy() {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("src/test/java/org/Reports/Spark.html");
        extent.attachReporter(spark);

        extent.flush();
    }
}
