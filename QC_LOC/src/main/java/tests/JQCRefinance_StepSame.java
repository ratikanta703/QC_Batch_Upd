package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class JQCRefinance_StepSame extends QCStore{
	public static void StepSame(String SSN,String AppURL)
	{
		try{
			int lastrow=TestData.getLastRow((Jprop.getProperty("Refinance")));
			String sheetName=Jprop.getProperty("Refinance");
			System.out.println("...."+sheetName);

			for(int row=2;row<=lastrow;row++)
			{		
				String RegSSN = TestData.getCellData(sheetName,"SSN",row);
				//String CallConsent = TestData.getCellData(sheetName,"CallConsent",row);
				System.out.println("...."+RegSSN);
				if(SSN.equals(RegSSN))
				{
					String ESign_CourtesyCallConsent = TestData.getCellData(sheetName,"ESign_CourtesyCallConsent",row);
					String ESign_Preference = TestData.getCellData(sheetName,"Esign_Preference",row);
				String PIN = TestData.getCellData(sheetName,"PIN",row);
		        String ProductID = TestData.getCellData(sheetName,"ProductID",row);
		        String StateID = TestData.getCellData(sheetName,"StateID",row);
		        String Income_PayFrequency = TestData.getCellData(sheetName,"Income_PayFrequency",row);      
		        String columnname=StateID+"_"+ ProductID+"_"+Income_PayFrequency;                                //column name
		        System.out.println(columnname);		      	       		      		      
		       String ESign_CollateralType = TestData.getCellData(sheetName,"ESign_CollateralType",row);		       
		       String TenderType = TestData.getCellData(sheetName,"TenderType",row);
		       
		       String cardType=TestData.getCellData(sheetName,"Card Type ",row);
		       String cardNumber=TestData.getCellData(sheetName,"Debit Card No",row);
		       String cardEx_month=TestData.getCellData(sheetName,"Expiry Month",row);
		       String cardEx_Year=TestData.getCellData(sheetName,"Expiry Year",row);
		       String cvv=TestData.getCellData(sheetName,"CVV",row);
		       String CardHolderName=TestData.getCellData(sheetName,"CardHolderName",row);
		      	
				        String SSN1 = SSN.substring(0, 3);
				        String SSN2 = SSN.substring(3,5);
				        String SSN3 = SSN.substring(5,9);
				        		       
				
		       Thread.sleep(4000);
				test.log(LogStatus.INFO, "Refinance from CSR has initiated");
				driver.switchTo().frame("bottom");
				String Str_date=driver.findElement(By.xpath("/html/body/blink/table/tbody/tr/td[4]")).getText();
				
				test.log(LogStatus.PASS, ""+Str_date);
				
				driver.switchTo().defaultContent();	
				
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("topFrame")));
				driver.switchTo().frame("topFrame");
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[id='910000']")));
		        driver.findElement(By.cssSelector("li[id='910000']")).click();	
				
				test.log(LogStatus.PASS, "Clicked on Loan Transactions");
				Thread.sleep(3000);
				driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");
			
				driver.findElement(By.cssSelector("li[id='911101']")).click();			
				test.log(LogStatus.PASS, "Clicked on Transactions");		
				driver.switchTo().frame("main");		
				driver.findElement(By.name("ssn1")).sendKeys(SSN1);
				test.log(LogStatus.PASS, "SSN1 is entered: "+SSN1);
				driver.findElement(By.name("ssn2")).sendKeys(SSN2);
				test.log(LogStatus.PASS, "SSN2 is entered: "+SSN2);
				driver.findElement(By.name("ssn3")).sendKeys(SSN3);
				test.log(LogStatus.PASS, "SSN3 is entered: "+SSN3);
				driver.findElement(locator(Jprop.getProperty("csr_new_loan_submit_button"))).click();
				test.log(LogStatus.PASS, "Clicked on submit Button");		
							
									    					   					     
				driver.findElement(locator(Jprop.getProperty("csr_new_loan_go_button"))).click();
				test.log(LogStatus.PASS, "Clicked on GO Button under search results");
				Thread.sleep(5000);		
			
				
				    driver.findElement(By.xpath("//input[@value='Go' and @type='button']")).click();
				    test.log(LogStatus.PASS, "Clicked on Go button under Loans section");
				   
				    driver.switchTo().defaultContent();
					 driver.switchTo().frame("mainFrame");
					 driver.switchTo().frame("main");
					 driver.findElement(locator(Jprop.getProperty("transactionList"))).sendKeys("Refinance");
					 test.log(LogStatus.PASS, "Transaction type is selected as Refinance");
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@name='button' and @value='Go']")).click();
					 test.log(LogStatus.PASS, "Click on GO Button after transaction type selection ");
					 Thread.sleep(10000);
					 
				    String paymentamount=driver.findElement(By.name("advanceRequestBean.paymentAmt")).getAttribute("value");
					test.log(LogStatus.PASS, "Getting payment amount "+paymentamount);
					driver.findElement(By.name("advanceRequestBean.tenderTypeFirst")).sendKeys(TenderType);
					test.log(LogStatus.PASS, "Select tender type as "+TenderType);
					WebElement e1=driver.findElement(By.name("advanceRequestBean.tenderAmtFirst"));
					e1.clear();
					e1.sendKeys(paymentamount);
					test.log(LogStatus.PASS, "Entered tender amount as  :"+paymentamount);

					String stepupmsg=driver.findElement(By.xpath("//*[@id='_StepUpDown']")).getText();
					test.log(LogStatus.PASS, "getting stepup message  :"+stepupmsg);
					
					if(stepupmsg.contains("Step Same")){
						
						System.out.println("************"+ESign_CollateralType);
						 test.log(LogStatus.PASS, "Collateral is " + ESign_CollateralType);
						 Thread.sleep(2000);
		
						if(ESign_CollateralType.equalsIgnoreCase("ACH"))
						{			
							
							driver.findElement(By.name("advanceRequestBean.paymentCollateralType")).sendKeys(ESign_CollateralType);
							test.log(LogStatus.PASS, "Select Payment collateral type as "+ESign_CollateralType);
							
								 
							
							}
						else if(ESign_CollateralType.equalsIgnoreCase("DEBIT CARD"))
						{
							driver.findElement(By.name("advanceRequestBean.paymentCollateralType")).sendKeys(ESign_CollateralType);
							test.log(LogStatus.PASS, "Select Payment collateral type as "+ESign_CollateralType);
							
							driver.findElement(By.xpath("//*[@id='cardsListColl']/select")).sendKeys("NEW CARD");
							test.log(LogStatus.PASS, "Select card as : " + "NEW CARD");

							driver.findElement(By.xpath("//*[@id='cardTypeColl']/select")).sendKeys(cardType);
							test.log(LogStatus.PASS, "Enterd card Type  : " + cardType);
							
							driver.findElement(By.xpath("//*[@id='ccnumberColl']")).sendKeys(cardNumber);
							test.log(LogStatus.PASS, "Card number is :" + cardNumber);							
							
							driver.findElement(By.xpath("//*[@id='expmonthColl']")).sendKeys(cardEx_month);
							test.log(LogStatus.PASS, "Enterd Expiry month " + cardEx_month);

							Select sel = new Select(driver.findElement(By.xpath("//*[@id='expyearColl']")));
							
							sel.selectByVisibleText(cardEx_Year);

							
							test.log(LogStatus.PASS, "Enterd Expiry year " + cardEx_Year);
							
							driver.findElement(By.xpath("//*[@id='cvvnumberColl']")).sendKeys(cvv);
							test.log(LogStatus.PASS, "Enterd CVV " + cvv);
							driver.findElement(By.xpath("//*[@id='ccnameColl']")).sendKeys(CardHolderName);
							test.log(LogStatus.PASS, "Card holder name is " + CardHolderName);
														
							driver.findElement(By.xpath("//input[@value='Add Card' and @type='button']")).click();
							test.log(LogStatus.PASS, "Clicked on add card button ");	
							Thread.sleep(30000);						
							
						}
						driver.findElement(By.name("advanceRequestBean.courtesyCallFlag")).sendKeys(ESign_CourtesyCallConsent);
						test.log(LogStatus.PASS, "Courtesy Call Consent is selected as "+ESign_CourtesyCallConsent);
						Thread.sleep(5000);
						if(ESign_CourtesyCallConsent.equalsIgnoreCase("Yes"))
							Thread.sleep(500);
						{
							
							if(ESign_Preference.equalsIgnoreCase("Call"))
							{
								driver.findElement(By.id("preferenceCall")).click();
								test.log(LogStatus.PASS, "Courtesy Call Consent is selected as "+ESign_Preference);
							}
			
							else if(ESign_Preference.equalsIgnoreCase("SMS"))
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
						driver.findElement(By.name("requestBean.password")).sendKeys(PIN);
							test.log(LogStatus.PASS, "ESign_Checks is selected as "+PIN);
							
							driver.findElement(By.name("finishadvance")).click();
							test.log(LogStatus.PASS, "click on Finish Loan button ");
							
							String confirm_text1=driver.findElement(By.xpath("//*[@id='confirmMsg']/b[1]")).getText();
							
							String confirm_text2=driver.findElement(By.xpath("//*[@id='confirmMsg']/b[2]")).getText();
							String confirm_text3=driver.findElement(By.xpath("//*[@id='confirmMsg']/b[3]")).getText();
							//String confirm_text4=driver.findElement(By.xpath("//*[@id='confirmMsg']/b[3]/text()[2]")).getText();
						
							test.log(LogStatus.PASS, "confirm text is  "+confirm_text1+" Will receive an LOC of "+confirm_text2+", out of Credit Limit "+confirm_text3);
							
							
							driver.findElement(By.xpath("//input[@value='Yes' and @type='button']")).click();
							test.log(LogStatus.PASS, "click on Yes button ");
							
							if(driver.findElement(By.xpath("//input[@value='OK' and @type='button']")).isDisplayed()){
								
								driver.findElement(By.xpath("//input[@value='OK' and @type='button']")).click();
							test.log(LogStatus.PASS, ESign_CollateralType+ "Refinance StepSame from CSR is successfull");
							 test.log(LogStatus.PASS, "**********************************************");	
							}else{
								
								test.log(LogStatus.INFO, ESign_CollateralType+ "Refinance StepSame from CSR is successfull");
								 test.log(LogStatus.PASS, "**********************************************");
							}					
					} 
					
					
						break;
				}
				
				 
			}
			
		}catch(Exception e){
						e.printStackTrace();
						test.log(LogStatus.FAIL, "Refinance from CSR is failed");

		}
			
		
	}
}
