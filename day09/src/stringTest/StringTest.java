package stringTest;

public class StringTest {
   public static void main(String[] args) {

      // String 클래스
      String msg = "안녕하세요";
      System.out.println(msg);
      System.out.println(msg.toString());

      // charAt()
      System.out.println(msg.charAt(0));
//      try {
//      }catch(StringIndexOutOfBoundsException e) {
//         System.out.println(e.getMessage());
//      }
//      System.out.println("출력끝");

      // indexOf()
      System.out.println(msg.indexOf("안"));
      System.out.println(msg.indexOf("h"));

      // split()
      String msg2 = "안!녕!하!세!요!";
      String[] ar = msg2.split("!");
//      System.out.println(msg2.split("!"));
      System.out.println(ar);
      for (String str : ar) {
         System.out.println(str);
      }

      // substring(start, end)
      String msg3 = msg2.substring(0, 3);
      System.out.println(msg3);

      // strip()
      String msg4 = "           java는 재밌고 쉽다!!         ";
      System.out.println(msg4);
      System.out.println(msg4.strip());

   }
}
