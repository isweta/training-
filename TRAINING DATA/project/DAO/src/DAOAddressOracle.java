import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOAddressOracle implements DAOAddress {
	public static Connection createConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String uname = "hr";
			String password = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, uname, password);
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
		return con;
	}
	
	public int getZipcode(int adrId){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Order order = null;

		try {
			con = createConnection();
			String query = "select zipcode from address where adrId="+adrId;
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			if(rs.next())
				return rs.getInt("zipcode");
			else{
				System.out.println("Address Doesn't exist");
				return -1;
			}
				

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return 0;
	
	}

}
