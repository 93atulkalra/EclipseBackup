package extentreport;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtenentVersion2 implements IReporter{

	private ExtentReports extent;
	
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		
		extent = new ExtentReports(outputDirectory + File.separator
				+ "Extent.html", true);
		for (ISuite suite : suites) {
String suiteName = suite.getName();
			Map<String, ISuiteResult> result = suite.getResults();
		
			for (ISuiteResult r : result.values()) {
				ITestContext tc = r.getTestContext();
				System.out.println(
                        "Passed tests for suite '" + suiteName + "' is:" + tc.getPassedTests().getAllResults().size());
                System.out.println(
                        "Failed tests for suite '" + suiteName + "' is:" + tc.getFailedTests().getAllResults().size());
                System.out.println("Skipped tests for suite '" + suiteName + "' is:"
                        + tc.getSkippedTests().getAllResults().size());
			
			}
		
		
		
	}

	
	
													} // IReporter ends
	
}
// Class Ends
