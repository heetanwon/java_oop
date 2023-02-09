package setget;

public class Array_top {

	public static void main(String[] args) {
		int[] array = {75,68,49,99,100};
		//변수 선언과 초기화를 동시에 
		
		for (int i = 0; i < array.length; i++) {
		//첫번째 비교값
			for (int j = 0; j < array.length-1; j++) {
				//두번째 비교값
				int temp = 0;
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					//변수초기화 한 후 작은 값 바꿔치기
				}
			}
		}//오름차순 구현
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		
		
	}

}






