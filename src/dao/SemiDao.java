package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.Semi;

public class SemiDao {
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

	public void insertData(Semi semi){
		int subjectid = semi.getSubjectid();
		String subjectname = semi.getSubjectname();
		String subjectcf = semi.getSubjectcf();

		try {

			// DB接続
			connection();
			// INSERT文の設定・実行 //INパラメータ(プレースホルダー)の使用例。サニタイジングのために使おう!
			String sql = "INSERT INTO semi VALUES(?,?,?);";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, subjectid);
			stmt.setString(2, subjectname);
			stmt.setString(3, subjectcf);
			stmt.executeUpdate();
		} catch (Exception e) {
		} finally {
			try {
				close();
			} catch (Exception e) {
			}

		}
	}
}
