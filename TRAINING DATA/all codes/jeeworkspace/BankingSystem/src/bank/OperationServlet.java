package bank;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class OperationServlet
 */
public class OperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OperationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String accNo = request.getParameter("accNo");
		String accOp = request.getParameter("accOp");
		HttpSession hs = request.getSession();
		hs.setAttribute("accNo", accNo);
		if (accOp.equals("MiniStatement")) {
			System.out.println("-------------generate mini statement-----");
			AccountBean accOb = new AccountBean();
			accOb.setAccNo(Integer.parseInt(accNo));
			RequestDispatcher rd = request
					.getRequestDispatcher("StatementServlet");
			request.setAttribute("acc", accOb);
			rd.forward(request, response);
		} else {
			AccountOperation accOpOb = new AccountOperation();
			accOpOb.setAccNo(Integer.parseInt(accNo));
			request.setAttribute("accOp", accOpOb);
			RequestDispatcher rd = request
					.getRequestDispatcher("TransactionForm.jsp");
			
			rd.forward(request, response);
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
