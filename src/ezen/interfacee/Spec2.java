package ezen.interfacee;

/**
 * 인터페이스간에도 상속이 가능하며, 일반 추상클래스는 extends때 다중상속이 안되는
 * 반면에 인터페이스는 다중 상속이 가능하다.
 * @author 김희원
 * @date  2023. 1. 6.
 */
public interface Spec2 extends Spec1,Weapon {
	
	public void doTask3();
	
	
}
