package ezen.interfacee;

public interface remote_control {
 
	public static final int MAX_VOLUME = 2;
	public static final int MIN_VOLUME = 2;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
    
	
	//java8부터 디폴트 메소드 추가
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다");
			setVolume(remote_control.MIN_VOLUME);
		}else {
			System.out.println("무음해제합니다");
			
		}
		
		//static 메소드 추가 
		//public static void changeBattery() {
			//System.out.println("건전지를 교체합니다");
		//}
		
		
	}

}
