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

public class ExtentReportListenClass  implements IReporter {
	
	private ExtentReports extent;

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		
		extent = new ExtentReports(outputDirectory + File.separator
				+ "Extent.html", true);
		
		// For adding this report in test-out folder
		// Name of the report can be modified and Extent.html in this code
	
		// Running for-each loop because your frame work can have multiple suites
		
		for (ISuite suite : suites) 
		
		{
			
			// This string variable with SuiteName would have the name of the suite one by one ( in case of multiple suites)
			
			String suiteName = suite.getName();
			
// Map String-IsuiteResult having suite name as first parameter and IsuiteResult interface containing all the results of the suite
			//This  represents the result of a suite run
			Map<String, ISuiteResult> result = suite.getResults();

			

			for (ISuiteResult r : result.values()) {
			
				
				ITestContext context = r.getTestContext();

			// ITestContext have values for all the cases failed , passed and skipped and it need separation 
				// and returns IResultMap interface
				
			//		IResultMap failedcases = context.getPassedTests();
			//	IResultMap tests = context.getPassedTests();
			//	LogStatus status = LogStatus.PASS;  	

// Specifies the log status of the log-event and is Enum

			
				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(),LogStatus.SKIP);
			}
		}

		extent.flush();   // This need to flush and closed in order to report to work
		extent.close();
		
		
	}
	
	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extent.startTest(result.getMethod().getMethodName());
				System.out.println(result.getMethod().getMethodName());
			//	test.setStartedTime(getTime(result.getStartMillis()));
				//test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
				} else {
					test.log(status, "Test " + status.toString().toLowerCase()
							+ "ed");
				}

				extent.endTest(test);
			}
		}
	}
	
	
/*	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
	
	*/
	
	
}
