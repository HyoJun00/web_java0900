package ReTest;

public class StudentMain {
	public static void main(String[] args) {
		// 객체 생성
		Student stu1 = new Student("양효준", "JAVA", 25, 4);
		
		// 학생 정보를 출력하는 메소드
		stu1.printStudent();
		
		System.out.println();
		
		// 평균 점수를 출력하는 메소드를 담은 변수
		double avg = stu1.avgScore(64, 87);
		System.out.println("평균 점수는 " + avg + "점");
		
		// 평균 점수를 통해 학점을 구하는 메소드
		System.out.println("학점은 " + stu1.gradeScore(avg));
		
	}
}
