package userTest;

import java.util.Scanner;

public class UserMain {
	
	private final Scanner sc = new Scanner(System.in);
	private UserService us = new UserService();
	private String loginId = null;
	
	public UserMain() {
		play();
	}
	
	// 메소드
	private void play() {
		
		System.out.println("커뮤니티에 오신 걸 환영합니다.");
		
		while(true) {
			System.out.println("1. 회원가입\n2. 로그인\n3. 종료");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : // 회원가입
				join();
				break;
			case 2 : // 로그인
				login();
				break;
			case 3 : // 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 프로그램 종료 코드
				break;
			default :
				System.out.println("번호를 확인하세요.");
			}
		}	
	}
	private void join() {
		
		String id = null;
		String pw = null;
		String name = null;
		String email = null;
		
		while(true) { // 중복되는 id가 없을 때까지 계속 입력
			System.out.println("q 입력 시 뒤로가기");
			System.out.print("id : ");
			id = sc.next();
			
			if(id.equals("q")) {
				return; // 함수 종료
			}
			
			if(!us.checkId(id)) {
				break;
			} else {
				System.out.println("이미 존재하는 아이디입니다.");
			}
		}// join() while문 닫는 중괄호
		
		System.out.print("pw : ");
		pw = sc.next();
		System.out.print("name : ");
		name = sc.next();
		System.out.print("email : ");
		email = sc.next();
		
		us.join(new UserVO(id, pw, name, email));
		
		System.out.println("회원 가입 완료");
	}
	
	private void login() {
		String id = null;
		String pw = null;
		
		if(loginId != null) {
			System.out.println("로그인 중");
			System.out.println("현재 로그인 계정 : " + loginId);
			return;
		}
		
		while(true) {
			System.out.println("q 입력 시 뒤로가기");
			System.out.println("id : ");
			id = sc.next();
			
			if(id.equals("q")) {
				System.out.println("이전 화면으로");
				return;
			}
			
			System.out.println("pw : ");
			pw = sc.next();
			
			if(id.equals("q")) {
				System.out.println("이전 화면으로");
				return;
			}
			
			loginId = us.login(id, pw);
			
			if(loginId == null) {
				System.out.println("아이디 비밀번호를 확인하세요");
				continue;
			}
			System.out.println(us.userInfo(loginId).getName() + "님 환영합니다");
			moveMyPage();
		} // while문
	}
	private void moveMyPage() {
		
	}
}
