package classTest;

public class Person {
	// 필드 : 속성
	String name;
	int age;
	char gender;
	String ph;
	
	// 메소드
	// 공부하기 메소드(장소, 시간) 매개변수 O 리턴값 X
	void study(String location, int time) {
		System.out.println(this.name + "이/가 " + location + "에서 " + time + "시에 공부를 합니다.");
	}
	
	// 밥먹기 메소드(음식종류, 시간) 매개변수 O 리턴값 O
	String eat(String food, int time) {
		return food + "를/을" + time + "시에 먹습니다.";
	}
	
	// 잠자기 메소드(시간) 매개변수 O 리턴값 X
	void sleep(int hour) {
		System.out.println(this.name + "이/가" + hour + "시에 잡니다.");
	}
	
	// 걷기 메소드(장소) 매개변수 O 리턴값 O
	String walk(String place) {
	      System.out.println(this.name + "이/가 " + place + "를/을 걷습니다");
	      return place;
	   }

	//생성자
	
}
