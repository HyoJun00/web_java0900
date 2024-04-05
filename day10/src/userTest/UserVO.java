package userTest;

public class UserVO {
	// 필드
	private String userId;
	private String userPw;
	private String name;
	private String email;
	
	// 생성자
	public UserVO() {}
	
	public UserVO(String userId, String userPw, String name, String email) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.name = name;
		this.email = email;
	}

	
	// 메소드
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
