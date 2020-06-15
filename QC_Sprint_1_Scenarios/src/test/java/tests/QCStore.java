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
	public static String username;
	public static String password;
	public static String store_id;
	public static String DBUserName;
	public static String DBPassword;
	public static String Eankey = null;
	public static String encryption_store_no = null;
	public static String encryption_transaction_nbr = null;
	public static String adjint_transnum = null;
	
	public static String FileName;

	public static ExcelNew TestData;
	public static String LOCamount;
	public static String Statementdate;
	public static String currentdate;
	
	
	public static String loan_nbr;
	public static String Updated_Adjusted_Amount;
	
	
	
	public static String key;
	public static String NextDueDate;
	public static String Payment_date;
	
	
	public static String AppURL = "https://qclocalreg.qfund.net/cc/demoIndex.do";
	public static String business_date;

	public static String Duedate_confirm_text3;
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
	
	//public static String Tran_Nbr;
	
	
	//================================  RATIKANTA  Sprint Scenarios  ====================================================
	
	
	
	//************************************  Requirment 564  ****************************************
	
	//============================= Store Used : 1259 (05/02/2018) =================================
	
	
	@Test(priority = 1, groups = "Ratikanta_Sprint1_REQ_564")

	public static void QC_Sprint_B20_151_1_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("QC_Sprint1_B20_151_1"),															    
				"Borrower Registration-->Loan-->Default->Collection-->Select Product-->Search For the Customer-->Got to Adjust Interest Button-->Verify Adjust Interest Button Available");
				
				
				String FileName = "QC_Sprint_B20_151_1_Txn_Testdata.xls";
				                 
				
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					
					if (RunFlag.equals("Y")) {
						
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);

						System.out.println(csr_url);	
						
						/*RProcTest.proc();						
						Thread.sleep(2000);*/								

						QCCSRLoginLogout.login(SSN, AppURL);
						QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);				
						QCCSRNewLoan.newLoan(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);							      
						QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QCDefault.defaultchk(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);						
						QC_Sprint_Adjust_Interestbutton_Verification.adjust_interest_verification(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);					
							
					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_151_1_Txn");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.FAIL, "QC_Sprint_B20_151_1 Transaction Failed ");			
			
			}
		}
	@Test(priority = 2, groups = "Ratikanta_Sprint1_REQ_564")

	public static void QC_Sprint_B20_151_2_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("QC_Sprint1_B20_151_2"),															    
						"Borrower Registration-->Loan-->Default->Collection-->Select Product-->Search For the Customer-->Click On AdjustInterest Button-->Update adjust interest amount-->Verify adjust interest amount in History Screen");
				
				
				String FileName = "QC_Sprint_B20_151_2_Txn_Testdata.xls";
				                 
				
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					
					if (RunFlag.equals("Y")) {
						
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);

						System.out.println(csr_url);	
						
						/*RProcTest.proc();						
						Thread.sleep(2000);*/								

						QCCSRLoginLogout.login(SSN, AppURL);
						QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);				
						QCCSRNewLoan.newLoan(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);							      
						QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QCDefault.defaultchk(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);						
						QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_verification(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);	
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QC_Adjust_Interest_Amount_HistoryVerification.adjamount_verfication(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);
							
					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_151_2_Txn");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.FAIL, "QC_Sprint_B20_151_2 Transaction Failed ");			
			
			}
		}
	
	@Test(priority = 3, groups = "Ratikanta_Sprint1_REQ_564")

	public static void QC_Sprint_B20_151_3_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("QC_Sprint1_B20_151_3"),															    
						"Borrower Registration-->Loan-->Default->Collection-->Select Product-->Search For the Customer-->Click On AdjustInterest Button-->Update adjust interest amount-->Login Central Store_2997-->Verify adjust interest amount in History Screen");
				
				
				String FileName = "QC_Sprint_B20_151_3_Txn_Testdata.xls";
				                 
				
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					
					if (RunFlag.equals("Y")) {
						
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);

						System.out.println(csr_url);	
						
						/*RProcTest.proc();						
						Thread.sleep(2000);*/								

						QCCSRLoginLogout.login(SSN, AppURL);
						QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);				
						QCCSRNewLoan.newLoan(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);							      
						QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QCDefault.defaultchk(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);						
						QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_verification(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);	
						
						CentralStore_Login_Logout.login(SSN, AppURL);
						QC_Adjust_Interest_Amount_HistoryVerification.adjamount_verfication(SSN, AppURL);
						CentralStore_Login_Logout.logout(SSN, AppURL);
							
					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_151_3_Txn");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.FAIL, "QC_Sprint_B20_151_3 Transaction Failed ");			
			
			}
		}
	
	@Test(priority = 4, groups = "Ratikanta_Sprint1_REQ_564")

		public static void QC_Sprint_B20_151_4_Txn_Testdata() throws Exception {
				try {
					test = reports.startTest(("QC_Sprint1_B20_151_4"),															    
					"Borrower Registration-->Loan-->Default->Collection-->Select Product-->Search For the Customer-->Verify Adjust Interest Void Button Available-->Increase Adjust Interest Amount-->Go To Central Store History To Verify Adjust Amount Increased Or Not");
					
					
					String FileName = "QC_Sprint_B20_151_4_Txn_Testdata.xls";
					                 
					
					TestData = new ExcelNew(System.getProperty("user.dir")
							+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

					
					int lastrow = TestData.getLastRow("Start");
					String sheetName = "Start";
					
					System.out.println(lastrow);
					for (int row = 2; row <= lastrow; row++) {

						String RunFlag = TestData.getCellData(sheetName, "Run", row);
						
						if (RunFlag.equals("Y")) {
							
							String AppURL = TestData.getCellData(sheetName, "AppURL", row);
							String SSN = TestData.getCellData(sheetName, "SSN", row);

							System.out.println(csr_url);	
							
							/*RProcTest.proc();						
							Thread.sleep(2000);*/								

							QCCSRLoginLogout.login(SSN, AppURL);
							QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
							QCCSRLoginLogout.logout(SSN, AppURL);
							
							QCCSRLoginLogout.login(SSN, AppURL);				
							QCCSRNewLoan.newLoan(SSN, AppURL);
							QCCSRLoginLogout.logout(SSN, AppURL);
							
							QCCSRLoginLogout.login(SSN, AppURL);							      
							QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
							
							QCCSRLoginLogout.login(SSN, AppURL);
							QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
							
							QCCSRLoginLogout.login(SSN, AppURL);
							QCDefault.defaultchk(SSN, AppURL);
							
							QCCSRLoginLogout.login(SSN, AppURL);						
							QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
							QCCSRLoginLogout.logout(SSN, AppURL);	
							
							CentralStore_Login_Logout.login(SSN, AppURL);
							QC_Adjust_Interest_Amount_HistoryVerification.increased_adjamount_verfication(SSN, AppURL);
							CentralStore_Login_Logout.logout(SSN, AppURL);			
								
						}
					}
				}

				catch (Exception e) {
					System.out.println("under catch of Test" + e);
					String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_151_4_Txn");
					test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
					test.log(LogStatus.FAIL, "QC_Sprint_B20_151_4 Transaction Failed ");			
				
				}
			}
	@Test(priority = 5, groups = "Ratikanta_Sprint1_REQ_564")

		public static void QC_Sprint_B20_151_5_Txn_Testdata() throws Exception {
				try {
					test = reports.startTest(("QC_Sprint1_B20_151_5"),															    
					"Borrower Registration-->Loan-->Default->Collection-->Select Product-->Search For the Customer-->Verify Adjust Interest Void Button Available-->Increase Adjust Interest Amount-->Go To Store History To Verify Adjust Amount Increased Or Not");
					
					
					String FileName = "QC_Sprint_B20_151_5_Txn_Testdata.xls";
					                 
					
					TestData = new ExcelNew(System.getProperty("user.dir")
							+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

					
					int lastrow = TestData.getLastRow("Start");
					String sheetName = "Start";
					
					System.out.println(lastrow);
					for (int row = 2; row <= lastrow; row++) {

						String RunFlag = TestData.getCellData(sheetName, "Run", row);
						
						if (RunFlag.equals("Y")) {
							
							String AppURL = TestData.getCellData(sheetName, "AppURL", row);
							String SSN = TestData.getCellData(sheetName, "SSN", row);

							System.out.println(csr_url);	
							
							/*RProcTest.proc();						
							Thread.sleep(2000);*/								

							QCCSRLoginLogout.login(SSN, AppURL);
							QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
							QCCSRLoginLogout.logout(SSN, AppURL);
							
							QCCSRLoginLogout.login(SSN, AppURL);				
							QCCSRNewLoan.newLoan(SSN, AppURL);
							QCCSRLoginLogout.logout(SSN, AppURL);
							
							QCCSRLoginLogout.login(SSN, AppURL);							      
							QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
							
							QCCSRLoginLogout.login(SSN, AppURL);
							QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
							
							QCCSRLoginLogout.login(SSN, AppURL);
							QCDefault.defaultchk(SSN, AppURL);	
							
							QCCSRLoginLogout.login(SSN, AppURL);						
							QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
							QCCSRLoginLogout.logout(SSN, AppURL);	
							
							QCCSRLoginLogout.login(SSN, AppURL);
							QC_Adjust_Interest_Amount_HistoryVerification.increased_adjamount_verfication(SSN, AppURL);
							QCCSRLoginLogout.logout(SSN, AppURL);		
								
						}
					}
				}

				catch (Exception e) {
					System.out.println("under catch of Test" + e);
					String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_151_5_Txn");
					test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
					test.log(LogStatus.FAIL, "QC_Sprint_B20_151_5 Transaction Failed ");			
				
				}
			}
	
	@Test(priority = 6, groups = "Ratikanta_Sprint1_REQ_564")

			public static void QC_Sprint_B20_151_6_Txn_Testdata() throws Exception {
					try {
						test = reports.startTest(("QC_Sprint1_B20_151_6"),															    
						"Borrower Registration-->Loan-->Default->Collection-->Select Product-->Search For the Customer-->Verify Adjust Interest Void Button Available-->Decrease Adjust Interest Amount-->Go To Central Store History To Verify Adjust Amount Decreased Or Not");
						
						
						String FileName = "QC_Sprint_B20_151_6_Txn_Testdata.xls";
						                 
						
						TestData = new ExcelNew(System.getProperty("user.dir")
								+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

						
						int lastrow = TestData.getLastRow("Start");
						String sheetName = "Start";
						
						System.out.println(lastrow);
						for (int row = 2; row <= lastrow; row++) {

							String RunFlag = TestData.getCellData(sheetName, "Run", row);
							
							if (RunFlag.equals("Y")) {
								
								String AppURL = TestData.getCellData(sheetName, "AppURL", row);
								String SSN = TestData.getCellData(sheetName, "SSN", row);

								System.out.println(csr_url);	
								
								/*RProcTest.proc();						
								Thread.sleep(2000);*/								

								QCCSRLoginLogout.login(SSN, AppURL);
								QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);				
								QCCSRNewLoan.newLoan(SSN, AppURL);
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);							      
								QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCDefault.defaultchk(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);						
								QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_decreased(SSN, AppURL);
								QCCSRLoginLogout.logout(SSN, AppURL);	
								
								CentralStore_Login_Logout.login(SSN, AppURL);
								QC_Adjust_Interest_Amount_HistoryVerification.increased_adjamount_verfication(SSN, AppURL);
								CentralStore_Login_Logout.logout(SSN, AppURL);			
									
							}
						}
					}

					catch (Exception e) {
						System.out.println("under catch of Test" + e);
						String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_151_6_Txn");
						test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
						test.log(LogStatus.FAIL, "QC_Sprint_B20_151_6 Transaction Failed ");			
					
					}
				}
			
		@Test(priority = 7, groups = "Ratikanta_Sprint1_REQ_564")

			public static void QC_Sprint_B20_151_7_Txn_Testdata() throws Exception {
					try {
						test = reports.startTest(("QC_Sprint1_B20_151_7"),															    
						"Borrower Registration-->Loan-->Default->Collection-->Select Product-->Search For the Customer-->Verify Adjust Interest Void Button Available-->Decrease Adjust Interest Amount-->Go To Store History To Verify Adjust Amount Decreased Or Not");
						
						
						String FileName = "QC_Sprint_B20_151_7_Txn_Testdata.xls";
						                 
						
						TestData = new ExcelNew(System.getProperty("user.dir")
								+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

						
						int lastrow = TestData.getLastRow("Start");
						String sheetName = "Start";
						
						System.out.println(lastrow);
						for (int row = 2; row <= lastrow; row++) {

							String RunFlag = TestData.getCellData(sheetName, "Run", row);
							
							if (RunFlag.equals("Y")) {
								
								String AppURL = TestData.getCellData(sheetName, "AppURL", row);
								String SSN = TestData.getCellData(sheetName, "SSN", row);

								System.out.println(csr_url);	
								
								/*RProcTest.proc();						
								Thread.sleep(2000);*/								

								QCCSRLoginLogout.login(SSN, AppURL);
								QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);				
								QCCSRNewLoan.newLoan(SSN, AppURL);
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);							      
								QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCDefault.defaultchk(SSN, AppURL);						
								
								QCCSRLoginLogout.login(SSN, AppURL);						
								QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_decreased(SSN, AppURL);
								QCCSRLoginLogout.logout(SSN, AppURL);	
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QC_Adjust_Interest_Amount_HistoryVerification.increased_adjamount_verfication(SSN, AppURL);
								QCCSRLoginLogout.logout(SSN, AppURL);			
									
							}
						}
					}

					catch (Exception e) {
						System.out.println("under catch of Test" + e);
						String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_151_7_Txn");
						test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
						test.log(LogStatus.FAIL, "QC_Sprint_B20_151_7 Transaction Failed ");			
					
					}
				}
			
		@Test(priority = 8, groups = "Ratikanta_Sprint1_REQ_564")

			public static void QC_Sprint_B20_152_1_Txn_Testdata() throws Exception {
					try {
						test = reports.startTest(("QC_Sprint1_B20_152_1"),															    
						"Borrower Registration-->Loan-->Default->Collection-->Select Product-->Search For the Customer-->In Store Verify Adjust Interest Void Button Available Or Not");
						
						
						String FileName = "QC_Sprint_B20_152_1_Txn_Testdata.xls";
						                 
						
						TestData = new ExcelNew(System.getProperty("user.dir")
								+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

						
						int lastrow = TestData.getLastRow("Start");
						String sheetName = "Start";
						
						System.out.println(lastrow);
						for (int row = 2; row <= lastrow; row++) {

							String RunFlag = TestData.getCellData(sheetName, "Run", row);
							
							if (RunFlag.equals("Y")) {
								
								String AppURL = TestData.getCellData(sheetName, "AppURL", row);
								String SSN = TestData.getCellData(sheetName, "SSN", row);

								System.out.println(csr_url);	
								
								/*RProcTest.proc();						
								Thread.sleep(2000);*/								

								QCCSRLoginLogout.login(SSN, AppURL);
								QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);				
								QCCSRNewLoan.newLoan(SSN, AppURL);
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);							      
								QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCDefault.defaultchk(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);						
								QC_Sprint_Adjust_Interestbutton_Verification.adjust_interest_Void_verification(SSN, AppURL);
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								
							}
						}
					}

					catch (Exception e) {
						System.out.println("under catch of Test" + e);
						String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_152_1_Txn");
						test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
						test.log(LogStatus.FAIL, "QC_Sprint_B20_152_1 Transaction Failed ");			
					
					}
				}
			
		@Test(priority = 9, groups = "Ratikanta_Sprint1_REQ_564")

			public static void QC_Sprint_B20_152_2_Txn_Testdata() throws Exception {
					try {
						test = reports.startTest(("QC_Sprint1_B20_152_2"),															    
						"Borrower Registration-->Loan-->Default->Collection-->Select Product-->Search For the Customer-->In Central Store(2997) Verify Adjust Interest Void Button Available Or Not");
						
						
						String FileName = "QC_Sprint_B20_152_2_Txn_Testdata.xls";
						                 
						
						TestData = new ExcelNew(System.getProperty("user.dir")
								+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

						
						int lastrow = TestData.getLastRow("Start");
						String sheetName = "Start";
						
						System.out.println(lastrow);
						for (int row = 2; row <= lastrow; row++) {

							String RunFlag = TestData.getCellData(sheetName, "Run", row);
							
							if (RunFlag.equals("Y")) {
								
								String AppURL = TestData.getCellData(sheetName, "AppURL", row);
								String SSN = TestData.getCellData(sheetName, "SSN", row);

								System.out.println(csr_url);	
								
								/*RProcTest.proc();						
								Thread.sleep(2000);*/								

								QCCSRLoginLogout.login(SSN, AppURL);
								QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);				
								QCCSRNewLoan.newLoan(SSN, AppURL);
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);							      
								QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCDefault.defaultchk(SSN, AppURL);
																
								CentralStore_Login_Logout.login(SSN, AppURL);
								QC_Sprint_AdjustInterest_CentralStore.CentralStore_Void_verification(SSN, AppURL);
								CentralStore_Login_Logout.logout(SSN, AppURL);
								
								
							}
						}
					}

					catch (Exception e) {
						System.out.println("under catch of Test" + e);
						String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_152_2_Txn");
						test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
						test.log(LogStatus.FAIL, "QC_Sprint_B20_152_2 Transaction Failed ");			
					
					}
				}


	@Test(priority = 10, groups = "Ratikanta_Sprint1_REQ_564")

			public static void QC_Sprint_B20_152_3_Txn_Testdata() throws Exception {
					try {
						test = reports.startTest(("QC_Sprint1_B20_152_3"),															    
						"Borrower Registration-->Loan-->Default->Collection-->Select Product-->Search For the Customer-->Adjust Interest-->Verify Adjust Interest Void Button Should be Available");
						
						
						String FileName = "QC_Sprint_B20_152_3_Txn_Testdata.xls";
						                 
						
						TestData = new ExcelNew(System.getProperty("user.dir")
								+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

						
						int lastrow = TestData.getLastRow("Start");
						String sheetName = "Start";
						
						System.out.println(lastrow);
						for (int row = 2; row <= lastrow; row++) {

							String RunFlag = TestData.getCellData(sheetName, "Run", row);
							
							if (RunFlag.equals("Y")) {
								
								String AppURL = TestData.getCellData(sheetName, "AppURL", row);
								String SSN = TestData.getCellData(sheetName, "SSN", row);

								System.out.println(csr_url);	
								
								/*RProcTest.proc();						
								Thread.sleep(2000);*/								

								QCCSRLoginLogout.login(SSN, AppURL);
								QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);				
								QCCSRNewLoan.newLoan(SSN, AppURL);
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);							      
								QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCDefault.defaultchk(SSN, AppURL);	
								
								QCCSRLoginLogout.login(SSN, AppURL);						
								QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
								QCCSRLoginLogout.logout(SSN, AppURL);	
															
									
							}
						}
					}

					catch (Exception e) {
						System.out.println("under catch of Test" + e);
						String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_152_3_Txn");
						test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
						test.log(LogStatus.FAIL, "QC_Sprint_B20_152_3 Transaction Failed ");			
					
					}
				}
			
	@Test(priority = 11, groups = "Ratikanta_Sprint1_REQ_564")

			public static void QC_Sprint_B20_152_4_Txn_Testdata() throws Exception {
					try {
						test = reports.startTest(("QC_Sprint1_B20_152_4"),															    
						"Borrower Registration-->Loan-->Default->Collection-->Select Product-->Search For the Customer-->Adjust Interest In Central Store(2997)-->Verify Adjust Interest Void Button Should be Available in Central Store");
						
						
						String FileName = "QC_Sprint_B20_152_4_Txn_Testdata.xls";
						                 
						
						TestData = new ExcelNew(System.getProperty("user.dir")
								+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

						
						int lastrow = TestData.getLastRow("Start");
						String sheetName = "Start";
						
						System.out.println(lastrow);
						for (int row = 2; row <= lastrow; row++) {

							String RunFlag = TestData.getCellData(sheetName, "Run", row);
							
							if (RunFlag.equals("Y")) {
								
								String AppURL = TestData.getCellData(sheetName, "AppURL", row);
								String SSN = TestData.getCellData(sheetName, "SSN", row);

								System.out.println(csr_url);	
								
								/*RProcTest.proc();						
								Thread.sleep(2000);*/								

								QCCSRLoginLogout.login(SSN, AppURL);
								QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);				
								QCCSRNewLoan.newLoan(SSN, AppURL);
								QCCSRLoginLogout.logout(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);							      
								QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
								
								QCCSRLoginLogout.login(SSN, AppURL);
								QCDefault.defaultchk(SSN, AppURL);									
								
								CentralStore_Login_Logout.login(SSN, AppURL);
								QC_Sprint_AdjustInterest_CentralStore.central_store_adjustinterest_amount_increased(SSN, AppURL);
								CentralStore_Login_Logout.logout(SSN, AppURL);
															
									
							}
						}
					}

					catch (Exception e) {
						System.out.println("under catch of Test" + e);
						String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_152_4_Txn");
						test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
						test.log(LogStatus.FAIL, "QC_Sprint_B20_152_4 Transaction Failed ");			
					
					}
				}
	     //========================= Secured LOC (KS Title) =============================		
	@Test(priority = 12, groups = "Ratikanta_Sprint1_REQ_564")

	public static void QC_Sprint_B20_153_1_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("QC_Sprint1_B20_153_1"),															    
				"Borrower Registration-->KS TitleLoan(Secured LOC)-->Default->-->PartialPayment-->Collection-->Select Product-->Search For the Customer-->Verify Adjust Interest Void Button is Disable");
				
				
				String FileName = "QC_Sprint_B20_153_1_Txn_Testdata.xls";
				                 
				
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					
					if (RunFlag.equals("Y")) {
						
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);

						System.out.println(csr_url);	
						
						/*RProcTest.proc();						
						Thread.sleep(2000);*/								

						QCCSRLoginLogout.login(SSN, AppURL);
						QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);				
						QCCSRNewLoan.newLoan(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);							      
						QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QCDefault.defaultchk(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);	
						QCCSRPartial_DefaultPayment.partialdefaultpayment(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);						
						QC_Sprint_Adjust_Interestbutton_Verification.adjust_interest_Void_verification(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);
						
							
							
					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_153_1_Txn");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.FAIL, "QC_Sprint_B20_153_1 Transaction Failed ");			
			
			}
		}	
	
	
	
	    //========================= Title Loan (NV TLP) =============================	
	       //===============  Store Used = 734 , Start Date = 05/01/2019 =============================
	
	@Test(priority = 13, groups = "Ratikanta_Sprint1_REQ_564")

	public static void QC_Sprint_B20_153_2_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("QC_Sprint1_B20_153_2"),															    
				"Borrower Registration-->Title Loan-->Default->-->PartialPayment-->Collection-->Select Product-->Search For the Customer-->Verify Adjust Interest Void Button is Disable");
				
				
				String FileName = "QC_Sprint_B20_153_2_Txn_Testdata.xls";
				                 
				
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					
					if (RunFlag.equals("Y")) {
						
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);

						System.out.println(csr_url);	
						
						QCCSRLoginLogout.adminLogin(SSN, SSN);						
						RAdminStoreDate.nvpdl_toStartdate(SSN, AppURL);															
						QCCSRLoginLogout.Adminlogout(SSN, AppURL);	
												
						QCProc.nvpdl_proc();
						Thread.sleep(3000);						
						QCProc.nvtlp_proc();
						
						Thread.sleep(2000);								

						QCCSRLoginLogout.login(SSN, AppURL);
						QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);				
						QCCSRNewLoan.newLoan(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);							      
						QCAgeStoreDueDate.NV_TLP_ageStoreDueDate(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QCCSR_LOC_ManualDefault.nvtlp_manualdefault(SSN, AppURL);
					
						QCCSRLoginLogout.login(SSN, AppURL);	
						QCCSRPartial_DefaultPayment.tlppartialdefaultpayment(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);						
						QC_Sprint_Adjust_Interestbutton_Verification.tlp_adjust_interest_Void_verification(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);
						
					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_153_2_Txn");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.FAIL, "QC_Sprint_B20_153_2 Transaction Failed ");			
			
			}
		}	
	
	//========================= Installment Loan (MO ILP) =============================	
    //===============  Store Used = 3236 , Start Date = 05/02/2018 =============================

