package AssignmentLevel1;
import java.util.Scanner;
public class Soln2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter your Maths Marks");
		  int maths = input.nextInt();
		  System.out.println("Enter your physics marks");
	      int physics = input.nextInt();
	      System.out.println("Enter yor chemistry marks");
	      int chemistry= input.nextInt();

		double average=(maths+physics+chemistry)/3;
		System.out.println("Sam's average mark in PCM is "+average);

	}

}
