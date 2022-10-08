import java.util.Scanner;
import java.lang.Math;

public class calculator {

	public static void main(String[] args) {
	    Scanner userInput = new Scanner(System.in);
		double result ;
		
		System.out.print("Enter First Number : "); 
		double firstNum = userInput.nextInt();
		
		System.out.print("Enter Operator ( + ; - ; * ; / ) : "); 
		char operator = userInput.next().charAt(0);
		
		System.out.print("Enter Second Number : "); 
		double secondNum = userInput.nextInt();
		
		
	
		switch(operator) {
		case '-' : 
			result = firstNum - secondNum;
			break;
			
		case '*' : 
			result = firstNum * secondNum;
			break;
		
		case '/' : 
			result = firstNum / secondNum;
			break;
		default: 
			result = firstNum + secondNum;
			break;
		}
		
		System.out.print("Result = " + result); 



	}

}
