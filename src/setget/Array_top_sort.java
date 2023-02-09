package setget;

import ezen.array.Array_util;

public class Array_top_sort {

	public static void main(String[] args) {
		// sort를 써서 오름차순으로 배열하기 

		int[] array = {99,78,90,100,75};
		int[] copyArray = Array_util.copyArray(array, 5);
		//이해안되는 부분 (array 다섯개와 배열 5개를 합친건가?)
		for (int i = 0; i < copyArray.length; i++) {
			System.out.print(copyArray[i]+"\t");
			
		}
		 System.out.println();
		 
		 Array_util.sort(array);
		 for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+"\t");
			}
			
		 
		
		
	}

}
