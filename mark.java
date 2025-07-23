package prg1;
import java.util.Scanner;
public class mark {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int n=sc.nextInt();
		if(n>=90) {
			System.out.println("your grade is A");
			
		}
		else if(n>=75) {
			System.out.println("your grade is B");
		}
		else if(n>=60) {
			System.out.println("your grade is C");
		}
		else if(n>=40) {
			System.out.println("your grade is D");
		}
		else
		{ System.out.println("Fail");
	}

	}
}

