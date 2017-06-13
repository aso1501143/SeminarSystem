package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.User;

public class UserDao {
	// データベースソース
		DataSource ds = null; // データベース接続情報
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		public Connection connection() throws Exception {
			// 
			if (ds == null) {
				ds = (DataSource) (new InitialContext()).lookup("java:comp/env/jdbc/MySQL");
			}
			con = ds.getConnection();

			return con;
		}

		public void close() throws Exception {
			// 
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
	public User getUser(String userId, String password) {

		User user = new User();

		try {
			//
			connection();

			// SQL
			String sql = "SELECT * FROM user WHERE studentid=? AND passwd=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, userId);
			stmt.setString(2, password);
			rs = stmt.executeQuery();

			//
			//
			//
			rs.next();

			//
			user.setUserId(rs.getString("studentid"));
			user.setPassword(rs.getString("passwd"));

		} catch (Exception e) {
			user.setUserId(null);
			user = null;
		} finally {
			try {
				close();
			} catch (Exception e) {

			}
		}
		return user;
	}
}
