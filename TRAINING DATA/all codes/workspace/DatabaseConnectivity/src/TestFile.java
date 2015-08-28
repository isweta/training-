import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class TestFile {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String uname = "hr";
			String password = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con=DriverManager.getConnection(url, uname, password);
			String query="select ename, salary from empl where empno=? and salary>?";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, 102);
			pstmt.setInt(2, 20000);
			rs=pstmt.executeQuery();
			while(rs.next()){
				String name=rs.getString("ename");
				int salary=rs.getInt("salary");
				System.out.println("Name: "+ name+" Salary: "+salary);
			}
			System.out.println("Completed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)
					rs.close();
				if(pstmt!=null)
					pstmt.close();
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
