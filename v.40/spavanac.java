import java.util.Scanner;
public class spavanac {

	public static void main(String[] args) {

    Scanner input = new Scanner(System.in); // initializes the scanner 
    
    int hours = input.nextInt(); // puts answer in varible
    int minutes = input.nextInt();
    
    minutes -= 45;
    
    if (minutes < 0)
    {
    	hours -= 1;
    	minutes += 60;
    }
    if (hours < 0)
    	hours = 23;
    
    System.out.println(hours + " " + minutes); // prints the answer 
    
    
    input.close(); // gets rid off anoying yellow sign:) 
    
	}

}
