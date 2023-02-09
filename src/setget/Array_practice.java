package setget;

//for문 한번만 돌리기
public class Array_practice {

	public static void main(String[] args) {
		
		//점수의 개수 구하기
		int[] score= {11,12,13,14,15};
		System.out.println("점수의 개수는 ? "+score.length);
		
		//변수 초기화 미리 해놓기 
		int sum = 0;
		//점수 그대로 나열하기(for문)
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]+"\t");
			sum += score[i];
		}	
			System.out.println();
			//총합 구하기 
			System.out.println("총점은 ? "+sum);
			//평균 구하기
			System.out.println("평균은 ? "+(sum/5));
		
		
		

	}

}
