package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.User;

public class MemberDAO {
	private static MemberDAO dao = new MemberDAO();

	private MemberDAO() {
		// do nothing; //기본 생성자를 private으로 만들어서 더 이상 생성하지 못하게 막음
	}

	public static MemberDAO getInstance() {
		return dao;
	}

	public User userRetrieve(String usertype, String username, String password) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		Connection con = JDBCUtil.getConnection();

		try {
			String sql = "SELECT * FROM shop_users WHERE userType=? AND userName=? AND password =?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, usertype);
			pstmt.setString(2, username);
			pstmt.setString(3, password);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int UserID = rs.getInt("userId");
				String UserType = rs.getString("userType");
				String UserName = rs.getString("userName");
				String Password = rs.getString("password");
				Date BirthDate = rs.getDate("birthDate");
				String Gender = rs.getString("gender");
				String Email = rs.getString("email");
				String Contact = rs.getString("contact");
				String Address = rs.getString("address");

				user = new User(UserID, UserType, UserName, Password, BirthDate, Gender, Email, Contact, Address);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(con);
		}
		return user;
	}

	public void userCreate(String usertype, String username, String password, Date birthdate, String gender,
			String email, String contact, String address) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement stmt = null;
		ResultSet rset = null;

		String getid_sql = "SELECT COUNT(userId) FROM shop_users";
		String create_sql = "INSERT INTO shop_users VALUES(?,?,?,?,?,?,?,?,?)";

		try {
			stmt = con.prepareStatement(getid_sql);
			rset = stmt.executeQuery();
			int ID = -1;
			rset.next();
			ID = rset.getInt("COUNT(userId)");
			ID++;
			stmt = con.prepareStatement(create_sql);
	
			stmt.setInt(1, ID);
			stmt.setString(2, usertype);
			stmt.setString(3, username);
			stmt.setString(4, password);
			stmt.setDate(5, birthdate);
			stmt.setString(6, gender);
			stmt.setString(7, email);
			stmt.setString(8, contact);
			stmt.setString(9, address);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rset);
			JDBCUtil.close(stmt);
			JDBCUtil.close(con);
		}
	}

}
