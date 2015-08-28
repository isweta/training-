import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DAOOrderOracle implements DAOOrder{
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
	
	
	public int getServiceAddressId(String custId){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Order order = null;

		try {
			con = createConnection();
			String query = "select serviceAddressId from Customer where custId="+custId;
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			if(rs.next())
				return rs.getInt("serviceAddressId");

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
		return -1;
		
	}

	@Override
	public Order getOrderDetails(String orderId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Order order = null;

		try {
			con = createConnection();
			String query = "select * from Order where orderId="+orderId;
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				//add fields
				order = new Order();
				

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
		return order;

	}
	
	@Override
	public String getServiceId(String orderId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Order order = null;

		try {
			con = createConnection();
			String query = "select serviceId from Order where orderId="+orderId;
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			if(rs.next())
				return rs.getString("serviceId");
				

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
		return null;

	}
	
	@Override
	public Order getProvisionReadyOrders() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Order> orderList = null;
		
		try {
			con = createConnection();
			
			
			String query = "select * from Order where status='provisionReady'";
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				//add fields
				order = new Order();
				

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
		return order;

	}
	
	@Override
	public String getAddOrderIdForDisconnectOrder(String serviceId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Order order = null;

		try {
			con = createConnection();
			String query = "select orderId from Order where serviceId="+serviceId+" and orderType='newInstall'";
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				//add fields
				order = new Order();
				

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
		return order;

	}
}
