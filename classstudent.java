package prg1;
import java.util.Scanner;
 class Student{
	 String name;
	 int age;
	 void displayDetails() {
		 System.out.println("Name"+name);
		 System.out.println("Age:"+age);
	 }
 }
public class classstudent {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		Student student1= new Student();
		System.out.println("enter the name");
		student1.name=sc.nextLine();
		System.out.println("enter the age");
		student1.age=sc.nextInt();
		System.out.println("\nStudent detail is");
		student1.displayDetails();
		sc.close();

		
	}
	}

