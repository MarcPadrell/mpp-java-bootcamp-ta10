package ex04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacionesApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num_1 = 0;
		int num_2 = 0;
		int seleccion = 0;
		int num;

		do {

			try {

				System.out.println(
						"Si quieres (+,-,/,*) introduce el numero '1', sino el '2' para la raiz cuadrada y cubica: ");
				seleccion = sc.nextInt();
				sc.nextLine();

			} catch (InputMismatchException e) {
				System.out.println("No se ha conseguido reconocer la entrada. Introducce un numero correcto!");
				sc.nextLine();
			}

		} while (seleccion != 1 && seleccion != 2);

		switch (seleccion) {

		case 1:

			try {

				System.out.println("Valor numero 1 (entero): ");
				num_1 = sc.nextInt();
				System.out.println("Valor numero 2 (entero): ");
				num_2 = sc.nextInt();

				Operaciones op1 = new Operaciones(num_1, num_2);

				op1.suma();
				op1.resta();
				op1.multiplicacion();
				op1.division();

			} catch (ArithmeticException e) {
				System.out.println("Arithmetic exception: "+e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println(
						"No se ha conseguido reconocer la entrada. Introducce un numero correcto a la próxima!");
			}

			break;
		case 2:

			try {
				System.out.println("Valor numero (entero): ");
				num = sc.nextInt();

				Operaciones op2 = new Operaciones(num);

				op2.raizCuadrada();
				op2.raizCubica();
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic exception: "+e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println(
						"No se ha conseguido reconocer la entrada. Introducce un numero correcto a la próxima!");
			}

			break;

		}

		sc.close();

	}

}
