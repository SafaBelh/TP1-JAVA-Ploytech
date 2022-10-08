
import java.util.Scanner;
import java.lang.Math;
public class secondDegreeEquation {

	public static void main(String[] args) {
	    Scanner userInput = new Scanner(System.in);
	    
	    System.out.println( "This Program Will Solve Any 2nd Degree Equation That Looks Like This : ax² + bx + c = 0");

	    
	    System.out.print("Enter a : ") ; 
	    int a = userInput.nextInt();

	    System.out.print("Enter b : ") ; 
	    int b = userInput.nextInt();

	    System.out.print("Enter c : " ) ; 
	    
	    int c = userInput.nextInt();
	    double  delta = Math.pow(b, 2) - (4 * a * c) ;
	    double firstSolution;
	    double secondSolution ;
	    int solutionsNumber = 0  ;
	    

	    String  solutionsNumResult = "" ;
	    

	    System.out.println( '\n' + "Your Equation is : " + a + "x² + "+ b +"x + " + c + " = 0 " + '\n');
	    
	    System.out.println("🔎 Calculating Number Of Solutions ... " + '\n') ;
	    
	    
	    if(a == b && b == c && b == 0) {
	    	solutionsNumResult = "Your Equation Has An INFINITY Of Solutions !" ;
	    	
	    }
	    else if(a == b && b == 0 && c != 0) {
	    	solutionsNumResult = "Your Equation Has NO SOLUTION !" ;
	    }
	    else if(a == 0 && b != 0) {
	    	solutionsNumResult = "Your Equation Has TWO SOLUTIONS !" ;
	    	solutionsNumber = 2 ;
	    }
	    else {
	    	
	    	if (delta < 0) solutionsNumResult = "Your Equation Has NO SOLUTION !" ;
	    	if (delta == 0) {
	    		solutionsNumResult = "Your Equation Has ONE SOLUTION !" ;
	    		solutionsNumber = 1 ;
	    		firstSolution = -b / 2*a ; 
	    		
	    	}  
	    	if (delta > 0) { solutionsNumResult =  "Your Equation Has TWO SOLUTIONS !" ;
	    	solutionsNumber = 2 ;

	    	
	    	
	    	} ;
	    }
	    
	    System.out.println("Result => " + solutionsNumResult + "\n");
	    
	    switch(solutionsNumber) {
	    case 0 : break ;
	    case 1 : 
	    {
	    	firstSolution = (-b + Math.sqrt(delta) ) / 2*a ;
	       System.out.println("⏳ Solving ... " + '\n');
	       System.out.println("Equation Solution = " + firstSolution);
	    }
	    	break;
	    case 2 : 	    	
	    	
	    	{
		    	firstSolution = (-b + Math.sqrt(delta) ) / 2*a ;
		    	secondSolution = (-b - Math.sqrt(delta) ) / 2*a ; 

		       System.out.println("⏳ Solving ... " + '\n');
		       System.out.println("💡 Solution (1) = " + Math.round(firstSolution));
		       System.out.println("💡 Solution (2) = " + Math.round(secondSolution));

		    }
		    
	    	break;

	    }
	    


	    
	    
	    
	    
	    

	    



	}

}
