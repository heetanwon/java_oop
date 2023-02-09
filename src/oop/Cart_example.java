package oop;

import ezen.shoppingmall.*;


//import com.ezen.shop.Cart;
//import com.ezen.shop.*;
//클래스 전체를 사용할 수 있다,but 비권장
//static import
import static java.lang.System.out;

import java.util.Date;





public class Cart_example {

	public static void main(String[] args) {
		Cart cart;
		//com.ezen.shop.Cart cart;
		//패키지 경로가 달라서 인식을 못하는 것 import package.클래스를
		//입력해줘야함
		cart = new Cart();
		cart.addItem(null);
		
		Date today = new Date();
		String ymd = today.toString();
		System.out.println(ymd);
		out.println("스테틱 임포트 사용하기");
		
		int x = 40, y = 35;
		int result = Math.max(x, y);
		System.out.println(result);
		
	}

}
