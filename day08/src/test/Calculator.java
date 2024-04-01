package test;

import java.util.Scanner;

public class Calculator {
//	1. 계산기 프로그램
//	   사용자로부터 입력받은 두 숫자와 연산자를 입력받아 연산을 수행하는 계산기 프로그램
//	   사용자가 0으로 나누는 경우 예외처리
//
//	클래스명    : Calculator
//	필드명    : double num1, num2
//	     char oper
//	생성자    : 기본생성자() - 초기값할당
//	   public Calculator(){
//	      this.num1 = 0;
//	      this.num2 = 0;
//	      this.oper = ' ';
//	   }
//
//	메소드 
//	   input   : 매개변수 o, 리턴값 x
//	      사용자로부터 입력받는 메소드(Scanner) 
//	      -> this.num1 = sc.nextDouble();
//	   calculate : 매개변수 x, 리턴값 o
//	      연산수행 메소드
//	   main   : 객체 1개 생성, 메소드 호출 2개
	
	// 필드
	double num1, num2;
	char oper;
	
	// 생성자
	public Calculator() {
		super();
		this.num1 = 0;
	    this.num2 = 0;
	    this.oper = ' ';
	}
	
	// 메소드
	Scanner sc = new Scanner(System.in);
	public void input(Scanner sc) {
		this.num1 = sc.nextDouble();
		this.num2 = sc.nextDouble();

	}
	
//	public int calculate() {
//		
//	}
	
	
	
	
}
