package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.LogStatus;

public class ATLP_GetLoanNumber  extends QCStore{

	public static String NextDueDate;

	public static void loannumber(String SSN,String AppURL) throws InterruptedException{

				int lastrow=TestData.getLastRow("NewLoan");
				String sheetName="NewLoan";

					for(int row=2;row<=lastrow;row++)
							{		
								String RegSSN = TestData.getCellData(sheetName,"SSN",row);
								if(SSN.equals(RegSSN))
								{
								
						       // String ProductID = TestData.getCellData(sheetName,"ProductID",row);
						       
								        String SSN1 = SSN.substring(0, 3);
								        String SSN2 = SSN.substring(3,5);
								        String SSN3 = SSN.substring(5,9);
						       Thread.sleep(4000);
								//test.log(LogStatus.INFO, MarkupHelper.createLabel("Age Store process is initiated", ExtentColor.BLUE));
								test.log(LogStatus.INFO, "Getting loan number");

								driver.switchTo().frame("bottom");
								String Str_date = driver.findElement(By.xpath("/html/body/blink/table/tbody/tr/td[4]"))
										.getText();
								String store_date[] = Str_date.split(":");
								business_date = store_date[1].trim();
								test.log(LogStatus.PASS, "Business date is :" + business_date);

								driver.switchTo().defaultContent();

								
						        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("topFrame")));
								driver.switchTo().frame("topFrame");
								wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[id='910000']")));
						        driver.findElement(By.cssSelector("li[id='910000']")).click();	
									
								test.log(LogStatus.PASS, "Clicked on Loan Transactions");
								Thread.sleep(1000);
								try{
								driver.switchTo().defaultContent();
								driver.switchTo().frame("mainFrame");
								driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
								driver.findElement(By.cssSelector("li[id='911101']")).click();			
								test.log(LogStatus.PASS, "Clicked on Transactions");
								}
								catch(Exception e)
								{
									driver.get("https://qclocalauto.qfund.net/cc/login/index.jsp");
									driver.switchTo().defaultContent();	
									
							        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("topFrame")));
									driver.switchTo().frame("topFrame");
									wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[id='910000']")));
							        driver.findElement(By.cssSelector("li[id='910000']")).click();	
										
									Thread.sleep(1000);	
									driver.switchTo().defaultContent();
									driver.switchTo().frame("mainFrame");
									driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
									driver.findElement(By.cssSelector("li[id='911101']")).click();	
									test.log(LogStatus.PASS, "Clicked on Transactions");
								}
								driver.switchTo().frame("main");		
								driver.findElement(By.name("ssn1")).sendKeys(SSN1);
								test.log(LogStatus.PASS, "SSN1 is entered: "+SSN1);
								driver.findElement(By.name("ssn2")).sendKeys(SSN2);
								test.log(LogStatus.PASS, "SSN2 is entered: "+SSN2);
								driver.findElement(By.name("ssn3")).sendKeys(SSN3);
								test.log(LogStatus.PASS, "SSN3 is entered: "+SSN3);
								driver.findElement(By.name("submit1")).click();
								test.log(LogStatus.PASS, "Click on submit Button");		
								
							    driver.switchTo().defaultContent();
							    driver.switchTo().frame("mainFrame");
							    driver.switchTo().frame("main");
							
										String mainwindow=driver.getWindowHandle();
										
									    driver.switchTo().defaultContent();
									    driver.switchTo().frame("mainFrame");
									    driver.switchTo().frame("main");
									    driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]/table[2]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/a")).click();
									    test.log(LogStatus.PASS, "Clicked on Customer number link");
										for (String winHandle : driver.getWindowHandles()) {
											if(!mainwindow.equalsIgnoreCase(winHandle)) {
												driver.switchTo().window(winHandle);

												loan_nbr = driver.findElement(locator(prop.getProperty("csr_loan_nbr"))).getText();
												test.log(LogStatus.PASS, "Loan Number is" + loan_nbr);
												Thread.sleep(2000);
												NextDueDate = driver.findElement(locator(prop.getProperty("csr_due_date"))).getText();
												test.log(LogStatus.PASS, "Next due date is " + NextDueDate);
												driver.close();
												break;
											}
										}
										driver.switchTo().window(mainwindow);
	
}
}}}