import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAODeviceOracle implements DAODevice {

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
	
	
	public List<De>
	
	public int insertDeviceToInventory(Device device) {
		
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			String query = "insert into Device values(?,?,?,?,?)";
			con = createConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, device.getSequenceNumber());
			pstmt.setString(2, device.getDeviceId());
			pstmt.setString(3, device.getPartNo());
			pstmt.setString(4, device.getManufacturer());
			pstmt.setInt(5, device.getZipcode());
			pstmt.setInt(6,device.getPortId());
			pstmt.setString(7,device.getStatus());
			pstmt.setInt(8, device.getBandwidthMbps());
			int rows = pstmt.executeUpdate();
			return rows;
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

	public List<Device> searchByGroupBy(String columnNameS,
			String columnValueS, String columnNameG) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Device> list = null;

		try {
			con = createConnection();
			String query = "select * from harrypotter where " + columnNameS
					+ "='" + columnValueS + "'" + " group by " + columnNameG;
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<Device>();
			while (rs.next()) {
				String name = rs.getString("name");
				String house = rs.getString("house");
				String role = rs.getString("role");
				String status = rs.getString("status");
				String dies = rs.getString("dies");
				Device newChar = new Device(name, house, role, status, dies);
				list.add(newChar);

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
		return list;
	}

	public static List<Device> searchBy(String columnName, String columnValue) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Device> list = null;

		try {
			con = createConnection();
			String query = "select * from harrypotter where " + columnName
					+ "='" + columnValue + "'";
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<Device>();
			while (rs.next()) {
				String name = rs.getString("name");
				String house = rs.getString("house");
				String role = rs.getString("role");
				String status = rs.getString("status");
				String dies = rs.getString("dies");
				Device newChar = new Device(name, house, role, status, dies);
				list.add(newChar);

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
		return list;
	}

	public static List<Device> returnQuery() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Device> list = null;

		try {
			con = createConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<Device>();
			while (rs.next()) {
				String name = rs.getString("name");
				String house = rs.getString("house");
				String role = rs.getString("role");
				String status = rs.getString("status");
				String dies = rs.getString("dies");
				Device newChar = new Device(name, house, role, status, dies);
				list.add(newChar);

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
		return list;
	}

	int insert(Device c) {

		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			String query = "insert into HarryPotter values(?,?,?,?,?)";
			con = createConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, c.getName());
			pstmt.setString(2, c.getHouse());
			pstmt.setString(3, c.getRole());
			pstmt.setString(4, c.getStatus());
			pstmt.setString(5, c.getDies());
			int rows = pstmt.executeUpdate();
			return rows;
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

	int update(Device c) {
		return 0;

	}

	List<Device> listCharacters() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Device> list = null;

		try {
			con = createConnection();
			String query = "select * from harrypotter";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<Device>();
			while (rs.next()) {
				String name = rs.getString("name");
				String house = rs.getString("house");
				String role = rs.getString("role");
				String status = rs.getString("status");
				String dies = rs.getString("dies");
				Device newChar = new Device(name, house, role, status, dies);
				list.add(newChar);

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
		return list;

	}

	int deleteCharacter(Device c) {
		return 0;

	}

	public static void createTable(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement();

			String query = "create table HarryPotter" + "(Name varchar2(25),"
					+ "House varchar2(25)," + "Role varchar2(25),"
					+ "Status varchar2(25)," + "Dies varchar2(25))";

			stmt.executeUpdate(query);
			System.out.println("Table created");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
}
