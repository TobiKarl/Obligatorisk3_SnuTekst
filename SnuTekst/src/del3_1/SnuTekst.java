package del3_1;

import java.util.Scanner;

class SnuTekst {
	/*
	 * Oppgave 1 Lag et nytt prosjekt og legg dette inn i din GIT repository.
	 * Oppgaven g�r ut p� � skrive ut tegnene i en streng i motsatt rekkef�lge
	 * (Basert p� Exercise 18.9 fra lab onsdag, men med noen modifikasjoner)
	 * Klassen skal hete SnuTekst. Skriv en rekursiv metode som viser innholdet
	 * i en streng baklengs. Metoden skal ha f�lgende header: public static void
	 * baklengs(String tekst) Skriv et testprogram (main-metode) som ber
	 * brukeren om en streng. Ledeteksten skal v�re p� norsk. Strengen skal s�
	 * skrives ut baklengs med en ledetekst p� norsk. N�r dette fungerer utgj�r
	 * dette f�rste utgave av klassen og skal ha versjon 0.1. Gj�r en Commit p�
	 * dette i GIT 
	 * 
	 * --- Gj�r en branch i GIT og legg til funksjonalitet for �
	 * telle antall tegn ved utskrift av hvert tegn. Resultatet skal skrives ut
	 * (med passende ledetekst) etter at strengen er skrevet ut baklengs. Flere
	 * av oppgavene i kapitlet har tips til hvordan man l�ser tilsvarende
	 * problemstillinger. N�r dette fungerer utgj�r det andre utgave av klassen.
	 * Gj�r en Commit og foreta en merge mot master til versjon 0.2.
	 * 
	 *  ---- Gj�r
	 * en ny branch i GIT og omarbeid programmet slik at det bruker en
	 * hjelpemetode for den rekursive metoden. Hensikten er at den rekursive
	 * metoden ikke skal lage en ny streng for hvert kall. For � oppn� dette
	 * skal den rekursive metoden n� ha headeren: public static void
	 * baklengs(String tekst, int siste) Hjelpemetoden skal ha samme header som
	 * den rekursive hadde tidligere. N�r programmet fungerer som forventet og
	 * du er forn�yd, gj�r Commit og foreta en merge mot master til versjon 0.3.
	 * Publiser l�sningen p� GitHub.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn tekst her og programmet vil returnere teksten baklengs:");
		String tekst = input.nextLine();

		System.out.println("Baklengs:");
		baklengs(tekst);
		System.out.println("\nAntall tegn: "+antallTegn);
		input.close();

	}

	static int antallTegn;

	public static void baklengs(String tekst) {
		if (tekst.length() != 0) {
			System.out.print(tekst.charAt(tekst.length() - 1));
			antallTegn++;
			String tekstNesteRunde;
			tekstNesteRunde = tekst.substring(0, tekst.length() - 1);
			baklengs(tekstNesteRunde);
		}
	}
}
