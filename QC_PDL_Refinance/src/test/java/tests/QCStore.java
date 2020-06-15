package tests;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;*/

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//This  is an executable class file.(Execution starts from here)
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class QCStore {

	public static WebDriverWait wait;
	public static WebDriver driver;
	public static WebDriver driver1;
	String appUrl;
	String timestamp = new SimpleDateFormat("MM.dd.yyyy.HH.mm.ss").format(new Date());

	public static Properties prop;
	public static Properties Jprop;
	public static Properties Rprop;
	public static Properties Aprop;
	public static Properties Vprop;
	public static String loan_number;
	public static ExtentReports reports;
	public static ExtentReports Breports;
	public static ExtentReports Jreports;
	public static ExtentReports Rreports;
	public static ExtentReports Areports;
	public static ExtentTest test;
	// public static ExtentReports reports;
	// public static ExtentTest test;
	// static ExtentHtmlReporter htmlReporter;
	// static ExtentReports extent;
	public static String Eankey = null;
	public static String encryption_store_no = null;
	public static String encryption_transaction_nbr = null;
	public static String FileName;
	public static ExcelNew TestData;

	public static String loan_nbr;
	public static String NextDueDate;
	public static String AppURL = "https://qclocalreg.qfund.net/cc/demoIndex.do";
	public static String business_date;
	public static String No_of_Installments;
	public static String transaction_date;

	public static String ESign_CheckNbr;
	public static String Password;
	public static String ESign_CollateralType;
	public static String appdate;
	public static String Date1;
	public static String Date2;
	public static String Date3;
	public static String customer_number;

	public static String Drawer_OverShort_Amount;

	public static String Due_Date1;
	public static String Due_Date2;
	public static String Due_Date3;
	public static String passwrd;
	public static String FirstName;

	public static String AdminURL;

	public static String csr_url;
	public static String csrloginpage;

	
	
//========================  RATIKANTA PDL Refinance Scenarios  ====================================================

	 // ---------------- SemiMonthly Scenarios With 1 Payments ----------------

     @Test(priority = 1, groups = "Ratikanta_PDL_Semimonthly")
     public static void QC_PDL_Refinance_Semimonthly_StepDown1_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("QC_PDL_Refinance_Semimonthly_StepDown1"),

						
			    "CSR Login->Borrower Registration(Change Frequency to Monthly & Select the day as 21st)->New Loan(With Provided Loan Amount)->AgeStore 15 Grace days-->Payment-->Age Store Grace days-->Edit Borrower(To Semimonthly & Next Pay Day is 16th day)-->Refinance");
				String FileName = "QC_PDL_Refinance_Semimonthly_StepDown1_Txn_Testdata.xls";
				                 
				
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ Rprop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					
					if (RunFlag.equals("Y")) {
						
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);

						System.out.println(AppURL);
						
						QCCSRLoginLogout.adminLogin(SSN, SSN);						
						RAdminStoreDate.toStartdate_SemiMonthly(SSN, AppURL);										
						QCCSRLoginLogout.adminLogout(driver, SSN, SSN);
						RProcTest.proc();
						Thread.sleep(8000);

						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRNewLoan.newLoan(SSN, AppURL);						
						RQCCSRLoginLogout.logout(SSN, AppURL);												
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
			            RQCAgeStoreGraceDays.ageStoreGraceDays2ndTime(SSN, AppURL);
			            
			            RQCCSRLoginLogout.login(SSN, AppURL);
						QC_Edit_BorrowRegestration.editborrower_saveexit(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPDLSemimonthlyRefinance.StepDown1(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);												           
											
						/*RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRHistory.history(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);*/
						

					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_PDL_Refinance_Semimonthly_StepDown1_Txn");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.ERROR, "Unable to start scenarios ");

			}
		}	
 
    @Test(priority = 2, groups = "Ratikanta_PDL_Semimonthly")
	public static void QC_PDL_Refinance_Semimonthly_StepDown2_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_PDL_Refinance_Semimonthly_StepDown2"),

					
		    "CSR Login->Borrower Registration(Change Frequency to Monthly & Select the day as 21st)->New Loan(With Provided Loan Amount)->AgeStore 15 Grace days-->Payment-->Age Store Grace days-->Edit Borrower(To Semimonthly & Next Pay Day is 16th day)-->Refinance");
			String FileName = "QC_PDL_Refinance_Semimonthly_StepDown2_Txn_Testdata.xls";
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ Rprop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);
					
					QCCSRLoginLogout.adminLogin(SSN, SSN);						
					RAdminStoreDate.toStartdate_SemiMonthly(SSN, AppURL);										
					QCCSRLoginLogout.adminLogout(driver, SSN, SSN);
					RProcTest.proc();
					Thread.sleep(8000);

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);												
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCPayment.payment(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
		            RQCAgeStoreGraceDays.ageStoreGraceDays2ndTime(SSN, AppURL);
		            
		            RQCCSRLoginLogout.login(SSN, AppURL);
					QC_Edit_BorrowRegestration.editborrower_saveexit(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCPDLSemimonthlyRefinance.StepDown1(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);												           
										
					/*RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRHistory.history(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);*/
					

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_PDL_Refinance_Semimonthly_StepDown2_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");

		}
	}	 

    // ------------------------ Monthly Scenarios ----------------------
    
    @Test(priority = 3, groups = "Ratikanta_PDL_Monthly")
	public static void QC_PDL_Refinance_Monthly_StepSame_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_PDL_Refinance_Monthly_StepSame"),

					
		    "CSR Login->Borrower Registration->New Loan(With Provided Loan Amount)->AgeStore 28 Grace days-->Payment-->Age Store Grace days-->Refinance");
			String FileName = "QC_PDL_Refinance_Monthly_StepSame_Txn_Testdata.xls";
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ Rprop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);
					
					QCCSRLoginLogout.adminLogin(SSN, SSN);						
					RAdminStoreDate.toStartdate_MonthlyBiweekly(SSN, AppURL);									
					QCCSRLoginLogout.adminLogout(driver, SSN, SSN);
					RProcTest.proc();
					Thread.sleep(8000);

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);												
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					    //RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCPayment.payment(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
		            RQCAgeStoreGraceDays.ageStoreGraceDays2ndTime(SSN, AppURL);		            						          
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					   //RQCPDLSemimonthlyRefinance.StepSame(SSN, AppURL);
					RQCPDLMonthlyRefinance.StepSame(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);												           
										
					/*RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRHistory.history(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);*/
					

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_PDL_Refinance_Monthly_StepSame_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");

		}
	}	 
 
    @Test(priority = 4, groups = "Ratikanta_PDL_Monthly")
	public static void QC_PDL_Refinance_Monthly_StepDown_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_PDL_Refinance_Monthly_StepDown"),

					
		    "CSR Login->Borrower Registration->New Loan(With Provided Loan Amount)->AgeStore 28 Grace days-->Payment-->Age Store Grace days-->Refinance");
			String FileName = "QC_PDL_Refinance_Monthly_StepDown_Txn_Testdata.xls";
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ Rprop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);
					
					QCCSRLoginLogout.adminLogin(SSN, SSN);						
					RAdminStoreDate.toStartdate_MonthlyBiweekly(SSN, AppURL);									
					QCCSRLoginLogout.adminLogout(driver, SSN, SSN);
					RProcTest.proc();
					Thread.sleep(8000);

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);												
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCPayment.payment(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
		            RQCAgeStoreGraceDays.ageStoreGraceDays2ndTime(SSN, AppURL);		            						          
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					    //RQCPDLSemimonthlyRefinance.StepDown(SSN, AppURL);
					RQCPDLMonthlyRefinance.StepDown(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);												           
										
					/*RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRHistory.history(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);*/
					

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_PDL_Refinance_Monthly_StepDown_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");

		}
	}	
    
    // ------------------------ Bi-Weekly Scenarios ----------------------
 
    @Test(priority = 5, groups = "Ratikanta_PDL_Biweekly")
	public static void QC_PDL_Refinance_BiWeekly_StepSame_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_PDL_Refinance_BiWeekly_StepSame"),

					
		    "CSR Login->Borrower Registration->New Loan(With Provided Loan Amount)->AgeStore Grace days-->Payment-->Age Store Grace days-->Refinance");
			String FileName = "QC_PDL_Refinance_BiWeekly_StepSame_Txn_Testdata.xls";
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ Rprop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);
					
					QCCSRLoginLogout.adminLogin(SSN, SSN);						
					RAdminStoreDate.toStartdate_MonthlyBiweekly(SSN, AppURL);									
					QCCSRLoginLogout.adminLogout(driver, SSN, SSN);
					RProcTest.proc();
					Thread.sleep(8000);

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);												
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCPayment.payment(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
		            RQCAgeStoreGraceDays.ageStoreGraceDays2ndTime(SSN, AppURL);			            	           
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					  //RQCPDLSemimonthlyRefinance.StepSame(SSN, AppURL);
					RQCPDLBiWeeklyRefinance.StepSame(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);												           
										
					/*RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRHistory.history(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);*/
					

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_PDL_Refinance_Monthly_StepDown_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");

		}
	}	  
 
    @Test(priority = 6, groups = "Ratikanta_PDL_Biweekly")
	public static void QC_PDL_Refinance_BiWeekly_StepDown_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_PDL_Refinance_BiWeekly_StepDown"),

					
		    "CSR Login->Borrower Registration->New Loan(With Provided Loan Amount)->AgeStore Grace days-->Payment-->Age Store Grace days-->Refinance");
			String FileName = "QC_PDL_Refinance_BiWeekly_StepDown_Txn_Testdata.xls";
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ Rprop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);
					
					QCCSRLoginLogout.adminLogin(SSN, SSN);						
					RAdminStoreDate.toStartdate_MonthlyBiweekly(SSN, AppURL);										
					QCCSRLoginLogout.adminLogout(driver, SSN, SSN);
					RProcTest.proc();
					Thread.sleep(8000);

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);												
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCPayment.payment(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
		            RQCAgeStoreGraceDays.ageStoreGraceDays2ndTime(SSN, AppURL);			            	           
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					  //RQCPDLSemimonthlyRefinance.StepSame(SSN, AppURL);
					RQCPDLBiWeeklyRefinance.StepDown(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);												           
										
					/*RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRHistory.history(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);*/
					

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_PDL_Refinance_Monthly_StepDown_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");

		}
	}	  

    // ------------------------ Weekly Scenarios ----------------------

	@Test(priority = 7, groups = "Ratikanta_PDL_Weekly")
	public static void QC_PDL_Refinance_Weekly_StepDown1_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_PDL_Refinance_Weekly_StepDown1"),

					
		    "CSR Login->Borrower Registration(Change Frequency to Monthly & Select the day as 21st)->New Loan(With Provided Loan Amount)->AgeStore 15 Grace days-->Payment-->Age Store Grace days-->Edit Borrower(To Semimonthly & Next Pay Day is 16th day)-->Refinance");
			String FileName = "QC_PDL_Refinance_Weekly_StepDown1_Txn_Testdata.xls";
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ Rprop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);
					
			/*		QCCSRLoginLogout.adminLogin(SSN, SSN);						
					RAdminStoreDate.toStartdate_Weekly(SSN, AppURL);										
					QCCSRLoginLogout.adminLogout(driver, SSN, SSN);
					RProcTest.proc();
					Thread.sleep(8000);

					RQCCSRLoginLogout.login(SSN, AppURL);					
					RQCWeeklyBorrowerRegestration.weeklyborrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);												
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					          //RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);					       
					RQCDepositDropdown.depositDropDown(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);*/
					
					         //RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRReturnPosting.returnposting(SSN, AppURL);									
				  //RQCAdminACHReturn.achreturn(SSN, AppURL);
					
					
					
					
					
					
					
					
					
					
					
					/*RQCCSRLoginLogout.login(SSN, AppURL);
		            RQCAgeStoreGraceDays.ageStoreGraceDays2ndTime(SSN, AppURL);
		            
		            RQCCSRLoginLogout.login(SSN, AppURL);
					QC_Edit_BorrowRegestration.editborrower_saveexit(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCPDLSemimonthlyRefinance.StepDown1(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);	*/											           
										
					/*RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRHistory.history(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);*/
					

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_PDL_Refinance_Weekly_StepDown1_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");

		}
	}	
	
	
