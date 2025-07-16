import java.util.Scanner;
public class checknum {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        double number = input.nextDouble();
        if(number>0) {
        	System.out.println(number+"is a positive number");
        }
        else if (number<0) {
        	System.out.println(number+"is negative number");
        }
        else {
        	System.out.println(number+"is zero");
        }
        input.close();
        
        	}
}
