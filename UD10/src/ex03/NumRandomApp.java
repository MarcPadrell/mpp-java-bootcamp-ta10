package ex03;

import excepcionesCustom.ExcepcionesPropias;

public class NumRandomApp {

	public static void main(String[] args) throws ExcepcionesPropias {
		
		try {
		System.out.println("Generando n�mero aleatorio...");
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
