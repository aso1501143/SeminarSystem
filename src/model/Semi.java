package model;

import java.io.Serializable;

public class Semi implements Serializable {
	
	private int subjectid;
	private String subjectname = "";
	private String subjectcf = "";
	
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
	
	

}
