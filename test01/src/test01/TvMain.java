package test01;

import java.util.Scanner;

public class TvMain {
	public static void main(String[] args) {
		Tv sTv = new Tv();
		Tv aTv = new Tv();
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Tv 전원 on/off\n"
					+ "2. Tv 채널 up\n"
					+ "3. Tv 채널 down\n"
					+ "4. Tv 볼륨 up\n"
					+ "5. Tv 볼륨 down\n"
					+ "번호를 입력하세요 : ");
			int control = sc.nextInt();
			switch(control) {
			case 1:
				sTv.powerOnOff();
				break;
				
			case 2:
				if(sTv.power) {
					System.out.println("현재 채널 : " + sTv.ch);
					sTv.chUp();
					System.out.println("채널을 1올렸습니다 : " + sTv.ch);
				} else {
					System.out.println("Tv가 껴져있습니다.");
				}
				break;
				
			case 3:
				if(sTv.power) {
					System.out.println("현재 채널 : " + sTv.ch);
					sTv.chDown();
					System.out.println("채널을 1내렸습니다 : " + sTv.ch);
				} else {
					System.out.println("Tv가 껴져있습니다.");
				}
				break;
				
			case 4:
				if(sTv.power) {
					System.out.println("현재 볼륨 : " + sTv.vol);
					sTv.volUp();
					System.out.println("볼륨을 1올렸습니다 : " + sTv.vol);
				} else {
					System.out.println("Tv가 껴져있습니다.");
				}
				break;
				
			case 5:
				if(sTv.power) {
					System.out.println("현재 볼륨 : " + sTv.vol);
					sTv.volDown();
					System.out.println("볼륨을 1내렸습니다 : " + sTv.vol);
				} else {
					System.out.println("Tv가 껴져있습니다.");
				}	
				break;
			
			case 0:
				sc.close();
				System.exit(0);
				break;
				
			default :
				System.out.println("프로그램을 종료합니다.");
			}
		}
	}
}
