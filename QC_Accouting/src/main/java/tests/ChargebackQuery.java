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

import com.relevantcodes.extentreports.LogStatus;

import oracle.jdbc.OracleTypes;

public class ChargebackQuery extends QCStore{

	public static void proc() throws ClassNotFoundException, SQLException {
		Connection conn = null;

		// Object of Statement. It is used to create a Statement to execute the
		// query
		Statement stmt = null;

		// Object of ResultSet => 'It maintains a cursor that points to the
		// current row in the result set'
		ResultSet resultSet = null;
		List<String> rowValues = new ArrayList();
		List<String> rowValues2 = new ArrayList();
		int total_sum[] = null;
		String stotal[] = new String [20];
		//String stotal[] = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");
		 //System.out.println("before conn");
		// Open a connection
		try {

			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.241:1521:QFUNDUAT1", "QCHPROD_QTP_03122019",
					"QCHPROD_QTP_03122019");
			test.log(LogStatus.PASS, "Connecting to DB ");

		} catch (SQLException e1) {

			System.out.println("Connection Failed! Check output console" + e1);
			e1.printStackTrace();
		}

		// Execute a query
		stmt = conn.createStatement();
		loan_nbr="10441158";
		//System.out.println("after conn");
		try {
		
			 resultSet = stmt.executeQuery("SELECT ILOAN_TRAN_CODE,PAY_INTEREST,UNPAID_INTEREST FROM ST_IL_DISTRIBUTION where iloan_tran_code in (SELECT si.ILOAN_TRAN_CODE FROM st_il_trans si where si.iloan_code="+loan_nbr+" and si.iloan_tran_code>(select max(slt.iloan_tran_code) from st_il_trans slt where slt.iloan_code=si.iloan_code and is_chargeback='Y') ) order by ILOAN_TRAN_CODE ASC ");
			 test.log(LogStatus.PASS, "Executing the query with loan number"+loan_nbr);
			
			 test.log(LogStatus.PASS, "Getting values from the tables ILOAN_TRAN_CODE,PAY_INTEREST and UNPAID_INTEREST with the loan number"+loan_nbr);

			while (resultSet .next())
			{
				 rowValues.add(resultSet.getString(2)); 
				 rowValues2.add(resultSet.getString(3)); 
				 System.out.println(
						resultSet .getString(2) + "  " +
									  resultSet.getString(3)/* + "  " +
									  resultSet.getString(3) + "  " +
									  resultSet.getString(4) + "  " +
									  resultSet.getString(5)
									 */);
			}
			 
			 
			System.out.println("after query");
			
			for (int i=0;i < rowValues.size();i++)
			{
			
				
				
				if(rowValues.get(i)==null){
					
					//total_sum=0;
					test.log(LogStatus.PASS, "Total interest value is "+ total_sum);
					
				}
				
				else 
				{
					String values=rowValues.get(i);	
					String values2=rowValues2.get(i);	
					
					Double dvalue=Double.parseDouble(values);
					test.log(LogStatus.PASS, "PAY_INTEREST value is "+ dvalue);
					Double dvalue2=Double.parseDouble(values2);
					test.log(LogStatus.PASS, "UNPAID_INTEREST value is "+ dvalue2);
					double total=dvalue+dvalue2;
					test.log(LogStatus.PASS, "Total interest value after adding the interests is "+ total);
					stotal[i]=String.valueOf(total);
					/*String s1[]=stotal.split("-");
					stotal=s1[1];*/
					
					
				}
				
				
				
			}
				
				
				

				for(int j=0;j<=stotal.length;j++)
				{
                   
				if(stotal[j].toLowerCase().trim().equalsIgnoreCase(interest_page[totalrows-payment_no+j].toLowerCase().trim()))
				{
					test.log(LogStatus.PASS, j+" Interest value->Expected value:"+interest_page[totalrows-payment_no+j] +"; == Actual value:"+stotal[j]);
				}
				else
				{
					test.log(LogStatus.FAIL, j+" Interest value->Expected value:"+interest_page[totalrows-payment_no+j] +"; not equals to Actual value:"+stotal[j]);

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
		catch (Exception e2) {

			System.out.println(" console" + e2);
			e2.printStackTrace();
		}

	}

}
