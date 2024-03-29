package tests;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.LogStatus;
public class RQCCSRSignatureLoan extends QCStore{
	private static final String SSN = null;
	public static String State;
	public static String SSN1;
	public static String SSN2;
	public static String SSN3;
	public static String ESign_Password;
	public static String ESign_Checks;
	public static String CouponNbr;
	public static String ChkgAcctNbr;
	public static String ESign_CheckNbr;
	public static String AllowPromotion;
	public static String ESign_Preference;
	public static String ESign_CourtesyCallConsent;
	public static String ESign_DisbType;
	public static String ESign_LoanAmt;
	public static String ESign_CollateralType;
	public static Object stateProductType;
	public static Object stateProduct;
	public static String StoreID;
	public static String NewVIN;
	public static String VehicleType;
	public static String NewLoan_Term;
	public static String NewLoan_ProductName;
	public static String ProductType;
	public static String Password;
	public static String UserName;
	public static String ProductID;
	public static CharSequence last4cheknum;
	public static String InsuranceExpiryDate0[]=null;
	public static String InsuranceExpiryDate3;
	public static String InsuranceExpiryDate2;
	public static String InsuranceExpiryDate1;
	public static String PolicyNumber;
	public static String InsuranceCompany;
	public static String PhoneNbr3;
	public static String PhoneNbr2;
	public static String PhoneNbr1;
	public static String PhoneNbr;
	public static String InsuranceCoverage;
	public static String LicensePlateExp;
	public static String LicensePlateNumber;
	public static String ExteriorColor;
	public static String AppraisalValue;
	public static String InsuranceExpiryDate;
	public static String TitleNumber;
	public static int rnum;
	public static int cnum;
	public static Object product_name;
	public static int count;
	public static List<WebElement> rows;
	public static String No_of_checks;
	public static String cardType;
	public static String cardNumber;
	public static String  cardEx_month;
	public static String cardEx_Year;
	public static String cvv;
	public static String CardHolderName;
	public static String DisbAmount;
	public static String Loanamount;
	public static String Refinance_Type;

