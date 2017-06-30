package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

	public void insertData(Register Reg){
		
		int sni = Reg.getStudentid();
		int sui = Reg.getSubjectid();

		try {

			// DB接続
			connection();
			// INSERT文の設定・実行 //INパラメータ(プレースホルダー)の使用例。サニタイジングのために使おう!
			String sql = "INSERT INTO register(studentid,subjectid) VALUES(?,?);";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, sni);
			stmt.setInt(2, sui);
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
	
	public ArrayList<Register> getData(int studentid){
		//▼▼List (大きさが決まっていない配列のようなもの) 、メッセージ格納用変数　準備

		ArrayList<Register> list = new ArrayList<Register>();
		
		try{
			
		//DB接続
			connection();
			
		//SQL文設定の準備・SQL文の実行
			String sql = "SELECT register.studentid,register.subjectid,semi.subjectname "
					+ "FROM register RIGHT OUTER JOIN semi "
					+ "ON register.subjectid = semi.subjectid WHERE studentid = ?;";
			stmt = con.prepareStatement(sql); //sql文をプリコンパイルした状態で保持
			stmt.setInt(1, studentid);
			rs = stmt.executeQuery();//sql文を実行
			
			while(rs.next()){
				Register rg = new Register();
				rg.setSubjectname(rs.getString("subjectname"));
				list.add(rg);
			}
		}catch (Exception e){
		}
		return list;
		
	}

}

