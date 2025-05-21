package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Main {
    public static ExtentReports extent;
    public static ExtentTest test;
    public static ExtentSparkReporter spark;
    public static ExtentSparkReporter spark1;

    public static void startReport() {
        spark = new ExtentSparkReporter("test-output/ExtentReport.html");

        spark1 = new ExtentSparkReporter("test-output/TestContent.html");

        extent = new ExtentReports();
        extent.attachReporter(spark,spark1);
    }

    public static void flushReport() {

        extent.flush();
    }
}
