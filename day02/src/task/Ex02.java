package task;

public class Ex02 {
	public static void main(String[] args) {
		// 구구단을 2단부터 9단꺼지 출력하는 프로그램(while문 사용, 단 마다 tab키 적용)
		
		// 로직구성
		// 정수형 타입 변수 2개 선언
		// while문 사용하여 단에 곱셈할 반복문 실행
		// 위 while문 안에서 단에 넣어줄 반복문 실행
		// 안쪽 while문에서 출력
		// 바깥쪽 while문에서 줄바꿈
		
		int dan = 2, num = 1;
		while(num < 10) {
			
			while(dan < 10) {
				System.out.print(dan + "X" + num + "=" + dan * num + "\t");
				dan++;
			}
			
			System.out.println();
			dan = 2;
			num++;
		}
	}
}
