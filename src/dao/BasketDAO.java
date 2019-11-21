package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.Basket;

public class BasketDAO {
	private static BasketDAO dao = new BasketDAO();

	private BasketDAO() {
		// do nothing; //기본 생성자를 private으로 만들어서 더 이상 생성하지 못하게 막음
	}

	public static BasketDAO getInstance() {
		return dao;
	}

	public ArrayList<Basket> basketRetrieve(int userid) throws SQLException {
		ArrayList<Basket> baskets = new ArrayList<Basket>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection con = JDBCUtil.getConnection();

		String sql = "SELECT * FROM basket where userId = ? and validity = 1";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int BasketID = rs.getInt(1);
				int UserID = rs.getInt(2);
				int ProductID = rs.getInt(3);
				int Numbers = rs.getInt(4);
				int Validity = rs.getInt(5);
				baskets.add(new Basket(BasketID, UserID, ProductID, Numbers, Validity));
			}
			return baskets;
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

	public void basketAdd(int userid, int productid, int numbers) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String getid_sql = "SELECT COUNT(basketId) FROM basket";
		String add_sql = "INSERT INTO basket VALUES(?,?,?,?,1)";
		try {
			pstmt = con.prepareStatement(getid_sql);
			rs = pstmt.executeQuery();
			int ID = -1;
			rs.next();
			ID = rs.getInt("COUNT(BasketID)");
			ID++;
			pstmt = con.prepareStatement(add_sql);
			pstmt.setInt(1, ID);
			pstmt.setInt(2, userid);
			pstmt.setInt(3, productid);
			pstmt.setInt(4, numbers);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(con);
		}
	}

	public void basketDelete(int userid, int basketid) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "UPDATE basket SET validity = 2 WHERE userId = ? AND basketId = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userid);
			pstmt.setInt(2, basketid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(con);
		}
	}

	public void basketClean(int userid) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "UPDATE basket SET validity = 2 WHERE userId = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userid);
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
