package setget;

//제너럴 타입 선언 
public interface Rentable <P> {
 public P rent();
}



//내부클래스
class TV{ 
	public void TurnOn() {
		System.out.println("TV를 켭니다");
	}
}


//내부클래스
class Cars{ 
	public void run() {
		System.out.println("자동차가 달립니다");
	}
}