package ex02;

public class Main {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		Circle c = new Circle();
		c.radius = 7;
		c.draw();
		
		Rectangle r = new Rectangle();
		r.height = 16;
		r.width = 8;
		r.draw();
	}
}
