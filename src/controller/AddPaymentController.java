package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductDAO;
import domain.Basket;
import domain.Product;
import domain.User;

public class AddPaymentController implements Controller {
	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		if (req.getMethod().equalsIgnoreCase("POST")) {

			HttpSession HttpSession = req.getSession();
			ArrayList<Basket> baskets = (ArrayList<Basket>) HttpSession.getAttribute("baskets");
			User user = (User) HttpSession.getAttribute("user1");
			ArrayList<Product> products = null;
			products = ProductDAO.getInstance().allproductRetrieve();
			int totalprice = 0;

			ArrayList<Product> myproducts = new ArrayList<Product>();
			for (int i = 0; i < baskets.size(); i++) {
				for (int j = 0; j < products.size(); j++) {
					if (baskets.get(i).getProductId() == products.get(j).getProductId()) {
						totalprice += products.get(j).getPrice() * baskets.get(i).getNumbers();
						myproducts.add(products.get(j));
					}
				}
			}

			req.setAttribute("baskets", baskets);
			req.setAttribute("user", user);
			req.setAttribute("myproducts", myproducts);
			req.setAttribute("totalprice", totalprice);
			

			return "addpayment";
		}
		return "basket";
	}
}
