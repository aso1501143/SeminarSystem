package model;

import java.io.Serializable;

public class Student implements Serializable {
	//変数
	private int studentid;
	private String studentname = "";
	private int passwd;
	private String classname = "";
	
	//デフォルトコンストラクタ
	public Student(){}
	
	//アクセッサ
	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getPasswd() {
		return passwd;
	}

	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	

}
