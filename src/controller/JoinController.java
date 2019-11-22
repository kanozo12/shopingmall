package controller;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;

public class JoinController implements Controller {
	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		if (req.getMethod().equalsIgnoreCase("POST")) {

			try {
				String username = req.getParameter("username");
				String password = req.getParameter("password");
				Date birthdate = java.sql.Date.valueOf(req.getParameter("birthdate"));
				String gender = req.getParameter("gender");
				String email = req.getParameter("email");
				String contact = req.getParameter("contact");
				String address = req.getParameter("address");

				
				System.out.println(username + ", " + password + ", " + birthdate +  ", " +  gender + ", " + email + ", " + contact + ", " + address);
				
				MemberDAO.getInstance().userCreate("C", username, password, birthdate, gender, email, contact, address);
				
				return "login";
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "join";
	}
}
