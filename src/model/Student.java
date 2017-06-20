package model;

import java.io.Serializable;

public class Student implements Serializable {
	//変数
	private int studentid;
	private String studentname = "";
	private String passwd;
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

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String string) {
		this.passwd = string;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	

}
