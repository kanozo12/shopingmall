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
			int userid = Integer.parseInt(req.getParameter("userid"));
			int productid = Integer.parseInt(req.getParameter("productid"));
			int numbers = Integer.parseInt(req.getParameter("numbers"));

			if ((req.getParameter("numbers") == null)) {
				System.out.println("No!!");
				return "product";
			}
			if ((numbers == 0)) {
				System.out.println("No --(2)");
				return "product";
			}

			HttpSession session = req.getSession();

			ArrayList<Product> products = null;
			products = ProductDAO.getInstance().allproductRetrieve();
			req.setAttribute("products", products);
			req.setAttribute("user", session.getAttribute("user"));

			try {
				BasketDAO.getInstance().basketAdd(userid, productid, numbers);
				return "product";
			} catch (Exception e) {
				e.printStackTrace();
				return "product";

			}

		}
		return "product";
	}

}
