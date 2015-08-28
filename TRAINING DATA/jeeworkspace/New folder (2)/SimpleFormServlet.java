

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleFormServlet
 */
public class SimpleFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
			
			RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
			if(name.equals("")||address.equals("") || pass.equals(""))
				out.println("Kindly enter all fields");
			else{
				request.setAttribute("fwdname", "Mr/Ms/Mrs"+name);
				request.setAttribute("fwdadr", address+" India");
				
				rd.forward(request, response);
			}
				
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}

}