@Test(priority = 14, groups = "Ratikanta_Sprint1_REQ_564")

public static void QC_Sprint_B20_153_3_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_Sprint1_B20_153_3"),															    
			"Borrower Registration-->Installment Loan-->Default->-->PartialPayment-->Collection-->Select Product-->Search For the Customer-->Verify Adjust Interest Void Button is Disable");
			
			
			String FileName = "QC_Sprint_B20_153_3_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(csr_url);	
					
					QCCSRLoginLogout.adminLogin(SSN, SSN);						
					RAdminStoreDate.moilp_toStartdate(SSN, AppURL);															
					QCCSRLoginLogout.Adminlogout(SSN, AppURL);	
											
					QCProc.ilp_proc();
					Thread.sleep(3000);															

					QCCSRLoginLogout.login(SSN, AppURL);
					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);				
					QCCSRNewLoan.newLoan(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);							      
					QCAgeStoreDueDate.ilpageStoreDueDate(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.ilp_manualdefault(SSN, AppURL);				
					
					QCCSRLoginLogout.login(SSN, AppURL);	
					QCCSRPartial_DefaultPayment.ilppartialdefaultpayment(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);						
					QC_Sprint_Adjust_Interestbutton_Verification.adjust_interest_Void_verification(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_153_3_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.FAIL, "QC_Sprint_B20_153_3 Transaction Failed ");			
		
		}
	}
     //========================= Secured LOC (KS Title) =============================	

  @Test(priority = 15, groups = "Ratikanta_Sprint1_REQ_564")

  public static void QC_Sprint_B20_153_4_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_Sprint1_B20_153_4"),															    
			"Borrower Registration-->KS TitleLoan(Secured LOC)-->Default-->Adjust Interest-->Refinance-->RefinanceVoid-->Partial Payment-->Verify Adjust Interest Void Button Should be Disable");
			
			
			String FileName = "QC_Sprint_B20_153_4_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(csr_url);	
					
					/*RProcTest.proc();						
					Thread.sleep(2000);*/								

					QCCSRLoginLogout.login(SSN, AppURL);
					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);				
					QCCSRNewLoan.newLoan(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);							      
					QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCDefault.defaultchk(SSN, AppURL);	
					
					QCCSRLoginLogout.login(SSN, AppURL);						
					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);	
					
					QCCSRLoginLogout.login(SSN, AppURL);										
					QCCSR_Refinance.SecuredLocStepSame(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);					
					QCCSR_Void.qcVoid(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);	
					QCCSRPartial_DefaultPayment.partialdefaultpayment(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);						
					QC_Sprint_Adjust_Interestbutton_Verification.adjust_interest_Void_verification(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					
						
				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_153_4_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.FAIL, "QC_Sprint_B20_153_4 Transaction Failed ");			
		
		}
	}	
  
             //========================= Title Loan (NV TLP) =============================
	
   @Test(priority = 16, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_153_5_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_Sprint1_B20_153_5"),															    
			"Borrower Registration-->Title Loan-->Default-->Adjust Interest-->Refinance-->RefinanceVoid-->Partial Payment-->Verify Adjust Interest Void Button Should be Disable");
			
			
			String FileName = "QC_Sprint_B20_153_5_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(csr_url);	
					
					/*RProcTest.proc();						
					Thread.sleep(2000);*/								

					QCCSRLoginLogout.login(SSN, AppURL);
					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);				
					QCCSRNewLoan.newLoan(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);							      
					QCAgeStoreDueDate.NV_TLP_ageStoreDueDate(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.nvtlp_manualdefault(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);						
					QC_Sprint_Adjust_Interestbutton_Verification.tlp_adjustinterest_amount_increased(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);										
					QCCSR_Refinance.tlpStepSame(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);					
					QCCSR_Void.qcVoid(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
				
					QCCSRLoginLogout.login(SSN, AppURL);	
					QCCSRPartial_DefaultPayment.tlppartialdefaultpayment(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);						
					QC_Sprint_Adjust_Interestbutton_Verification.tlp_adjust_interest_Void_verification(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
				
					
						
				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_153_5_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.FAIL, "QC_Sprint_B20_153_5 Transaction Failed ");			
		
		}
	}	
	
   //========================= Installment (MO ILP) =============================	

   @Test(priority = 17, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_153_6_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_Sprint1_B20_153_6"),															    
 			"Borrower Registration-->Installment Loan-->Default-->Adjust Interest-->Conversion To TLP-->ConversionVoid-->Partial Payment With Old Loan-->Verify Adjust Interest Void Button Should be Disable");
 			
 			
 			String FileName = "QC_Sprint_B20_153_6_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
 			int lastrow = TestData.getLastRow("Start");
 			String sheetName = "Start";
 			
 			System.out.println(lastrow);
 			for (int row = 2; row <= lastrow; row++) {

 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
 				
 				if (RunFlag.equals("Y")) {
 					
 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
 					String SSN = TestData.getCellData(sheetName, "SSN", row);

 					System.out.println(csr_url);	
 					
 					/*RProcTest.proc();						
 					Thread.sleep(2000);*/								

 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);				
 					QCCSRNewLoan.newLoan(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);							      
					QCAgeStoreDueDate.ilpageStoreDueDate(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.ilp_manualdefault(SSN, AppURL);		
					
					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);	
 					
 					QCCSRLoginLogout.login(SSN, AppURL);										
 					QCCSRConversion.ilptotlpconversion(SSN, AppURL); 										
 					
 					QCCSRLoginLogout.login(SSN, AppURL);					
 					QCCSR_Void.Conv_Ilp_Void(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);	
					QCCSRPartial_DefaultPayment.ilppartialdefaultpayment(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QC_Sprint_Adjust_Interestbutton_Verification.adjust_interest_Void_verification(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
	
 					
 					
 						
 				}
 			}
 		}

 		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_153_6_Txn");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_153_6 Transaction Failed ");			
 		
 		}
 	}	
   
   //========================= Title Loan (NV TLP) =============================
   
   @Test(priority = 18, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_1_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_Sprint1_B20_154_1"),															    
			"Borrower Registration-->Title Loan-->Default-->Adjust Interest-->Partial Payment-->Payment Void-->Verify Adjust Interest Void Button Should be Enable");
			
			
			String FileName = "QC_Sprint_B20_154_1_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(csr_url);	
					
					/*RProcTest.proc();						
					Thread.sleep(2000);*/								

					QCCSRLoginLogout.login(SSN, AppURL);
					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);				
					QCCSRNewLoan.newLoan(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);							      
					QCAgeStoreDueDate.NV_TLP_ageStoreDueDate(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.nvtlp_manualdefault(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);						
					QC_Sprint_Adjust_Interestbutton_Verification.tlp_adjustinterest_amount_increased(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);	
					QCCSRPartial_DefaultPayment.tlppartialdefaultpayment(SSN, AppURL);
									
					QCCSRLoginLogout.login(SSN, AppURL);					
					QCCSR_Void.qcVoid(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);									
					
					QCCSRLoginLogout.login(SSN, AppURL);						
					QC_Sprint_Adjust_Interestbutton_Verification.Defaulttlp_adjust_interest_Void_verification(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);									
						
				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_154_1_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.FAIL, "QC_Sprint_B20_154_1 Transaction Failed ");			
		
		}
	}	

 //========================= Installment (MO ILP) =============================	

   @Test(priority = 19, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_2_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_Sprint1_B20_154_2"),															    
 			"Borrower Registration-->Installment Loan-->Default-->Adjust Interest-->Partial Payment-->Void-->Verify Adjust Interest Void Button Should be Enable");
 			
 			
 			String FileName = "QC_Sprint_B20_154_2_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
 			int lastrow = TestData.getLastRow("Start");
 			String sheetName = "Start";
 			
 			System.out.println(lastrow);
 			for (int row = 2; row <= lastrow; row++) {

 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
 				
 				if (RunFlag.equals("Y")) {
 					
 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
 					String SSN = TestData.getCellData(sheetName, "SSN", row);

 					System.out.println(csr_url);	
 					
 					/*RProcTest.proc();						
 					Thread.sleep(2000);*/								

 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);				
 					QCCSRNewLoan.newLoan(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);							      
					QCAgeStoreDueDate.ilpageStoreDueDate(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.ilp_manualdefault(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);	
					QCCSRPartial_DefaultPayment.ilppartialdefaultpayment(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);					
 					QCCSR_Void.qcVoid(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);
					QC_Sprint_Adjust_Interestbutton_Verification.Defaultilp_adjust_interest_Void_verification(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
										
 				}
 			}
 		}

 		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_154_2_Txn");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_154_2 Transaction Failed ");			
 		
 		}
 	}	
   
   @Test(priority = 20, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_7_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_Sprint1_B20_154_7"),															    
 			"Borrower Registration-->Installment Loan-->Default-->Adjust Interest-->WriteOff-->Verify Adjust Interest Void Button Should be Disable");
 			
 			
 			String FileName = "QC_Sprint_B20_154_7_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
 			int lastrow = TestData.getLastRow("Start");
 			String sheetName = "Start";
 			
 			System.out.println(lastrow);
 			for (int row = 2; row <= lastrow; row++) {

 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
 				
 				if (RunFlag.equals("Y")) {
 					
 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
 					String SSN = TestData.getCellData(sheetName, "SSN", row);

 					System.out.println(csr_url);	
 					
 					/*RProcTest.proc();						
 					Thread.sleep(2000);*/								

 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);				
 					QCCSRNewLoan.newLoan(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);							      
					QCAgeStoreDueDate.ilpageStoreDueDate(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.ilp_manualdefault(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCCSR_WriteOff.ilpwriteoff(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 														
 					QCCSRLoginLogout.login(SSN, AppURL);
					QC_Sprint_Adjust_Interestbutton_Verification.adjust_interest_Void_verification(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
										
 				}
 			}
 		}

 		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_154_7_Txn");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_154_7 Transaction Failed ");			
 		
 		}
 	}	
   
