import java.util.InputMismatchException;
import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Zadejte stranu n�doby(dm): ");
		while (true) {
			try {
				int strana = in.nextInt();
				System.out.print("Zadejte stav n�doby(l): ");

				while (true) {
					try {
						int l = in.nextInt();
						KrychlovaNadoba jedna = new KrychlovaNadoba(strana, l, in);

						jedna.info();
						while (true) {
							System.out.print("Zadejte zmenu: ");

							try {
								int zmena = in.nextInt();
								;
								jedna.plusL(zmena, in);
							} catch (InputMismatchException e) {

							}
						}

					} catch (InputMismatchException e) {
						System.out.print("Zadejte stav n�doby(l): ");
						in.nextLine();
					}
				}

			} catch (InputMismatchException e) {
				System.out.print("Zadejte stranu n�doby(dm): ");
				in.nextLine();
			}
		}

	}

}
