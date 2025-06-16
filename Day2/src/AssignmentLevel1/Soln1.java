package AssignmentLevel1;
import java.util.Scanner;
public class Soln1 {
   
	    public static void main(String[] args) {
	    	 Scanner input = new Scanner(System.in);
	    	 System.out.println("Enter your birthYear");
	         int birthYear = input.nextInt();
	        int currentYear = 2025;
	        int age = currentYear - birthYear;

	        System.out.println("Harry's age in 2024 is " + age);
	    }
	}



