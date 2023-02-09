package ezen.shape;

public class Circle extends Shape {

	protected double radian;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(double x, double y,double radian){
		this.x=x;
		this.y=y;
		this.radian=radian;
	}



	public double getRadian() {
		return radian;
	}

	public void setRadian(double radian) {
		this.radian = radian;
	}

		
	@Override
	public void draw() {
		System.out.println(getX()+","+getY()+" 위치의 반지름"+radian+"인 원입니다.");
	}
	
	public double getLength() {
		return 2 * Math.PI * radian;
		
	}
	
	public double getArea() {
		return Math.PI * radian * Math.pow(radian, 2);
		
	}

}
