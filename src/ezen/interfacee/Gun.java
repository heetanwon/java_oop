package ezen.interfacee;

public class Gun implements Weapon {

	@Override
	public void attack() {
		System.out.println("총을 휘두른다");
	}

}
