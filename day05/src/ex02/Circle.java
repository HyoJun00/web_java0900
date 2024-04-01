package ex02;

public class Circle extends Shape {
	// 필드
	double radius;

	// 메소드 오버라이딩
	@Override
	void draw() {
//		super.draw();
		double c = radius * radius * 3.14;
		System.out.println("넓이가"+ c + "인 원을 스케치합니다.");
	}
}
