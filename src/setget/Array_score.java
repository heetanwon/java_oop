package setget;
//for문에 변수 초기화
public class Array_score {

	public static void main(String[] args) {
		int[] scores =  {95,71,84,93,87};
		int sum = 0;
		for (int score : scores) {
			sum = sum+score;
		}
		System.out.println("점수 총합:"+sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균:"+avg);
	}

}
