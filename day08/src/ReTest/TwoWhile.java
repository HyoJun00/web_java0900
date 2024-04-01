package ReTest;

public class TwoWhile {
	public static void main(String[] args) {
		// 단 마다 가로로 출력
//		for (int num = 1; num <= 9; num++) {
//	         for (int dan = 2; dan <= 9; dan++) {
//	            System.out.print(dan + "x" + num + "=" + dan * num + "\t");
//	         }
//	         System.out.println();
//
//		}
		int num = 1, dan = 2;
		while(num <= 9) {
			while(dan <= 9) {
				System.out.print(dan + "x" + num + "=" + dan * num + "\t");
				dan++;
			}
			dan = 2;
			num++;
			System.out.println();
		}
		
		
		
		
	}
}
