import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Ques1 {

	public static void getAllGryffindors(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String query = "select name from HarryPotter where house=? ";
			pstmt.setString(1, "Gryffindor");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("ename");
				int salary = rs.getInt("salary");
				System.out.println("Name: " + name + " Salary: " + salary);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if(pstmt!=null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void insertRecords(Connection con) {
		
	}

	

	public static void main(String[] args) {
		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String uname = "hr";
			String password = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, uname, password);
			// createTable(con);
			// insertRecords(con);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {

				if (con != null)
					con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}

}
