package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import dao.ProductDAO;
import domain.Product;
import domain.User;

public class ProductController implements Controller {
	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ArrayList<Product> products = null;
		HttpSession session = req.getSession();		
		products = ProductDAO.getInstance().allproductRetrieve();

//		int userid = Integer.parseInt(req.getParameter("userid"));
//	
		req.setAttribute("products", products);
		req.setAttribute("user", session.getAttribute("user1"));
		
		System.out.println(session.getAttribute("user"));
		System.out.println(products);
		return "product";
	}
}
