package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.Register;
import model.Student;

public class RegisterDao {
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

	public void insertData(Register reg){
		int studentid = reg.getStudentid();
		int subjectid = reg.getSubjectid();
		try {

			// DB接続
			connection();
			// INSERT文の設定・実行 //INパラメータ(プレースホルダー)の使用例。サニタイジングのために使おう!
			String sql = "INSERT INTO semi(studentid,subjectid) VALUES(?,?);";
			stmt.setInt(1, studentid);
			stmt.setInt(2, subjectid);
			stmt = con.prepareStatement(sql);
			stmt.executeUpdate();
		} catch (Exception e) {
		} finally {
			try {
				close();
			} catch (Exception e) {
			}

		}
	}

	public Student getUser(int studentid, String studentname) {

		Student st = new Student();

		try {
			//
			connection();

			// SQL
			String sql = "SELECT * FROM  WHERE studentid=? AND studentname=?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, studentid);
			stmt.setString(2, studentname);
			rs = stmt.executeQuery();
			//
			rs.next();

			st.setStudentid(rs.getInt("studentid"));
			st.setPasswd(rs.getString("sutdentname"));

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

