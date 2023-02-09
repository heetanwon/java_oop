package ezen.interfacee;

public class Weapon_example {

	public static void main(String[] args) {
		Weapon weapon = new Gun();
		//인터페이스는 타입으로 선언 가능,생성은 불가능
		//자동형변환,다형성
		weapon.attack();
		
		weapon = new Sword();
		weapon.attack();
		
		weapon = new Club();
		weapon.attack();
	}

}
