package bank;



import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StatementServlet
 */
public class StatementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accNo = request.getParameter("accNo");
		System.out.println("-------------processing mini statement-----");
		DAOBank dbank = new DAOBankOracle();
		double currBal = dbank.getBalanceQuery(Integer.parseInt(accNo));
		System.out.println("balance returned- "+currBal);
		AccountBean acc=(AccountBean) request.getAttribute("acc");
		acc.setCurrBal(currBal);
		System.out.println("acc acc no"+acc.getAccNo());
		System.out.println("acc cuur bal"+acc.getCurrBal());
		RequestDispatcher rd=request.getRequestDispatcher("MiniStatement.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
