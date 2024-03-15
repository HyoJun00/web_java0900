package forTest;

public class WhileTest {
	public static void main(String[] args) {
		// 1부터 10까지 숫자 출력하기(while문)
		
		// 정수형 타입의 변수 기본값으로 초기화
		// while문에 정수형 변수가 10보다 작을때까지 조건식 넣기
		// 실행할 문장에서 변수++
		// 출력
		
		int i = 0;
		int total = 0;
		while(i < 10) {
			i++;
			System.out.println(i);
			total += i;
		}
		System.out.println(total);
		
	}
}
