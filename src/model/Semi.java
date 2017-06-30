package model;

import java.io.Serializable;

public class Semi implements Serializable {
	
	private int subjectid;
	private String subjectname = "";
	private String subjectcf = "";
	private String studentname = "";
	private int Studentid;
	
	public int getStudentid() {
		return Studentid;
	}


	public void setStudentid(int studentid) {
		Studentid = studentid;
	}


	//デフォルトコンストラクタ
	public Semi(){}

	
	//アクセッサ
	public int getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public String getSubjectcf() {
		return subjectcf;
	}

	public void setSubjectcf(String subjectcf) {
		this.subjectcf = subjectcf;
	}


	public String getStudentname() {
		return studentname;
	}


	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	
	
	

}
