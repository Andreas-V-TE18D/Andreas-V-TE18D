public class homework{

	public static void main(String[] args) {
	lol();
    System.out.println(max(6,3));
	count(8);
	System.out.println(kelvinToCelsius(290.38));
	System.out.println(fahrenheitToCelsius(160));
	ageControl(30);
	stair(5);

	}
  static void lol() {
		System.out.println("HAHAHAHAHAHAHA!");

	}

	static int max(int putin,int donald) {
		    if(putin>donald) {
			return putin;
	}
		    return donald;
	}

	static void count(int gg) {
		for(int i=1;i<=gg;i++) {
		System.out.println(i);
	}
	}

	static double kelvinToCelsius(double kelvin) {
	double celsius = kelvin-273.15;
	return celsius;
	}
    static double fahrenheitToCelsius(double fahrenheit) {
	double celsius = (fahrenheit-32)*5/9;
	return celsius;
	}
	static void ageControl(int age) {
		if(age<5) {
	      System.out.println("Småbarn får integöra något");
		   	 } 
		else if(age<=12) {
          System.out.println("du får spela Fortnite");
             } 
		else if(age<=14) {
		  System.out.println("Du får köra moppe");
		     } 
		else if(age<=17) {
		  System.out.println("Du får köra bil");
		     } 
		else if(age<=20) {
		  System.out.println("Du får vuxenstraff om du gör något dumt");
		     } 
		else if(age<=64) {
          System.out.println("Du får vuxenstraff om du gör något dumt");
             } 
		else if(age<=99) {
		  System.out.println("Du är pensionär");
			 } 
		else if(age>=100) {
		  System.out.println("Rest in Peace");
		     }
    }
	static void stair(int steg) {
		for(int i = 1; i<=steg;i++) {
		for(int j=0;j<steg-i;j++) {
		  System.out.print(" ");
    }
		for(int j=0;j<i;j++) {
		  System.out.print("X");
	}
			System.out.println();

	}

	}

}