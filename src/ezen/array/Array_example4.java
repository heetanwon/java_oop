package ezen.array;

public class Array_example4 {

	public static void main(String[] args) {
		// 6개의 로또번호 임의 생성 및 배열에 저장
		int[] lottos = new int[6];

		for (int i = 0; i < lottos.length; i++) {

		int random	= (int)(Math.random() *45 + 1);// 0.0<= value<1.0;

		lottos[i] = random;

		// for을 통해 중복 체크
		for(int j = 0; j<i; j++) {

		if(lottos[i] == lottos[j]) {

		i--;

		}

		}

		}

		Array_util.sort(lottos);

		for(int i = 0; i<lottos.length; i++) {
		System.out.print(lottos[i]+"\t");
		}
		//0이 나올 수 있거나 or 45가 나오지 않을 가능성도 있으니 오류를 수정해줘야함 
		
		
		
		
		
		
		
		
		
		
	}

}