//========================= Title Loan (NV TLP) =============================
   
   @Test(priority = 21, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_8_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_Sprint1_B20_154_8"),															    
			"Borrower Registration-->Title Loan-->Default-->Adjust Interest-->WriteOff-->Verify Adjust Interest Void Button Should be Disable");
			
			
			String FileName = "QC_Sprint_B20_154_8_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(csr_url);	
					
					/*RProcTest.proc();						
					Thread.sleep(2000);*/								

					QCCSRLoginLogout.login(SSN, AppURL);
					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);				
					QCCSRNewLoan.newLoan(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);							      
					QCAgeStoreDueDate.NV_TLP_ageStoreDueDate(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.nvtlp_manualdefault(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);						
					QC_Sprint_Adjust_Interestbutton_Verification.tlp_adjustinterest_amount_increased(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
 					QCCSR_WriteOff.tlpwriteoff(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 																																
					QCCSRLoginLogout.login(SSN, AppURL);						
					QC_Sprint_Adjust_Interestbutton_Verification.tlp_adjust_interest_Void_verification(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);									
						
				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_154_8_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.FAIL, "QC_Sprint_B20_154_8 Transaction Failed ");			
		
		}
	}	
   
 //========================= UnSecured LOC (KS LOC) =============================	

   @Test(priority = 22, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_9_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_Sprint1_B20_154_9"),															    
 			"Borrower Registration-->KS LOC(UnSecured LOC)-->Default-->Adjust Interest-->WriteOff-->Verify Adjust Interest Void Button Should be Disable");
 			
 			
 			String FileName = "QC_Sprint_B20_154_9_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
 			int lastrow = TestData.getLastRow("Start");
 			String sheetName = "Start";
 			
 			System.out.println(lastrow);
 			for (int row = 2; row <= lastrow; row++) {

 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
 				
 				if (RunFlag.equals("Y")) {
 					
 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
 					String SSN = TestData.getCellData(sheetName, "SSN", row);

 					System.out.println(csr_url);	
 					
 					/*RProcTest.proc();						
 					Thread.sleep(2000);*/								

 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);				
 					QCCSRNewLoan.newLoan(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);							      
 					QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
 										
 					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);	
 					
 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCCSR_WriteOff.locwriteoff(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjust_interest_Void_verification(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 										
 				}
 			}
 		}

 		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_154_9_Txn");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_154_9 Transaction Failed ");			
 		
 		}
 	}	
 //========================= Secured LOC (KS Title) =============================	

   @Test(priority = 23, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_10_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_Sprint1_B20_154_10"),															    
 			"Borrower Registration-->KS TitleLoan(Secured LOC)-->Default-->Adjust Interest-->WriteOff-->Verify Adjust Interest Void Button Should be Disable");
 			
 			
 			String FileName = "QC_Sprint_B20_154_10_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
 			int lastrow = TestData.getLastRow("Start");
 			String sheetName = "Start";
 			
 			System.out.println(lastrow);
 			for (int row = 2; row <= lastrow; row++) {

 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
 				
 				if (RunFlag.equals("Y")) {
 					
 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
 					String SSN = TestData.getCellData(sheetName, "SSN", row);

 					System.out.println(csr_url);	
 					
 					/*RProcTest.proc();						
 					Thread.sleep(2000);*/								

 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);				
 					QCCSRNewLoan.newLoan(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);							      
 					QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
 					 					
 					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);	
 										
 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCCSR_WriteOff.locwriteoff(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjust_interest_Void_verification(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					
 						
 				}
 			}
 		}

 		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_154_10_Txn");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_154_10 Transaction Failed ");			
 		
 		}
 	}	
   
 //========================= Installment (MO ILP) =============================	

   @Test(priority = 24, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_11_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_Sprint1_B20_154_11"),															    
 			"Borrower Registration-->Installment Loan-->Default-->Adjust Interest-->Refinance-->Void-->Partial Payment-->Verify Adjust Interest Void Button Should be Disable");
 			
 			
 			String FileName = "QC_Sprint_B20_154_11_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
 			int lastrow = TestData.getLastRow("Start");
 			String sheetName = "Start";
 			
 			System.out.println(lastrow);
 			for (int row = 2; row <= lastrow; row++) {

 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
 				
 				if (RunFlag.equals("Y")) {
 					
 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
 					String SSN = TestData.getCellData(sheetName, "SSN", row);

 					System.out.println(csr_url);	
 					
 					/*RProcTest.proc();						
 					Thread.sleep(2000);*/								

 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);				
 					QCCSRNewLoan.newLoan(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);							      
					QCAgeStoreDueDate.ilpageStoreDueDate(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.ilp_manualdefault(SSN, AppURL);		
					
					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);	
 					
 					QCCSRLoginLogout.login(SSN, AppURL);										
 					QCCSR_Refinance.ilpStepSame(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					
 					QCCSRLoginLogout.login(SSN, AppURL);					
 					QCCSR_Void.Ref_Ilp_Void(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);	
					QCCSRPartial_DefaultPayment.ilppartialdefaultpayment(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QC_Sprint_Adjust_Interestbutton_Verification.adjust_interest_Void_verification(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
	
 					
 					
 						
 				}
 			}
 		}

 		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_154_11_Txn");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_154_11 Transaction Failed ");			
 		
 		}
 	}	  
   
   //========================= Secured LOC (KS Title) =============================	

   @Test(priority = 25, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_13_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_Sprint1_B20_154_13"),															    
 			"Borrower Registration-->KS TitleLoan(Secured LOC)-->Default-->Adjust Interest-->Verify Adjust Interest Void Button Should be Enable");
 			
 			
 			String FileName = "QC_Sprint_B20_154_13_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
 			int lastrow = TestData.getLastRow("Start");
 			String sheetName = "Start";
 			
 			System.out.println(lastrow);
 			for (int row = 2; row <= lastrow; row++) {

 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
 				
 				if (RunFlag.equals("Y")) {
 					
 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
 					String SSN = TestData.getCellData(sheetName, "SSN", row);

 					System.out.println(csr_url);	
 					
 					/*RProcTest.proc();						
 					Thread.sleep(2000);*/								

 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);				
 					QCCSRNewLoan.newLoan(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);							      
 					QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);	
 					
 					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);											
 						
 				}
 			}
 		}

 		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_153_13_Txn");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_154_13 Transaction Failed ");			
 		
 		}
 	}	
   
 //============================== UnSecured LOC  =====================================	

   @Test(priority = 26, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_14_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_Sprint1_B20_154_14"),															    
 			"Borrower Registration-->ULOC Loan-->Default-->Adjust Interest-->Verify Adjust Interest Void Button Should be Enable");
 			
 			
 			String FileName = "QC_Sprint_B20_154_14_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
 			int lastrow = TestData.getLastRow("Start");
 			String sheetName = "Start";
 			
 			System.out.println(lastrow);
 			for (int row = 2; row <= lastrow; row++) {

 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
 				
 				if (RunFlag.equals("Y")) {
 					
 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
 					String SSN = TestData.getCellData(sheetName, "SSN", row);

 					System.out.println(csr_url);	
 					
 					/*RProcTest.proc();						
 					Thread.sleep(2000);*/								

 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);				
 					QCCSRNewLoan.newLoan(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);							      
 					QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);	
 					
 					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);											
 						
 				}
 			}
 		}

 		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_153_14_Txn");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_154_14 Transaction Failed ");			
 		
 		}
 	}	
   
   @Test(priority = 27, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_15_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_Sprint1_B20_154_15"),															    
 			"Borrower Registration-->ULOC Loan-->Default-->Adjust Interest-->Verify Adjust Interest Void Button Should be Enable At Central Store(2997)");
 			
 			
 			String FileName = "QC_Sprint_B20_154_15_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
 			int lastrow = TestData.getLastRow("Start");
 			String sheetName = "Start";
 			
 			System.out.println(lastrow);
 			for (int row = 2; row <= lastrow; row++) {

 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
 				
 				if (RunFlag.equals("Y")) {
 					
 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
 					String SSN = TestData.getCellData(sheetName, "SSN", row);

 					System.out.println(csr_url);	
 					
 					/*RProcTest.proc();						
 					Thread.sleep(2000);*/								

 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);				
 					QCCSRNewLoan.newLoan(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);							      
 					QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);	
 					
 					CentralStore_Login_Logout.login(SSN, AppURL);						
 					QC_Sprint_AdjustInterest_CentralStore.Centralstore_adjustinterest_Void_verification(SSN, AppURL);
 					CentralStore_Login_Logout.logout(SSN, AppURL);
  						
 				}
 			}
 		}

 		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_153_15_Txn");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_154_15 Transaction Failed ");			
 		
 		}
 	}	
   @Test(priority = 28, groups = "Ratikanta_Sprint1_REQ_564")

	public static void QC_Sprint_B20_154_16_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("QC_Sprint1_B20_154_16"),															    
				
						"Borrower Registration-->ULOC Loan-->Default-->Payment-->Verify Adjust Interest Void Button Should Not be Enable At Central Store(2997)");
				
				String FileName = "QC_Sprint_B20_154_16_Txn_Testdata.xls";
				                 
				
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					
					if (RunFlag.equals("Y")) {
						
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);

						System.out.println(csr_url);	
						
						/*RProcTest.proc();						
						Thread.sleep(2000);*/								

						QCCSRLoginLogout.login(SSN, AppURL);
						QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);				
						QCCSRNewLoan.newLoan(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);							      
						QCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
												
						QCCSRLoginLogout.login(SSN, AppURL);	
						QCCSRPartial_DefaultPayment.partialdefaultpayment(SSN, AppURL);
												
						CentralStore_Login_Logout.login(SSN, AppURL);												
						QC_Sprint_AdjustInterest_CentralStore.CentralStore_Void_verification(SSN, AppURL);
						CentralStore_Login_Logout.logout(SSN, AppURL);
							
					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_154_16_Txn");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.INFO, "QC_Sprint_B20_154_16 Transaction Failed ");			
			
			}
		}
   
  
	
	//========================= Installment (MO ILP) =============================	

	   @Test(priority = 29, groups = "Ratikanta_Sprint1_REQ_564")

	   public static void QC_Sprint_B20_154_17_Txn_Testdata() throws Exception {
	 		try {
	 			test = reports.startTest(("QC_Sprint1_B20_154_17"),															    
	 			"Borrower Registration-->Installment Loan-->Default-->Adjust Interest-->Refinance-->Void-->Partial Payment-->Verify Adjust Interest Void Button Should be Disable");
	 			
	 			
	 			String FileName = "QC_Sprint_B20_154_17_Txn_Testdata.xls";
	 			                 
	 			
	 			TestData = new ExcelNew(System.getProperty("user.dir")
	 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

	 			
	 			int lastrow = TestData.getLastRow("Start");
	 			String sheetName = "Start";
	 			
	 			System.out.println(lastrow);
	 			for (int row = 2; row <= lastrow; row++) {

	 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
	 				
	 				if (RunFlag.equals("Y")) {
	 					
	 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
	 					String SSN = TestData.getCellData(sheetName, "SSN", row);

	 					System.out.println(csr_url);	
	 					
	 					/*RProcTest.proc();						
	 					Thread.sleep(2000);*/								

	 					QCCSRLoginLogout.login(SSN, AppURL);
	 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
	 					QCCSRLoginLogout.logout(SSN, AppURL);
	 					
	 					QCCSRLoginLogout.login(SSN, AppURL);				
	 					QCCSRNewLoan.newLoan(SSN, AppURL);
	 					QCCSRLoginLogout.logout(SSN, AppURL);
	 					
	 					QCCSRLoginLogout.login(SSN, AppURL);							      
						QCAgeStoreDueDate.ilpageStoreDueDate(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);
						QCCSR_LOC_ManualDefault.ilp_manualdefault(SSN, AppURL);		
						
						QCCSRLoginLogout.login(SSN, AppURL);						
	 					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
	 					QCCSRLoginLogout.logout(SSN, AppURL);	
	 					
	 					QCCSRLoginLogout.login(SSN, AppURL);										
	 					QCCSR_Refinance.ilpStepSame(SSN, AppURL);
	 					QCCSRLoginLogout.logout(SSN, AppURL);
	 					
	 					
	 					QCCSRLoginLogout.login(SSN, AppURL);					
	 					QCCSR_Void.Ref_Ilp_Void(SSN, AppURL);
	 					QCCSRLoginLogout.logout(SSN, AppURL);
						
						QCCSRLoginLogout.login(SSN, AppURL);	
						QCCSRPartial_DefaultPayment.ilppartialdefaultpayment(SSN, AppURL);
						
						/*QCCSRLoginLogout.login(SSN, AppURL);
						QC_Sprint_Adjust_Interestbutton_Verification.adjust_interest_Void_verification(SSN, AppURL);
						QCCSRLoginLogout.logout(SSN, AppURL);*/
						
						CentralStore_Login_Logout.login(SSN, AppURL);												
						QC_Sprint_AdjustInterest_CentralStore.CentralStore_Void_verification(SSN, AppURL);
						CentralStore_Login_Logout.logout(SSN, AppURL);
		
	 					
	 					
	 						
	 				}
	 			}
	 		}

	 		catch (Exception e) {
	 			System.out.println("under catch of Test" + e);
	 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_154_17_Txn");
	 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
	 			test.log(LogStatus.FAIL, "QC_Sprint_B20_154_17 Transaction Failed ");			
	 		
	 		}
	 	}	  
 //========================= Installment (MO ILP) =============================	

   @Test(priority = 30, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_18_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_Sprint1_B20_154_18"),															    
 			"Borrower Registration-->Installment Loan-->Default-->Adjust Interest-->Partial Payment-->Void-->Verify Adjust Interest Void Button Should be Enable in Central Store(2997)");
 			
 			
 			String FileName = "QC_Sprint_B20_154_18_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
 			int lastrow = TestData.getLastRow("Start");
 			String sheetName = "Start";
 			
 			System.out.println(lastrow);
 			for (int row = 2; row <= lastrow; row++) {

 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
 				
 				if (RunFlag.equals("Y")) {
 					
 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
 					String SSN = TestData.getCellData(sheetName, "SSN", row);

 					System.out.println(csr_url);	
 					
 					/*RProcTest.proc();						
 					Thread.sleep(2000);*/								

 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);				
 					QCCSRNewLoan.newLoan(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);							      
					QCAgeStoreDueDate.ilpageStoreDueDate(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.ilp_manualdefault(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);	
					QCCSRPartial_DefaultPayment.ilppartialdefaultpayment(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);					
 					QCCSR_Void.qcVoid(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL); 				
					
					CentralStore_Login_Logout.login(SSN, AppURL);												
					QC_Sprint_AdjustInterest_CentralStore.CentralStore_Void_Enable_verification(SSN, AppURL);
					CentralStore_Login_Logout.logout(SSN, AppURL);
										
 				}
 			}
 		}

 		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_154_18_Txn");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.INFO, "QC_Sprint_B20_154_18 Transaction Failed ");			
 		
 		}
 	}	
  
   //****************************************************************************************************************************************************************
   //=======================================  Sprint REQ-572  ================================================
 //=======================================  MO PDL (590) SSN Start = 202021045 ================================================
 //=======================================  Start Date = 05/01/2019  ================================================
   
   
   @Test(priority = 31, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_178_1_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_178_1"),

   					
   		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Verify FDD Details in Courtesy call Screen");
   			String FileName = "QC_Sprint_B20_178_1_Txn_Testdata.xls";
   			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

   			
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
					RAdminStoreDate.mopdl_toStartdate(SSN, AppURL);															
					QCCSRLoginLogout.Adminlogout(SSN, AppURL);
					QCProc.mopdl_proc();
					Thread.sleep(2000);	
												
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL); 					
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_verification(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);

   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_178_1_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_178_1_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
 //=======================================  MO ILP (590) SSN Start = 202021049 ================================================
   
   @Test(priority = 32, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_178_2_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_178_2"),

   					
   		    
   			"CSR Login->Borrower Registration-->Installment NewLoan-->Courtesy Call-->Future Deposit Date-->Verify FDD Details in Courtesy call Screen");
   			String FileName = "QC_Sprint_B20_178_2_Txn_Testdata.xls";
   			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   								   				
												
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL); 					
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_verification(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);

   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_178_2_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_178_2_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
 //=======================================  MO TLP (590) SSN Start = 202021053 ================================================
   
   @Test(priority = 33, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_178_3_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_178_3"),  					  		    
   			"CSR Login->Borrower Registration-->TLP NewLoan-->Courtesy Call-->Future Deposit Date-->Verify FDD Details in Courtesy call Screen");
   			String FileName = "QC_Sprint_B20_178_3_Txn_Testdata.xls";
   			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					
			   					/*QCCSRLoginLogout.adminLogin(SSN, SSN);							
								RAdminStoreDate.mopdl_toStartdate(SSN, AppURL);															
								QCCSRLoginLogout.Adminlogout(SSN, AppURL);
								QCProc.mopdl_proc();
								Thread.sleep(2000);	*/
												
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL); 					
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_verification(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);

   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_178_3_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_178_3_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
 
 //=======================================  MO ILP (590) SSN Start = 202021057 ================================================
   
   @Test(priority = 34, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_178_5_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_178_5"),
  					  		    
   			"CSR Login->Borrower Registration-->ILP NewLoan-->Courtesy Call-->Future Deposit Date-->Verify FDD Details in Courtesy call Screen Of Central Store(2997)");
   			String FileName = "QC_Sprint_B20_178_5_Txn_Testdata.xls";
   			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					
   					QCProc.mopdl_proc();
					Thread.sleep(2000);  					
			   				
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  								
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL);  					   					 				    
   				 
   					CentralStore_Login_Logout.login(SSN, AppURL);					
					QCCSR_FDD_Verification.centralstore_fdd_verification(SSN, AppURL); 	
					CentralStore_Login_Logout.logout(SSN, AppURL);   					  					
   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_178_5_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_178_5_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO ILP (590) SSN Start = 202021061 ================================================
   // Issue : Not taking more than 4 FDD deposits, we need 10 FDD to complete scenario, Not getting Scroll Bar after flow change(4 FDD-->Cancel-->FDD-->Cancel-->continue up to 10 records)
   
   //@Test(priority = 35, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_178_6_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_178_6"),
  					  		    
   			"CSR Login->Borrower Registration-->ILP NewLoan-->Courtesy Call-->10 Times Future Deposit Date-->Verify FDD Details in Courtesy call Screen Of Central Store(2997)");
   			String FileName = "QC_Sprint_B20_178_6_Txn_Testdata.xls";
   			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					
   					// For 10 times FDD Deposit
   					
   				 /*for(int i=0; i<=9; i++){ 
   				    System.out.println("Value Of Variable i is " +i); 
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL);
   				   }	
   					CentralStore_Login_Logout.login(SSN, AppURL);	
   					//Update central_fdd_ver class once issue resolved
					QCCSR_FDD_Verification.centralstore_fdd_verification(SSN, AppURL); 	
					CentralStore_Login_Logout.logout(SSN, AppURL); */  					  					
   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_178_6_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_178_6_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
  
 //=======================================  MO PDL (590) SSN Start = 202021065 ================================================
   
   @Test(priority = 36, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_179_1_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_179_1"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Default-->Verify FDD Details in Collection Screen");
   			String FileName = "QC_Sprint_B20_179_1_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);   					   					
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.pdlmanualdefault(SSN, AppURL);  					  										
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_collectionverification(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);

   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_179_1_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_179_1_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
  
 //=======================================  MO ILP (590) SSN Start = 202021069 ================================================
   
   @Test(priority = 37, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_179_2_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_179_2"),
  					  		    
   			"CSR Login->Borrower Registration-->ILP NewLoan-->Courtesy Call-->Future Deposit Date-->Default-->Verify FDD Details in Collection Screen");
   			String FileName = "QC_Sprint_B20_179_2_Txn_Testdata.xls";
   			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL);   					   					
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.ilp_manualdefault(SSN, AppURL);  					  										
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_collectionverification(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					  								  					
   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_179_2_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_179_2_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO TLP (590) SSN Start = 202021073 ================================================
                
   @Test(priority = 38, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_179_3_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_179_3"),  					  		    
   			"CSR Login->Borrower Registration-->TLP NewLoan-->Courtesy Call-->Future Deposit Date-->Default-->Verify FDD Details in Collection Screen");
   			String FileName = "QC_Sprint_B20_179_3_Txn_Testdata.xls";
   			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);  								   					
												
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL); 					
   					  					  				
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.nvtlp_manualdefault(SSN, AppURL);  					  										
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_tlpcollectionverification(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);

   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_179_3_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_179_3_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021077 ================================================
   
   @Test(priority = 39, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_179_6_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_179_6"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Default-->Verify FDD Details in Collection Screen For Central Store(2997)");
   			String FileName = "QC_Sprint_B20_179_6_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					
   					QCProc.mopdl_proc();
   					Thread.sleep(2000);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);   					   					
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.pdlmanualdefault(SSN, AppURL);  					  										
   					 					
   					CentralStore_Login_Logout.login(SSN, AppURL);
   					QCCSR_FDD_Verification.fdd_centralstore_collectionverification(SSN, AppURL); 	
					CentralStore_Login_Logout.logout(SSN, AppURL);

   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_179_6_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_179_6_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021081 ================================================
   
   @Test(priority = 40, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_180_1_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_180_1"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Default-->Verify FDD Details in Transaction History Screen");
   			String FileName = "QC_Sprint_B20_180_1_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);   					   					
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.pdlmanualdefault(SSN, AppURL);  					  										
   					 					
					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_FDD_Verification.fdd_historyscreen_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);

   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_180_1_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_180_1_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO ILP (590) SSN Start = 202021085 ================================================
   
   @Test(priority = 41, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_180_2_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_180_2"),
  					  		    
   			"CSR Login->Borrower Registration-->ILP NewLoan-->Courtesy Call-->Future Deposit Date-->Default-->Verify FDD Details in History Screen");
   			String FileName = "QC_Sprint_B20_180_2_Txn_Testdata.xls";
   			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL);   					   					
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.ilp_manualdefault(SSN, AppURL);   					  										
   					 					
					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_FDD_Verification.fdd_historyscreen_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					  								  					
   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_180_2_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_180_2_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
 //=======================================  MO TLP (590) SSN Start = 202021089 ================================================
   
   @Test(priority = 42, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_180_3_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_180_3"),  					  		    
   			"CSR Login->Borrower Registration-->TLP NewLoan-->Courtesy Call-->Future Deposit Date-->Default-->Verify FDD Details in History Screen");
   			String FileName = "QC_Sprint_B20_180_3_Txn_Testdata.xls";
   			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);  								   					
												
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL); 					
   					  					  				
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.nvtlp_manualdefault(SSN, AppURL); 
					
					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_FDD_Verification.fdd_historyscreen_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					

   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_180_3_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_180_3_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021093 ================================================
   
   @Test(priority = 43, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_180_6_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_180_6"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Default-->Verify FDD Details in Transaction History Screen Of Central Store (2997)");
   			String FileName = "QC_Sprint_B20_180_6_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);   					   					
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.pdlmanualdefault(SSN, AppURL);  					  										
   					
   					CentralStore_Login_Logout.login(SSN, AppURL);  					 	
   					QCCSR_FDD_Verification.fdd_centralstore_historyscreen_verfication(SSN, AppURL); 
   					CentralStore_Login_Logout.logout(SSN, AppURL);

   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_180_6_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_180_6_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021097 ================================================
   
   @Test(priority = 44, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_181_1_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_181_1"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Default-->Verify FDD Details (Date Created, Installment Number, Orginal Duedate, FDD, Amount, Created By)in Collection Screen");
   			String FileName = "QC_Sprint_B20_181_1_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);   					   					
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.pdlmanualdefault(SSN, AppURL);  					  										
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_collection_allvalue_verification(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);

   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_181_1_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_181_1_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021101 ================================================
   
   @Test(priority = 45, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_181_2_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_181_2"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Default-->Verify FDD Details (Date Created, Installment Number, Orginal Duedate, FDD, Amount, Created By)in History Screen");
   			String FileName = "QC_Sprint_B20_181_2_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);   					   					
					
					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.pdlmanualdefault(SSN, AppURL);  					  										
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_historyscreen_all_value_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);  					  					

   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_181_2_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_181_2_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021105 ================================================
   
   @Test(priority = 46, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_181_3_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_181_3"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Verify FDD Details (Date Created, Installment Number, Orginal Duedate, FDD, Amount, Created By)in Courtesy Call Screen");
   			String FileName = "QC_Sprint_B20_181_3_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);   					   					
										
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_courtesycall_allvalues_verification(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);				
					
   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_181_3_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_181_3_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021109 ================================================
   
   @Test(priority = 47, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_181_7_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_181_7"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Default-->Central Store(2997) Login-->Verify FDD Details (Date Created, Installment Number, Orginal Duedate, FDD, Amount, Created By)in Central Store Payment History Screen");
   			String FileName = "QC_Sprint_B20_181_7_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);  
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.pdlmanualdefault(SSN, AppURL);
   					
					CentralStore_Login_Logout.login(SSN, AppURL);						      
   					QC_CentralStore.centralstore_paymentscreen_history_fddverification(SSN, AppURL); 					
   					  					
   				}
   			}
   		}

   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_181_7_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_181_7_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
