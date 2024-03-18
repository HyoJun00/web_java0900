package day04_review;

import java.util.Scanner;

public class Ex07_Array {
	public static void main(String[] args) {
		//사용자로부터 1에서 7까지의 숫자를 입력받아 해당하는 요일을 출력하기 
		//(1이면 "월요일", 2이면 "화요일", ..., 7이면 "일요일")
		// 배열로 바꾸는 법
		Scanner sc = new Scanner(System.in);
	      String[] days = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
//	      System.out.println(days[0]);

	      while (true) {
	         System.out.println("1부터 7사이의 숫자 입력 : ");
	         int dayNum = sc.nextInt();
	         if (dayNum >= 1 && dayNum <= 7) {
	            String day = days[dayNum - 1];
	            System.out.println(dayNum + "일의 요일은 " + day + "입니다");
	         } else if (dayNum == 0){
	            break;
	         } else {
	            System.out.println("잘못된 입력입니다");
	         }
	      }

	}
}
