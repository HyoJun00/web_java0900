package ReTest;

import java.util.Scanner;

public class TwoFor {
	public static void main(String[] args) {
		// 사용자로부터 행을 입력받아 입력된 행의 크기만큼 열을 만들고 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("행을 입력하세요 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; ++i) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
	}
}
