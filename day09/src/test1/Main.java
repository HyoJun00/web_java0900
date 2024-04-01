package test1;

public class Main {
	public static void main(String[] args) {
	
	//	메소드   학생등록메소드 호출하고 학생객체3개 등록하기
	//	학생목록메소드 호출
	//	학생 성적 평균 보기 메소드 호출
	
	// 객체 생성
	School school = new School();
	System.out.println(school);
	
	int[] grades1 = {85, 90, 95};
    int[] grades2 = {75, 80, 85};
    int[] grades3 = {90, 85, 80};
    

    Student student1 = new Student("뽀로로", grades1);
    Student student2 = new Student("루피", grades2);
    Student student3 = new Student("짱구", grades3);

    school.registerStudent(student1);
    school.registerStudent(student2);
    school.registerStudent(student3);
    
    // 학생 목록 보기
    school.showStudentList();

    // 학생들의 성적 평균 보기
    school.showScoreAvg();

	
	}
}
