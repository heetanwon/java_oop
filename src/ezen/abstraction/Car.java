package ezen.abstraction;
/**
 * 모든 자동차들이 구현해야 하는 추상메소드를 선언한 추상클래스
 * @author 김희원
 * @date  2023. 1. 6.
 */
public abstract class Car {
	//제품 관련
	protected String name;
	protected String model;
	protected boolean status;
	protected int speed=60;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	//car 추상메소드(수직적 명세)
	//제품 기능
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void run();
	public abstract void speedup();
	public abstract void speeddown();
	public abstract void stop();
	
	
	

}
