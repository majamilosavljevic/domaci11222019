package domaci_11222019;

import java.util.Scanner;

public class Zadatak1_11222019 {

	public static double product3numb(double a, double b, double c) {

		double product = a * b * c;
		return product;
	}

	public static void min3numb(double a, double b, double c) {

		double min = a;
		if (b < a)
			min = b;
		if (c < a && c < b)
			min = c;

		System.out.println("Najmanji broj od unetih brojeva je " + min);
	}

	public static void main(String[] args) {
		/*
		 * Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		 * metode(u mainu). Prva metoda vraca proizvod unetih brojeva. Druga metoda
		 * ispisuje najmanji od unesenih brojeva.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Unesite tri broja:");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		System.out.println("Proizvod unetih brojeva je: " + product3numb(n1, n2, n3));
		min3numb(n1, n2, n3);

	}

}
