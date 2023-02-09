package oop;

import ezen.abstraction.Animal;
import ezen.abstraction.Bird;

public class Instance_of_example {
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		
		System.out.println(bird instanceof Bird);
		System.out.println(bird instanceof Animal);
		System.out.println(bird instanceof Object);
		//System.out.println(bird instanceof String);
		
		
		//상속 개념이기때문에 같은 직계 가족은 다 true라고 인식함
		
		
		
	}
}
