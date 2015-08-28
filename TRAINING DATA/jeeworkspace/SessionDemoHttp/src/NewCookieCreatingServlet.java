

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewCookieCreatingServlet
 */
public class NewCookieCreatingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewCookieCreatingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("usrname");
		String passwrd=request.getParameter("passwrd");
		Cookie Mycookie1 = new Cookie("uname",name) ;
         Mycookie1.setMaxAge(10);        
         response.addCookie( Mycookie1 ) ;
         
         Cookie Mycookie2 = new Cookie("pwd",passwrd) ;
         Mycookie2.setMaxAge(10);
         response.addCookie( Mycookie2 ) ;
         
         Cookie Mycookie3 = new Cookie("mobile","9905216484") ;
         Mycookie3.setMaxAge(10000);
         response.addCookie( Mycookie3 ) ;
         
         response.setContentType("text/html");
 		
 		PrintWriter out=response.getWriter();
 		out.println("<HTML><BODY>");
 		out.println("<h3>Cookie Initialized</h3>");
 		out.println("<a href='index.html'>Go back to home page</a>");
 		out.println("<a href='http://localhost:8080/SessionDemoHttp/CookieCheckingServlet'>check cookie</a>");
 		out.println("</BODY></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