//=======================================  MO PDL (590) SSN Start = 202021113 ================================================
   
   @Test(priority = 48, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_182_1_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_182_1"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Verify Future deposit date should be displayed in Loan Account Status section  in customer transaction History screen");
   			String FileName = "QC_Sprint_B20_182_1_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);   					   					
										
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_date_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);  					  					
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_182_1_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_182_1_Txn_Testdata Transaction Failed ");					
 		}
   	}
   
//=======================================  MO ILP (590) SSN Start = 202021117 ================================================
   
   @Test(priority = 49, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_182_2_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_182_2"),
  					  		    
   			"CSR Login->Borrower Registration-->ILP NewLoan-->Courtesy Call-->Future Deposit Date-->Verify Future deposit date should be displayed in Loan Account Status section  in customer transaction History screen");
   			String FileName = "QC_Sprint_B20_182_2_Txn_Testdata.xls";
   			                  			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL);   					   					

   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_date_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);  					  								  					
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_182_2_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_182_2_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
 //=======================================  MO TLP (590) SSN Start = 202021121 ================================================
   
   @Test(priority = 50, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_182_3_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_182_3"),  					  		    
   			"CSR Login->Borrower Registration-->TLP NewLoan-->Courtesy Call-->Future Deposit Date-->Verify Future deposit date should be displayed in Loan Account Status section  in customer transaction History screen");
   			String FileName = "QC_Sprint_B20_182_3_Txn_Testdata.xls";  			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
  			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL); 
   					
   					QCProc.mopdl_proc();
   					Thread.sleep(2000);
												
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL); 					
   					  					  				
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_date_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_182_3_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_182_3_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021125 ================================================
   
   @Test(priority = 51, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_182_6_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_182_6"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Central Store(2997),Verify Future deposit date Field should be displayed in Loan Account Status section  in customer transaction History screen");
   			String FileName = "QC_Sprint_B20_182_6_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);   					   					
										
   					CentralStore_Login_Logout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_datefield_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					CentralStore_Login_Logout.logout(SSN, AppURL);     					
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_182_6_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_182_6_Txn_Testdata Transaction Failed ");					
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021129 ================================================
   
   @Test(priority = 52, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_183_1_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_183_1"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Verify Future deposit date field  should be displayed in Loan Account Status section  in customer transaction History screen");
   			String FileName = "QC_Sprint_B20_183_1_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);   					   					
										
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_datefield_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);    					
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_183_1_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_183_1_Txn_Testdata Transaction Failed ");					
 		}
   	}
   
