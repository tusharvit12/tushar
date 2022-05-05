import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;

public class DeleteTest {

	public static void main(String[] args) {
		try
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded.../registered....");
		
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to the db....");
			
			PreparedStatement pst = conn.prepareStatement("delete from BANK_APPLICANT WHERE APPLICANT_ID=?");
			pst.setInt(1, 123);
			System.out.println("prepared statement is created..."+pst);
			
			int row = pst.executeUpdate();
			System.out.println("row deleted ..."+row);

			pst.close();
			conn.close();
			System.out.println("DisConnected from the db....");
			
		}
		catch(SQLException e) {
			System.out.println("Some problem : "+e);
		}
		
	}

}