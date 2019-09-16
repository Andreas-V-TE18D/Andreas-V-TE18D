import java.util.Scanner;

public class hemlaxav37 {
	//1. Take input for strings 
	//2. Take input for integers 
	//3. Take input for doubles 
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//step 1: Declare each variable 
		String name1 = "Andreas";
		int age = 0;
		String name2 = "nothing"; 
		int postnummer = 0;
		String name3 = "nothinges";
		int userPhonenumber = 0;
		
		//Step 2: Prompt user and take input 
		System.out.print("Vad heter du: ");
		name1 = s.nextLine();
		System.out.print("Hur gammal är du: ");
		age = s.nextInt();
		System.out.print("Vad är din adress: ");
		s.nextLine();
		name2 = s.nextLine();
		System.out.print("Vad är ditt postnummer: ");
		postnummer = s.nextInt();
		s.nextLine();
		System.out.print("Vilken stad bor du i: ");
		name3 = s.nextLine();
		System.out.print("Vad är ditt telefon nummer: ");
		userPhonenumber = s.nextInt();
		s.nextLine();
		
		//Step 3: Use inputs.
		System.out.println("Information");
		System.out.println("Namn:  "+name1);
		System.out.println("Ålder: "+age+" år");
		System.out.println("Adress: "+name2+",  "+postnummer+",  "+name3+", ");
		System.out.println("Ditt telefon nummer är: "+userPhonenumber);
				
		
		
	}

}
