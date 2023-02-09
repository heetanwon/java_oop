package oop;



public class Student_app {

	public static void main(String[] args) {
		Student student = new Student("김희원", "무역학과");
	System.out.println(student.getSsn());
	String name = student.getName();
		System.out.println(name);
	student.study();
		
		
		
		//클래스 변수는 클래스 이름.변수명
	System.out.println(Student.SCHOOLNAME);
		Student student2 = new Student("홍길동", "컴퓨터공학과");
		System.out.println(student2.getSsn());

		//권장
		Student.printSchoolName();
		//비권장
		//student.printSchoolName();
		
		
		
		
		
	}

}
