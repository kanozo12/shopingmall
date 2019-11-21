package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dao.ProductDAO;
import domain.Product;
import domain.User;

public class MainController implements Controller {
	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if (req.getMethod().equalsIgnoreCase("POST")) {

			String usertype = req.getParameter("usertype");
			String username = req.getParameter("username");
			String password = req.getParameter("password");

			System.out.println(usertype + ", " + username + ", " + password);

			User user = null;
			ArrayList<Product> products = null;

			try {
				user = MemberDAO.getInstance().userRetrieve(usertype, username, password);
				products = ProductDAO.getInstance().allproductRetrieve();

				if (user == null) {
					System.out.println("로그인 실패");
					return "main";
				}
//				if (products == null) {
//					System.out.println("상품 로드 실패");
//					return "main";
//				}

				req.setAttribute("user", user);
				req.setAttribute("products", products);
				
				System.out.println("##########");
				System.out.println(user);
				System.out.println(products);

			} catch (Exception e) {
				e.printStackTrace();
				return "/";
			}

			if (usertype.equals("A")) {
//				return "redirect::/admin/login";
				return "product";
			}

			if (usertype.equals("C")) {
				return "product";
			}
		}
		return "main";
	}
}
