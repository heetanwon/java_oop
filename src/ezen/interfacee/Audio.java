package ezen.interfacee;

public class Audio implements remote_control {
	
	private int volume;
	private int memoryVolume;
	
	
	

	public int getVolume() {
		return volume;
	}

	@Override
	public void turnOn() {
	  System.out.println("오디오를 켭니다");
		
	}

	@Override
	public void turnOff() {
     System.out.println("오디오를 끕니다");
		
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
		System.out.println("Audio 현재 볼륨: "+ this.volume);
	    }
		
		//디폴트 메소드 오버라이딩
		@Override
		public void setMute(boolean mute){
			if(mute) {
				this.memoryVolume = volume;
				System.out.println("무음처리합니다");
				setVolume(remote_control.MIN_VOLUME);
			}else {
				System.out.println("무음해제합니다");
				volume = memoryVolume;
				
			}
			
		
		
	}
	
}
