package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PaymentDAO;
import domain.Payment;
import domain.User;

public class PaymentListController implements Controller {
	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		HttpSession session = req.getSession();
		
		if (session.getAttribute("id") == null) {
			return "login";
		}

		int userid = ((User) session.getAttribute("user")).getUserId();
		ArrayList<Payment> payments = null;

		payments = PaymentDAO.getInstance().allpaymentRetrieve(userid);

		req.setAttribute("user", session.getAttribute("user1"));
		req.setAttribute("payments", payments);

		return "payment";
	}
}
