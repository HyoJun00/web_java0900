package test01;

public class Tv {
	// 필드
	boolean power;
	int ch = 1;
	int vol;
	String color;
	
	// 메소드
	void powerOnOff() {
		power = !power;
		if(power) {
			System.out.println("Tv 전원이 켜졌습니다.");
		} else {
			System.out.println("Tv 전원이 꺼져있습니다.");
		}
	}

	void chUp() {
		++ch;
	}
	
	void chDown() {
		--ch;
	}
	
	void volUp() {
		++vol;
	}
	
	void volDown() {
		--vol;
	}
	
}
