
package com.tests.Managers;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = createInstance("target/extent-report.html");
        }
        return extent;
    }

    private static ExtentReports createInstance(String fileName) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setDocumentTitle("Emids Automation Test Report");
        htmlReporter.config().setReportName("Emids Automation Test Report");
        htmlReporter.config().setTheme(Theme.STANDARD);
        //extent.setSystemInfo("Environment", "QA");
        //extent.setSystemInfo("Browser", "Chrome");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return extent;
    }
}

