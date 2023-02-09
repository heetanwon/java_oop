package ezen.interfacee;

public class Television implements remote_control {
	
	private int volume;
	
	
	
	public int getVolume() {
		return volume;
	}

	@Override
	public void turnOn() {
	  System.out.println("티비를 켭니다");
		
	}

	@Override
	public void turnOff() {
     System.out.println("티비를 끕니다");
		
	}
	

	@Override
	public void setVolume(int volume) {
		if(volume > remote_control.MAX_VOLUME) {
			this.volume = remote_control.MAX_VOLUME;
		}else if(volume< remote_control.MIN_VOLUME){
			this.volume = remote_control.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("tv 현재 볼륨: "+ this.volume);
		
		
	}
	
}
