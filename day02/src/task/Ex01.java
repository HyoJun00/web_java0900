package task;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 사용자로부터 정수 n을 입력받아 1부터 n까지 합을 구하는 프로그램
		// [출력결과]
		// 정수 입력 : 4
		// 입력한 숫자는 4입니다.
		// 1부터 4까지의 합은 10입니다.
		
		// 로직구성
		// 입력 클래스 import
		// 정수형 타입 조건식에 사용할 변수 1개 사용자에게 입력받을 변수 1개 입력받은 변수의 합을 담을 변수 1개 선언
		// 입력받을 변수에 입력 메소드 사용(nextInt())
		// while문을 사용하여 입력받은 정수만큼 반복문 실행
		// 입력한 숫자와 합 출력
		
		Scanner sc = new Scanner(System.in);
		int i = 0, number = 0, total = 0;
		System.out.print("정수를 입력하세요 : ");
		number = sc.nextInt();
		System.out.println("입력한 숫자는 " + number + "입니다.");
		while(i < number) {
			i++;
			total += i;
		}
		System.out.println("[출력결과]");
		System.out.println("1부터 " + number + "까지의 합은" + total + "입니다.");
	}
}
