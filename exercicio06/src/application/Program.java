package application;

//principal class 
import java.util.Locale;
import java.util.Scanner;
import entities.BoardingSchool;

public class Program {

	public static void main(String[] args) {

		// BoardingSchool bs;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		BoardingSchool[] rent = new BoardingSchool[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[room-1] = new BoardingSchool(name, email);
			System.out.println();
		}

		System.out.printf("Busy rooms:\n");

		for (int i = 0; i < 10; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		sc.close();
	}
}
