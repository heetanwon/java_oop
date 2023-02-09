package ezen.array;

public class Array_example3 {

	public static void main(String[] args) {
		int[] array = {99, 78, 90, 100, 75};
		int[] copyArray = Array_util.copyArray(array, 5);
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
