package abstractTest;

public class Main {
	public static void main(String[] args) {
		ClassA b = new ClassB();
		b.method();
		
		ClassA a = new ClassA() {

	         @Override
	         void method() {
	            System.out.println("익명클래스에서 재정의");
	         }
	         
	      };
	      
//	      Class aa = () -> System.out.println("익명클래스에서 재정의");
//	      람다식으로 변경이 불가능한 이유 -> 람다식은 익명 메소드이기 때문에 함수형 인터페이스에서만 가능하다
		
	}
}
