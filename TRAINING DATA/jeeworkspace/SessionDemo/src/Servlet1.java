
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
		String name = request.getParameter("usrname");
		request.setAttribute("usrname", name);
		out.println("<html><body>");
		out.println("<h2>Hello" + name
				+ "<h2><br>We need some addiional details about you<br>");
		out.println("<form action='Servlet2' method='get'>");
		out.println("Age:<input type='text' name='age'><br>");
		out.println("Salary:<input type='text' name='salary'><br>");
		out.println("<input type='submit' value='Submit'>");
		out.println("</form></body></html>");
		//rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
