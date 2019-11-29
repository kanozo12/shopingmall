package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BasketDAO;
import domain.Basket;

public class BasketController implements Controller {
	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		if (req.getMethod().equals("POST")) {
			HttpSession session = req.getSession();
			
			if(session.getAttribute("id") == null) {
				return "login";
			}
			 
			int userid = Integer.parseInt(req.getParameter("userid"));
			
//			ArrayList<Basket> baskets = BasketDAO.getInstance().basketRetrieve(userid);
			ArrayList<Basket> list = BasketDAO.getInstance().basketJoin(userid);
			System.out.println("######");
			System.out.println(list);
			
			
			req.setAttribute("user", session.getAttribute("user1"));
//			req.setAttribute("baskets", list);
			session.setAttribute("baskets", list);
		
		}

		return "basket";
	}
}
