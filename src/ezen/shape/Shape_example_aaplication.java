package ezen.shape;

public class Shape_example_aaplication {

	public Shape_example_aaplication() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Shape shape = new Shape(10,10);
		//shape.draw();
		//System.out.println(shape.getLength());
		//System.out.println(shape.getArea());
		
		Shape shape = new Circle(5, 5, 15);
		shape.draw();
		System.out.println("원의 둘레:"+shape.getLength());
		System.out.println("원의 면적:"+shape.getArea());
		
		Shape shape2= new Lectangle(5, 5, 15, 20);
		System.out.println("사각형의 둘레:"+shape2.getLength());
		System.out.println("사각형의 면적:"+shape2.getArea());
	}

}
