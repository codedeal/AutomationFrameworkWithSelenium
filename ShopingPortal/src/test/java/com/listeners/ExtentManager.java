package com.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager 
{
	 private static ExtentReports extent;
	static // initialize the HtmlReporter
	   ExtentHtmlReporter htmlReporter;
	    public synchronized static ExtentReports getReporter() {
	        if (extent == null) {
	            //Set HTML reporting file location
	        	
	            String workingDir = System.getProperty("user.dir");
	            if (System.getProperty("os.name").toLowerCase().contains("win")) {
	            	htmlReporter = new ExtentHtmlReporter(workingDir + "\\ExtentReports\\ExtentReportResults.html");
	                extent = new ExtentReports();
	            }
	            else if (System.getProperty("os.name").toLowerCase().contains("mac")) 
	            {  
	            	htmlReporter = new ExtentHtmlReporter(workingDir + "\\ExtentReports\\ExtentReportResults.html");
	                extent = new ExtentReports();
	               
	            }
	        }
	        extent.attachReporter(htmlReporter);
	        return extent;
	    }

}
