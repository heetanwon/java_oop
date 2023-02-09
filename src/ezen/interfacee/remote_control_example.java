package ezen.interfacee;

public class remote_control_example {

	public static void main(String[] args) {
		remote_control remocon ;
		remocon = new Television();
		remocon.turnOn();
		remocon.setVolume(5);
		//인터페이스의 디폴트 메소드 재사용
		remocon.setMute(true);
		remocon.setMute(false);
		Television tv = (Television)remocon;
		System.out.println("현재볼륨:"+ tv.getVolume());
		
		remocon.setVolume(100);
		remocon.turnOff();
		
		remocon = new Audio();
		remocon.turnOff();
		remocon.setVolume(20);
		remocon.setMute(true);
		remocon.setMute(false);
		Audio audio =(Audio)remocon;
		System.out.println("현재볼륨:"+ audio.getVolume());
		
		remocon.turnOn();
		
		//remote_control.changeBattery();
		
		
	}

}
