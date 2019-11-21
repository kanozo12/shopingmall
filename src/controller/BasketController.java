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

		HttpSession session = req.getSession();
		int userid = Integer.parseInt(req.getParameter("userid"));

		ArrayList<Basket> baskets = BasketDAO.getInstance().basketRetrieve(userid);

		req.setAttribute("user", session.getAttribute("user"));
		req.setAttribute("baskets", baskets);

		return "basket";
	}
}
