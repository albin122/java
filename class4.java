package prg5;
class Student{
	int rollNumber;
	String name;
	int m1,m2,m3;
	float average;
	
	Student(int rollNumber,String name,int m1,int m2,int m3){
		this.rollNumber=rollNumber;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
		
	}
	public void calculateAverage() {
		average = (m1+m2+m3)/3;
	}
	public void displaydetails() {
		System.out.println("Roll No"+rollNumber);
		System.out.println("Name"+name);
		System.out.println("Mark1"+m1+"Mark2"+m2+"Mark3"+m3);
		System.out.println("AverageMark:"+average);
		
		
	}
}
public class StudentDemo {
	public static void main(String[] args) {
		Student student1=new Student (14,"albin",45,79,80);
		Student student2=new Student(19,"aiben",23,46,78);
		
		student1.calculateAverage();
		student1.displaydetails();
		student2.calculateAverage();
		student2.displaydetails();
	}

}
