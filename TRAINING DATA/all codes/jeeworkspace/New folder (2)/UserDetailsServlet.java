

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDetailsServlet
 */
public class UserDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Welcome</TITLE></HeAd>");
		out.println("<BODY>");
			String name=request.getParameter("nameText");
			String address=request.getParameter("addressText");
			String pass=request.getParameter("passText");
			
			RequestDispatcher rd=request.getRequestDispatcher("HeaderServlet");
			rd.include(request, response);
			
			
			out.println("You entered the following info:");
			out.println("Name "+name);
			out.println("Address "+address);
			out.println("Password "+pass);
			
				
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}

}
