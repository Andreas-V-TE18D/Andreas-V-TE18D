import java.util.*;

public class Quadrant {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //intializes the scanner
		
		int x = sc.nextInt(); //scans the line and puts it in int
		int y = sc.nextInt();
		System.out.println(solve(x, y)); //prints the answer
	}

	public static int solve(int x, int y) { //this is the math for the answer
		if (x < 0)
			return (y < 0) ? 3 : 2;
		return (y < 0) ? 4 : 1;
	}
}