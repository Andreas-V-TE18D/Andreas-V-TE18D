 package numbergamefinal;
 import java.util.Scanner;
 import java.util.Random;
public class Numbergamefinal {
 static Scanner input = new Scanner(System.in);
 static boolean run = true;
 
    static int begintinterval;
	static int endInterval;

	public static void main(String[] args) {
		
	int guesses = 0; //variables for guesses and the interval
	int thenumber = 0;

	  System.out.println("NumberPlumber!");
	  System.out.println("The new and cool number guesing game...");
	  System.out.println();
	
	do {

		//the game begins 
		System.out.println("(Just press 666)");
		System.out.println();
		
		 int game = input.nextInt();//the player inputs
		switch (game) {
		case 666://if input is 666 case 666 starts

			System.out.print("get ready mortal...for some numbersss");
			System.out.println();
			System.out.print("The number is gonna be betwen 1 and 333");
			System.out.println();
			System.out.println("Choose wisley, you only have 30 guesses");
			System.out.println();

			begintinterval = 0;//The number of gueses and interval 
			endInterval = 333;
			guesses = 30;

			//Method for interval and brings the number
			thenumber = chooseInterval(begintinterval, endInterval, thenumber);

		
			game(thenumber, guesses);//Method for guessing

			break;

		}

		//The mortal gets to choose if he dares to play again
		System.out.println("Puny mortal, do you want to suffer again?");
		System.out.println();
		System.out.println("Press 1 for yes");
		System.out.println();
		System.out.println("Press 2 for No");

		int suffer = input.nextInt();
		switch (suffer) {

		case 1:
		break;
	    case 2:

		//If player chooses no then run changes to false, and the loop stops playing
		System.out.println("HA! I had known that you are weak!");
		run = false;
		break;

		}

	  } while (run);

	 }

                  //Generates a random number from interval 
	private static int chooseInterval(int begintinterval, int endInterval, int thenumber) {

		Random number = new Random();
		thenumber = number.nextInt(endInterval-begintinterval)+begintinterval;
		return thenumber;
	}

       // This is a loop that repeats until player have guesed the right number 
	 private static void game(int thenumber, int guesses) {
		int guess = 0;

		
		for (int i = 1; i <= guesses; i--) {//This (for)-loop loops until right number

		System.out.println("Try your luck");

		guess = input.nextInt();
		guesses--;

		if (guess == thenumber) { //if right number

		System.out.println("..clap..clap..bravo mortal!");
		System.out.println();
		break;

		}else if (guesses != 0) {

				

				
		if (guess < thenumber) {//If guess smaler than thenumber, this runs

		System.out.println();

		System.out.println("Wrong!");

	    System.out.println("The number is bigger!");

					
		}else if (guess > thenumber) { //If guess bigger than thenumber, this runs 

		System.out.println();

		System.out.println("Wrong!");

		System.out.println("The number is smaler!");

		}

		System.out.println("You have " + guesses + " guesses left.");

		}else {//If the number of guesses is 0 this runs 

	    System.out.println();
		System.out.println("Ha Ha Ha! you lose");
		System.out.println();
	    System.out.println("The number was: " + thenumber + "Dumbass! ");
		System.out.println();

		break;

		} 

	}

   }

}