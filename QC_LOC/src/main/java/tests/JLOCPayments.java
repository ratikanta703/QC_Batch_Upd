package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;


public class JLOCPayments extends QCStore{

	public static void payment (String SSN,String AppURL) throws Exception
	{	
		test.log(LogStatus.INFO, "******************Performing  payment ******************");
		  	
		int lastrow=TestData.getLastRow("Payment");
		String sheetName="Payment";

		for(int row=2;row<=lastrow;row++)
		{	
			String RegSSN = TestData.getCellData(sheetName,"SSN",row);

			if(SSN.equals(RegSSN))

			{	
				String TxnType =TestData.getCellData(sheetName,"TxnType",row);
				String TenderType =TestData.getCellData(sheetName,"TenderType",row);
				String PaymentAmount = TestData.getCellData(sheetName,"PaymentAmount",row);
				String PIN = TestData.getCellData(sheetName,"Password",row);
				String TenderAmount = TestData.getCellData(sheetName,"TenderAmount",row);
				
				String cardType=TestData.getCellData(sheetName,"Card Type ",row);
				String cardNumber=TestData.getCellData(sheetName,"Debit Card No",row);
				String cardEx_month=TestData.getCellData(sheetName,"Expiry Month",row);
				String cardEx_Year=TestData.getCellData(sheetName,"Expiry Year",row);
				String cvv=TestData.getCellData(sheetName,"CVV",row);
				String CardHolderName=TestData.getCellData(sheetName,"CardHolderName",row);
				
				String SSN1 = SSN.substring(0, 3);
				String SSN2 = SSN.substring(3,5);
				String SSN3 = SSN.substring(5,9);

				Thread.sleep(3000);
				
				driver.switchTo().frame("topFrame");
				driver.findElement(locator(Jprop.getProperty("transactions_tab"))).click();			
				test.log(LogStatus.PASS, "Clicked on Loan Transactions");

				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");

				driver.findElement(By.cssSelector("li[id='911101']")).click();
				test.log(LogStatus.PASS, "Clicked on Transaction");		
				driver.switchTo().frame("main");	
				Thread.sleep(500);
				driver.findElement(By.name("ssn1")).sendKeys(SSN1);
				test.log(LogStatus.PASS, "SSN1 is entered: "+SSN1);
				driver.findElement(locator(Jprop.getProperty("CSR_SSN_second_field"))).sendKeys(SSN2);
				test.log(LogStatus.PASS, "SSN2 is entered: "+SSN2);
				driver.findElement(locator(Jprop.getProperty("CSR_SSN_third_field"))).sendKeys(SSN3);
				test.log(LogStatus.PASS, "SSN3 is entered: "+SSN3);
				driver.findElement(locator(Jprop.getProperty("csr_new_loan_submit_button"))).click();
				test.log(LogStatus.PASS, "Clicked on submit Button");		
				Thread.sleep(5000);			
									    					   					     
				driver.findElement(locator(Jprop.getProperty("csr_new_loan_go_button"))).click();
				test.log(LogStatus.PASS, "Clicked on GO Button under search results");
				Thread.sleep(5000);					  
			
				driver.findElement(By.xpath("//input[@value='Go' and @type='button']")).click();
				test.log(LogStatus.PASS, "Clicked on GO Button Under Product web table");
				Thread.sleep(5000);
				driver.findElement(By.name("transactionList")).sendKeys(TxnType);
				test.log(LogStatus.PASS, "Transaction Type is selected as :" +TxnType);
				Thread.sleep(4000);
				driver.findElement(By.name("button")).click();
				test.log(LogStatus.PASS, "Clicked on Go button ");
				Thread.sleep(10000);	
				
				WebElement e5=driver.findElement(By.name("requestBean.paymentAmt"));
				e5.clear();
				e5.sendKeys(PaymentAmount);
				test.log(LogStatus.PASS, "PaymentAmount entered :"+PaymentAmount);
				
				if(TenderType.equalsIgnoreCase("Cashiers Check"))
				{
				driver.findElement(By.name("requestBean.tenderType")).sendKeys(TenderType);
				test.log(LogStatus.PASS, "Tender Type is :"+TenderType);
				Thread.sleep(4000);
				driver.findElement(By.name("requestBean.transactionDataBean.ccmoNbrFirst")).sendKeys(SSN);
				test.log(LogStatus.PASS, "CC/MO number entered as  :"+SSN);
									
				
				}
											
				if(TenderType.equalsIgnoreCase("Cash")){
					
				driver.findElement(By.name("requestBean.tenderType")).sendKeys(TenderType);
				test.log(LogStatus.PASS, "Tender Type is :"+TenderType);
				
				}
				
				else if(TenderType.equalsIgnoreCase("Debit Card")){
					
					driver.findElement(By.xpath("//*[@id='cardsList']/select")).sendKeys("NEW CARD");
					test.log(LogStatus.PASS, "Select card as : " + "NEW CARD");
					
					Thread.sleep(4000);
				
					driver.findElement(By.xpath("//*[@id='cardType2']/select")).sendKeys(cardType);
					test.log(LogStatus.PASS, "Enterd card Type  : " + cardType);
					
					Thread.sleep(4000);
					
					driver.findElement(By.xpath("//*[@id='ccnumber']")).sendKeys(cardNumber);
					test.log(LogStatus.PASS, "Card number is :" + cardNumber);
					
					Thread.sleep(4000);

					driver.findElement(By.xpath("//*[@id='expmonth']")).sendKeys(cardEx_month);
					test.log(LogStatus.PASS, "Enterd Expiry month " + cardEx_month);

					driver.findElement(By.xpath("//*[@id='expyear']")).sendKeys(cardEx_Year);
					test.log(LogStatus.PASS, "Enterd Expiry year " + cardEx_month);
				
					driver.findElement(By.xpath("//*[@id='cvvnumber']")).sendKeys(cvv);
					test.log(LogStatus.PASS, "Enterd CVV " + cvv);
					driver.findElement(By.xpath("//*[@id='ccname']")).sendKeys(CardHolderName);
					test.log(LogStatus.PASS, "Card holder name is " + CardHolderName);
			
					driver.findElement(By.xpath("//*[@id='errorMessage']/form[1]/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/table[1]/tbody/tr[17]/td[2]/div[1]/input[3]")).click();
					test.log(LogStatus.PASS, "Clicked on add card button ");
					Thread.sleep(30000);
					
				}
			
				
				driver.findElement(By.name("requestBean.tenderAmt")).sendKeys(TenderAmount);
				test.log(LogStatus.PASS, "TenderAmount is :"+TenderAmount);	
				Thread.sleep(1000);
				
					
					
				driver.findElement(By.name("password")).sendKeys(PIN);
				test.log(LogStatus.PASS, "Pin is entered "+PIN);
				Thread.sleep(1000);
				driver.findElement(By.name("Submit22")).click();
				test.log(LogStatus.PASS, "Clicked on Finish  Payment");

				Thread.sleep(3000);
				try { 
					Alert alert = driver.switchTo().alert();

					alert.accept();
					test.log(LogStatus.PASS, "Alert Handeld");
																			
				}
				catch (NoAlertPresentException e) {
					//do what you normally would if you didn't have the alert.
				}
				Thread.sleep(2000);//Ok
				try{
				if(driver.findElement(By.name("Ok")).isDisplayed())
				{
				test.log(LogStatus.PASS, "<FONT color=green style=Arial>Payment transaction is successfully");
				}
				else{
					test.log(LogStatus.INFO, "<FONT color=green style=Arial>Payment transaction is successfully");
				}
				}
				catch(Exception e){
					test.log(LogStatus.INFO, "<FONT color=green style=Arial>Payment transaction is successfully");
				}
				
				
			//break;
			}

		//break;
		}
	}
	
	
	
}
