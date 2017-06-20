package model;

import java.io.Serializable;

public class Register implements Serializable {
	private int regid;
	private int studentid;
	private int subjectid;
	
	//デフォルトコンストラクタ
	public Register(){}

	
	//アクセッサ
	public int getRegid() {
		return regid;
	}

	public void setRegid(int regid) {
		this.regid = regid;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public int getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	
	

}
