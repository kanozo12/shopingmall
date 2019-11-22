package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BasketDAO;
import dao.ProductDAO;
import domain.Product;

public class TakeController implements Controller {
	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if (req.getMethod().equalsIgnoreCase("POST")) {
			HttpSession session = req.getSession();

			if (session.getAttribute("id") == null) {
				return "login";
			}

			int userid = Integer.parseInt(req.getParameter("userid"));
			int productid = Integer.parseInt(req.getParameter("productid"));

			ArrayList<Product> products = null;
			products = ProductDAO.getInstance().allproductRetrieve();

			req.setAttribute("products", products);
			req.setAttribute("user", session.getAttribute("user1"));
			try {
				BasketDAO.getInstance().basketAdd(userid, productid, 1);
			} catch (Exception e) {
				e.printStackTrace();
				return "product";
			}
		}
		return "product";
	}

}
