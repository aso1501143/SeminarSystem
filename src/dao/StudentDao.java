package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.Student;

public class StudentDao {
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

	//ログインユーザー(生徒)の確認
	public Student getUser(int studentid, String passwd) {

		Student st = new Student();

		try {
			//
			connection();

			// SQL
			String sql = "SELECT * FROM student WHERE studentid=? AND passwd=?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, studentid);
			stmt.setString(2, passwd);
			rs = stmt.executeQuery();
			//
			rs.next();

			st.setStudentid(rs.getInt("studentid"));
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

	//受講科目申込
	public void insertData(){

	}


	}


