package setget;
//배열 복사 연습 
public class ArrayCopy {

	public static void main(String[] args) {
		String[] oldArray = {"tan1","tan2","tan3"};
		String[] newArray = new String[5];
	   
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		//원본 배열,원본 배열 인덱스 시작점,복사 배열,복사 배열 시작점,원본 길이
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+",");
		}
	}

}
