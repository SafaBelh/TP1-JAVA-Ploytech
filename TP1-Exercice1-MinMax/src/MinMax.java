
import java.util.Scanner;
import java.lang.Math;

public class MinMax {

	public static void main(String[] args) {
	    Scanner userInput = new Scanner(System.in);
	    double average ; 
	    
	    System.out.print("Enter First Number : ");
	    int number1 = userInput.nextInt();

	    System.out.print("Enter Second Number : ");
	    int number2 = userInput.nextInt();


	    System.out.println("Max Number = " + Math.max(number1 , number2));
	    System.out.println("Min Number = " + Math.min(number1 , number2));
	    System.out.println("Average = " + ((number1 + number2)/2));

	}

}
