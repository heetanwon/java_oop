package setget;

public class Student {
	
	private int[] jumsu;
	private String name;
	
	public Student(){
		this(null,null);
	}
	
	public Student( int[] jumsu,String name){
		this.name = name;
		this.jumsu= jumsu;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		}

	
	public int[] getJumsu(){
		return jumsu;
	}
	public void setJumsu(int[] jumsu) {
		this.jumsu= jumsu;
		
	}
	
	public int getSum() {
	
	int sum = 0;
			for (int i= 0; i < jumsu.length; i++) {
				sum+= jumsu[i];
			}
		
		return sum;
	}
	
	public void setSum(int sum) {
		
	//	this.sum = sum;
	}
	//public int getAvg() {
	//	return(double)getSum()/jumsu.length;
	//}
	public void setAvg(int avg) {
		//this.avg = avg;
	}
	
	
	
	
		
	
	
}
