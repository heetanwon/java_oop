package setget;

public class DmbCellPhone extends CellPhone {

	private int channel;
	
	public DmbCellPhone() {
		this(null,null,0);
	}
	//부모것까지 상속받으므로
	//데이터타입 총 세개
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color);
		this.channel= channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void turnOnDmb() {
		System.out.println("DMB 방송 수신을 시작합니다");
	}
	
	public void turnOffDmb() {
		System.out.println("Dmb 방송 수신을 종료합니다");
	}
	
	public void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널을"+channel+"번 채널로 변경합니다");
	
	
	
	
}
}
