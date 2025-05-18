package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Main {
    public static ExtentReports extent;
    public static ExtentTest test;
    public  static ExtentReports exten1;
    public static void startReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
        ExtentSparkReporter spark1 = new ExtentSparkReporter("test-output/TestContent.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        exten1 = new ExtentReports();
        exten1.attachReporter(spark1);
    }

    public static void flushReport() {
        extent.flush();
    }
    public static void runReport()
    {

        exten1.flush();

    }


}
