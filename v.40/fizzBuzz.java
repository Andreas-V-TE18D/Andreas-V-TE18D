import java.util.Scanner;
public class fizzBuzz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //initializes the Scanner
		
		int input1 = input.nextInt();
		int input2 = input.nextInt();
		int input3 = input.nextInt();
		
		for (int i = 1; i <= input3; i++) { //This is LOOP
			
			if (i % input1 == 0 && i % input2 == 0) { 
//checks if the number is divisible with both input1 and input2, if is prints fizzBuzz  
				System.out.println("FizzBuzz");
		}
			else if (i % input1 == 0) {//checks the number if its divisible with input1 
				System.out.println("Fizz"); 
		}
			else if (i % input2 == 0) {
				System.out.println("Buzz");
		}
			else {
				System.out.println(i);
				//if it is not divisible, then it prints the number instead
			}

	}
input.close(); //removes the anoying yellow resorse leak sign 
	}
}