//=======================================  MO ILP (590) SSN Start = 202021133 ================================================
   
   @Test(priority = 53, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_183_2_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_183_2"),
  					  		    
   			"CSR Login->Borrower Registration-->ILP NewLoan-->Courtesy Call-->Future Deposit Date-->Verify Future deposit date field  should be displayed in Loan Account Status section  in customer transaction History screen");
   			String FileName = "QC_Sprint_B20_183_2_Txn_Testdata.xls";
   			                  			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL);   					   					

   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_datefield_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);  					  								  					
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_183_2_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_183_2_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO TLP (590) SSN Start = 202021137 ================================================
   
   @Test(priority = 54, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_183_3_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_183_3"),  					  		    
   			"CSR Login->Borrower Registration-->TLP NewLoan-->-->Courtesy Call-->Future Deposit Date-->Verify Future deposit date field  should be displayed in Loan Account Status section  in customer transaction History screen");
   			String FileName = "QC_Sprint_B20_183_3_Txn_Testdata.xls";  			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
  			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL); 
   					
   					QCProc.mopdl_proc();
   					Thread.sleep(2000);
												
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL); 					
   					  					  				
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_datefield_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL); 
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_183_3_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_183_3_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021141 ================================================
   
   @Test(priority = 55, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_183_6_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_183_6"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Central Store(2997),Verify Future deposit date should be displayed in Loan Account Status section  in customer transaction History screen");
   			String FileName = "QC_Sprint_B20_183_6_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);   					   					
										
   					CentralStore_Login_Logout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_date_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					CentralStore_Login_Logout.logout(SSN, AppURL);     					
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_183_6_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_183_6_Txn_Testdata Transaction Failed ");					
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021145 ================================================
   
   @Test(priority = 56, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_184_1_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_184_1"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Age the Store to FDD Date+Gracedays-->Verify Future deposit date  should be Blank in History's Loan Account Status section screen");
   			String FileName = "QC_Sprint_B20_184_1_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);  
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCAgeStoreDueDate.fdddate_ageStoreGraceDays(SSN, AppURL);
										
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_date_empty_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL); 					
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_184_1_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_184_1_Txn_Testdata Transaction Failed ");					
 		}
   	}
   
//=======================================  MO ILP (590) SSN Start = 202021149 ================================================
   
   @Test(priority = 57, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_184_2_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_184_2"),
  					  		    
   			"CSR Login->Borrower Registration-->ILP NewLoan-->Courtesy Call-->Future Deposit Date-->Age the Store to FDD Date+Gracedays-->Verify Future deposit date  should be Blank in History's Loan Account Status section screen");
   			String FileName = "QC_Sprint_B20_184_2_Txn_Testdata.xls";
   			                  			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL);   					   					

   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCAgeStoreDueDate.fdddate_ageStoreGraceDays(SSN, AppURL);
										
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_date_empty_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);  					  								  					
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_184_2_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_184_2_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO PDL (590) SSN Start = 202021153 ================================================
   
   @Test(priority = 58, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_184_4_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_184_4"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->Courtesy Call-->Future Deposit Date-->Cancel FDD-->Verify Future deposit date should be Blank in History's Loan Account Status section Screen");
   			String FileName = "QC_Sprint_B20_184_4_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_future_deposit_date(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.pdl_cancel_future_deposit_date(SSN, AppURL);
										
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_date_empty_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL); 					
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_184_4_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_184_4_Txn_Testdata Transaction Failed ");					
 		}
   	}
   
//=======================================  MO ILP (590) SSN Start = 202021157 ================================================
   
   @Test(priority = 59, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_184_5_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_184_5"),
  					  		    
   			"CSR Login->Borrower Registration-->ILP NewLoan-->Courtesy Call-->Future Deposit Date-->Cancel FDD-->Verify Future deposit date should be Blank in History's Loan Account Status section Screen");
   			String FileName = "QC_Sprint_B20_184_5_Txn_Testdata.xls";
   			                  			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL);   					   					

   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_cancel_future_deposit_date(SSN, AppURL);
										
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_date_empty_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);  					  								  					
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_184_5_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_184_5_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
//=======================================  MO TLP (590) SSN Start = 202021161 ================================================
  
   @Test(priority = 60, groups = "Ratikanta_Sprint1_REQ_572")

   public static void QC_Sprint_B20_184_6_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint1_B20_184_6"),  					  		    
   			"CSR Login->Borrower Registration-->TLP NewLoan-->-->Courtesy Call-->Future Deposit Date-->Cancel FDD-->Verify Future deposit date should be Blank in History's Loan Account Status section Screen");
   			String FileName = "QC_Sprint_B20_184_6_Txn_Testdata.xls";  			                 
   			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
  			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL); 
   					
   					QCProc.mopdl_proc();
   					Thread.sleep(2000);
												
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_future_deposit_date(SSN, AppURL); 					
   					  					  				
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QC_FDD.ilp_cancel_future_deposit_date(SSN, AppURL);
										
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCCSR_FDD_Verification.fdd_date_empty_historyscreen_loanacctsection_verfication(SSN, AppURL); 					
   					QCCSRLoginLogout.logout(SSN, AppURL);  
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_184_6_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_184_6_Txn_Testdata Transaction Failed ");			
 		
 		}
   	}
   
   
   //****************************************************************************************************************************************************************
   
   //=======================================  Sprint REQ-601_MOPDL  ================================================
   
//=======================================  MO PDL (120) SSN Start = 020202001 ================================================
   //======================= Scheduler Run Scenarios are in Hold ============================================
   
   /*@Test(priority = 61, groups = "Ratikanta_Sprint2_REQ_601_MOPDL")
  
   public static void QC_Sprint2_QF_601_TS_026_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint2_QF_601_TS_026"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->");
   			String FileName = "QC_Sprint2_QF_601_TS_026_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);  					  					
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_CaptureDate_LoanNumber.date_loan_capture(SSN, AppURL);
   					
   					CentralStore_Login_Logout.login(SSN, AppURL);
   					QCCSR_CourtesyCall_PromiseToPay.courtesycall_promisetoPay(SSN, AppURL);
   					CentralStore_Login_Logout.logout(SSN, AppURL);
   				  					
   					QCCSRLoginLogout.login(SSN, AppURL);							      
   					QCAgeStoreDueDate.ageStoreToPaymentDate(SSN, AppURL);
   					
   					QCCSR_SchedulerRun.scheduler1025();
   					
   					QCCSR_SchedulerRun.scheduler116();
  						
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint2_QF_601_TS_026_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint2_QF_601_TS_026_Txn_Testdata Transaction Failed ");					
 		}
   	}*/
   
 //=======================================  MO PDL (120) SSN Start = 020202005 ================================================
 
   
   @Test(priority = 62, groups = "Ratikanta_Sprint2_REQ_601_MOPDL")
  
   public static void QC_Sprint2_QF_601_TS_086_Txn_Testdata() throws Exception {
   		try {
   			test = reports.startTest(("QC_Sprint2_QF_601_TS_086"), 		    
   			"CSR Login->Borrower Registration-->PDL NewLoan-->BuyBack");
   			String FileName = "QC_Sprint2_QF_601_TS_086_Txn_Testdata.xls";   			                    			
   			TestData = new ExcelNew(System.getProperty("user.dir")
   					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);
   			
   			int lastrow = TestData.getLastRow("Start");
   			String sheetName = "Start";
   			
   			System.out.println(lastrow);
   			for (int row = 2; row <= lastrow; row++) {

   				String RunFlag = TestData.getCellData(sheetName, "Run", row);
   				
   				if (RunFlag.equals("Y")) {
   					
   					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
   					String SSN = TestData.getCellData(sheetName, "SSN", row);
   				
   					System.out.println(AppURL);
   					  					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);	
   					QCCSRLoginLogout.logout(SSN, AppURL); 	
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSRNewLoan.newLoan(SSN, AppURL);						
   					QCCSRLoginLogout.logout(SSN, AppURL);  
   					
                    QCCSRLoginLogout.login(SSN, AppURL);							      
                    QCAgeStoreDueDate.ageStoreGraceDays(SSN, AppURL);
   					
   					QCCSRLoginLogout.login(SSN, AppURL);
   					QCCSR_BuyBack.buyback_chkcash(SSN, AppURL);
   					QCCSRLoginLogout.logout(SSN, AppURL);
   					
   				    QCCSRLoginLogout.login(SSN, AppURL);
   				    QCCSRInternalTransfer.internaltransfer(SSN, AppURL);
   				   				    
   				    QCCSRLoginLogout.login(SSN, AppURL);
   				    QCCSRCashMgmtDeposit.cashmgmtdeposit(SSN, AppURL);
   				    QCCSRLoginLogout.logout(SSN, AppURL);
   					
   							
   					
  						
   				}
   			}
   		}
   		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint2_QF_601_TS_086_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint2_QF_601_TS_086_Txn_Testdata Transaction Failed ");					
 		}
   	}
   
   
   
   
   
   
   
   //*****************************************************************************************************
   //=================================== ONLINE SPRINT SCENARIOS STARTS =========================================
    //================ ONLINE Portal is in HOLD For New UI ========================================
   
 //=======================================  ON LINE MO PDL  ================================================ 
   // Issue : Getting invalid Verification Fee in Loan Decision Screen 
    
    @Test(priority = 999, groups = "Ratikanta_Sprint1_REQ_572_999")
    public static void QC_Sprint_B20_178_4_Txn_Testdata() throws Exception {
    //public static void QC_Accounting_OnlineRefinance_CabReturn_ACHDeposit_Return() throws Exception {
  	
  	  
  	  try {
  		 test = reports.startTest(("QC_Sprint1_B20_178_4"),  					  		    
  	   			"Lend Nation Login->Generate Online PDL Loan-->PAM Approve-->Courtesy Call-->Verify FDD Section is Displayed in Courtesy call Screen");
  	   			String FileName = "QC_Sprint_B20_178_4_Txn_Testdata.xls";
  			
  			TestData = new ExcelNew(System.getProperty("user.dir")
    					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

  			
  			int lastrow = TestData.getLastRow("Start");
  			String sheetName = "Start";
  			// int lastrow=TestData.getLastRow("Borrower");
  			System.out.println(lastrow);
  			for (int row = 2; row <= lastrow; row++) {

  				String RunFlag = TestData.getCellData(sheetName, "Run", row);
  				// System.out.println(RunFlag);
  				if (RunFlag.equals("Y")) {
  					
  				String SSN = TestData.getCellData(sheetName, "SSN", row);				
  				System.out.println(AppURL); 							 				
  				
  				LendNationRegistration.registration(SSN, AppURL);
  				LendNationPersonalInformation.personalInformation(SSN, AppURL);
  			    LendNationFinancialInformation.financialInformation(SSN, AppURL);
  			    LendNationRepaymentInformation.repaymentInformation(SSN, AppURL);			    
  				LendNationLoanDecision.loandecision(SSN, AppURL);			    			            
  			    LendNationSignContract.signContract(SSN, AppURL);
  				          				
  				QCCSR_PAM.PAMLogin(SSN, AppURL);
  				QCCSR_PAM.PAM_ACH(SSN, AppURL, loan_number);
  				
  				CentralStore_Login_Logout.login(SSN, AppURL);
  				QC_CentralStore_FDDSection_Verification.centralstore_courtesycall_fddsection_verification(SSN, AppURL);
 				CentralStore_Login_Logout.logout(SSN, AppURL);
	
    }
    }
    }
    
  	 catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_178_4_Txn_Testdata");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.FAIL, "QC_Sprint_B20_178_4_Txn_Testdata Transaction Failed ");			
 		
 		}
  	}
  
   
   
   
   
   
   
   
   
   
   //=========================================================================================================================================
 //===================== Need Clarification on B20-154-03,B20-154-04,B20-154-05,B20-154-06 Will Try later =============================================  
   //@Test(priority = 50, groups = "Ratikanta_Sprint1_REQ_564")

   public static void QC_Sprint_B20_154_3_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_Sprint1_B20_154_3"),															    
 			"Borrower Registration-->Installment Loan-->Default-->Adjust Interest-->Deposit-->Clear-->Verify Adjust Interest Void Button Should be Enable");
 			
 			
 			String FileName = "QC_Sprint_B20_154_3_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
 			int lastrow = TestData.getLastRow("Start");
 			String sheetName = "Start";
 			
 			System.out.println(lastrow);
 			for (int row = 2; row <= lastrow; row++) {

 				String RunFlag = TestData.getCellData(sheetName, "Run", row);
 				
 				if (RunFlag.equals("Y")) {
 					
 					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
 					String SSN = TestData.getCellData(sheetName, "SSN", row);

 					System.out.println(csr_url);	
 					
 					/*RProcTest.proc();						
 					Thread.sleep(2000);*/								

 					QCCSRLoginLogout.login(SSN, AppURL);
 					QCBorrowerRegistration.borrowerRegistration(SSN, AppURL);											
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);				
 					QCCSRNewLoan.newLoan(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);							      
					QCAgeStoreDueDate.ilpageStoreDueDate(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);
 					QCCSR_Deposit.depositDropDown(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					QCCSRACH_Processing_NACHA.achprocess_nacha(SSN, AppURL);
 					
 					//Return
 					QCCSR_ACHReturn.achreturn(SSN, AppURL);
 					
 					QCCSRLoginLogout.login(SSN, AppURL);
					QCCSR_LOC_ManualDefault.ilp_manualdefault(SSN, AppURL);
					
					QCCSRLoginLogout.login(SSN, AppURL);						
 					QC_Sprint_Adjust_Interestbutton_Verification.adjustinterest_amount_increased(SSN, AppURL);
 					QCCSRLoginLogout.logout(SSN, AppURL);
 					
 					//redeposit															
 				}
 			}
 		}

 		catch (Exception e) {
 			System.out.println("under catch of Test" + e);
 			String screenshotPath = getScreenhot(driver, "QC_Sprint_B20_154_3_Txn");
 			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.INFO, "QC_Sprint_B20_154_3 Transaction Failed ");			
 		
 		}
 	}	
   
   
 //===================================================================  
			
