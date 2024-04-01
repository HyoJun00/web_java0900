package classTest;

public class Ex01 {
	public static void main(String[] args) {
		// 1. 출력결과처럼 나올 수 있도록 작성하기
		// [출력결과]
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12

		int b = 0;
		
		System.out.println("[출력결과]");

		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print(++b + " ");
			}
			System.out.println();
		}
	}
}
