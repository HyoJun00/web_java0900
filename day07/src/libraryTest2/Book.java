package libraryTest2;

public class Book {
   // 책 정보보기 클래스 -> Library 클래스 활용예정

   // 필드
   int bookNumber; // 책번호
   String bookName; // 책이름
   boolean bookStatus; // 대여상태

   // 생성자
   public Book(String bookName) {
      super();
      this.bookNumber = 0; // 초기값 0
      this.bookName = bookName;
      this.bookStatus = true; // 초기값 true
//      System.out.println("Book 클래스 생성자 - 초기값 할당");
   }

   // 메소드 : 책정보보기 메소드
   void showBookInfo() {
      // 리턴타입x 매개변수x
      // 책번호.책이름 출력 => 필드
      // 조건문(if~else문, if문 return;)
      System.out.println(this.bookNumber+1 + "." + this.bookName);
      if (bookStatus) {
         System.out.println("대여가능");
      } else {
         System.out.println("대여 불가능");
      }
   }

}
