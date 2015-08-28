

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foodpanda.DiscountCalculator;
import com.foodpanda.DiscountCalculatorService;

/**
 * Servlet implementation class BillServlet
 */
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BillServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Double bill = Double.parseDouble(request.getParameter("food"));

		// get discount from webservice
		Double discount;
		DiscountCalculatorService dcs = new DiscountCalculatorService();
		DiscountCalculator dc = dcs.getDiscountCalculatorPort();
		discount = dc.calcDiscount(bill);

		Double finalAmt = bill - discount;

		request.setAttribute("finalAmt", finalAmt);
		RequestDispatcher rd = request.getRequestDispatcher("Invoice.jsp");
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
