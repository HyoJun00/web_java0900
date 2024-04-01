package libraryTest;

public class Member {
	// 필드 : 회원 번호, 회원 이름, 회원 전화번호, 회원주소, 빌린책목록(최대 3권만가능)
	// 생성자 : 매개변수3개(회원이름, 회원전화번호, 회원주소)
	// 회원번호는 회원객체를 생성할 때가 아닌 도서관에 회원가입할 때 만들어야한다
	// 메소드 : showBookList() 빌린 책 목록 보여주기 메소드
	// 빌린 책 목록 출력
	// showMemberInfo() 회원정보보여주기 메소드
	// 회원번호.회원이름 출력
	// 주소 : 주소 출력
	// 핸드폰번호 : 회원전화번호 출력
	
	// 로직구성
	// 회원 정보 필드 생성
	// 매개변수 3개 받는 생성자 생성
	// 빌린 책 목록을 출력하는 메소드 생성
	// 회원 정보를 출력하는 메소드 생성
	
	// 필드
	int MemberNumber;
	String MemberName;
	String MemberPH;
	String MemberAdd;
	String[] BorrowList;
	
	// 생성자
	public Member(String memberName, String memberPH, String memberAdd) {
		super();
		MemberName = memberName;
		MemberPH = memberPH;
		MemberAdd = memberAdd;
	}
	
	// 메소드
	public void showBookList() {
		System.out.println("회원 이름 : " + this.MemberName);
		System.out.println("대여한 책 목록 : " + this.BorrowList);
	}
	
	public void showMemberInfo() {
		System.out.println(this.MemberNumber + "." + this.MemberName);
		System.out.println(this.MemberAdd);
		System.out.println(this.MemberPH);
	}
}
