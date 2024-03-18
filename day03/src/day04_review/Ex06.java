package day04_review;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//사용자로부터 세 개의 숫자를 입력받아 세 수 중 중간값을 출력하기
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, median = 0;
		System.out.println("세 개의 숫자 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		if((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
			median = num1;
		} else if((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
			median = num2;
		} else {
			median = num3;
		}
		System.out.println("중간값 : " + median);
		sc.close();
		
	}
}
