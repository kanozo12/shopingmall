package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import dao.ProductDAO;
import domain.Product;
import domain.User;

public class LoginController implements Controller {
	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if (req.getMethod().equalsIgnoreCase("POST")) {
			User user = null;
			ArrayList<Product> products = null;

			HttpSession session = req.getSession();
			String usertype = req.getParameter("usertype");
			String username = req.getParameter("username");
			String password = req.getParameter("password");

			try {
				user = MemberDAO.getInstance().userRetrieve(usertype, username, password);
				products = ProductDAO.getInstance().allproductRetrieve();
				session.setAttribute("id", username);
				session.setAttribute("user1", user);
				req.setAttribute("products", products);
				
				if (user == null) {
					System.out.println("로그인 실패");
					return "login";
				}

			} catch (Exception e) {
				e.printStackTrace();
				return "login";
			}

			if (usertype.equals("A")) {
//				return "redirect::/admin/login";
				return "main";
			}

			if (usertype.equals("C")) {
				return "main";
			}
		}
		return "login";
	}
}
