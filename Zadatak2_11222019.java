package domaci_11222019;

import java.util.Scanner;

public class Zadatak2_11222019 {

	public static int productArrayOdd(int[] array) {
		int product = 1;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0)
				product *= array[i];
		}
		return product;
	}

	public static int sumArrayEven(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0)
				sum += array[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava niz od n celih brojeva i dve metode. Prva
		 * metoda vraca proizvod elemenata na neparnim pozicijama, a druga vraca zbir
		 * parnih elemenata niza.
		 */
		Scanner scan = new Scanner(System.in);
		int n = 0;
		while (n < 2) {
			System.out.println("Unesite duzinu niza (min 2):");
			n = scan.nextInt();
		}
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". broj:");
			array[i] = scan.nextInt();
		}
		System.out.println("Proizvod elemenata na neparnim pozicijama u nizu je: " + productArrayOdd(array));
		System.out.println("Zbir elemenata na parnim pozicijama u nizu je: " + sumArrayEven(array));

	}

}
