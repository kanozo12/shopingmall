package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BasketDAO;
import domain.Basket;

public class DeleteController implements Controller {
	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		int basketid = Integer.parseInt(req.getParameter("basketid"));
		int userid = Integer.parseInt(req.getParameter("userid"));
		
		ArrayList<Basket> baskets = null;
		BasketDAO.getInstance().basketDelete(userid, basketid);
		baskets = BasketDAO.getInstance().basketRetrieve(userid);

		HttpSession session = req.getSession();

		req.setAttribute("baskets", baskets);
		
		req.setAttribute("user", session.getAttribute("user"));

		return "basket";
	}
}
