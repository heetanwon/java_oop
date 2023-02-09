package ezen.array;

/**
 * 다차원 배열 생성 
 * @author 김희원
 *2022. 12. 29.
 */
public class Array_example5 {
//2차원 배열
	
	public static void main(String[] args) {
		//int[][] array;
		//array = new int[2][5];
		//array[0][0] = 88;
		//array[0][1] = 98;
		//array[0][2] = 75;
		//array[0][3] = 100;
		//array[0][4] = 100;
		
		
		//array[1][0] = 50;
		//array[1][1] = 20;
		//array[1][2] = 80;
		//array[1][3] = 90; 
		//array[1][4] = 100; 
		
		//int[][] array = 
				//new int[][] {
							//	{88,98,75,100,100},
								//{50,20,80,90,100}
						//	};
							
							
							
	   int[][] array = {
							    {88,98,75,100,100},
								{50,20,80,90,100}
					    };
		//바깥 중괄호는 첫번째 배열
	   
	   
	   
	   for (int i = 0; i < array.length; i++) {
		   System.out.print((i+1)+"반 성적:");
	   for (int j = 0; j < array[i].length; j++) {
		   System.out.print(array[i][j]+"\t");
		   
		}
		   System.out.println();
	}
		
	//	  int sum1 = 0;
	//	  System.out.println("1반 전체 학생 수 :" + array[0].length);
	//      for (int i = 0; i < array[0].length; i++) {
	//		  sum1 += array[0][i];
			  
	//	}
	//      	System.out.println("총 점:" +sum1);
	//      	System.out.println("평균:" +sum1/array[0].length);
	   
	   
	   int sum1 =0, sum2=0;
	   for (int i = 0; i < array.length; i++) {
		   for(int j = 0; j < array[i].length; i++){
	   if(i ==0) {
		   sum1 += array[i][j];
	   }else if(i == 1){
		   sum2 += array[i][j];
	   }
	   
	   }
	   }
	   double avg1=(double) sum1/array[0].length;
	   double avg2= (double)sum2/array[1].length;
	   
	   
		   System.out.println("1반 총점:"+sum1+"평균 :"+avg1);
		   System.out.println(sum2+avg2); 
		   System.out.println("전체총점:"+(sum1+sum2)+"평균 :"
		   +(avg1+avg2)); 
		
	}

	   
	   
	      	
	   
	   
	   
		
		
	}