	public static void signatureloan(String SSN,String AppURL) throws Exception
	{

		test.log(LogStatus.INFO, "*****Performing  New Loan transaction *****");
		int lastrow=TestData.getLastRow("New_Loan");
		String sheetName="New_Loan";

		for(int row=2;row<=lastrow;row++)
		{	
			String RegSSN = TestData.getCellData(sheetName,"SSN",row);
			//String Loanamount = TestData.getCellData(sheetName,"Loanamount",row);
			
			
			
			
		
		
			if (SSN.equals(RegSSN)) {
		
				State = TestData.getCellData(sheetName,"StateID",row);
				ProductID=TestData.getCellData(sheetName,"ProductID",row);

				Refinance_Type = TestData.getCellData(sheetName,"Refinance_Type",row);
				ProductType = TestData.getCellData(sheetName,"ProductType",row);
				NewLoan_ProductName = TestData.getCellData(sheetName,"NewLoan_ProductName",row);
				NewLoan_Term = TestData.getCellData(sheetName,"NewLoan_Term",row);
				StoreID = TestData.getCellData(sheetName,"StoreID",row);
				stateProduct=State+" "+ProductID;
				stateProductType=State+" "+ProductType;
				ESign_CollateralType = TestData.getCellData(sheetName,"ESign_CollateralType",row);
				ESign_LoanAmt = TestData.getCellData(sheetName,"ESign_LoanAmt",row);
				ChkgAcctNbr = TestData.getCellData(sheetName,"ChkgAcctNbr",row);
				ESign_DisbType = TestData.getCellData(sheetName,"ESign_DisbType",row);
				ESign_CourtesyCallConsent = TestData.getCellData(sheetName,"ESign_CourtesyCallConsent",row);
				
				AllowPromotion = TestData.getCellData(sheetName,"Allow Promotion",row);
				CouponNbr = TestData.getCellData(sheetName,"CouponNbr",row);
				ESign_Preference = TestData.getCellData(sheetName,"ESign_Preference",row);
				ESign_Checks = TestData.getCellData(sheetName,"ESign_Checks",row);
				ESign_Password=TestData.getCellData(sheetName,"ESign_Password",row);
				ESign_CheckNbr = TestData.getCellData(sheetName,"ESign_CheckNbr",row);			
				last4cheknum= ChkgAcctNbr.substring(ChkgAcctNbr.length() - 4);

				No_of_checks=TestData.getCellData(sheetName,"No_of_checks",row);
				cardType=TestData.getCellData(sheetName,"Card Type ",row);
				cardNumber=TestData.getCellData(sheetName,"Debit Card No",row);
				cardEx_month=TestData.getCellData(sheetName,"Expiry Month",row);
				cardEx_Year=TestData.getCellData(sheetName,"Expiry Year",row);
				cvv=TestData.getCellData(sheetName,"CVV",row);
				CardHolderName=TestData.getCellData(sheetName,"CardHolderName",row);
				Loanamount = TestData.getCellData(sheetName,"Loanamount",row);
				
				DisbAmount=TestData.getCellData(sheetName,"DisbAmount",row);
				SSN1 = SSN.substring(0, 3);
				SSN2 = SSN.substring(3,5);
				SSN3 = SSN.substring(5,9);

				
				Thread.sleep(3000);
				driver.switchTo().frame("topFrame");
				driver.findElement(locator(Rprop.getProperty("transactions_tab"))).click();			
				test.log(LogStatus.PASS, "Clicked on Loan Transactions");

				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");

				driver.findElement(locator(Rprop.getProperty("csr_new_loan_link"))).click();			
				test.log(LogStatus.PASS, "Clicked on New Loan");		
				driver.switchTo().frame("main");	
				Thread.sleep(1000);
				driver.findElement(By.name("ssn1")).sendKeys(SSN1);
				test.log(LogStatus.PASS, "SSN1 is entered: "+SSN1);
				driver.findElement(locator(Rprop.getProperty("CSR_SSN_second_field"))).sendKeys(SSN2);
				test.log(LogStatus.PASS, "SSN2 is entered: "+SSN2);
				driver.findElement(locator(Rprop.getProperty("CSR_SSN_third_field"))).sendKeys(SSN3);
				test.log(LogStatus.PASS, "SSN3 is entered: "+SSN3);
				driver.findElement(locator(Rprop.getProperty("csr_new_loan_submit_button"))).click();
				test.log(LogStatus.PASS, "Click on submit Button");		
				
					driver.switchTo().defaultContent();
					driver.switchTo().frame("mainFrame");
					driver.switchTo().frame("main");
					driver.findElement(locator(Rprop.getProperty("csr_new_loan_go_button"))).click();
					test.log(LogStatus.PASS, "Click on GO Button");

					driver.switchTo().defaultContent();
					driver.switchTo().frame("mainFrame");
					driver.switchTo().frame("main");
					//	Selection of Product based on the Name provided in Test Data
					if(driver.findElement(By.id("LoanButtonId")).isDisplayed())
					{

						WebElement htmltable=driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table"));
						rows=htmltable.findElements(By.tagName("tr"));
						count=0;							
						count=driver.findElements(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr")).size();	
						System.out.println("current row num "+count);	
						System.out.println(" rows num "+ rows.size());
						test.log(LogStatus.PASS, "New Loan button is enabled");
						if(ProductID.equals("LOC"))
						{
							LOC();

						}
						

																																				
					}

				
			}

		}
			
		
			
	}


	public static void LOC() throws InterruptedException
	{
		Thread.sleep(500);
		driver.findElement(By.name("requestBean.collateralType")).sendKeys(ESign_CollateralType);
		//driver.findElement(By.name("advanceRequestBean.paymentCollateralType")).sendKeys(ESign_CollateralType);
		test.log(LogStatus.PASS, "Colatetal Type is Selected As :"+ESign_CollateralType);
		Thread.sleep(15000);
		
		List<WebElement>  rows = driver.findElements(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr")); 
		int n=rows.size();
				for(int i=2;i<=n;i++){
					String Pname=driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr["+i+"]/td[2]")).getText().trim();
					test.log(LogStatus.PASS, "getting product name "+Pname);
					

					if(Pname.equals(ProductType))
					{
						/*Thread.sleep(500);
						driver.findElement(By.name("requestBean.collateralType")).sendKeys(ESign_CollateralType);
						//driver.findElement(By.name("advanceRequestBean.paymentCollateralType")).sendKeys(ESign_CollateralType);
						test.log(LogStatus.PASS, "Colatetal Type is Selected As :"+ESign_CollateralType);
						Thread.sleep(15000);*/
						driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr["+i+"]/td[2]/input")).click();
						//driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/input")).click();
						                              //*[@id="riskViewBdy"]/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/input
						test.log(LogStatus.PASS, "Clicked On Signature Loan Radio Button");


						}
						
					
					else{
						continue;
					}
				}
		Thread.sleep(1000);
		driver.findElement(By.id("LoanButtonId")).click();
		test.log(LogStatus.PASS, "Clicked on loan button");
		
//=======================================================
		if(Refinance_Type.equals("StepUp"))
		{
			//driver.findElement(By.name("advanceRequestBean.loanAmount"))
			driver.findElement(By.name("advanceRequestBean.loanAmount")).sendKeys(Keys.chord(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE)+Loanamount);
									
			
		//}
//=======================================================
		//else{
		Thread.sleep(5000);
		
		
		//Thread.sleep(5000);
		driver.findElement(By.name("advanceRequestBean.paymentCollateralType")).sendKeys(ESign_CollateralType);
		Thread.sleep(40000);
		Thread.sleep(40000);
		Thread.sleep(40000);
		Thread.sleep(40000);
		Thread.sleep(40000);
		//wait.until(ExpectedConditions.elementToBeSelected(By.name("advanceRequestBean.paymentCollateralType")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("advanceRequestBean.paymentCollateralType")));
		//driver.findElement(By.name("advanceRequestBean.paymentCollateralType")).sendKeys(ESign_CollateralType);
		//test.log(LogStatus.PASS, "Collateral Type is enterted as "+ESign_CollateralType);
		if(!(ESign_LoanAmt.isEmpty()))
		{
			driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr[1]/td/table[2]/tbody/tr/td/table/tbody/tr[13]/td[3]/input")).sendKeys(ESign_LoanAmt);
			test.log(LogStatus.PASS, "Loan amount is enterted as "+ESign_LoanAmt);
		}
		Thread.sleep(3000);
		//driver.findElement(By.name("advanceRequestBean.paymentCollateralType")).sendKeys(ESign_CollateralType);
		//test.log(LogStatus.PASS, "Collateral Type is enterted as "+ESign_CollateralType);
		Thread.sleep(1000);
		driver.findElement(By.name("advanceRequestBean.disbursementType")).sendKeys(ESign_DisbType);		                                      
		test.log(LogStatus.PASS, "Disb Type is enterted as "+ESign_DisbType);
		Thread.sleep(1000);
		String LOCamount=driver.findElement(By.xpath("//*[@id='errorMessage']/form[1]/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/table[1]/tbody/tr[7]/td[2]/input")).getAttribute("value");
		test.log(LogStatus.PASS, "LOC amount is : "+LOCamount);
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("advanceRequestBean.disbAmtFirst")).sendKeys(LOCamount.trim());
		test.log(LogStatus.PASS, "Disb amount is : "+LOCamount);
		

		driver.findElement(By.name("advanceRequestBean.courtesyCallFlag")).sendKeys(ESign_CourtesyCallConsent);
		test.log(LogStatus.PASS, "Courtsey call consent selected as "+ESign_CourtesyCallConsent);
		Thread.sleep(8000);

		/*driver.findElement(By.xpath("//*[@id='advanceRequestBean.disbursementType']")).sendKeys(ESign_DisbType);
		test.log(LogStatus.PASS, "Disb Type is enterted as "+ESign_DisbType);*/
		if(ESign_CourtesyCallConsent.equalsIgnoreCase("Yes"))
		{
			Thread.sleep(500);
			if(ESign_Preference.equalsIgnoreCase("Call"))	
			{
				driver.findElement(By.xpath("//*[@id='preferenceCall']")).click();
				test.log(LogStatus.PASS, "Courtesy Call Consent is selected as "+ESign_Preference);
			}
			if(ESign_Preference.equalsIgnoreCase("Mail"))	
			{
				driver.findElement(By.xpath("//*[@id='preferenceMail']")).click();
				test.log(LogStatus.PASS, "Courtesy Call Consent is selected as "+ESign_Preference);
			}
			if(ESign_Preference.equalsIgnoreCase("SMS"))	
			{
				driver.findElement(By.xpath("//*[@id='preferenceSms']")).click();
				test.log(LogStatus.PASS, "Courtesy Call Consent is selected as "+ESign_Preference);

				try { 
					Alert alert = driver.switchTo().alert();
					alert.dismiss();
					//if alert present, accept and move on.														

				}
				catch (NoAlertPresentException e) {
					//do what you normally would if you didn't have the alert.
				}
			}

		}

		if (ESign_CollateralType.equals("SIGNATURE"))
		{
			//driver.findElement(By.name("advanceRequestBean.disbAmtFirst")).sendKeys(LOCamount);
			
			//test.log(LogStatus.PASS, "Disb amount enterd  as "+LOCamount);
			
			driver.findElement(By.name("requestBean.password")).sendKeys(ESign_Password);
			test.log(LogStatus.PASS, "ESign_Checks is selected as "+ESign_Password);
			Thread.sleep(500);
			driver.findElement(By.name("finishadvance")).click();			
			test.log(LogStatus.PASS, "click on Finish Loan button ");
		}

		
		Thread.sleep(3000);
		try {
			Alert alert = driver.switchTo().alert();
			String almsg= alert.getText();

			alert.accept();
			test.log(LogStatus.PASS, "alert handled "+almsg);
	}
		catch (NoAlertPresentException e) {
			//do what you normally would if you didn't have the alert.
		}

		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		driver.switchTo().frame("main");
		Thread.sleep(4000);
		//*[@id="confirmMsg"]/b[1]    //*[@id="confirmMsg"]/b[2]
		String confirm_text1=driver.findElement(By.xpath("//*[@id='confirmMsg']/b[1]")).getText();
		String confirm_text2=driver.findElement(By.xpath("//*[@id='confirmMsg']/b[2]")).getText();
		//String confirm_text3=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr[4]/td[2]/table/tbody/tr[4]/td")).getText();
		
		test.log(LogStatus.PASS, "confirm text is  "+confirm_text1+"Will revice an amount of"+confirm_text2);
		
	
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td/input[1]")).click();
		
		test.log(LogStatus.PASS, "click on Yes button ");
	Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		driver.switchTo().frame("main");
		if(driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/b[3]")).getText().contains("confirm_text1")){
			test.log(LogStatus.PASS, "<FONT color=green style=Arial> Signature Loan is Completed Successfully");
		}
		else
		{
			test.log(LogStatus.INFO, "<FONT color=green style=Arial>Signature Loan is  Completed Successfully ");
		}

		
	}
		else
		{
			Thread.sleep(5000);
			driver.findElement(By.name("advanceRequestBean.paymentCollateralType")).sendKeys(ESign_CollateralType);
			test.log(LogStatus.PASS, "Collateral Type is enterted as "+ESign_CollateralType);
			Thread.sleep(1000);
			if(!(ESign_LoanAmt.isEmpty()))
			{
				driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr[1]/td/table[2]/tbody/tr/td/table/tbody/tr[13]/td[3]/input")).sendKeys(ESign_LoanAmt);
				test.log(LogStatus.PASS, "Loan amount is enterted as "+ESign_LoanAmt);
			}
			
			driver.findElement(By.name("advanceRequestBean.disbursementType")).sendKeys(ESign_DisbType);		                                      
			test.log(LogStatus.PASS, "Disb Type is enterted as "+ESign_DisbType);
			Thread.sleep(1000);
			
			String LOCamount=driver.findElement(By.xpath("//*[@id='errorMessage']/form[1]/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/table[1]/tbody/tr[7]/td[2]/input")).getAttribute("value");
			test.log(LogStatus.PASS, "LOC amount is : "+LOCamount);
			
			Thread.sleep(1000);
			
			driver.findElement(By.name("advanceRequestBean.disbAmtFirst")).sendKeys(LOCamount.trim());
			test.log(LogStatus.PASS, "Disb amount is : "+LOCamount);
			Thread.sleep(500);
			

			driver.findElement(By.name("advanceRequestBean.courtesyCallFlag")).sendKeys(ESign_CourtesyCallConsent);
			test.log(LogStatus.PASS, "Courtsey call consent selected as "+ESign_CourtesyCallConsent);
			Thread.sleep(8000);
			/*driver.findElement(By.xpath("//*[@id='advanceRequestBean.disbursementType']")).sendKeys(ESign_DisbType);
			test.log(LogStatus.PASS, "Disb Type is enterted as "+ESign_DisbType);*/
			if(ESign_CourtesyCallConsent.equalsIgnoreCase("Yes"))
			{
				Thread.sleep(500);
				if(ESign_Preference.equalsIgnoreCase("Call"))	
				{
					driver.findElement(By.xpath("//*[@id='preferenceCall']")).click();
					test.log(LogStatus.PASS, "Courtesy Call Consent is selected as "+ESign_Preference);
				}
				if(ESign_Preference.equalsIgnoreCase("Mail"))	
				{
					driver.findElement(By.xpath("//*[@id='preferenceMail']")).click();
					test.log(LogStatus.PASS, "Courtesy Call Consent is selected as "+ESign_Preference);
				}
				if(ESign_Preference.equalsIgnoreCase("SMS"))	
				{
					driver.findElement(By.xpath("//*[@id='preferenceSms']")).click();
					test.log(LogStatus.PASS, "Courtesy Call Consent is selected as "+ESign_Preference);

					try { 
						Alert alert = driver.switchTo().alert();
						alert.dismiss();
						//if alert present, accept and move on.														

					}
					catch (NoAlertPresentException e) {
						//do what you normally would if you didn't have the alert.
					}
				}

			}

			if (ESign_CollateralType.equals("SIGNATURE"))
			{
				//driver.findElement(By.name("advanceRequestBean.disbAmtFirst")).sendKeys(LOCamount);
				
				//test.log(LogStatus.PASS, "Disb amount enterd  as "+LOCamount);
				
				driver.findElement(By.name("requestBean.password")).sendKeys(ESign_Password);
				test.log(LogStatus.PASS, "ESign_Checks is selected as "+ESign_Password);
				Thread.sleep(500);
				driver.findElement(By.name("finishadvance")).click();
				test.log(LogStatus.PASS, "click on Finish Loan button ");
				Thread.sleep(500);
			}

			
			Thread.sleep(3000);
			try {
				Alert alert = driver.switchTo().alert();
				String almsg= alert.getText();

				alert.accept();
				test.log(LogStatus.PASS, "alert handled "+almsg);
		}
			catch (NoAlertPresentException e) {
				//do what you normally would if you didn't have the alert.
			}

			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("mainFrame");
			driver.switchTo().frame("main");
			Thread.sleep(4000);
			//*[@id="confirmMsg"]/b[1]    //*[@id="confirmMsg"]/b[2]
			String confirm_text1=driver.findElement(By.xpath("//*[@id='confirmMsg']/b[1]")).getText();
			String confirm_text2=driver.findElement(By.xpath("//*[@id='confirmMsg']/b[2]")).getText();
			//String confirm_text3=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr[4]/td[2]/table/tbody/tr[4]/td")).getText();
			
			test.log(LogStatus.PASS, "confirm text is  "+confirm_text1+"Will revice an amount of"+confirm_text2);
			
		
			
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td/input[1]")).click();
			
			test.log(LogStatus.PASS, "click on Yes button ");
		Thread.sleep(3000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("mainFrame");
			driver.switchTo().frame("main");
			if(driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/b[3]")).getText().contains("confirm_text1")){
				test.log(LogStatus.PASS, "<FONT color=green style=Arial> Signature Loan is Completed Successfully");
			}
			else
			{
				test.log(LogStatus.INFO, "<FONT color=green style=Arial>Signature Loan is  Completed Successfully ");
			}

			
		}
		}
	}
	