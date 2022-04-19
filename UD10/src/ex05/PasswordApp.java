package ex05;

import java.util.Scanner;

public class PasswordApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el tamaño del array: ");
		int tamanyo = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduce la longitud de la contraseña: ");
		int longitud = sc.nextInt();
		
		String[] array_string = new String[longitud];
		Boolean[] array_boolean = new Boolean[longitud];
		Password[] array_password = new Password[tamanyo];

		for (int i = 0; i < array_password.length; i++) {
			array_password[i] = new Password(longitud, array_string);
		}

		for (int i = 0; i < array_password.length; i++) {
			array_boolean[i] = array_password[i].esFuerte(array_string);
			System.out.println("Contraseña" + (i + 1) + " " + array_boolean[i]);
			System.out.println("Contraseña: "+array_password[i].toString());
		}
		
		sc.close();

	}

}
