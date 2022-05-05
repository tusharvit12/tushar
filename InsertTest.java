import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;

public class InsertTest {

	public static void main(String[] args) {
		try
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded.../registered....");
		
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to the db....");
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO BANK_APPLICANT VALUES (?,?,?,?,?,?) ");
			pst.setInt(1, 723);
			pst.setString(2, "ROBERT");
			pst.setString(3, "robert@gmail.com");
			pst.setString(4, "Mumbai");
			pst.setString(5, "6667778880");
			
			Calendar cal = Calendar.getInstance();
			java.util.Date date = cal.getTime();
			
			java.sql.Date sqlDate= new java.sql.Date(date.getTime());
			pst.setDate(6,sqlDate);
			System.out.println("prepared statement is created..."+pst);
			
			int row = pst.executeUpdate();
			System.out.println("row inserted..."+row);

			pst.close();
			conn.close();
			System.out.println("DisConnected from the db....");
			
		}
		catch(SQLException e) {
			System.out.println("Some problem : "+e);
		}
		
	}

}

