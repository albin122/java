package prg1;
import java.util.Scanner;
public class day {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number (1 to 7): ");
        int day = scanner.nextInt();
        switch(day) {
         
        case 1:
        	System.out.println("sunday");
        	break;
        case 2:
        	System.out.println("Monday");
        	break;
        case 3:
        	System.out.println("Tuesday");
        	break;
        case 4:
        	System.out.println("Wednesday");
        	break;
        case 5:
        	System.out.println("Thursday");
        	break;
        case 6:
        	System.out.println("Friday");
        	break;
        case 7:
        	System.out.println("Satudary");
        	break;
        	default:
        		System.out.println("valid input ");
        		
        	
        }
    	scanner.close();
        }
	}
	
