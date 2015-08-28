package bank;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TransactionServlet
 */
public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TransactionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("-------------processing transaction-----");
		HttpSession hs = request.getSession();
		String accNo = (String)hs.getAttribute("accNo");
		String ttype = request.getParameter("ttype");
		String amt = request.getParameter("amt");
		
		System.out.println(accNo);
		System.out.println(ttype);
		System.out.println(amt);
		AccountOperation accOp = new AccountOperation();
		DAOBank dbank = new DAOBankOracle();
		accOp.setAccNo(Integer.parseInt(accNo));
		accOp.setTranType(ttype);
		accOp.setAmount(Double.parseDouble(amt));
		if (ttype.equals("Withdraw")) {

			dbank.withdrawQuery(Integer.parseInt(accNo), Double.parseDouble(amt));

		} else {
			dbank.depositQuery(Integer.parseInt(accNo), Double.parseDouble(amt));
		}
		dbank.insertTransactionQuery(accOp);
		RequestDispatcher rd = request
				.getRequestDispatcher("TransactionDone.jsp");
		rd.forward(request, response);
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
