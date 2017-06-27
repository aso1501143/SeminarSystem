package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
		String subjectname = semi.getSubjectname();
		String subjectcf = semi.getSubjectcf();

		try {

			// DB接続
			connection();
			// INSERT文の設定・実行 //INパラメータ(プレースホルダー)の使用例。サニタイジングのために使おう!
			String sql = "INSERT INTO semi(subjectname,subjectcf) VALUES(?,?);";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, subjectname);
			stmt.setString(2, subjectcf);
			stmt.executeUpdate();
		} catch (Exception e) {
		} finally {
			try {
				close();
			} catch (Exception e) {
			}
		}
	   }
	   
	   
		public ArrayList<Semi> getData(String subjectcf){
			//▼▼List (大きさが決まっていない配列のようなもの) 、メッセージ格納用変数　準備
			ArrayList<Semi> list = new ArrayList<Semi>();
			
			try{
				
			//DB接続
				connection();
				
			//SQL文設定の準備・SQL文の実行
				String sql = "SELECT * FROM semi WHERE subjectid = ?";
				stmt = con.prepareStatement(sql); //sql文をプリコンパイルした状態で保持
				stmt.setString(1, subjectcf);
			
				rs = stmt.executeQuery();//sql文を実行
				
				while(rs.next()){
					Semi sm = new Semi();
					sm.setSubjectid(rs.getInt("subjectid"));
					sm.setSubjectname(rs.getString("subjectname"));
					sm.setSubjectcf(rs.getString("subjectcf"));
					list.add(sm);
				}
			}catch (Exception e){
			}
			return list;
			
		}


}
