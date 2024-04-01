package test1;

import java.util.Arrays;

public class Student {
//  Student 클래스
//  필드    학생번호 studentNumber
//     학생이름 studentName
//     성적배열 grades

//  생성자   studentName, grades 매개변수 2개 있는 생성자

//  메소드    성적보기 메소드 showGradeInfo (매개변수x, 리턴타입x)
//        학생이름, 학생번호, 국어성적, 영어성적, 수학성적 출력

//     평균성적계산 메소드 scoreAvg    (매개변수x, 리턴타입 o double타입)
     
//     toString 오버라이딩
//        학생이름과 학생점수를 반환하는 메소드
	
//	로직구성
//	1. 정수 타입의 학생번호, 문자열 타입의 학생이름, 정수형 배열 성적배열 필드 생성
//	2. 매개변수로 학생의 이름과 성적을 받는 생성자 생성
//	3. 학생이름, 학생번호 출력 성적배열의 인덱스를 활용하여 국어, 영어, 수학 성적 출력
//	4. 성적배열의 실수형타입의 메소드 생성 후 국어 영어 수학 성적의 평균을 반환
//	5. toString를 재정의하여 학생이름과 학생점수를 반환하는데 학생점수는 Arrays.toString()을 활용하여 각 과목의 성적을 반환한다
	
	// 필드
	int studentNumber;
	String studentName;
	int[] grades;
	
	// 생성자
	public Student(String studentName, int[] grades) {
		super();
		this.studentName = studentName;
		this.grades = grades;
	}
	
	// 메소드
	
	// 학생 정보와 성적을 출력하는 메소드
	void showGradeInfo() {
		System.out.println("학생이름 : " + this.studentName);
		System.out.println("학생번호 : " + this.studentNumber);
		System.out.println("국어성적 : " + this.grades[0]);
		System.out.println("영어성적 : " + this.grades[1]);
		System.out.println("수학성적 : " + this.grades[2]);
	}
	
	// 학생의 성적 평균을 계산하는 메소드
	double scoreAvg() {
		int avg = 0;
		for(int grade : grades) {
			avg += grade;
		}
		return (double)avg / grades.length;
	}

	
	// toString 오버라이딩
	@Override
	public String toString() {
		System.out.println("=== 학생 목록 ===");
		return "학생 이름 : " + this.studentName
				+ "\n학생 번호 : " + this.studentNumber
				+ "\n학생 점수 : " + Arrays.toString(grades);
	}
}
