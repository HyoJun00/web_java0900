package finalTest;

public class SportCar extends Car {

	// 메소드 오버라이딩
	@Override
	void speedUp() {
//		super.speedUp();
		speed += 30;
		System.out.println("스포츠카의 현재 시속 : " + speed);
	}
	
}
