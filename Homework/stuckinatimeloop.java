import java.util.*;

public class stuckinatimeloop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //intalizes the scanner
		
		int cases = sc.nextInt(); //scanns the line and puts it in int
		
		for (int i = 1; i < cases + 1; i++) //loop
			System.out.println(i + " Abracadabra"); //prints the answer
	}
}