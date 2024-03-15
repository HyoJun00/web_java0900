package task;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 사용자로부터 두개의 숫자와 연산기호를 입력받아 두 숫자의 사칙연산을 출력하는 프로그램
		// +, -, *, /
		
		// 로직구성
		// 입력 클래스 import
		// 정수형 타입 변수 2개 문자열 타입 변수 4개 선언
		// 변수에 사용자로부터 정수를 입력받을 입력 메소드 nextInt() 사용
		// 문자형 타입 변수에 사칙연산을 입력받을 입력 메소드 next() 사용
		// if ~ else if문을 사용하여 연산기호별로 계산
		//출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("사칙연산을 입력하세요 : ");
		String oper = sc.next();
		
		
	}
}