//====================================================================================================================================================================	 
 // @Test(priority = 2, groups = "Ratikanta_ILP_Semimonthly")
		public static void QC_3Payments_Refinance_Semimonthly_StepUp_LoanAmt_Edit_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("QC_3Payments_Refinance_Semimonthly_StepUp_LoanAmt_Edit"),

						
			"Login->Borrower Registration->New Loan->AgeStore 3 Grace days-->Payment-->NewLoan(with provided amt)-->Grace days-->Payment-->Grace days-->Payment-->Grace days-->Payment-->Edit Borrower(Semimonthly)-->Refinance");
				String FileName = "QC_3Payments_Refinance_Semimonthly_StepUp_LoanAmt_Edit_Txn_Testdata.xls";
				// String FileName=
				// Rprop.getProperty("QC_DefaultPayment_Txn_Testdata_Scenario")+".xls";
				// ExcelNew TestData;
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ Rprop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				// test=reports.startTest("Lend Nation Smoke_testing","Lend Nation
				// Application test report");

				// String FileName= "Registration_Lend_Nation.xls";
				// Excel TestData = new
				// ExcelNew(System.getProperty("user.dir")+"/TestData/LendNation/"+FileName);
				// int lastrow=TestData.getLastRow("Start");
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				// int lastrow=TestData.getLastRow("Borrower");
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					// System.out.println(RunFlag);
					if (RunFlag.equals("Y")) {
						// driver.get(appUrl);
						// test.log(LogStatus.INFO, "Application is launched");
						// driver.manage().window().maximize();
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);

						System.out.println(AppURL);
						
						/*QCCSRLoginLogout.adminLogin(SSN, SSN);						
						RAdminStoreDate.toStartdate(SSN, AppURL);										
						QCCSRLoginLogout.adminLogout(driver, SSN, SSN);
						RProcTest.proc();
						Thread.sleep(8000);*/

						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRNewLoan.newLoan(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRNewLoan2.newLoan2(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCAgeStoreGraceDays.ageStoreGraceDays2ndTime(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment1(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCAgeStoreGraceDays.ageStoreGraceDays3rdTime(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment2(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCAgeStoreGraceDays.ageStoreGraceDays4thTime(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment3(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						QC_Edit_BorrowRegestration.editborrower_saveexit(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						//RQCSemiMonthlyRefinance.StepUp_LoanAmt_Edit(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						/*RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRHistory.history(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);*/
						

					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_3Payments_Refinance_Semimonthly_StepUp_LoanAmt_Edit_Txn");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.ERROR, "Unable to start scenarios ");

			}
		}	
		
  //@Test(priority = 3, groups = "Ratikanta_ILP_Semimonthly")
		public static void QC_3Payments_Refinance_Semimonthly_StepUp_NoCashout_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("QC_3Payments_Refinance_Semimonthly_StepUp_NoCashout"),

						
			"Login->Borrower Registration->New Loan->AgeStore 3 Grace days-->Payment-->NewLoan(with provided amt)-->Grace days-->Payment-->Grace days-->Payment-->Grace days-->Payment-->Edit Borrower(Semimonthly)-->Refinance");
				String FileName = "QC_3Payments_Refinance_Semimonthly_StepUp_NoCashout_Txn_Testdata.xls";
				// String FileName=
				// Rprop.getProperty("QC_DefaultPayment_Txn_Testdata_Scenario")+".xls";
				// ExcelNew TestData;
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ Rprop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				// test=reports.startTest("Lend Nation Smoke_testing","Lend Nation
				// Application test report");

				// String FileName= "Registration_Lend_Nation.xls";
				// Excel TestData = new
				// ExcelNew(System.getProperty("user.dir")+"/TestData/LendNation/"+FileName);
				// int lastrow=TestData.getLastRow("Start");
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				// int lastrow=TestData.getLastRow("Borrower");
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					// System.out.println(RunFlag);
					if (RunFlag.equals("Y")) {
						// driver.get(appUrl);
						// test.log(LogStatus.INFO, "Application is launched");
						// driver.manage().window().maximize();
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);

						System.out.println(AppURL);
						
						/*QCCSRLoginLogout.adminLogin(SSN, SSN);						
						RAdminStoreDate.toStartdate(SSN, AppURL);										
						QCCSRLoginLogout.adminLogout(driver, SSN, SSN);
						RProcTest.proc();
						Thread.sleep(8000);*/

						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRNewLoan.newLoan(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRNewLoan2.newLoan2(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCAgeStoreGraceDays.ageStoreGraceDays2ndTime(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment1(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCAgeStoreGraceDays.ageStoreGraceDays3rdTime(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment2(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCAgeStoreGraceDays.ageStoreGraceDays4thTime(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment3(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						QC_Edit_BorrowRegestration.editborrower_saveexit(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						/*RQCCSRLoginLogout.login(SSN, AppURL);
						RQCSemiMonthlyRefinance.StepUp_CashOut_No(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);*/
						
						/*RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRHistory.history(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);*/
						

					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_3Payments_Refinance_Semimonthly_StepUp_NoCashout_Txn");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.ERROR, "Unable to start scenarios ");

			}
		}	 
		
		// ----------------Weekly Scenarios With 3 Payments-----------------
		
	 
 
//============================================================================================================
	


	@BeforeClass(alwaysRun = true)
	public void setup() throws IOException {

		try {

			BufferedReader reader;
			BufferedReader Jreader;
			BufferedReader Rreader;
			BufferedReader Areader;
			BufferedReader Vreader;

			

			try {
				Rreader = new BufferedReader(

						new FileReader("C:/QC_Batch_LocReg/QC_PDL_Refinance/src/test/java/tests/RObjects.properties"));

				Rprop = new Properties();
				Rprop.load(Rreader);
				Rreader.close();
				csr_url = Rprop.getProperty("CSR_URL");
				csrloginpage = Rprop.getProperty("Login_Page");
				AdminURL = Rprop.getProperty("ADMIN_CSR_URL");
				
				
				String Rfilename = Rprop.getProperty("QC_Store_extent_report_file_name") + timestamp + ".html";

				reports = new ExtentReports(
						System.getProperty("user.dir") + Rprop.getProperty("QC_Store_extent_report_path") + Rfilename,
						true);

			}

			catch (Exception e) {

				System.out.println("Object proprties file not found");
			}

		

			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/IEDriverServer.exe");

		}

		catch (Exception e) {

			test.log(LogStatus.ERROR, "Unable to setup for the QC Store ");

		}

	}

	@BeforeMethod(alwaysRun = true)

	public void killProcess() throws Exception {

		try {

			//Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");

			Thread.sleep(5000); // Allow OS to kill the process
			System.out.println("killed the process PDL scenarios");
			// break;

		} catch (Exception e) {
			// break;
			// continue;
		}
	}

	public static String getScreenhot(WebDriver driver, String screenshotName) throws Exception {
		String dateName = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());

		File source = ((TakesScreenshot) (driver)).getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "/ExecutionReports/QCStore/PDL/FailedTestsScreenshots/"
				+ screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	@AfterMethod(alwaysRun = true)

	public void getResult(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			// test.log(LogStatus.FAIL, "Test Case Failed is
			// "+result.getThrowable());

			String screenshotPath = getScreenhot(driver, result.getName());
			// To add it in the extent report
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(LogStatus.PASS, result.getName() + " Test Case is Passed");
		}
		reports.flush();
		driver.quit();

	}

	@AfterMethod(alwaysRun = true)

	public void endReport() {

		// reports.endTest(test);
		// reports.flush();

		// driver.quit();
		// extent.flush();

	}

	public static By locator(String obj) {

		String loctype = null;
		String locname = null;
		By locator = null;
		String[] locobj = obj.split("%%");
		loctype = locobj[0];
		locname = locobj[1];
		

		if (loctype.equalsIgnoreCase("id"))
			return locator = By.id(locname);
		else if (loctype.equalsIgnoreCase("name"))
			return locator = By.name(locname);
		else if (loctype.equalsIgnoreCase("linkText"))
			return locator = By.linkText(locname);
		else if (loctype.equalsIgnoreCase("partialLinkText"))
			return locator = By.partialLinkText(locname);
		else if (loctype.equalsIgnoreCase("xpath"))
			return locator = By.xpath(locname);
		else if (loctype.equalsIgnoreCase("cssSelector"))
			return locator = By.cssSelector(locname);
		return locator;

		// System.out.println(locator);
		// return locator;

	}

}
