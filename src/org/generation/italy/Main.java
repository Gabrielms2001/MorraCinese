package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int punteggioUtente = 0, punteggioComputer = 0;

		do {

			// Viene generata la mossa del Computer
			int mossaComputerN = random.nextInt(3);
			String mossaComputerP = "";

			if (mossaComputerN == 0) {
				mossaComputerP = "carta";
			} else if (mossaComputerN == 1) {
				mossaComputerP = "forbice";
			} else if (mossaComputerN == 2) {
				mossaComputerP = "sasso";
			}

			// Si richiede all'utente di inserire la mossa
			System.out.println("Inserire una mossa tra carta, forbice, sasso: ");
			String mossaUtente = scanner.nextLine();

			// Verifico la validità della mossa inserita dall'utente
			if (!mossaUtente.equals("carta") && !mossaUtente.equals("forbice") && !mossaUtente.equals("sasso")) {
				System.out.println("Mossa non valida, riprovare");
			}
			// Vengono mostrate le mosse
			System.out.println("La mossa del Computer è: " + mossaComputerP);
			System.out.println("La tua mossa è: " + mossaUtente);

			// Dichiarare il vincitore della partita
			if (mossaUtente.equals(mossaComputerP)) {
				System.out.println("Pareggio");
			} else if ((mossaUtente.equals("carta") && mossaComputerP.equals("sasso"))
					|| (mossaUtente.equals("forbice") && mossaComputerP.equals("carta"))
					|| (mossaUtente.equals("sasso") && mossaComputerP.equals("forbice"))) {
				System.out.println("Hai vinto");
				punteggioUtente++;
			} else {
				System.out.println("Hai perso");
				punteggioComputer++;
			}
			// Viene mostrato il punteggio
			System.out.println("Punteggio: \nUtente = " + punteggioUtente + " \nComputer = " + punteggioComputer);

		} while (punteggioUtente < 5 && punteggioComputer < 5);

		// Viene mostrato il vincitore
		if (punteggioUtente == 5) {
			System.out.println("Hai vinto la partita.");
		} else {
			System.out.println("Il computer ha vinto la partita.");
		}

		scanner.close();

	}
}
