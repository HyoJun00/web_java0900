package forTest;

public class ForTest01 {
   public static void main(String[] args) {

      //0~9의 총합 구하기
      //총합구할 변수
      //변수+=i
//      int total = 0;
//      for(int i = 0; i < 10; i++) {
//         System.out.println(i);
//         total += i;
//         System.out.println(total);
//      }
//      System.out.println(total);
      
      //for문의 초기식 : 기본데이터 타입(int
//      for(double i = 0; i < 10.5; i++) {
//         System.out.println(i);
//         break;
//      }
      
      for(char c = 'a'; c < 'f'; c++) {
         System.out.println(c);
      }
      
      String s = "hello world";
      System.out.println(s.length());
      for(int i = 0;  i < s.length(); i++) {
         char c = s.charAt(i);
         System.out.println("인덱스 : " + i + "의 문자 : " + c);
      }
      
   }
}
