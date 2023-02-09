package oop;

public class Student {
	//필드( 인스턴스변수, 클래스변수 , 상수)
	public static final String SCHOOLNAME = "EZEN-UNIVERCITY";
	//상수(관례상 all 대문자 처리)
	//클래스변수는 모든 인스턴스들이 공유하는 데이터이기 때문에 private보다는 public으로 씀
	public static int sequence = 1;
	//클래스(static)변수 : 모든 인스턴스들이 공유하는 데이터
	
	//인스턴스 변수
	private int ssn;
	private String name;
	private String subject;
	
	
	//초기화 블록 
	{
		
		System.out.println("학생 인스턴스가 생성 되었습니다");
		System.out.println("*****");
		
	}
	
	//static 초기화 블록
	static{
		System.out.println("프로그램 로딩중...");
	}
	

	public Student() {
		this(null, null);
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Student(String name, String subject) {
		this.ssn = Student.sequence++;
		this.name = name;
		this.subject = subject;
		System.out.println("생성자 실행됨");
	}

	
	
	public void study() {
		System.out.println("공부하기");
	}
	
	
	//학교 이름을 출력하는 공통 기능(클래스 메소드,정적 메소드)
	
	public static void printSchoolName() {
		System.out.println(Student.SCHOOLNAME);
	    //System.out.println(name);
		//같은 클래스일때는 굳이 클래스명. 안 붙여줘도 됨.
	}
	
	
	
	
	
	
	
	
	
}