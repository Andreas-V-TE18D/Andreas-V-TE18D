package lektion;

import java.util.Scanner;

public class lektion3 {

	public static void main(String[] args) {

		// villkor

		boolean again = true;
		int svar = 1;
		int ålder = 0;

		Scanner input = new Scanner(System.in);

		if (again) {

			System.out.println("hur gammal är du?");
			ålder = input.nextInt();

			if (ålder >= 18) {
				System.out.println("Du är gammal nog att köra bill! grattis din jävel!");
				System.out.println("Bara så du vet, så får du åka moppe också!");
			}

			else if (ålder > 14 && ålder < 18) {
				System.out.println("Bara så du vet, så får du åka moppe också!");
			} else {
				System.out.println("Tyvär, du får vänta ett tag till!");
			}

			System.out.println("Vill du fråga omålder igen? Skriv (1) om ja,(2) om nej");
			if (svar != input.nextInt()) {
				again = false;

			}
		}
	}

}
