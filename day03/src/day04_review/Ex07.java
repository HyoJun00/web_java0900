package day04_review;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		//사용자로부터 1에서 7까지의 숫자를 입력받아 해당하는 요일을 출력하기 
		//(1이면 "월요일", 2이면 "화요일", ..., 7이면 "일요일")
		Scanner sc = new Scanner(System.in);
	      int day = 0;
	      System.out.println("일을 입력하세요 : ");
	      day = sc.nextInt();
	      switch(day) {
	      case 1:
	         System.out.println(day + "는 월요일입니다");
	         break;
	      case 2:
	         System.out.println(day + "는 화요일입니다");
	         break;
	      case 3:
	         System.out.println(day + "는 수요일입니다");
	         break;
	      case 4:
	         System.out.println(day + "는 목요일입니다");
	         break;
	      case 5:
	         System.out.println(day + "는 금요일입니다");
	         break;
	      case 6:
	         System.out.println(day + "는 토요일입니다");
	         break;
	      case 7:
	         System.out.println(day + "는 일요일입니다");
	         break;
	      default:
	         System.out.println(day + "는 없는 요일입니다");
	         break;
	      }


	}
}
