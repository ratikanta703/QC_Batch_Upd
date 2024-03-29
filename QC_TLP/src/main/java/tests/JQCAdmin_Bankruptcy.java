package tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;*/
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class JQCAdmin_Bankruptcy extends QCStore
{

	public static void Admin_Bankruptcy(String SSN,String AppURL) throws Exception
	{


		int lastrow=TestData.getLastRow("Deceased");
		String sheetName="Deceased";

		for(int row=2;row<=lastrow;row++)
		{		
			String RegSSN = TestData.getCellData(sheetName,"SSN",row);
			if(SSN.equals(RegSSN))
			{
				String UserName = TestData.getCellData(sheetName,"AdminUserName",row);
				String Password = TestData.getCellData(sheetName,"AdminPassword",row);
				//String AdminURL = TestData.getCellData(sheetName,"AdminURL",row);
				String PIN = TestData.getCellData(sheetName,"PIN",row);

				String AdminURL =prop.getProperty("adminURL");

				String StoreID= TestData.getCellData(sheetName,"StoreID",row);
				String DeceasedStatus= TestData.getCellData(sheetName,"DeceasedStatus",row);



				test.log(LogStatus.INFO, "********Admin Application is launched********");
				driver = new InternetExplorerDriver();



				driver.get(AdminURL);

				test.log(LogStatus.INFO, "Opened the Admin URL" + AdminURL);




				String mainwindow2=driver.getWindowHandle();



				DateFormat df=new SimpleDateFormat("MM/dd/yyyy"); 

				driver.findElement(By.name("loginRequestBean.userId")).sendKeys(UserName);

				test.log(LogStatus.PASS, "Username is entered: "+UserName); 

				driver.findElement(By.name("loginRequestBean.password")).sendKeys(Password);

				test.log(LogStatus.PASS, "Password is entered: "+Password); 

				//Click Login Button

				driver.findElement(By.name("login")).click();

				test.log(LogStatus.PASS, "Clicked on Submit button");

				Thread.sleep(8000);

				driver.switchTo().defaultContent();

				driver.switchTo().frame("topFrame");

				driver.findElement(By.xpath("//*[@id='500000']/a")).click(); 

				test.log(LogStatus.PASS, "Clicked on Transactions tab");

				Thread.sleep(3000);

				driver.switchTo().defaultContent();

				driver.switchTo().frame("mainFrame");



				driver.findElement(By.linkText("Borrower")).click();

				test.log(LogStatus.PASS, "Clicked on Borrower link");
				Thread.sleep(3000);

				driver.findElement(By.id("988190496")).click();

				test.log(LogStatus.PASS, "Clicked on Bankrupt");
				Thread.sleep(3000);

				//Code For Mouse Over

				Actions action = new Actions(driver);
				action.moveByOffset(200,100).perform();
				//Thread.sleep(10000);
				action.click();
				Thread.sleep(2000);

				driver.switchTo().defaultContent();

				driver.switchTo().frame("mainFrame");

				driver.switchTo().frame("main");


				driver.findElement(By.name("requestBean.bnklocnbr")).sendKeys(StoreID);

				test.log(LogStatus.PASS, "Store number Entered"+StoreID);


				driver.findElement(By.name("requestBean.dealNbr")).sendKeys(loan_number);

				test.log(LogStatus.PASS, "loan_number Entered"+loan_number);

				Thread.sleep(5000);

				action.moveByOffset(200,100).perform();
				//Thread.sleep(10000);
				action.click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[1]/form/table[3]/tbody/tr/td[2]/input")).click();

				test.log(LogStatus.PASS, "Clicked on Submit");

				Thread.sleep(2000);

				driver.findElement(By.xpath("//input[@value='Go' and @type='button']")).click();

				test.log(LogStatus.PASS, "Clicked on GO Button");

				Thread.sleep(2000);



				driver.findElement(By.name("requestBean.bnkStatus")).sendKeys(DeceasedStatus);

				test.log(LogStatus.PASS, "bankruptcy Status is :" +DeceasedStatus);

				Thread.sleep(500);

				driver.findElement(By.name("ubnkDate1")).sendKeys(Date1.trim());


				test.log(LogStatus.PASS, "Date Entered is :" +Date1);

				Thread.sleep(500);

				driver.findElement(By.name("ubnkDate2")).sendKeys(Date2.trim());


				test.log(LogStatus.PASS, "Date Entered is :" +Date2);

				Thread.sleep(500);

				driver.findElement(By.name("ubnkDate3")).sendKeys(Date3.trim());


				test.log(LogStatus.PASS, "Date Entered is :" +Date3);

				Thread.sleep(500);

				driver.findElement(By.xpath("//*[@id='bt_AddBankruptcy']")).click();

				test.log(LogStatus.PASS, "Clicked on Save");

				Thread.sleep(2000);
				String Bank_Status = driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[9]/td/table/tbody/tr[2]/td[2]/strong")).getText();

				if(Bank_Status.equalsIgnoreCase("Deceased")){

					test.log(LogStatus.PASS, "BNK_Status is" + Bank_Status);
				}
				else{
					test.log(LogStatus.PASS, "BNK_Status is failed");
				}

				test.log(LogStatus.PASS, "Deceased Completed Successfully");
				test.log(LogStatus.PASS, "****************************************");

				driver.close();



				//=====================================================================================
				break;
			}
		}	

	}
}
