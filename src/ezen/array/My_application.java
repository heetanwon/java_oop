package ezen.array;

 /**
  * 명령형 인자 처리하기 
 * @author 김희원
 *2023. 1. 3.
 *java My_application some.txt some2.txt
 */
public class My_application {
//arg는 배열과 같은 성격
	public static void main(String[] args) {
		String fileName1 = null, fileName2 = null;
		if(args.length != 2){
			System.out.println("Usage : java My_application <전달인자1> <전달인자2>");
			return;
		}
		fileName1 = args[0];
		fileName2 = args[1];
		System.out.println("전달된 파일 이름: "+fileName1);
		System.out.println("전달된 파일 이름: "+fileName2);

	}

}
