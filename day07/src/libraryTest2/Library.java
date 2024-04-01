package libraryTest2;

public class Library {
//   클래스명 Library
//   필드    보유한책(최대20권)   - 배열 Book[]
//      보유회원(최대 30명) - 배열   Member[]
//      현재 가입한 회원수
//      현재 등록된 책 수

   // 필드
   Book[] libraryBookList;
   Member[] libraryMemberList;
   int libraryBookCnt;
   int libraryMemberCnt;

   // 생성자
   public Library() {
      super();
      this.libraryBookList = new Book[20];
      this.libraryMemberList = new Member[30];
      this.libraryBookCnt = 0;
      this.libraryMemberCnt = 0;
//      System.out.println("초기값할당");
   }

//   메소드
   // 회원가입하기 Member클래스
   boolean join(Member member) {
      System.out.println(this + "추가"); // 메인에서 확인용
      // 하나의 도서관은 회원을 30명까지만 받을 수 있다
      // 29보다 크다면 false
      if (this.libraryMemberCnt > 29) {
         return false;
      }
      // memberList[0] = member;
      this.libraryMemberList[this.libraryMemberCnt] = member;
      member.memberNumber = this.libraryMemberCnt;
      this.libraryMemberCnt++;
      return true;
   }

   // 책등록하기 Book클래스
   boolean bookRegister(Book book) {
      if (this.libraryBookCnt > 19) {
         return false;
      }
      // 책번호를 부여한다 //책번호는 0부터 시작한다
      book.bookNumber = this.libraryBookCnt;
      this.libraryBookList[this.libraryBookCnt] = book;
      this.libraryBookCnt++;
      return true;
   }

   // 대여해주기
   boolean bookRental(int bookNumber, Member member) {
	   // 유효한 책 번호인지 확인
	   // 책이 대여 가능한 상태인지 확인
	   // 회원이 빌린 책 목록이 3권인지 확인
      Book book = this.libraryBookList[bookNumber];

      if (book.bookStatus) {
         // 대여가 가능한 상태라면 회원의 북 리스트에 저장해줘야함
         // 회원의 북리스트가 가득찼다면(4권이상 빌렸다면) 대여가 불가능함
         for (int i = 0; i < 3; i++) {
            if (member.memberBookList[i] == null) {
               // 상태를 바꾸고 대여를 한다
               book.bookStatus = false;
               member.memberBookList[i] = book;
               return true;
            }
         }
      }
      return false;
   }

   // 대여책돌려받기
   void bookReturn(int bookNumber, Member member) {
      Book book = this.libraryBookList[bookNumber];

      // 돌려 받은 책의 상태를 다시 true로 변환
      if (book != null) {
         book.bookStatus = true;

         // Member객체의 대여한 책목록에서 반납한 책은 삭제해야한다.
         for (int i = 0; i < member.memberBookList.length; i++) {
            if (member.memberBookList[i] != null && member.memberBookList[i].bookNumber == bookNumber) {
               member.memberBookList[i] = null;
               return;
            }
         }
      }
   }

   // 등록된 회원 목록보기 Member클래스
   void showMemberList() {
      Member member = null;

      for (int i = 0; i < libraryMemberList.length; i++) {
         member = libraryMemberList[i];
         if (member == null) {
            break;
         }

         member.showMemberInfo();
         member.showBookList();
      }

   }

   // 등록된 책 목록보기 Book클래스
   void showLibraryBookList() {
      Book book = null;

      for (int i = 0; i < libraryBookList.length; i++) {
         book = libraryBookList[i];

         if (book == null) {
            break;
         }

         book.showBookInfo();
      }
   }

}
