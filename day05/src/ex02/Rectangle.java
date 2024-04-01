package ex02;

public class Rectangle extends Shape {
	// 필드
	int width;
	int height;
	
	// 메소드 오버라이딩
	@Override
	void draw() {
//		super.draw();
		int r = width * height;
		System.out.println("넓이가" + r + "인 사각형을 스케치합니다.");
	}
	
	
}
