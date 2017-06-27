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

	//ログインユーザー（教師）の確認
	public Teacher getUser(String teacherid, int passwd) {

		Teacher st = new Teacher();

		try {
			//
			connection();

			// SQL
			String sql = "SELECT * FROM teacher WHERE teacherid=? AND passwd=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, teacherid);
			stmt.setInt(2, passwd);
			rs = stmt.executeQuery();

			//
			rs.next();
			//

			st.setTeacherid(rs.getString("teacherid"));
			st.setPasswd(rs.getInt("passwd"));

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
