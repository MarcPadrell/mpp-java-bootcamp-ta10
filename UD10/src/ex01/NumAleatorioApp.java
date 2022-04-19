package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * App para adivinar el numero aleatorio generado, verificando el funcionamiento con try y catch.
 * @author marcp
 *
 */
public class NumAleatorioApp {

	public static void main(String[] args) {

		NumAleatorio num_aleatorio1 = new NumAleatorio();
		System.out.println("Numero aleatorio es: " + num_aleatorio1.getNumero_random());
		Scanner sc = new Scanner(System.in);
		int numero_escrito = 0;
		int contador = 0;
		boolean acertado = false;
		
		// Bucle del cual no salimos hasta que acierte el numero.
		do {

			try {
				System.out.println("Introduce el numero para intentar adivinarlo: ");
				numero_escrito = sc.nextInt();

				if (numero_escrito == num_aleatorio1.getNumero_random()) {
					acertado = true;
				} else if (numero_escrito > num_aleatorio1.getNumero_random()) {
					System.out.println("El numero a adivinar es menor al introducido!");
				} else {
					System.out.println("El numero a adivinar es mayor al introducido!");
				}

				contador++;

			} catch (InputMismatchException e) {
				System.out.println("No se ha conseguido reconocer la entrada.");
				sc.nextLine();
				contador++;
			}

		} while (!acertado);

		System.out.println("Has acertado el numero!! Era el " + num_aleatorio1.getNumero_random()
				+ " enhorabuena!! Lo has intentado " + contador + " veces.");
		sc.close();

	}

}
