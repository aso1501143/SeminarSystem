package model;

import java.io.Serializable;

public class Teacher implements Serializable{
	//変数
		private String teacherid;
		private String teachername = "";
		private int passwd;

		//デフォルトコンストラクタ
		public Teacher(){}

		//アクセッサ
		public String getTeacherid() {
			return teacherid;
		}

		public void setTeacherid(String teacherid) {
			this.teacherid = teacherid;
		}

		public String getTeachername() {
			return teachername;
		}

		public void setTeachername(String teachername) {
			this.teachername = teachername;
		}

		public int getPasswd() {
			return passwd;
		}

		public void setPasswd(int passwd) {
			this.passwd = passwd;
		}
}
