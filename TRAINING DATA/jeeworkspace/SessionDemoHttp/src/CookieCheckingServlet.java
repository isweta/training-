
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookieCheckingServlet
 */
public class CookieCheckingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CookieCheckingServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// HttpSession hs1= request.getSession();
		// HttpSession hs1= request.getSession(true);

		// to check user in session
		/*
		 * HttpSession hs2= request.getSession(false);
		 * if(hs2==null||hs2.getAttribute("username")==null)
		 * response.sendRedirect("login.html");
		 * 
		 * 
		 * //logout if(hs2!=null) hs2.invalidate();
		 */

		
		
		Cookie[] cookie = request.getCookies();
		
		if (cookie == null)
			response.sendRedirect("index.html");
		System.out.println("length  " +cookie.length);
		
		Cookie userNameCookie = null;
		Cookie passwordCookie = null;
		String username = null;
		String password = null;
		for (int i = 0; i < cookie.length; i++) {
			if (cookie[i].getName().equals("uname")) {
				userNameCookie = cookie[i];
			} else if (cookie[i].getName().equals("pwd")) {
				passwordCookie = cookie[i];
			}

		}// end of for
		System.out.println(userNameCookie);
		System.out.println(passwordCookie);
		
		
		if (userNameCookie != null && passwordCookie != null) {
			username = userNameCookie.getValue();
			password = passwordCookie.getValue();

			if (username.equals("trainee") && password.equals("verizon"))
				response.sendRedirect("index.html");
			else
				response.sendRedirect("welcome.html");

		} else {
			PrintWriter out = response.getWriter();
			out.println("<HTML><BODY>");
			out.println("<h3>Cookie Expired</h3>");
			out.println("<a href='index.html'>Go back to home page</a>");
			out.println("</BODY></HTML>");
		}
		
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
