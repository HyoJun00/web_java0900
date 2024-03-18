package day04_review;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 사용자로부터 사칙연산(+, -, *, /) 중 하나를 입력받아 두 개의 정수에 대해 해당 연산을 수행하여 결과를 출력하기
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		char operator = ' ';
		System.out.println("연산자 입력(+, -, *, /) : ");
		operator = sc.next().charAt(0);
		System.out.println("정수 2개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 + num2;
			break;
		case '*':
			result = num1 + num2;
			break;
		case '/':
			result = num1 + num2;
			break;
		default:
			System.out.println("잘못된 연산자");
			break;
		}
		System.out.println("출력결과 : " + result);
		sc.close();
	}
}
