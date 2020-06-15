package tests;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import oracle.jdbc.OracleTypes;


public class db_conn {
	
public static ExtentTest test;
public static String db_BoCode;
public static String App_BoCode;


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		// Object of Connection from the Database
				Connection conn = null;
				
		// Object of Statement. It is used to create a Statement to execute the query
			    Statement stmt = null;
			    
	   //Object of ResultSet => 'It maintains a cursor that points to the current row in the result set'
				ResultSet resultSet = null;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
	   // Open a connection
				conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.241:1521:QFUNDUAT1", "QCHPROD_RECON_04162019",
						"QCHPROD_RECON_04162019");
			
				//test.log(LogStatus.PASS, "Connecting to DB ");
				System.out.println("Connecting to DB");
				
	   // Execute a query
				stmt = conn.createStatement();
				resultSet = stmt.executeQuery("select * from bo_master");
				while (resultSet .next()) {
					System.out.println(resultSet .getString(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3) + "  "
					+ resultSet.getString(4) + "  " + resultSet.getString(5));
					db_BoCode = resultSet .getString(1);
					System.out.println(db_BoCode);
					 App_BoCode = "2520718";
					
					//if (db_BoCode = App_BoCode){
					if(db_BoCode.equalsIgnoreCase(App_BoCode)){	
						System.out.println("Pass");	
						
					}
					else{
						System.out.println("Fail");
					}
					
				}
				
				if (resultSet != null) {
					try {
						resultSet.close();
					} catch (Exception e) {
					}
				}
				
				if (stmt != null) {
					try {
						stmt.close();
					} catch (Exception e) {
					}
				}
				
				if (conn != null) {
					try {
						conn.close();
					} catch (Exception e) {
					}
				}
			}
		//}
		
		
		
		
		

	//}

}
