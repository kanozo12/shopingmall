package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import domain.Product;

public class ProductDAO {
	private static ProductDAO dao = new ProductDAO();

	private ProductDAO() {
		// do nothing; //기본 생성자를 private으로 만들어서 더 이상 생성하지 못하게 막음
	}

	public static ProductDAO getInstance() {
		return dao;
	}

	public ArrayList<Product> allproductRetrieve() {
		ArrayList<Product> products = new ArrayList<Product>();
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM product";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int ProductID = rs.getInt(1);
				String ProductType = rs.getString(2);
				String ProductName = rs.getString(3);
				String Explanation = rs.getString(4);
				int Price = rs.getInt(5);
				int Inventory = rs.getInt(6);
				products.add(new Product(ProductID, ProductType, ProductName, Explanation, Price, Inventory));
			}
			return products;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			JDBCUtil.close(pstmt);
			JDBCUtil.close(con);
			JDBCUtil.close(rs);
		}
	}

	public ArrayList<Product> productRetrieve(String productname) {
		ArrayList<Product> products = new ArrayList<Product>();
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			pstmt = con.prepareStatement("SELECT * FROM product WHERE productName like '%" + productname + "%'");

			rs = pstmt.executeQuery();
			while (rs.next()) {
				int ProductID = rs.getInt(1);
				String ProductType = rs.getString(2);
				String ProductName = rs.getString(3);
				String Explanation = rs.getString(4);
				int Price = rs.getInt(5);
				int Inventory = rs.getInt(6);
				products.add(new Product(ProductID, ProductType, ProductName, Explanation, Price, Inventory));
			}
			return products;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			JDBCUtil.close(pstmt);
			JDBCUtil.close(con);
			JDBCUtil.close(rs);
		}
	}

	public void productInsert(String producttype, String productname, String explanation, int price, int inventory) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String getid_sql = "SELECT COUNT(productId) FROM product";
			String insert_sql = "INSERT INTO shoppingproduct VALUES(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(getid_sql);
			rs = pstmt.executeQuery();
			int ID = -1;
			rs.next();
			ID = rs.getInt("COUNT(productId)");
			ID++;
			pstmt = con.prepareStatement(insert_sql);
			pstmt.setInt(1, ID);
			pstmt.setString(2, producttype);
			pstmt.setString(3, productname);
			pstmt.setString(4, explanation);
			pstmt.setInt(5, price);
			pstmt.setInt(6, inventory);
			pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt);
			JDBCUtil.close(con);
			JDBCUtil.close(rs);
		}
	}
	
	public void productUpdate(int productid, String producttype, String productname, String explanation, int price,
			int inventory) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "UPDATE product SET productType = ? productName = ? explanation = ? price = ? inventory = ? WHERE productId = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, producttype);
			pstmt.setString(2, productname);
			pstmt.setString(3, explanation);
			pstmt.setInt(4, price);
			pstmt.setInt(5, inventory);
			pstmt.setInt(6, productid);
			pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt);
			JDBCUtil.close(con);
			JDBCUtil.close(rs);
		}
	}
}
