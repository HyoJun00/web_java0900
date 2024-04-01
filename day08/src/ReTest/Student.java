package ReTest;

public class Student {
	// 학생 클래스
	
		// 필드
		// 이름 / 전공 / 나이 / 학년 / 학점
		String name;
		String major;
		int age;
		int grade;
		char score;
		
		// 생성자
		
		// 기본생성자
		public Student() {
			
		}
		
		// 이름, 전공, 나이 입력받는 생성자
		public Student(String name, String major, int age) {
			this.name = name;
			this.major = major;
			this.age = age;
		}

		// 이름, 전공, 나이, 학년을 입력받는 생성자
		public Student(String name, String major, int age, int grade) {
			this(name, major, age);
			this.grade = grade;
		}
		
		// 메소드
		
		// 학생의 이름과 학년, 전공을 출력하는 메소드 printStudent
		void printStudent() {
			System.out.println("이름 : " + this.name + "\n학년 : " + this.grade + "\n전공 : " + this.major);
		}
		
		// 학생의 전공 과목의 성적을 2개 입력받아 전공 과목의 평균을 반환하는 메소드 avgScore
		double avgScore(double subject1, double subject2) {
			return (subject1 + subject2) / 2;
		}
		
		// 학생의 평균이 90점 이상이면 A, 70점 이상이면 B, 60점 이상이면 C, 그 외는 F학점으로 반환하는 메소드 gradeScore
		char gradeScore(double avgScore) {
			if(avgScore >= 90) {
//				System.out.println("학점은 A");
				this.score = 'A';
			} else if(avgScore >= 70) {
//				System.out.println("학점은 B");
				this.score = 'B';
			} else if(avgScore >= 60) {
//				System.out.println("학점은 C");
				this.score = 'C';
			} else {
//				System.out.println("학점은 F");
				this.score = 'F';
			}
			return this.score;
		}
}
