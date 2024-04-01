package test1;

public class School {
//	학생배열   students
//	학생수   studentCount
//
//  기본생성자 매개변수가 없는 생성자(단, 초기값은 반드시 지정)
//	   
//	학생 등록 메소드 registerStudent
//	      
//	학생 목록 보기 메소드 showStudentList
//	   
//	성적 평균 보기 메소드 showScoreAvg
	
//	로직구성
//	1. 문자열 타입의 학생 배열과 정수타입의 학생 수 필드 생성
//	2. 기본 생성자 생성 후 필드에 초기값 설정
//	3. 논리형 타입의 학생을 등록하는 메소드 생성 후 if문을 사용하여 학생 수가 최대 30명까지 등록할 수 있도록 조건 만들기
//	4. 30명이 초과됐을 경우 "학생 수를 초과하여 등록하지 못했습니다" 출력 후 false 반환
//	5. 30명이 초과되지 않았을 경우 학생 번호 부여 후 학생 등록하였습니다 출력 후 true 반환
//	6. 반복문을 사용하여 학생 배열안에 있는 학생 정보 출력하여 학생 목록 메소드 생성
//	7. 반복문과 학생클래스에 있는 scoreAvg() 메소드를 사용하여 학생의 성적평균을 보는 메소드 생성
	
	Student[] students;
	int studentCount;
	
	// 생성자
	public School() {
		this.students = new Student[30];
		this.studentCount = 0;
	}
	
	// 메소드
	
	// 학생 등록 메소드
	boolean registerStudent(Student student) {
		if(studentCount >= 30) {
			System.out.println("학생 수를 초과하여 학생을 등록하지 못했습니다.");
			return false;
		}
		students[studentCount++] = student;
		student.studentNumber = studentCount;
		System.out.println("학생을 등록했습니다.");
		return true;
	}
	
	// 학생 목록 보는 메소드
	void showStudentList() {
		for(int i = 0; i < studentCount; i++) {
			System.out.println(students[i]);
		}
	}
	
	// 학생 성적 평균 보기 메소드
	void showScoreAvg() {
		for(int i = 0; i < studentCount; i++) {
			Student student = students[i];
			double avg = student.scoreAvg();
			System.out.println("=== 학생 성적 평균 ===");
			System.out.println("학생 이름: " + student.studentName + ", 평균 성적: " + avg);
		}
	}
}
