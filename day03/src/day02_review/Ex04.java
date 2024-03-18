package day02_review;

public class Ex04 {
	public static void main(String[] args) {
		// str1 = "abcdjavapythonclength"
		// str1 문자열에서 각 문자가 몇번 나타나는지 개수를 세어 출력하는 프로그램
		// [출력결과]
		// a : 
		// b : 
		// ...
		// z :
		
		String str1 = "abcdjavapythonclength";
	      int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0,
	            countG = 0, countH = 0, countL = 0, countN = 0, countT = 0, countP =0, countJ= 0,
	            countO =0, countY = 0;
	      
	      for(int i = 0; i < str1.length(); i++) {
//	         System.out.println(i);
	         char ch = str1.charAt(i);
//	         System.out.println(ch);
	         if(ch >= 'a' && ch <= 'z') {
	            switch(ch) {
	            case 'a':
	               countA++;
	               break;
	            }
	         }
	      }
	      System.out.println("a : " + countA);
	}
}
