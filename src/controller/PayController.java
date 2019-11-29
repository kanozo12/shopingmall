package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BasketDAO;
import dao.PaymentDAO;
import dao.ProductDAO;
import domain.Basket;
import domain.Product;
import domain.User;

public class PayController implements Controller {
	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		HttpSession session = req.getSession();
		ArrayList<Basket> baskets = (ArrayList<Basket>) session.getAttribute("baskets");

		if (session.getAttribute("id") == null) {
			return "login";
		}

		User user = (User) session.getAttribute("user");
		int userid = user.getUserId();
		String address = user.getAddress();
		String contact = user.getContact();
		String creditcardnumber = req.getParameter("creditcardnumber");
		String creditcardpassword = req.getParameter("creditcardpassword");
		ArrayList<Product> products = null;

		products = ProductDAO.getInstance().allproductRetrieve();

		req.setAttribute("products", products);
		req.setAttribute("user", session.getAttribute("user"));

		for (int i = 0; i < baskets.size(); i++) {
			PaymentDAO.getInstance().paymentAdd(userid, baskets.get(i).getProductId(), baskets.get(i).getNumbers(),
					address, contact, creditcardnumber, creditcardpassword);
		}
		BasketDAO.getInstance().basketClean(userid);

		return "product";
	}
}
