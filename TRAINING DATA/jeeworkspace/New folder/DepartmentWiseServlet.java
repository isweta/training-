

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DepartmentWiseServlet
 */
public class DepartmentWiseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentWiseServlet() {
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
		
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Student Records</TITLE></HeAd>");
		out.println("<BODY>");
		
		DAOStudent dstud = new DAOStudentOracle();

		List<String> list = dstud.getDepartmentsQuery();
		out.println("<Form method=post action=GetDepartmentsServlet>");
		out.println("<select name=\"dept\">");
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			out.println("<option>");
			out.println(it.next());
			out.println("</option>");
			
		}
		
		out.println("</select>");
		out.println("<input type=\"submit\" value=\"submit\" />");
		out.println("</Form>");
	}

}
