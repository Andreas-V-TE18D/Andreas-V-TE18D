package lektion;

import java.util.Scanner;

public class lektion3 {

	public static void main(String[] args) {

		// villkor

		boolean again = true;
		int svar = 1;
		int �lder = 0;

		Scanner input = new Scanner(System.in);

		if (again) {

			System.out.println("hur gammal �r du?");
			�lder = input.nextInt();

			if (�lder >= 18) {
				System.out.println("Du �r gammal nog att k�ra bill! grattis din j�vel!");
				System.out.println("Bara s� du vet, s� f�r du �ka moppe ocks�!");
			}

			else if (�lder > 14 && �lder < 18) {
				System.out.println("Bara s� du vet, s� f�r du �ka moppe ocks�!");
			} else {
				System.out.println("Tyv�r, du f�r v�nta ett tag till!");
			}

			System.out.println("Vill du fr�ga om�lder igen? Skriv (1) om ja,(2) om nej");
			if (svar != input.nextInt()) {
				again = false;

			}
		}
	}

}
