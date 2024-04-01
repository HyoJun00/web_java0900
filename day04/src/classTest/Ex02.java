package classTest;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 2. 사용자로부터 행을 입력받아 입력된 행의 크기만큼 열을 만들고 출력하기
		// [출력결과]
		//	행 입력 : 3
		//	A B C
		//	D E
		//	F
		Scanner sc = new Scanner(System.in);
		System.out.println("[출력결과]");
		System.out.print("행 입력 : ");
		int num = sc.nextInt();
		char l = 64;
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - i; j++) {
				System.out.print(++l + " ");
			}
			System.out.println();
		}

		
		
	}
}
