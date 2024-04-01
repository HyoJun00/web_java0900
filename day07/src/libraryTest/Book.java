package libraryTest;

public class Book {
	// 필드 		: 도서번호, 책이름, 대여상태
	// 생성자 	: 매개변수1개(책이름)
	// 책번호는 도서관에 등록하면 부여됨
	// 메소드 	: showBookInfo() 책정보 보기 메소드
	// 책번호.책이름 형태로 출력
	// 대여상태가 true라면 대여가능 출력, 아니면 대여 불가능 출력
	
	// 로직구성
	// 책 정보 필드 생성
	// 매개변수 1개인 생성자 생성
	// 책 정보를 보여주는 메소드 생성
	// 조건문을 사용하여 책이 대여중이라면 대여 불가능 출력
	// 책이 대여중이 아니라면 대여 가능 출력
	
	// 필드
	int BookNumber;
	String BookTitle;
	boolean BookStatus;
	
	// 생성자
	public Book(String bookTitle) {
		super();
		this.BookNumber = 0;
		this.BookStatus = true;
		BookTitle = bookTitle;
	}
	
	// 메소드
	public void showBookInfo() {
		System.out.println(this.BookNumber + "." + this.BookTitle);
		
		if(BookStatus) {
			System.out.println(this.BookTitle + "은/는 대여 가능한 책 입니다.");
		} else {
			System.out.println(this.BookTitle + "은/는 대여 불가능한 책 입니다.");
		}
	}
}
