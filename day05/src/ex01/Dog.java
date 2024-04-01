package ex01;

public class Dog extends Animal {

	// 메소드 오버라이딩
	@Override
	void cry() {
//		super.cry();
		System.out.println("으르르 멍멍멍");
	}
}
