package test0329;

public class Student {
	// 필드
	String name;
	String major;
	int age;
	int grade;
	char score;
	
	// 생성자
	public Student(String name, String major, int age) {
		super();
		this.name = name;
		this.major = major;
		this.age = age;
	}

	public Student(String name, String major, int age, int grade) {
		super();
		this.name = name;
		this.major = major;
		this.age = age;
		this.grade = grade;
	}
	
	// 메소드
	void printStudent() {
		System.out.println("이름 : " + this.name);
		System.out.println("학년 : " + this.grade);
		System.out.println("전공 학과 : " + this.major);
	}
	
	double avgScore(double subjectA, double subjectB) {
		double avg = (subjectA + subjectB) / 2;
		return avg;
	}
	
	char gradeScore(double avgScore) {
		if(avgScore >= 90) {
			this.score = 'A';
		} else if(avgScore >= 70) {
			this.score = 'B';
		} else if(avgScore >= 60) {
			this.score = 'C';
		} else {
			this.score = 'F';
		}
		return this.score;
	}
	
}
