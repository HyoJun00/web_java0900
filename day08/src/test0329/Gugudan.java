package test0329;

public class Gugudan {
	public static void main(String[] args) {
		int num = 1, dan = 2;
		while(num <= 9) {
			while(dan <= 9) {
				System.out.print(dan + "X" + num + "=" + dan*num + "\t");
				dan++;
			}
			dan = 2;
			num++;
			System.out.println();
		}
	}
}
