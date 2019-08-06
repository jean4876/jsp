package kr.or.ddit.user.model;

public class UserVO {
	
	private String userId;
	private String pass;
	private String userNM;	// 사용자 이름
	
	
	public UserVO() {}
	
	
	public UserVO(String userName) {
		this.userNM = userName;
	}



	public String getUserNM() {
		return userNM;
	}


	public void setUserNM(String userNM) {
		this.userNM = userNM;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", pass=" + pass + ", userNM=" + userNM + "]";
	}



	
}
