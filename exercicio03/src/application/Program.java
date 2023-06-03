package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student std = new Student();

		std.name = sc.nextLine();
		std.x = sc.nextDouble();
		std.y = sc.nextDouble();
		std.z = sc.nextDouble();
		System.out.printf("%n");

		System.out.printf("FINAL GRADE = %.2f%n", std.total());
		if (std.total() >= 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", std.missing());
		}
		sc.close();
	}
}