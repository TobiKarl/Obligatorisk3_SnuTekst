package del3_1;

import java.util.Scanner;

class SnuTekst {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn tekst her så vil programmet returnere baklengs:");
		String tekst = input.nextLine();

		System.out.println("\nBaklengs:");
		baklengs(tekst, 0);
		System.out.println("\nAntall tegn: " + antallTegn);
		input.close();
	}

	static int antallTegn;

	public static void baklengs(String tekst, int siste) {
		if (siste == 0) {
			System.out.print(tekst.charAt(tekst.length() - 1));
			antallTegn++;
			hjelpeMetode(tekst.substring(0, tekst.length() - 1));
		}
		if (siste == 1) {
			System.out.print(tekst.charAt(tekst.length() - 1));
			antallTegn++;
		} else if (siste > 1 || siste < 0)
			System.out
					.println("\nVerdi for Int Siste er utenfor grensen(0 eller 1)");
	}

	public static void hjelpeMetode(String tekst) {
		if (tekst.length() > 1) {
			baklengs(tekst, 0);
		}
		if (tekst.length() == 1) {
			baklengs(tekst, 1);
		} else if (tekst.length() < 0)
			System.out.println("En feil har oppstaatt");
	}
}
