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

    
 //=======================================  ON LINE MO ILP  ================================================ 
	    //=======================================  ON LINE MO ILP // SSN = 993838213-993838214 Acct No = 0049-0050 ================================================ 
	   
		// Receive Type as : "Cash At Store" and Repayment Method  as  : "ACH" 
     
   @Test(priority = 1, groups = "Ratikanta_Online_MOILP")
     public static void QC_Sprint_Online_MOILP_ACH_CashAtStore_Txn_Testdata() throws Exception {
    
   	  try {
   		 test = reports.startTest(("QC_Online_MOILP_ACH_ReceiveType As CashAtStore"),  					  		    
   	   			"Lend Nation Login->Generate Online ILP Loan With ACH-->Approve Loan In PAM (2997 Store) For Cash At Store-->Complete Loan in 118 Store");
   	   			String FileName = "QC_Sprint_Online_MOILP_ACH_CashAtStore_Txn_Testdata.xls";
   			
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
   				String ReceiveType = TestData.getCellData(sheetName, "ReceiveType", row);
   				System.out.println(AppURL); 							 				
   				
   				LendNationRegistration.registration(SSN, AppURL);
   				LendNationPersonalInformation.personalInformation(SSN, AppURL);
   			    LendNationFinancialInformation.financialInformation(SSN, AppURL);
   			    LendNationRepaymentInformation.repaymentInformation(SSN, AppURL);			    
   				LendNationLoanDecision.moilp_loandecision(SSN, AppURL);			    			            
   			    LendNationSignContract.signContract(SSN, AppURL);
   				          				  				 
   				
   				if(ReceiveType.equalsIgnoreCase("Cash At Store"))
  			    {		  				
  				QCCSR_PAM.CashAtStore(SSN, AppURL);
  				
  				QCCSR_PAM.PAMLogin(SSN, AppURL);
				QCCSR_PAM.PAM_ACH(SSN, AppURL, loan_number);
  			    }
  			
  			else{
  				QCCSR_PAM.PAMLogin(SSN, AppURL);
  				QCCSR_PAM.PAM_ACH(SSN, AppURL, loan_number);
  				
  			    }
 	
     }
     }
     }
     
   	 catch (Exception e) {
  			System.out.println("under catch of Test" + e);
  			String screenshotPath = getScreenhot(driver, "QC_Sprint_Online_MOILP_ACH_CashAtStore_Txn_Testdata");
  			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
  			test.log(LogStatus.FAIL, "QC_Sprint_Online_MOILP_ACH_CashAtStore_Txn_Testdata Transaction Failed ");			
  		
  		}
   	}
     
     
 //=======================================  ON LINE MO ILP  ================================================ 
   	     //=======================================  ON LINE MO ILP // SSN = 993838215-993838216 Acct No = 0051-0052 ================================================ 
   	   
   		 // Receive Type as : "ACH" and Repayment Method  as  : "ACH" 
        
     @Test(priority = 2, groups = "Ratikanta_Online_MOILP")
        public static void QC_Sprint_Online_MOILP_ACH_Txn_Testdata() throws Exception {
       
      	  try {
      		 test = reports.startTest(("QC_Online_MOILP_ACH_ReceiveType As ACH"),  					  		    
      	   			"Lend Nation Login->Generate Online ILP Loan With ACH-->Approve Loan In PAM (2997 Store)-->Complete Loan in PAM");
      	   			String FileName = "QC_Sprint_Online_MOILP_ACH_Txn_Testdata.xls";
      			
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
      				String ReceiveType = TestData.getCellData(sheetName, "ReceiveType", row);
      				System.out.println(AppURL); 							 				
      				
      				LendNationRegistration.registration(SSN, AppURL);
      				LendNationPersonalInformation.personalInformation(SSN, AppURL);
      			    LendNationFinancialInformation.financialInformation(SSN, AppURL);
      			    LendNationRepaymentInformation.repaymentInformation(SSN, AppURL);			    
      				LendNationLoanDecision.moilp_loandecision(SSN, AppURL);			    			            
      			    LendNationSignContract.signContract(SSN, AppURL);
      				          				  				 
      				
      				if(ReceiveType.equalsIgnoreCase("Cash At Store"))
     			    {		  				
     				QCCSR_PAM.CashAtStore(SSN, AppURL);
     				
     				QCCSR_PAM.PAMLogin(SSN, AppURL);
   				    QCCSR_PAM.PAM_ACH(SSN, AppURL, loan_number);
     			    }
     			
     			else{
     				QCCSR_PAM.PAMLogin(SSN, AppURL);
     				QCCSR_PAM.PAM_ACH(SSN, AppURL, loan_number);
     				
     			    }
    	
        }
        }
        }
        
      	 catch (Exception e) {
     			System.out.println("under catch of Test" + e);
     			String screenshotPath = getScreenhot(driver, "QC_Sprint_Online_MOILP_ACH_Txn_Testdata");
     			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
     			test.log(LogStatus.FAIL, "QC_Sprint_Online_MOILP_ACH_Txn_Testdata Transaction Failed ");			
     		
     		}
      	}
        
 //=======================================  ON LINE MO ILP  ================================================ 
      	   //=======================================  ON LINE MO ILP // SSN = 993838217-993838218 Acct No = 0053-0054 ================================================ 
      	   
          // Receive Type as : "ACH" and Repayment Method  as  : "Debit Card"  
           
     @Test(priority = 3, groups = "Ratikanta_Online_MOILP")
           public static void QC_Sprint_Online_MOILP_DC_ACH_Txn_Testdata() throws Exception {
           
         	  try {
         		 test = reports.startTest(("QC_Online_MOILP_ACH_ReceiveType As ACH"),  					  		    
         	   			"Lend Nation Login->Generate Online ILP Loan With DC-->Approve Loan In PAM (2997 Store)-->Complete Loan in PAM");
         	   			String FileName = "QC_Sprint_Online_MOILP_DC_ACH_Txn_Testdata.xls";
         			
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
         				String ReceiveType = TestData.getCellData(sheetName, "ReceiveType", row);
         				System.out.println(AppURL); 							 				
         				
         				LendNationRegistration.registration(SSN, AppURL);
         				LendNationPersonalInformation.personalInformation(SSN, AppURL);
         			    LendNationFinancialInformation.financialInformation(SSN, AppURL);
         			    LendNationRepaymentInformation.repaymentInformation(SSN, AppURL);			    
         				LendNationLoanDecision.moilp_loandecision(SSN, AppURL);			    			            
         			    LendNationSignContract.ilp_dc_ACH_signContract(SSN, AppURL);
         				          				  				 
         				
         				if(ReceiveType.equalsIgnoreCase("Cash At Store"))
        			    {		  				
        				QCCSR_PAM.CashAtStore(SSN, AppURL);
        				
        				QCCSR_PAM.PAMLogin(SSN, AppURL);
      				    QCCSR_PAM.PAM_ACH(SSN, AppURL, loan_number);
        			    }
        			
        			else{
        				QCCSR_PAM.PAMLogin(SSN, AppURL);
        				QCCSR_PAM.PAM_ACH(SSN, AppURL, loan_number);
        				
        			    }
       	
           }
           }
           }
           
         	 catch (Exception e) {
        			System.out.println("under catch of Test" + e);
        			String screenshotPath = getScreenhot(driver, "QC_Sprint_Online_MOILP_DC_ACH_Txn_Testdata");
        			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
        			test.log(LogStatus.FAIL, "QC_Sprint_Online_MOILP_DC_ACH_Txn_Testdata Transaction Failed ");			
        		
        		}
         	}
           
 //=======================================  ON LINE MO ILP  ================================================ 
        //=======================================  ON LINE MO ILP // SSN = 993838219-993838220 Acct No = 0055-0056 ================================================ 
        	   
        // Receive Type as : "Cash At Store" and Repayment Method  as  : "Debit Card"   
             
    @Test(priority = 4, groups = "Ratikanta_Online_MOILP")
             public static void QC_Sprint_Online_MOILP_DC_ACH_CashAtStore_Txn_Testdata() throws Exception {
            
           	  try {
           		 test = reports.startTest(("QC_Online_MOILP_DC_ReceiveType As CashAtStore"),  					  		    
           	   			"Lend Nation Login->Generate Online ILP Loan With DC-->Approve Loan In PAM (2997 Store) For Cash At Store-->Complete Loan in 118 Store");
           	   			String FileName = "QC_Sprint_Online_MOILP_DC_ACH_CashAtStore_Txn_Testdata.xls";
           			
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
           				String ReceiveType = TestData.getCellData(sheetName, "ReceiveType", row);
           				System.out.println(AppURL); 							 				
           				
           				LendNationRegistration.registration(SSN, AppURL);
           				LendNationPersonalInformation.personalInformation(SSN, AppURL);
           			    LendNationFinancialInformation.financialInformation(SSN, AppURL);
           			    LendNationRepaymentInformation.repaymentInformation(SSN, AppURL);			    
           				LendNationLoanDecision.moilp_loandecision(SSN, AppURL);			    			            
           			    LendNationSignContract.ilp_dc_CashatStore_signContract(SSN, AppURL);
           				          				  				 
           				
           				if(ReceiveType.equalsIgnoreCase("Cash At Store"))
          			    {		  				
          				QCCSR_PAM.CashAtStore(SSN, AppURL);
          				
          				QCCSR_PAM.PAMLogin(SSN, AppURL);
        				QCCSR_PAM.PAM_ACH(SSN, AppURL, loan_number);
          			    }
          			
          			else{
          				QCCSR_PAM.PAMLogin(SSN, AppURL);
          				QCCSR_PAM.PAM_ACH(SSN, AppURL, loan_number);
          				
          			    }
         	
             }
             }
             }
             
           	 catch (Exception e) {
          			System.out.println("under catch of Test" + e);
          			String screenshotPath = getScreenhot(driver, "QC_Sprint_Online_MOILP_DC_ACH_CashAtStore_Txn_Testdata");
          			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
          			test.log(LogStatus.FAIL, "QC_Sprint_Online_MOILP_DC_ACH_CashAtStore_Txn Transaction Failed ");			
          		
          		}
           	}
        
        
     
     
 //=======================================  ON LINE WI ILP  ================================================ 
            
  	 //=======================================  ON LINE WI ILP // SSN = 993838221-993838222 Acct No = 0057-0058 ================================================ 
  	   
         // Receive Type as : "ACH" and Repayment Method  as  : "ACH"   
      
   //@Test(priority = 1, groups = "Ratikanta_Online_WIILP")
      
      public static void QC_Sprint_Online_WIILP_ACH_Txn_Testdata() throws Exception {
     
    	  try {
    		 test = reports.startTest(("QC_Online_WIILP_ACH_ReceiveType As ACH"),  					  		    
    	   			"Lend Nation Login-->Registration-->Generate Online WI ILP Loan With ACH-->ESign Process In PAM (2997 Store)-->Login To Lendnation To Complete E-Signature-->Loan Generated");
    	   			String FileName = "QC_Sprint_Online_WIILP_ACH_Txn_Testdata.xls";
    			
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
    				String ReceiveType = TestData.getCellData(sheetName, "ReceiveType", row);
    				System.out.println(AppURL); 							 				
    				
    				LendNationRegistration.registration(SSN, AppURL);
    				LendNationPersonalInformation.personalInformation(SSN, AppURL);
    			    LendNationFinancialInformation.financialInformation(SSN, AppURL);
    			    LendNationRepaymentInformation.repaymentInformation(SSN, AppURL);			    
    				LendNationLoanDecision.wiilp_loandecision(SSN, AppURL);	  				
    			       
    				QCCSR_PAM.PAMLogin(SSN, AppURL);
    				QCCSR_PAM.PAM_ACH_ESign(SSN, AppURL, loan_number);
    				
    				LendNationLoggin.esignature(SSN, AppURL);
    				
      }
      }
      }
      
    	 catch (Exception e) {
   			System.out.println("under catch of Test" + e);
   			String screenshotPath = getScreenhot(driver, "QC_Sprint_Online_WIILP_ACH_Txn_Testdata");
   			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
   			test.log(LogStatus.FAIL, "QC_Sprint_Online_WIILP_ACH_Txn Failed ");			
   		
   		}
    	}
   
 //=======================================  ON LINE WI ILP  ================================================ 
      
   	     //=======================================  ON LINE WI ILP // SSN = 993838223-993838224 Acct No = 0059-0060 ================================================ 
   	   
         // Receive Type as : "Cash At Store" and Repayment Method  as  : "ACH"   
       
    //@Test(priority = 2, groups = "Ratikanta_Online_WIILP")
       
       public static void QC_Sprint_Online_WIILP_ACH_CashAtStore_Txn_Testdata() throws Exception {
    	  
     	  try {
     		 test = reports.startTest(("QC_Online_WIILP_ACH_ReceiveType As CashAtStore"),  					  		    
     	   			"Lend Nation Login-->Registration-->Generate Online WI ILP Loan With ACH-->ESign Process In PAM (2997 Store)-->Login To Lendnation To Complete E-Signature-->Complete Loan in 252 Store");
     	   			String FileName = "QC_Sprint_Online_WIILP_ACH_CashAtStore_Txn_Testdata.xls";
     			
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
     				String ReceiveType = TestData.getCellData(sheetName, "ReceiveType", row);
     				System.out.println(AppURL); 							 				
     				
     				LendNationRegistration.registration(SSN, AppURL);
     				LendNationPersonalInformation.personalInformation(SSN, AppURL);
     			    LendNationFinancialInformation.financialInformation(SSN, AppURL);
     			    LendNationRepaymentInformation.repaymentInformation(SSN, AppURL);			    
     				LendNationLoanDecision.wiilp_loandecision(SSN, AppURL);	  				
     			       
			     				     				
     				if(ReceiveType.equalsIgnoreCase("Cash At Store"))
       			    {		  				
     					QCCSR_PAM.PAMLogin(SSN, AppURL);
         				QCCSR_PAM.PAM_ACH_ESign(SSN, AppURL, loan_number);
         				
         				LendNationLoggin.wi_ilp_cashatstore_esignature(SSN, AppURL);
       				
       				    QCCSR_PAM.PAMLogin_with_252(SSN, AppURL);
     				    QCCSR_PAM.PAM_ACH(SSN, AppURL, loan_number);
       			    }
       			
       			else{
       				    QCCSR_PAM.PAMLogin(SSN, AppURL);
     				    QCCSR_PAM.PAM_ACH_ESign(SSN, AppURL, loan_number);
     				
     				    LendNationLoggin.esignature(SSN, AppURL);
       				
       			    }
       }
       }
       }
       
     	 catch (Exception e) {
    			System.out.println("under catch of Test" + e);
    			String screenshotPath = getScreenhot(driver, "QC_Sprint_Online_WIILP_ACH_CashAtStore_Txn_Testdata");
    			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
    			test.log(LogStatus.FAIL, "QC_Sprint_Online_WIILP_ACH_CashAtStore_Txn Failed ");			
    		
    		}
     	}
       
 //=======================================  ON LINE WI ILP  ================================================ 
       
     	 //=======================================  ON LINE WI ILP // SSN = 993838225-993838226 Acct No = 0061-0062 ================================================ 
     	   
        // Receive Type as : "ACH" and Repayment Method  as  : "Debit Card"   
       
   //@Test(priority = 3, groups = "Ratikanta_Online_WIILP")
         
         public static void QC_Sprint_Online_WIILP_DC_ACH_Txn_Testdata() throws Exception {
         
       	  try {
       		 test = reports.startTest(("QC_Online_WIILP_DebitCard_ReceiveType As ACH"),  					  		    
       	   			"Lend Nation Login-->Registration-->Generate Online WI ILP Loan With DC-->ESign Process In PAM (2997 Store)-->Login To Lendnation To Complete E-Signature-->Loan Generated");
       	   			String FileName = "QC_Sprint_Online_WIILP_DC_ACH_Txn_Testdata.xls";
       			
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
       				String ReceiveType = TestData.getCellData(sheetName, "ReceiveType", row);
       				System.out.println(AppURL); 							 				
       				
       				LendNationRegistration.registration(SSN, AppURL);
       				LendNationPersonalInformation.personalInformation(SSN, AppURL);
       			    LendNationFinancialInformation.financialInformation(SSN, AppURL);
       			    LendNationRepaymentInformation.repaymentInformation(SSN, AppURL);			    
       				LendNationLoanDecision.wiilp_loandecision(SSN, AppURL);	  				
       			       
       				QCCSR_PAM.PAMLogin(SSN, AppURL);
       				QCCSR_PAM.PAM_ACH_ESign(SSN, AppURL, loan_number);
       				
       				LendNationLoggin.wi_dc_ach_esignature(SSN, AppURL);
       				
       				
       				
         }
         }
         }
         
       	 catch (Exception e) {
      			System.out.println("under catch of Test" + e);
      			String screenshotPath = getScreenhot(driver, "QC_Sprint_Online_WIILP_DC_ACH_Txn_Testdata");
      			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
      			test.log(LogStatus.FAIL, "QC_Sprint_Online_WIILP_DC_ACH_Txn Failed ");			
      		
      		}
       	}
         
       //=======================================  ON LINE WI ILP  ================================================ 
         
     	 //=======================================  ON LINE WI ILP // SSN = 993838227-993838228 Acct No = 0063-0064 ================================================ 
     	   
        // Receive Type as : "Cash At Store" and Repayment Method  as  : "Debit Card"   
       
     //@Test(priority = 4, groups = "Ratikanta_Online_WIILP")
         
         public static void QC_Sprint_Online_WIILP_DC_ACH_CashAtStore_Txn_Testdata() throws Exception {
         
       	  try {
       		 test = reports.startTest(("QC_Online_WIILP_DebitCard_ReceiveType As CashAtStore"),  					  		    
       	   			"Lend Nation Login-->Registration-->Generate Online WI ILP Loan With ACH-->ESign Process In PAM (2997 Store)-->Login To Lendnation To Complete E-Signature-->Complete Loan in 252 Store");
       	   			String FileName = "QC_Sprint_Online_WIILP_DC_ACH_CashAtStore_Txn_Testdata.xls";
       			
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
       				String ReceiveType = TestData.getCellData(sheetName, "ReceiveType", row);
       				System.out.println(AppURL); 							 				
       				
       				LendNationRegistration.registration(SSN, AppURL);
       				LendNationPersonalInformation.personalInformation(SSN, AppURL);
       			    LendNationFinancialInformation.financialInformation(SSN, AppURL);
       			    LendNationRepaymentInformation.repaymentInformation(SSN, AppURL);			    
       				LendNationLoanDecision.wiilp_loandecision(SSN, AppURL);	  				
       			       
       				
       				if(ReceiveType.equalsIgnoreCase("Cash At Store"))
       			    {		  				
     					QCCSR_PAM.PAMLogin(SSN, AppURL);
         				QCCSR_PAM.PAM_ACH_ESign(SSN, AppURL, loan_number);
         				
         				LendNationLoggin.wi_ilp_dc_cashatstore_esignature(SSN, AppURL);
       				
       				    QCCSR_PAM.PAMLogin_with_252(SSN, AppURL);
     				    QCCSR_PAM.PAM_ACH(SSN, AppURL, loan_number);
       			    }
       			
       			else{
       				    QCCSR_PAM.PAMLogin(SSN, AppURL);
       				    QCCSR_PAM.PAM_ACH_ESign(SSN, AppURL, loan_number);
       				
       				    LendNationLoggin.wi_dc_ach_esignature(SSN, AppURL);
       				
       			    }
       				
         }
         }
         }
         
       	 catch (Exception e) {
      			System.out.println("under catch of Test" + e);
      			String screenshotPath = getScreenhot(driver, "QC_Sprint_Online_WIILP_DC_ACH_CashAtStore_Txn_Testdata");
      			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
      			test.log(LogStatus.FAIL, "QC_Sprint_Online_WIILP_DC_ACH_CashAtStore_Txn Failed ");			
      		
      		}
       	}
         
 //=======================================  ON LINE WI ILP  ================================================ 
         
     	 //=======================================  ON LINE WI ILP // SSN = 993838229-993838230 Acct No = 0065-0066 ================================================ 
     	   
        // Receive Type as : "Instant Funding With DC" and Repayment Method  as  : "Debit Card"   
       
   @Test(priority = 5, groups = "Ratikanta_Online_WIILP")
         
         public static void QC_Sprint_Online_WIILP_DC_InstatnFundingWithDC_Txn_Testdata() throws Exception {
         
       	  try {
       		 test = reports.startTest(("QC_Online_WIILP_DebitCard_ReceiveType As Instant Funding With DC"),  					  		    
       	   			"Lend Nation Login-->Registration-->Generate Online WI ILP Loan With DC-->ESign Process In PAM (2997 Store)-->Login To Lendnation To Complete E-Signature-->Loan Generated");
       	   			String FileName = "QC_Sprint_Online_WIILP_DC_InstatnFundingWithDC_Txn_Testdata.xls";
       			
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
       				String ReceiveType = TestData.getCellData(sheetName, "ReceiveType", row);
       				System.out.println(AppURL); 							 				
       				
       				LendNationRegistration.registration(SSN, AppURL);
       				LendNationPersonalInformation.personalInformation(SSN, AppURL);
       			    LendNationFinancialInformation.financialInformation(SSN, AppURL);
       			    LendNationRepaymentInformation.repaymentInformation(SSN, AppURL);			    
       				LendNationLoanDecision.wiilp_loandecision(SSN, AppURL);	  				
       			       
       				QCCSR_PAM.PAMLogin(SSN, AppURL);
       				QCCSR_PAM.PAM_ACH_ESign(SSN, AppURL, loan_number);
       				
       				LendNationLoggin.wi_dc_ach_esignature(SSN, AppURL);
       				
       				
       				
         }
         }
         }
         
       	 catch (Exception e) {
      			System.out.println("under catch of Test" + e);
      			String screenshotPath = getScreenhot(driver, "QC_Sprint_Online_WIILP_DC_InstatnFundingWithDC_Txn_Testdata");
      			test.log(LogStatus.INFO, test.addScreenCapture(screenshotPath));
      			test.log(LogStatus.FAIL, "QC_Sprint_Online_WIILP_DC_InstatnFundingWithDC_Txn Failed ");			
      		
      		}
       	}

   
 
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

						new FileReader("C:/QC_Batch_191/QC_Online_ILP/src/test/java/tests/Objects.properties"));

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
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 5000);	

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

		String destination = System.getProperty("user.dir") + "/ExecutionReports/QCStore/ILP/FailedTestsScreenshots/"
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
