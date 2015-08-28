

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ServletContext sc=getServletContext();
				//sc.setAttribute("compname","wipro");
				
		PrintWriter out=response.getWriter();
				
				HttpSession hs=request.getSession(false);
				String name=(String)hs.getAttribute("usrname");
				String age=request.getParameter("age");
				String salary=request.getParameter("salary");
				out.println("<html><body>");
				out.println("<h2>Hello"+name+"<h2><br>Plese verify the details about you<br>");
				out.println("Your name is "+name);
				out.println("<br>Your age is "+age);
				out.println("<br>Your salary is "+salary);
				out.println("<br><input type='submit' value='Submit'>");
				out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
