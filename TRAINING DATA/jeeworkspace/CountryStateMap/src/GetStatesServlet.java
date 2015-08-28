

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetStatesServlet
 */
public class GetStatesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetStatesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Connecting to Database");
		String cname=request.getParameter("cname");
		System.out.println("Cpuntry name obtained "+cname);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		PreparedStatement pstmt = conn
				.prepareStatement("select states.name from country join states on country.cid=states.cid where country.name=?");
		pstmt.setString(1,cname);
		ResultSet rs=pstmt.executeQuery();
		PrintWriter output=response.getWriter();
		output.write("<select>");
		while(rs.next()){
			output.write("<option>");
				System.out.println(rs.getString(1));
				output.write(rs.getString(1));
			output.write("</option>");
		}
		
		output.write("</select>");
		conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
