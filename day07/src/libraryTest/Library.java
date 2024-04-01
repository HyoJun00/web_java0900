package libraryTest;

public class Library {
	// 보유한책(최대20권)
	// 보유회원(최대 30명)
	// 현재 가입한 회원수
	// 현재 등록된 책 수

	// 회원가입하기
	// 책등록하기
	// 대여해주기
	// 대여책돌려받기
	// 등록된 회원 목록보기
	// 등록된 책 목록보기
	
	// 로직구성
	// Member 클래스 상속받기
	// 배열을 활용한 필드 생성
	// 메소드 생성
	
	// 필드
	Book[] BookList;
	Member[] MemberList;
	int MemberCount;
	int BookCount;
	
	// 생성자
	public Library() {
		this.BookList = new Book[20];
		this.MemberList = new Member[30];
		this.MemberCount = 0;
		this.BookCount = 0;
	}
	
	
	// 메소드
	
	// 회원가입 메소드
	boolean join(Member member) {
		if(this.MemberCount > 29) {
			return false;		
		}
		this.MemberList[this.MemberCount] = member;
		this.MemberCount++;
		return true;
	}
	
	// 책 등록 메소드
	boolean register(Book book) {
		if(this.BookCount > 19) {
			return false;		
		}
		this.BookList[this.BookCount] = book;
		this.BookCount++;
		return true;
	}

	
}
