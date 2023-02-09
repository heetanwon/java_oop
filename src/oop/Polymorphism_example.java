package oop;

import ezen.shape.Circle;
import ezen.shape.Lectangle;
import ezen.shape.Shape;

/**
 * 자바는 다형성을 지원하기 위해 클래스 자동 형변환과 메소드 재정의를 지원한다.
 * @author 김희원
 * @date  2023. 1. 5.
 */
public class Polymorphism_example {

	public Polymorphism_example() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 기본타입 자동형변환 
		//double weight = 70;
		
		Shape shape = new Circle();
		shape.draw();
		
		//클래스 자동형변환 
		//부모,자식 간에는 타입을 부모로 선언하면
		//모든 자식 객체를 할당할 수 있다. 
		shape = new Circle();
		shape.draw();
		shape =new Lectangle();
		shape.draw();
		
		
		//부모 객체에 자식 객체를 넣을 수 있다
		
	
		

	}

}
