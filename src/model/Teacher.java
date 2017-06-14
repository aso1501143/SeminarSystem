package model;

import java.io.Serializable;

public class Teacher implements Serializable{
	//変数
		private int teacherid;
		private String teachername = "";
		private String passwd;

		//デフォルトコンストラクタ
		public Teacher(){}

		//アクセッサ
		public int getTeacherid() {
			return teacherid;
		}

		public void setTeacherid(int teacherid) {
			this.teacherid = teacherid;
		}

		public String getTeachername() {
			return teachername;
		}

		public void setTeachername(String teachername) {
			this.teachername = teachername;
		}

		public String getPasswd() {
			return passwd;
		}

		public void setPasswd(String string) {
			this.passwd = string;
		}
}
