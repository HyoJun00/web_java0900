package libraryTest2;

public class Member {
   // 회원, 빌려간책 확인 클래스 -> Library 활용예정

   // 필드
//   회원 번호, 회원 이름, 회원 전화번호, 회원주소, 빌린책목록(Book 클래스 활용)
   int memberNumber;
   String memberName;
   String memberPhoneNumber;
   String memberAddress;
   Book[] memberBookList; // 빌린책목록(최대3권까지 가능)

   // 생성자
   public Member(String memberName, String memberPhoneNumber, String memberAddress) {
      super();
      this.memberName = memberName;
      this.memberPhoneNumber = memberPhoneNumber;
      this.memberAddress = memberAddress;
      // 회원번호는 회원객체를 생성할 때가 아닌 도서관에 회원 가입할 때 생성해야한다
      this.memberNumber = 0;
      this.memberBookList = new Book[3];
//      System.out.println("Member 클래스 초기값 할당");
   }

   // 빌린 책 목록 보여주기
   void showBookList() {
      Book book = null;

      System.out.println("----대여한 책 목록----");

      for (int i = 0; i < memberBookList.length; i++) {
         book = memberBookList[i];
         if (book == null) {
            continue;
         }

         System.out.println(book.bookName);
      }
      System.out.println("-------------------\n");
   }

   // 회원정보 보여주기
   void showMemberInfo() {
      System.out.println(memberNumber + 1 + ". " + memberName);
      System.out.println("주소 : " + memberAddress);
      System.out.println("핸드폰 번호 : " + memberPhoneNumber);
   }

}

