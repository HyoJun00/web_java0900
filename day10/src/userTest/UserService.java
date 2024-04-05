package userTest;

import java.util.HashMap;
import java.util.Map;

public class UserService {
	
	// 메소드
	public static Map<String, UserVO> userList = new HashMap<>();
	
	// 회원가입
	public void join(UserVO userVO) {
		userList.put(userVO.getUserId(), userVO);
	}
	
	// id 중복검사
	public boolean checkId(String id) {
		// true가 리턴 -> 아이디가 중복된다. 회원가입 불가
		// fasle가 리턴 -> 아이디가 중복 안됨. 회원가입 가능
		return userList.containsKey(id);
	}	
	
	// 로그인
	// 매개변수 -> id, pw
	// 로그인 성공 시 id 리턴
	// 로그인 실패 시 null 리턴
	public String login(String id, String pw) {
		if(checkId(id)) {
			if(userList.get(id).getUserPw().equals(pw)) {
				return id;
			}
		}
		return null;
	}
	
	// 유저 정보 가져오기
	// 로그인이 되어있는 이 후에만 사용할 친구
	public UserVO userInfo(String id) {
		return userList.get(id);
	}
	
}
