package test0329;

public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student("짱구", "자바", 5);
		Student st2 = new Student("철수", "파이썬", 6, 3);
		
		int avg1 = (int) st1.avgScore(70, 80);
		int avg2 = (int) st2.avgScore(90, 40);
		
		System.out.println(st1.name + "의 평균점수 : " + avg1 + " 학점 : " + st1.gradeScore(avg1));
		System.out.println(st2.name + "의 평균점수 : " + avg2 + " 학점 : " + st2.gradeScore(avg2));
	}
}
