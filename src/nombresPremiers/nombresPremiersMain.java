package nombresPremiers;

import java.util.Scanner;

public class nombresPremiersMain {

	public static void main(String[] args) {

		int reste;
		boolean premier = true;
		while (premier = true) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Veuillez fixer votre limite supérieur de nombre premier :");
			int limiteSearch = scan.nextInt();

			System.out.println("Veuillez écrire un nombre premier compris entre 0 et " + limiteSearch);

			int nbr = scan.nextInt();

			if (nbr < limiteSearch && nbr > 0) {
				for (int i = 2; i <= nbr / 2;) {

					int nbpremier = 1;
					for (int loop = 2; loop <= i; loop++) {
						if ((i % loop) == 0 && loop != i) {
							nbpremier = 0;
						}
					}
					if (nbpremier != 0) {
						System.out.println(i + " est un nombre premier");
						i++;
					} else
						i++;
				}

			} else {
				System.out.println("Votre nombre n'est pas compris entre 0 et " + limiteSearch + "!!! ERROR");
			}

		}
	}

}