/*//================================  RATIKANTA  Accounting Scenarios  ====================================================

	             // ----------------TX PDL  Accounting Scenarios Starts ----------------
	
	             // =========== Store Used For Texas is 1031 Start Date=12/05/2019 =================
	

     @Test(priority = 1, groups = "Ratikanta_TXPDL_Accounting")
     
     public static void QC_Accounting_Deposit_Return_NSFPayment_WithoutWaive_Void_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("TXPDL_Deposit_Return_NSFPayment(Without Waive)_Void"),

						
			    "CSR Login->Borrower Registration-->NewLoan-->DueDate-->Check Deposit-->Return-->NSFPayment(Without Waive)-->Void");
				String FileName = "QC_Accounting_Deposit_Return_NSFPayment_WithoutWaive_Void_Txn_Testdata.xls";
				                 
				
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				
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
						RAdminStoreDate.txpdl_toStartdate(SSN, AppURL);															
						RQCCSRLoginLogout.Adminlogout(driver, SSN, AppURL);
						RProcTest.txpdl_proc();						
						
						Thread.sleep(2000);	
					

						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRNewLoan.newLoan(SSN, AppURL);						
						RQCCSRLoginLogout.logout(SSN, AppURL);												
						
						RQCCSRLoginLogout.login(SSN, AppURL);						      
						RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCDepositDropdown.depositDropDown(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRInternalTransfer.internaltransfer(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRCashMgmtDeposit.cashmgmtdeposit(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
												
						RQCCSRReturnPosting.returnposting(SSN, AppURL);
						         //RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCNSFPayment.nsfpayment_withoutwave(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCVoid.qcVoid(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);

					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_Accounting_Deposit_Return_NSFPayment_WithoutWaive_Void_Txn");
				
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.ERROR, "Unable to start scenarios ");
				
				

			}
		}	
 
    @Test(priority = 2, groups = "Ratikanta_TXPDL_Accounting")
     
     public static void QC_Accounting_Deposit_Return_NSFPayment_WithWaive_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("TXPDL_Deposit_Return_NSFPayment(With Waive)"),

						
			    
				"CSR Login->Borrower Registration-->NewLoan-->DueDate-->Check Deposit-->Return-->NSF Payment-->Void-->Again Validate NSFPayment With Waive(Shouldn't Allow Payment)");
				String FileName = "QC_Accounting_Deposit_Return_NSFPayment_WithWaive_Txn_Testdata.xls";
				                 
				
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					
					if (RunFlag.equals("Y")) {
						
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);
					
						System.out.println(AppURL);
					
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRNewLoan.newLoan(SSN, AppURL);						
						RQCCSRLoginLogout.logout(SSN, AppURL);												
						
						RQCCSRLoginLogout.login(SSN, AppURL);						      
						RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCDepositDropdown.depositDropDown(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRInternalTransfer.internaltransfer(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRCashMgmtDeposit.cashmgmtdeposit(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
												
						RQCCSRReturnPosting.returnposting(SSN, AppURL);
						         //RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCNSFPayment.nsfpayment_withoutwave(SSN, AppURL);					
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCVoid.qcVoid(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCNSFPayment.nsfpayment_withwave(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
																						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRHistory1.history(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						

					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_Accounting_Deposit_Return_NSFPayment_WithWaive_Txn");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.ERROR, "Unable to start scenarios ");
				
			
			}
		}
     
 @Test(priority = 3, groups = "Ratikanta_TXPDL_Accounting")
     
     public static void QC_Accounting_TexasPDL_Loan_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("TXPDL_NewLoan_ValidateDB"),

						
			    
				"CSR Login->Borrower Registration-->NewLoan-->Validate Value From Data Base");
				String FileName = "TXPDL_TexasPDL_Loan_Txn_Testdata.xls";
				                 
				
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					
					if (RunFlag.equals("Y")) {
						
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);

						System.out.println(AppURL);

						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRNewLoan.newLoan(SSN, AppURL);						
						RQCCSRLoginLogout.logout(SSN, AppURL);												
						
						RQCCSRLoginLogout.login(SSN, AppURL);						      
						RQCValidation.validation(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);					

					}
				}
			}

			catch (Exception e) {
				System.out.println("under catch of Test" + e);
				String screenshotPath = getScreenhot(driver, "QC_Accounting_TexasPDL_Loan_Txn");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.ERROR, "Unable to start scenarios ");
						
			}
		}
 
                       // ----------------MO PDL  Accounting Scenarios Starts ----------------
	
                      // =========== Store Used For MO PDL is 590 Start Date=05/01/2019 =================
     
 @Test(priority = 4, groups = "Ratikanta_MOPDL_Accounting")
 
 public static void QC_Accounting_Deposit_Return_NSFPayment_WithWaive1_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("MOPDL_Loan_DCDeposit_Return_Redeposit_Return"),

					
		    
			"CSR Login->Borrower Registration-->NewLoan-->DueDate-->DC Deposit-->Return-->Redeposit-->Return");
			String FileName = "QC_PDL_Loan_DCDeposit_Return_Redeposit_Return_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
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
					RAdminStoreDate.mopdl_toStartdate(SSN, AppURL);															
					RQCCSRLoginLogout.Adminlogout(driver, SSN, AppURL);
					RProcTest.mopdl_proc();
					Thread.sleep(2000);	
				
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQC_DC_Deposit.dc_depositDropDown(SSN, AppURL);					
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RBusinessDateCapture.businessdate(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					RQC_DC_DBReturn.dcreturn_proc();					
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQC_DCReturn_Validation.dbreturn_validation(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
															
					RQC_DC_DBReturn.redepositDC(SSN);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_DC_Redeposit.csrredepositDC(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
		

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_PDL_Loan_DCDeposit_Return_Redeposit_Return_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");
					
		}
	}
 
 @Test(priority = 5, groups = "Ratikanta_MOPDL_Accounting")
 
 public static void QC_PDL_Loan_DCDeposit_Return_NSFPayment_Less_Redeposit_Return_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("MOPDL_Loan_DCDeposit_Return_NSF Payment_Less_Redeposit_Return"),

					
		    
			"CSR Login->Borrower Registration-->NewLoan-->DueDate-->DC Deposit-->Return-->NSF Payment-->Redeposit-->Return");
			String FileName = "QC_PDL_Loan_DCDeposit_Return_NSFPayment_Less_Redeposit_Return_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);
				
					System.out.println(AppURL);
				
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQC_DC_Deposit.dc_depositDropDown(SSN, AppURL);					
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RBusinessDateCapture.businessdate(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					RQC_DC_DBReturn.dcreturn_proc();					
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQC_DCReturn_Validation.dbreturn_validation(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCNSFPayment.nsfpayment_less(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
															
					RQC_DC_DBReturn.redepositDC(SSN);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_DC_Redeposit.csrredepositDC(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);	

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_PDL_Loan_DCDeposit_Return_NSFPayment_Less_Redeposit_Return_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");
					
		}
	}
 
@Test(priority = 6, groups = "Ratikanta_MOPDL_Accounting")
 
 public static void QC_PDL_Loan_DCDeposit_Return_NSFPayment_Full_Redeposit_Return_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("MOPDL_Loan_DCDeposit_Return_NSF Payment_Full_Redeposit_Return"),

					
		    
			"CSR Login->Borrower Registration-->NewLoan-->DueDate-->DC Deposit-->Return-->Full NSF Payment-->Redeposit-->Return");
			String FileName = "QC_PDL_Loan_DCDeposit_Return_NSFPayment_Full_Redeposit_Return_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);
				
					System.out.println(AppURL);
				
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQC_DC_Deposit.dc_depositDropDown(SSN, AppURL);					
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RBusinessDateCapture.businessdate(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					RQC_DC_DBReturn.dcreturn_proc();					
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQC_DCReturn_Validation.dbreturn_validation(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCNSFPayment.nsfpayment_morethanearnfee(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
															
					RQC_DC_DBReturn.redepositDC(SSN);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_DC_Redeposit.csrredepositDC(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
		

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_PDL_Loan_DCDeposit_Return_NSFPayment_Full_Redeposit_Return_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");
					
		}
	}

@Test(priority = 7, groups = "Ratikanta_MOPDL_Accounting")

public static void QC_PDL_Loan_BuyBack_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("MOPDL_Loan_AgestoreGrace days_BuyBack_DB Validation"),

					
		    
			"CSR Login->Borrower Registration-->NewLoan-->GraceDays-->BuyBack-->Validate DB For Apportion Amount");
			String FileName = "QC_PDL_Loan_BuyBack_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);
				
					System.out.println(AppURL);
				
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					PDLBuyBack.buyback(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RDBValidation.apportionvalidation();
			
		

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_PDL_Loan_BuyBack_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");
					
		}
	}



                  // ----------------LA PDL  Accounting Scenarios Starts ----------------

                // =========== Store Used For LA PDL is 354 Start Date=05/01/2019 =================
 
@Test(priority = 8, groups = "Ratikanta_LAPDL_Accounting")

public static void QC_LAPDL_DCDeposit_Return_Redeposit_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("LAPDL_Loan_DCDeposit_Return_Redeposit_Return"),

					
		    
			"CSR Login->Borrower Registration-->NewLoan-->DueDate-->DC Deposit-->Return-->Redeposit-->Return");
			String FileName = "QC_LAPDL_DCDeposit_Return_Redeposit_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
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
					RAdminStoreDate.lapdl_toStartdate(SSN, AppURL);															
					RQCCSRLoginLogout.Adminlogout(driver, SSN, AppURL);
					RProcTest.lapdl_proc();
					Thread.sleep(2000);	
				
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);						
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQC_DC_Deposit.dc_depositDropDown(SSN, AppURL);					
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RBusinessDateCapture.businessdate(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
					
					RQC_DC_DBReturn.dcreturn_proc();					
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQC_DCReturn_Validation.dbreturn_validation(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
															
					RQC_DC_DBReturn.redepositDC(SSN);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_DC_Redeposit.csrredepositDC(SSN, AppURL);
					QCCSRLoginLogout.logout(SSN, AppURL);
		

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_PDL_Loan_DCDeposit_Return_Redeposit_Return_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");
					
		}
	}







    //===============================  ILP Accounting Scenarios Starts  ===================================
     
    //================================  Store Used 3236  ===================================================
     
 @Test(priority = 9, groups = "Ratikanta_ILP_Accounting")
     
     public static void QC_Payment_Payment2_BuyBack_ChargeBack_Txn_Testdata() throws Exception {
			try {
				test = reports.startTest(("MOILP_Payment_Payment2_BuyBack_ChargeBack"),
									    
				"CSR Login->Borrower Registration-->NewLoan-->DueDate-->Payment1-->Grace Days-->Payment2-->Grace Days-->BuyBack-->ChargeBack-->Verification Fee Validation In DB & History");
				String FileName = "QC_Payment_Payment2_BuyBack_ChargeBack_Txn_Testdata.xls";
				                 
				
				TestData = new ExcelNew(System.getProperty("user.dir")
						+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

				
				int lastrow = TestData.getLastRow("Start");
				String sheetName = "Start";
				
				System.out.println(lastrow);
				for (int row = 2; row <= lastrow; row++) {

					String RunFlag = TestData.getCellData(sheetName, "Run", row);
					
					if (RunFlag.equals("Y")) {
						
						String AppURL = TestData.getCellData(sheetName, "AppURL", row);
						String SSN = TestData.getCellData(sheetName, "SSN", row);

						System.out.println(AppURL);		
						
						RProcTest.ilp_proc();
						Thread.sleep(2000);

						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRNewLoan.newLoan(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);						      
						RQCAgeStoreDueDate.ilpageStoreDueDate(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment1(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment2(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCPayment.payment3(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						
						RQCCSRLoginLogout.login(SSN, AppURL);						
						RQCChargeBack.chargeback(SSN, AppURL);
						          
						RQCChargebackQuery.proc();
						
						RQCCSRLoginLogout.login(SSN, AppURL);
						RQCCSRHistory.historyverificationfee(SSN, AppURL);
						RQCCSRLoginLogout.logout(SSN, AppURL);
						

					}
				}
			}

			catch (Exception e) {
				//System.out.println("under catch of Test" + e);
				//String screenshotPath = getScreenhot(driver, "QC_Payment_Payment2_BuyBack_ChargeBack_Txn");
				//test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
				test.log(LogStatus.INFO, "Verification Fee Value is Null in DB ");
				
			
			}
		}	
 
 @Test(priority = 10, groups = "Ratikanta_ILP_Accounting")
 
 public static void QC_Default_Refinance_Void_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("MOILP_DefaultLoan_Refinance_Void"),
								    
			"CSR Login->Borrower Registration-->NewLoan-->Age the Store to make a Loan Default-->Refinance-->Void-->Validate DB For Void Posting");
			String FileName = "QC_Default_Refinance_Void_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRNewLoan.newLoan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRDefault.sdefault(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
										        					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRDefault_Refinance.refinance(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCVoid.qcVoid(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RDBValidation.ilpvoid_validation();
					

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_Default_Refinance_Void_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.ERROR, "Unable to start scenarios ");
			
		
		}
	}	
 

 
 
  
//----------------NV PDL & NV TLP  Accounting Scenarios Starts ----------------
	
  // =========== Store Used For NV PDL & NV TLP is 734 Start Date=05/01/2019 =================


@Test(priority = 11, groups = "Ratikanta_NVPDL_Accounting")

public static void QC_NVPDL_Deposit_Return_Payment_Deposit_Return_ReturnPaymentStore_Txn_Testdata() throws Exception {
try {
	test = reports.startTest(("NVPDL_Deposit_Return_EPP_EPPPayment_Deposit_Return_ReturnPaymentStore"),

			
 "CSR Login->Borrower Registration-->NVNewLoan-->DueDate-->Deposit-->Return-->EPP-->EPPPayment-->DueDate-->Deposit-->Return-->Return Payment through Store");
	String FileName = "QC_NVPDL_Deposit_Return_Payment_Deposit_Return_ReturnPaymentStore_Txn_Testdata.xls";
	                 
	
	TestData = new ExcelNew(System.getProperty("user.dir")
			+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

	
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
			RAdminStoreDate.nvpdl_toStartdate(SSN, AppURL);															
			RQCCSRLoginLogout.Adminlogout(driver, SSN, AppURL);			
			RProcTest.nvpdl_proc();
			Thread.sleep(2000);
						
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCCSRNewLoan.newLoan(SSN, AppURL);						
			RQCCSRLoginLogout.logout(SSN, AppURL);	
			
			RQCCSRLoginLogout.login(SSN, AppURL);						      
			RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCDepositDropdown.nvpdldeposit(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RBusinessDateCapture.businessdate(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
						
			RQCCSRReturnPosting.returnposting(SSN, AppURL);
			
			RQCAdminACHReturn.achreturn(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCCSREPP.epp(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCEPPPayment.epppayment(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);						      
			RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCDepositDropdown.nvpdldeposit(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RBusinessDateCapture.businessdate(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
						
			RQCCSRReturnPosting.returnposting(SSN, AppURL);
			
			RQCAdminACHReturn.achreturn(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);			
			RQCCSRACHPayment.achpayment(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);	
			
			RQCCSRLoginLogout.login(SSN, AppURL);			
			RQCCSRNVPDLHistory.history(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			

		}
	}
}

catch (Exception e) {
	System.out.println("under catch of Test" + e);
	String screenshotPath = getScreenhot(driver, "QC_NVPDL_Deposit_Return_Payment_Deposit_Return_ReturnPaymentStore_Txn");
	
	test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
	test.log(LogStatus.ERROR, "Unable to start scenarios ");
	
	

}
}	

@Test(priority = 12, groups = "Ratikanta_NVPDL_Accounting")

public static void QC_NVPDL_Deposit_Return_Payment_Deposit_Return_ReturnPaymentFullStore_Txn_Testdata() throws Exception {
try {
	test = reports.startTest(("NVPDL_Deposit_Return_EPP_EPPPayment_Deposit_Return_ReturnPaymentFullStore"),

			
 "CSR Login->Borrower Registration-->NVNewLoan-->DueDate-->Deposit-->Return-->EPP-->EPPPayment-->DueDate-->Deposit-->Return-->Return Payment Full through Store");
	String FileName = "QC_NVPDL_Deposit_Return_Payment_Deposit_Return_ReturnPaymentFullStore_Txn_Testdata.xls";
	                 
	
	TestData = new ExcelNew(System.getProperty("user.dir")
			+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

	
	int lastrow = TestData.getLastRow("Start");
	String sheetName = "Start";
	
	System.out.println(lastrow);
	for (int row = 2; row <= lastrow; row++) {

		String RunFlag = TestData.getCellData(sheetName, "Run", row);
		
		if (RunFlag.equals("Y")) {
			
			String AppURL = TestData.getCellData(sheetName, "AppURL", row);
			String SSN = TestData.getCellData(sheetName, "SSN", row);

			System.out.println(AppURL);
						
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCCSRNewLoan.newLoan(SSN, AppURL);						
			RQCCSRLoginLogout.logout(SSN, AppURL);	
			
			RQCCSRLoginLogout.login(SSN, AppURL);						      
			RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCDepositDropdown.nvpdldeposit(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RBusinessDateCapture.businessdate(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
						
			RQCCSRReturnPosting.returnposting(SSN, AppURL);
			
			RQCAdminACHReturn.achreturn(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCCSREPP.epp(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCEPPPayment.epppayment(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);						      
			RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCDepositDropdown.nvpdldeposit(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RBusinessDateCapture.businessdate(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
						
			RQCCSRReturnPosting.returnposting(SSN, AppURL);
			
			RQCAdminACHReturn.achreturn(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);			
			RQCCSRACHPayment.fullachpayment(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);	
			
			RQCCSRLoginLogout.login(SSN, AppURL);			
			RQCCSRNVPDLHistory.history(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			

		}
	}
}

catch (Exception e) {
	System.out.println("under catch of Test" + e);
	String screenshotPath = getScreenhot(driver, "QC_NVPDL_Deposit_Return_Payment_Deposit_Return_ReturnPaymentFullStore_Txn");
	
	test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
	test.log(LogStatus.ERROR, "Unable to start scenarios ");
	
	

}
}	

@Test(priority = 13, groups = "Ratikanta_NVTLP_Accounting")

public static void QC_NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC_Txn_Testdata() throws Exception {
try {
	test = reports.startTest(("NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC"),

			
 "CSR Login->Borrower Registration-->NVNewLoanWithNOC-->Age Store to More than 2 Month-->Default-->Return-->EPP-->EPPPayment-->DB Validation For Payment Plan Posted or Not-->Application Validation for Payment Plan");
	String FileName = "QC_NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC_Txn_Testdata.xls";
	                 
	
	TestData = new ExcelNew(System.getProperty("user.dir")
			+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

	
	int lastrow = TestData.getLastRow("Start");
	String sheetName = "Start";
	
	System.out.println(lastrow);
	for (int row = 2; row <= lastrow; row++) {

		String RunFlag = TestData.getCellData(sheetName, "Run", row);
		
		if (RunFlag.equals("Y")) {
			
			String AppURL = TestData.getCellData(sheetName, "AppURL", row);
			String SSN = TestData.getCellData(sheetName, "SSN", row);

			System.out.println(AppURL);								
			RProcTest.nvpdl_proc();
			Thread.sleep(3000);
			RProcTest.nvtlp_proc();
			
			Thread.sleep(2000);	
						
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCCSRNewLoan.newLoan(SSN, AppURL);						
			RQCCSRLoginLogout.logout(SSN, AppURL);	
			
			RQCCSRLoginLogout.login(SSN, AppURL);						      
			RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCDefault.tlpdefaultchk(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCCSREPP.epp(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCEPPPayment.dcepppayment(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RDBValidation.tlpdbvalidation();
			
			RQCCSRLoginLogout.login(SSN, AppURL);			
			QCCSRPaymentPlanValidation.paymentplanvalidation(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
							
		}
	}
}

catch (Exception e) {
	System.out.println("under catch of Test" + e);
	String screenshotPath = getScreenhot(driver, "QC_NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC_Txn");
	
	test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
	test.log(LogStatus.ERROR, "Unable to start scenarios ");
	
	

}
}	

@Test(priority = 14, groups = "Ratikanta_NVTLP_Accounting")

public static void QC_NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC_Void_Txn_Testdata() throws Exception {
try {
	test = reports.startTest(("NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC_Void"),

			
 "CSR Login->Borrower Registration-->NVNewLoanWithNOC-->Age Store to More than 2 Month-->Default-->Return-->EPP-->EPPPayment-->Void-->DB Validation For Payment Plan Posted or Not-->Application Validation for Payment Plan");
	String FileName = "QC_NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC_Void_Txn_Testdata.xls";
	                 
	
	TestData = new ExcelNew(System.getProperty("user.dir")
			+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

	
	int lastrow = TestData.getLastRow("Start");
	String sheetName = "Start";
	
	System.out.println(lastrow);
	for (int row = 2; row <= lastrow; row++) {

		String RunFlag = TestData.getCellData(sheetName, "Run", row);
		
		if (RunFlag.equals("Y")) {
			
			String AppURL = TestData.getCellData(sheetName, "AppURL", row);
			String SSN = TestData.getCellData(sheetName, "SSN", row);

			System.out.println(AppURL);
			
			RProcTest.nvpdl_proc();
			Thread.sleep(3000);
			RProcTest.nvtlp_proc();
			
			Thread.sleep(2000);	
						
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCCSRNewLoan.newLoan(SSN, AppURL);						
			RQCCSRLoginLogout.logout(SSN, AppURL);	
			
			RQCCSRLoginLogout.login(SSN, AppURL);						      
			RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCDefault.tlpdefaultchk(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCCSREPP.epp(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCEPPPayment.dcepppayment(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCVoid.tlpVoid(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RDBValidation.tlpdbvalidation();
			
			RQCCSRLoginLogout.login(SSN, AppURL);			
			QCCSRPaymentPlanValidation.paymentplanvalidation(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
							
		}
	}
}

catch (Exception e) {
	System.out.println("under catch of Test" + e);
	String screenshotPath = getScreenhot(driver, "QC_NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC_Void_Txn");
	
	test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
	test.log(LogStatus.ERROR, "Unable to start scenarios ");		
}
}	

//==========================  LOC Accounting Scenarios Start  ================================

//============================= Store Used = 523 Start Date : 05/02/2018 ===============================================


@Test(priority = 15, groups = "Ratikanta_LOC_Accounting")

public static void QC_LOC_SignatureLoan_Default_Refinance_StepSame_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_LOC_SignatureLoan_Default_Refinance_StepSame"),
								    
			"CSR Login->Borrower Registration-->NewLoan(Signature)-->DueDate-->Grace Days-->Due Date-->Grace Days-->Default-->Refinance-->StepSame");
			String FileName = "QC_LOC_SignatureLoan_Default_Refinance_StepSame_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
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
					RAdminStoreDate.ksloc_toStartdate(SSN, AppURL);															
					RQCCSRLoginLogout.Adminlogout(driver, SSN, AppURL);				
					RProcTest.proc();
					Thread.sleep(2000);


					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRSignatureLoan.signatureloan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCDefault.defaultchk(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCRefinance.StepSame(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOCHistory.lochistory(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
										
				}
			}
		}

		catch (Exception e) {
			//System.out.println("under catch of Test" + e);
			//String screenshotPath = getScreenhot(driver, "QC_Payment_Payment2_BuyBack_ChargeBack_Txn");
			//test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.INFO, "QC_LOC_SignatureLoan_Default_Refinance_StepSame Transaction Failed ");
			
		
		}
	}	

@Test(priority = 16, groups = "Ratikanta_LOC_Accounting")

public static void QC_LOC_SignatureLoan_Default_Refinance_StepSame_WaiveFee_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_LOC_SignatureLoan_Default_Refinance_StepSame_WaiveFee"),
								    
			"CSR Login->Borrower Registration-->NewLoan(Signature)-->Run 2 Statements-->Default-->Refinance-->StepSame-->WaiveFee");
			String FileName = "QC_LOC_SignatureLoan_Default_Refinance_StepSame_WaiveFee_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRSignatureLoan.signatureloan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCDefault.defaultchk(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCRefinance.StepSame_WaiveFee(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
															
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOCHistory.lochistory(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
										
				}
			}
		}

		catch (Exception e) {
			//System.out.println("under catch of Test" + e);
			//String screenshotPath = getScreenhot(driver, "QC_Payment_Payment2_BuyBack_ChargeBack_Txn");
			//test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.INFO, "QC_LOC_SignatureLoan_Default_Refinance_StepSame_WaiveFee Transaction Failed ");
			
		
		}
	}	
  

@Test(priority = 17, groups = "Ratikanta_LOC_Accounting")

public static void QC_LOC_SignatureLoan_WaiveFeeFull_Default_Refinance_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_LOC_SignatureLoan_WaiveFeeFull_Default_Refinance"),
								    
			"CSR Login->Borrower Registration-->NewLoan(Signature)-->Run 2 statements-->WaiveFee-->Default-->Refinance");
			String FileName = "QC_LOC_SignatureLoan_WaiveFeeFull_Default_Refinance_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRSignatureLoan.signatureloan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCWaiveFee.WaiveFee(SSN, AppURL);
																			
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCDefault.defaultchk(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCRefinance.normalrefinance(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOCHistory.lochistory(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);									

				}
			}
		}

		catch (Exception e) {
			//System.out.println("under catch of Test" + e);
			//String screenshotPath = getScreenhot(driver, "QC_Payment_Payment2_BuyBack_ChargeBack_Txn");
			//test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.INFO, "QC_LOC_SignatureLoan_WaiveFeeFull_Default_Refinance Transaction Failed ");
			
		
		}
	}	 
   
@Test(priority = 18, groups = "Ratikanta_LOC_Accounting")

public static void QC_LOC_SignatureLoan_WaiveFeePartial_Default_Refinance_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_LOC_SignatureLoan_WaiveFeePartial_Default_Refinance"),
								    
			"CSR Login->Borrower Registration-->NewLoan(Signature)-->Run 2 statements-->WaiveFee Partial-->Default-->Refinance");
			String FileName = "QC_LOC_SignatureLoan_WaiveFeePartial_Default_Refinance_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);


					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRSignatureLoan.signatureloan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCWaiveFee.WaiveFee_Partial(SSN, AppURL);
																			
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCDefault.defaultchk(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCRefinance.normalrefinance(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOCHistory.lochistory(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
										
				}
			}
		}

		catch (Exception e) {
			//System.out.println("under catch of Test" + e);
			//String screenshotPath = getScreenhot(driver, "QC_Payment_Payment2_BuyBack_ChargeBack_Txn");
			//test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.INFO, "QC_LOC_SignatureLoan_WaiveFeePartial_Default_Refinance Transaction Failed ");
			
		
		}
	}	 

@Test(priority = 19, groups = "Ratikanta_LOC_Accounting")

public static void QC_LOC_SignatureLoan_Default_Refinance_StepUp_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_LOC_SignatureLoan_Default_Refinance_StepUp"),
								    
			"CSR Login->Borrower Registration-->NewLoan(Signature)-->Run 2 Statements-->Default-->Refinance-->StepUp");
			String FileName = "QC_LOC_SignatureLoan_Default_Refinance_StepUp_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRSignatureLoan.signatureloan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCDefault.defaultchk(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCRefinance.StepUp(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOCHistory.lochistory(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);										

				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_Payment_Payment2_BuyBack_ChargeBack_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.FAIL, "QC_LOC_SignatureLoan_Default_Refinance_StepUp Transaction Failed ");					
		}
	}

//========= Exclude Priority=6 scenario ============

@Test(priority = 6, groups = "Ratikanta_LOC_Accounting")

public static void QC_LOC_SignatureLoan_Default_Refinance_StepUp_WaiveFeeTxn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_LOC_SignatureLoan_Default_Refinance(WaiveFee)_StepUp"),
								    
			"CSR Login->Borrower Registration-->NewLoan(Signature)-->Run 2 Statements-->Default-->Refinance(WaiveFee)-->StepUp");
			String FileName = "QC_LOC_SignatureLoan_Default_Refinance_StepUp_WaiveFeeTxn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRSignatureLoan.signatureloan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCDefault.defaultchk(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);										
					RQCRefinance.StepUp_WaiveFee(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOCHistory.lochistory(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
										
				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_LOC_SignatureLoan_Default_Refinance_StepUp_WaiveFee_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.INFO, "QC_LOC_SignatureLoan_Default_Refinance_StepUp_WaiveFee Transaction Failed ");			
		
		}
	}

@Test(priority = 20, groups = "Ratikanta_LOC_Accounting")

public static void QC_LOC_Default_Repo_Refinance_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("KSLOC_TitleLoan_Default_Repo_Refinance"),
								    
			"CSR Login->Borrower Registration-->KS TitleNewLoan-->Default-->Send Repo Request-->Approve-->Out For Repo-->Check Repo is Available in dropdown List-->Refinance");
			String FileName = "QC_LOC_Default_Repo_Refinance_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);							
					RProcTest.proc();
					
					Thread.sleep(2000);								

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);					
					RQCCSRNewLoan.newLoan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCDefault.defaultchk(SSN, AppURL);
					
					RAdmin_Repo.repo(driver, SSN, AppURL);
					
					RAdmin_RepoApproval.repoapproval(driver, SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RBusinessDateCapture.businessdate(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RAdmin_OutForRepo.outforrepo(driver, SSN, AppURL);
					           		
					RAdmin_Repo_Validation.repovalidation(driver, SSN, AppURL);
					          
					RQCCSRLoginLogout.login(SSN, AppURL);										
					RQCRefinance.SecuredLocStepSame(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOCHistory.lochistory(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
						
				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_LOC_Default_Repo_Refinance_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.INFO, "QC_LOC_Loan_Default_Repo_Refinance Transaction Failed ");			
		
		}
	}

@Test(priority = 21, groups = "Ratikanta_LOC_Accounting")

public static void QC_LOC_Payment_Default_Repo_Refinance_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("KSLOC_TitleLoan_Payment_Default_Repo_Refinance"),
								    
			"CSR Login->Borrower Registration-->KS TitleNewLoan-->Payment-->Default-->Send Repo Request-->Approve-->Out For Repo-->Check Repo is Available in dropdown List-->Refinance");
			String FileName = "QC_LOC_Payment_Default_Repo_Refinance_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);							
					RProcTest.proc();
					
					Thread.sleep(2000);					

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);					
					RQCCSRNewLoan.newLoan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRPayment.payment(SSN, AppURL);
										
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCDefault.defaultchk(SSN, AppURL);
					
					RAdmin_Repo.repo(driver, SSN, AppURL);
					
					RAdmin_RepoApproval.repoapproval(driver, SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RBusinessDateCapture.businessdate(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RAdmin_OutForRepo.outforrepo(driver, SSN, AppURL);
					
					RAdmin_Repo_Validation.repovalidation(driver, SSN, AppURL);
															           					
					RQCCSRLoginLogout.login(SSN, AppURL);										
					RQCRefinance.SecuredLocStepSame(SSN, AppURL);
					        //RQCRefinance.lessthansecuredlocamount(SSN, AppURL);				
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOCHistory.lochistory(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);					
	
				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_LOC_Payment_Default_Repo_Refinance_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.INFO, "QC_LOC_Loan_Payment_Default_Repo_Refinance Transaction Failed ");
			
		
		}
	}

@Test(priority = 22, groups = "Ratikanta_LOC_Accounting")

public static void QC_LOC_Payment_Default_Repo_RefinanceWithDisb_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("KSLOC_TitleLoan_Payment_Default_Repo_RefinanceWithDisb"),
								    
			"CSR Login->Borrower Registration-->KS TitleNewLoan-->Payment-->Default-->Send Repo Request-->Approve-->Out For Repo-->Check Repo is Available in dropdown List-->RefinanceWithDisb");
			String FileName = "QC_LOC_Payment_Default_Repo_RefinanceWithDisb_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);							
					RProcTest.proc();
					
					Thread.sleep(2000);								

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);					
					RQCCSRNewLoan.newLoan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRPayment.payment(SSN, AppURL);
										
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCDefault.defaultchk(SSN, AppURL);
					
					RAdmin_Repo.repo(driver, SSN, AppURL);
					
					RAdmin_RepoApproval.repoapproval(driver, SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RBusinessDateCapture.businessdate(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RAdmin_OutForRepo.outforrepo(driver, SSN, AppURL);
					
					RAdmin_Repo_Validation.repovalidation(driver, SSN, AppURL);
															           					
					RQCCSRLoginLogout.login(SSN, AppURL);															
				    RQCRefinance.lessthansecuredlocamount(SSN, AppURL);				
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOCHistory.lochistory(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
						
				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_LOC_Payment_Default_Repo_RefinanceWithDisb_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.INFO, "QC_LOC_Loan_Payment_Default_Repo_RefinanceWithDisb Transaction Failed ");			
		
		}
	}

@Test(priority = 23, groups = "Ratikanta_LOC_Accounting")

public static void QC_LOC_Payment_Default_DefaultPayment_Repo_RefinanceWithDisb_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("KSLOC_TitleLoan_Payment_Default_DefaultPaymentLess Than Due Amount_Repo_RefinanceWithDisb"),
								    
			"CSR Login->Borrower Registration-->KS TitleNewLoan-->Payment-->Default-->DefaultPaymentLess Than Due Amount-->Send Repo Request-->Approve-->Out For Repo-->Check Repo is Available in dropdown List-->RefinanceWithDisb");
			String FileName = "QC_LOC_Payment_Default_DefaultPayment_Repo_RefinanceWithDisb_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);							
					RProcTest.proc();
					
					Thread.sleep(2000);									

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);					
					RQCCSRNewLoan.newLoan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRPayment.payment(SSN, AppURL);
										
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOC_ManualDefault.manualdefault(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCDefault.defaultchk(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRDefaultPayment.sdefaultpayment(SSN, AppURL);
															
					RAdmin_Repo.repo(driver, SSN, AppURL);
					
					RAdmin_RepoApproval.repoapproval(driver, SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RBusinessDateCapture.businessdate(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RAdmin_OutForRepo.outforrepo(driver, SSN, AppURL);
					
					RAdmin_Repo_Validation.repovalidation(driver, SSN, AppURL);
															           					
					RQCCSRLoginLogout.login(SSN, AppURL);															
				            //RQCRefinance.refinanceshouldnttallow(SSN, AppURL);	
				    RQCRefinance.SecuredLocStepSame(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSR_LOCHistory.lochistory(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
						
				}
			}
		}

		catch (Exception e) {
			System.out.println("under catch of Test" + e);
			String screenshotPath = getScreenhot(driver, "QC_LOC_Payment_Default_DefaultPayment_Repo_RefinanceWithDisb_Txn");
			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.INFO, "QC_LOC_Loan_Payment_Default_DefaultPayment_Repo_RefinanceWithDisb Transaction Failed ");			
		
		}
	}

@Test(priority = 24, groups = "Ratikanta_LOC_Accounting")

public static void QC_LOC_SignatureLoan_Runtwostatements_WaiveFee_CheckWaiveFeein2997Store_Txn_Testdata() throws Exception {
		try {
			test = reports.startTest(("QC_LOC_SignatureLoan_Run Two Statements_WaiveFee_Check Post WaiveFee in 2997 Store"),
								    
			"CSR Login->Borrower Registration-->NewLoan(Signature)-->Run 2 statements-->WaiveFee-->PostWaiveFee in 2997");
			String FileName = "QC_LOC_SignatureLoan_Runtwostatements_WaiveFee_CheckWaiveFeein2997Store_Txn_Testdata.xls";
			                 
			
			TestData = new ExcelNew(System.getProperty("user.dir")
					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

			
			int lastrow = TestData.getLastRow("Start");
			String sheetName = "Start";
			
			System.out.println(lastrow);
			for (int row = 2; row <= lastrow; row++) {

				String RunFlag = TestData.getCellData(sheetName, "Run", row);
				
				if (RunFlag.equals("Y")) {
					
					String AppURL = TestData.getCellData(sheetName, "AppURL", row);
					String SSN = TestData.getCellData(sheetName, "SSN", row);

					System.out.println(AppURL);

					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCCSRSignatureLoan.signatureloan(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);						      
					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
					
					RQCCSRLoginLogout.login(SSN, AppURL);
					RQCWaiveFee.WaiveFee(SSN, AppURL); 																								
										
					QCCSRPaymentPlanValidation.waivefeevalidation(SSN, AppURL);
					RQCCSRLoginLogout.logout(SSN, AppURL);									

				}
			}
		}

		catch (Exception e) {
			//System.out.println("under catch of Test" + e);
			//String screenshotPath = getScreenhot(driver, "QC_Payment_Payment2_BuyBack_ChargeBack_Txn");
			//test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
			test.log(LogStatus.INFO, "QC_LOC_SignatureLoan_Runtwostatements_WaiveFee_CheckWaiveFeein2997Store Transaction Failed ");
			
		
		}
	}	 

//======== This scenario(Priority 15) will work only when we have payment plan posted in DB, because NSF Posting(DC Return) is not possible without record.=====


//@Test(priority = 15, groups = "Ratikanta_NVTLP_Accounting")

public static void QC_NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC_NSFPosting_Txn_Testdata() throws Exception {
try {
	test = reports.startTest(("NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC_NSF Posting"),

			
 "CSR Login->Borrower Registration-->NVNewLoanWithNOC-->Age Store to More than 2 Month-->Default-->Return-->EPP-->EPPPayment-->NSF Posting(DC Return)-->DB Validation For Payment Plan Posted or Not-->Application Validation for Payment Plan");
	String FileName = "QC_NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC_NSFPosting_Txn_Testdata.xls";
	                 
	
	TestData = new ExcelNew(System.getProperty("user.dir")
			+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

	
	int lastrow = TestData.getLastRow("Start");
	String sheetName = "Start";
	
	System.out.println(lastrow);
	for (int row = 2; row <= lastrow; row++) {

		String RunFlag = TestData.getCellData(sheetName, "Run", row);
		
		if (RunFlag.equals("Y")) {
			
			String AppURL = TestData.getCellData(sheetName, "AppURL", row);
			String SSN = TestData.getCellData(sheetName, "SSN", row);

			System.out.println(AppURL);
						
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCBorrowerRegistration.borrowerRegistration(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCCSRNewLoan.newLoan(SSN, AppURL);						
			RQCCSRLoginLogout.logout(SSN, AppURL);	
			
			RQCCSRLoginLogout.login(SSN, AppURL);						      
			RQCAgeStoreDueDate.pdlageStoreDueDate(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCDefault.tlpdefaultchk(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCCSREPP.epp(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQCEPPPayment.dcepppayment(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RBusinessDateCapture.businessdate(SSN, AppURL);
			QCCSRLoginLogout.logout(SSN, AppURL);
			
			RQC_DC_DBReturn.dcreturn_proc();					
			
			RQCCSRLoginLogout.login(SSN, AppURL);
			RQC_DCReturn_Validation.dbreturn_validation(SSN, AppURL);
			QCCSRLoginLogout.logout(SSN, AppURL);
										
			RDBValidation.tlpdbvalidation();
			
			RQCCSRLoginLogout.login(SSN, AppURL);			
			QCCSRPaymentPlanValidation.paymentplanvalidation(SSN, AppURL);
			RQCCSRLoginLogout.logout(SSN, AppURL);
		
			
		
		}
	}
}

catch (Exception e) {
	System.out.println("under catch of Test" + e);
	String screenshotPath = getScreenhot(driver, "QC_NVTLP_LoanWithNOC_Default_EPP_PaymentWithDC_NSFPosting_Txn");
	
	test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
	test.log(LogStatus.ERROR, "Unable to start scenarios ");
	
	

}
}	
 
 //=============================================================================   
  //@Test(priority = 11, groups = "Ratikanta_LOC_Accounting")
  
  public static void QC_LOC_SignatureLoan_Default_Refinance_StepDown_Txn_Testdata() throws Exception {
 		try {
 			test = reports.startTest(("QC_LOC_SignatureLoan_Default_Refinance_StepDown"),
 								    
 			"CSR Login->Borrower Registration-->NewLoan(Signature)-->DueDate-->Grace Days-->Due Date-->Grace Days-->Default-->Refinance-->StepDown");
 			String FileName = "QC_LOC_SignatureLoan_Default_Refinance_StepDown_Txn_Testdata.xls";
 			                 
 			
 			TestData = new ExcelNew(System.getProperty("user.dir")
 					+ prop.getProperty("QC_Store_NewLoan_Test_data_sheet_path") + FileName);

 			
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
 					RQCCSRSignatureLoan.signatureloan(SSN, AppURL);
 					RQCCSRLoginLogout.logout(SSN, AppURL);
 					
 					RQCCSRLoginLogout.login(SSN, AppURL);						      
 					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
 					
 					RQCCSRLoginLogout.login(SSN, AppURL);
 					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
 					
 					RQCCSRLoginLogout.login(SSN, AppURL);						      
 					RQCAgeStoreDueDate.ageStoreDueDate(SSN, AppURL);
 					
 					RQCCSRLoginLogout.login(SSN, AppURL);
 					RQCAgeStoreGraceDays.ageStoreGraceDays(SSN, AppURL);
 					
 					RQCCSRLoginLogout.login(SSN, AppURL);
 					RQCDefault.defaultchk(SSN, AppURL);
 					
 					RQCCSRLoginLogout.login(SSN, AppURL);
 					RQCRefinance.StepDown(SSN, AppURL);
 					RQCCSRLoginLogout.logout(SSN, AppURL);
 					
 					RQCCSRLoginLogout.login(SSN, AppURL);
 					RQCCSR_LOCHistory.lochistory(SSN, AppURL);
 					RQCCSRLoginLogout.logout(SSN, AppURL);
 					
 					

 				}
 			}
 		}

 		catch (Exception e) {
 			//System.out.println("under catch of Test" + e);
 			//String screenshotPath = getScreenhot(driver, "QC_Payment_Payment2_BuyBack_ChargeBack_Txn");
 			//test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
 			test.log(LogStatus.INFO, "QC_LOC_SignatureLoan_Default_Refinance_StepDown Transaction Failed ");
 			
 		
 		}
 	}	*/
    		
	 
 
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

						new FileReader("C:/QC_Batch_191/QC_Sprint_1_Scenarios/src/test/java/tests/Objects.properties"));

				prop = new Properties();
				prop.load(Rreader);
				Rreader.close();
				csr_url = prop.getProperty("CSR_URL");
				csrloginpage = prop.getProperty("Login_Page");
				AdminURL = prop.getProperty("ADMIN_CSR_URL");
				DBUserName = prop.getProperty("DB_UserName");
				DBPassword = prop.getProperty("DB_Password");
				
				String Rfilename = prop.getProperty("QC_Store_extent_report_file_name") + timestamp + ".html";

				reports = new ExtentReports(
						System.getProperty("user.dir") + prop.getProperty("QC_Store_extent_report_path") + Rfilename,
						true);

			}

			catch (Exception e) {

				System.out.println("Object proprties file not found");
			}

		

			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/IEDriverServer.exe");
			/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5000);*/	

			//BufferedReader reader;
			String propertyFilePath=("user.dir")+"/Objects.properties";
		
		
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
