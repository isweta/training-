import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOStudentOracle implements DAOStudent {

	public Connection createConnection() {
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

	public List<Student> matchNameQuery(String str) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Student> list = null;

		try {
			con = createConnection();
			String query = "select * from studentRecords where sname like '%"
					+ str + "%'";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<Student>();
			while (rs.next()) {
				int sId = rs.getInt("sId");
				String sname = rs.getString("sname");
				
				String deptName = rs.getString("deptName");
				int totCredits = rs.getInt("totCredits");
				Student newStud = new Student(sId, sname, deptName, totCredits);
				list.add(newStud);

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

	public List<Student> matchDeptQuery(String deptNameStr) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Student> list = null;

		try {
			con = createConnection();
			String query = "select * from studentRecords where deptName ='"
					+ deptNameStr + "'";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<Student>();
			while (rs.next()) {
				int sId = rs.getInt("sId");
				String sname = rs.getString("sname");

				String deptName = rs.getString("deptName");
				int totCredits = rs.getInt("totCredits");
				Student newStud = new Student(sId, sname, deptName, totCredits);
				list.add(newStud);

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

	public List<String> getDepartmentsQuery() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<String> list = null;

		try {
			con = createConnection();
			String query = "select distinct deptName from studentRecords";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<String>();
			while (rs.next()) {
				String deptName = rs.getString("deptName");
				list.add(deptName);

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

}
