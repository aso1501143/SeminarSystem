package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.Teacher;

public class TeacherDao {
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

	public Teacher getUser(int teacherid, String passwd) {

		Teacher st = new Teacher();

		try {
			//
			connection();

			// SQL
			String sql = "SELECT * FROM teacher WHERE teacherid=? AND passwd=?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, teacherid);
			stmt.setString(2, passwd);
			rs = stmt.executeQuery();

			//
			//
			//
			rs.next();

			//
			st.setTeacherid(rs.getInt("teacherid"));
			st.setPasswd(rs.getString("passwd"));

		} catch (Exception e) {
			st = null;
		} finally {
			try {
				close();
			} catch (Exception e) {

			}
		}
		return st;
	}
}