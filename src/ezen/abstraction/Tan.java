package ezen.abstraction;

public class Tan extends Car {

	
	
	
	public Tan() {}
	
	public Tan(String name,String model,boolean status,int speed) {
		this.name=name;
		this.model=model;
		this.status=status;
		this.speed=speed;
	}
	
	
	
	public void turnOn() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	public void run() {
		System.out.println("달리는중");
	}
	public void speedup() {
		System.out.println(+getSpeed()+"\t"+"스피드 올리는중");
	}
	public void speeddown() {
		System.out.println(+getSpeed()+"\t"+"스피드 내리는중");
	}
	public void stop() {
		System.out.println("시동 끄기");
	}
	
	
}
