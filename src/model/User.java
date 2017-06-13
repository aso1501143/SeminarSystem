package model;

import java.io.Serializable;

public class User implements Serializable{
	//変数
	private String id;
	private String pass;

	//デフォルトコンストラクタ
	public User(){}
	
	//アクセッサ
	public User(String id,String pass){
		this.id = id;
		this.pass = pass;
	}
	
	public String getId(){return id;}
	
	public String getPass(){return pass;}
	
	public void setUserId(String id) {
		this.id = id;
	}
	
	public void setPassword(String pass) {
		this.pass = pass;
	}
}
