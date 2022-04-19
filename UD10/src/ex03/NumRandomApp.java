package ex03;

import excepcionesCustom.ExcepcionesPropias;

/**
 * Clase para utilizar la Excepcion de numero par e impar.
 * @author marcp
 *
 */
public class NumRandomApp {

	public static void main(String[] args) throws ExcepcionesPropias {
		
		try {
		System.out.println("Generando número aleatorio...");
		NumRandom num_random1 = new NumRandom();
		System.out.println("El numero aleatorio generado es: "+num_random1.getNumero_random());
		{
			throw new ExcepcionesPropias(num_random1.getNumero_random());
		}
		}catch (ExcepcionesPropias e) {
			System.out.println(e.getMessage());
		}

	}

}
