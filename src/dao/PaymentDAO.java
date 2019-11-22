package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.Payment;

public class PaymentDAO {
	private static PaymentDAO dao = new PaymentDAO();

	private PaymentDAO() {
		// do nothing; //기본 생성자를 private으로 만들어서 더 이상 생성하지 못하게 막음
	}

	public static PaymentDAO getInstance() {
		return dao;
	}

	public ArrayList<Payment> allpaymentRetrieve() throws SQLException {
		ArrayList<Payment> payments = new ArrayList<Payment>();
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String allselect_sql = "SELECT * FROM pay";
			pstmt = con.prepareStatement(allselect_sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int PaymentID = rs.getInt(1);
				int UserID = rs.getInt(2);
				int ProductID = rs.getInt(3);
				int Numbers = rs.getInt(4);
				String Address = rs.getString(5);
				String Contact = rs.getString(6);
				String CreditCardNumber = rs.getString(7);
				String CreditCardPassword = rs.getString(8);
				payments.add(new Payment(PaymentID, UserID, ProductID, Numbers, Address, Contact, CreditCardNumber,
						CreditCardPassword));
			}
			return payments;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(con);
		}
	}

	ArrayList<Payment> paymentRetrieve(int userid) throws SQLException {
		ArrayList<Payment> payments = new ArrayList<Payment>();
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String select_sql = "SELECT * FROM pay WHERE userId = ?";
		try {
			pstmt = con.prepareStatement(select_sql);
			pstmt.setInt(1, userid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int PaymentID = rs.getInt(1);
				int UserID = rs.getInt(2);
				int ProductID = rs.getInt(3);
				int Numbers = rs.getInt(4);
				String Address = rs.getString(5);
				String Contact = rs.getString(6);
				String CreditCardNumber = rs.getString(7);
				String CreditCardPassword = rs.getString(8);
				payments.add(new Payment(PaymentID, UserID, ProductID, Numbers, Address, Contact, CreditCardNumber,
						CreditCardPassword));
			}
			return payments;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(con);
		}
	}

	public void paymentAdd(int userid, int productid, int numbers, String address, String contact,
			String creditcardnumber, String creditcardpassword) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String getid_sql = "SELECT COUNT(paymentId) FROM pay";
		String add_sql = "INSERT INTO pay VALUES(?,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(getid_sql);
			rs = pstmt.executeQuery();
			int ID = -1;
			rs.next();
			ID = rs.getInt("COUNT(PaymentID)");
			ID++;
			pstmt = con.prepareStatement(add_sql);
			pstmt.setInt(1, ID);
			pstmt.setInt(2, userid);
			pstmt.setInt(3, productid);
			pstmt.setInt(4, numbers);
			pstmt.setString(5, address);
			pstmt.setString(6, contact);
			pstmt.setString(7, creditcardnumber);
			pstmt.setString(8, creditcardpassword);
			pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(con);
		}
	}
}
