package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle x;
		x = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();

		double areaX = x.area();
		double perimeterX = x.perimeter();
		double diagonalX = x.diagonal();

		System.out.println();
		System.out.printf("AREA = %.2f%n", areaX);
		System.out.printf("PERIMETER = %.2f%n", perimeterX);
		System.out.printf("DIAGONAL = %.2f%n", diagonalX);

		sc.close();
	}
}
