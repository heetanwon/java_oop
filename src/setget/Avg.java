package setget;
//합산 값과 평균 값 연습
public class Avg {

	public static void main(String[] args) {
		int[] score = {99,88,66,88,100};
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		int avg = sum;
		System.out.println("합산 값:"+avg);
		System.out.println("평균 값:"+(avg/5));
	}

}
