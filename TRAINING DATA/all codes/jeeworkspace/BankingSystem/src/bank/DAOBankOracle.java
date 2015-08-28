package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOBankOracle implements DAOBank {

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
	
	public void depositQuery(int accNo, double amt) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		

		try {
			con = createConnection();
			String query = "update account_info_table set balance=balance+"+amt+" where accNo="
					+ accNo;
			pstmt = con.prepareStatement(query);

			pstmt.executeQuery();
			
			
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
		

	}
	public void insertTransactionQuery(AccountOperation accOp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		

		try {
			con = createConnection();
			String query = "insert into bankusertransaction values(?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, accOp.getAccNo());
			pstmt.setDouble(2, accOp.getAmount());
			pstmt.setString(3, accOp.getTranType());

			pstmt.executeUpdate();
			
			
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
		

	}
	
	public void withdrawQuery(int accNo, double amt) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		

		try {
			con = createConnection();
			String query = "update account_info_table set balance=balance-"+amt+" where accNo="
					+ accNo;
			pstmt = con.prepareStatement(query);

			pstmt.executeQuery();
			
			
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
		

	}

	public double getBalanceQuery(int accNo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		double currBal = 0.0;

		try {
			con = createConnection();
			String query = "select balance from account_info_table where accNo="
					+ accNo;
			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				currBal = Double.parseDouble(rs.getString("balance"));

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
		return currBal;

	}

}
