import java.util.Scanner;
import java.lang.Math;
public class GuessMySecretNumber {

	public static void main(String[] args) {
	    Scanner userInput = new Scanner(System.in);
        int guessedNumber ;
        int secretNumber;
        int guessCounter = 0 ;

        
        // Secret Number Controle ( It Must In [1..100] 
	    do {
    	System.out.print("Player (1) Enter Your Secret Number : ") ;
	     secretNumber = userInput.nextInt();
        } while (secretNumber < 1  || secretNumber > 100 ) ;
     

	    // Keep Giving Player (2) Chances 
    	do {
    		
    		System.out.print("Player (2) Try To Guess The Secret Number : ") ;
             guessedNumber = userInput.nextInt() ;
             if(guessedNumber < secretNumber) System.out.println("Try With Superior Number ! ");
             else if (guessedNumber > secretNumber) System.out.println("Try With Inferior Number !");
             guessCounter++;

    	} while(guessedNumber != secretNumber && guessCounter < 15 );
    	
    	
    	// Tentatives Cases 
    	int tentativeCase = 0 ;
    	String result ; 
    	if(guessCounter == 1 ) tentativeCase = 1 ;
    	else if (guessCounter >= 2 && guessCounter <= 7 ) tentativeCase = 2 ;
    	else if (guessCounter >= 8 && guessCounter <= 12 ) tentativeCase = 3 ;
    	else if (guessCounter==15) tentativeCase = 4 ;

	
    	switch (tentativeCase) {
		case 1 : result = "Humm you guessed the secret Number too fast !! Dear Player , In case that you didn't CHEAT 😏 ! I see that you can be a super lucky Lotto player 😎 ";
		break ;
		case 2 : result = "YOU ROCK 😍! You Won !!";
		break ;
		case 3 : result = " 🏆 You Won !! Try To Be Faster Next Time !";
		break ;
		default : result = "✅ Correct!! ";
		break ;
		
		}
    	
    	
    	// Display Result 
    	if(secretNumber ==guessedNumber && guessCounter<=15  ) {
    		System.out.print(result);
    	}
    	else {
    		System.out.print("You LOST !! ") ;
    	}
  

	}

}
