package ex02;

import excepcionesCustom.ExcepcionesPropias;

public class ExcpecionApp {

	public static void main(String[] args) {
		
		String mensaje = "Excpeci�n capturada con mensaje: Esto es un objeto Exception";

		try {
			System.out.println("Mensaje mostrado por pantalla");
			{
				throw new ExcepcionesPropias(mensaje);
			}
		} catch (ExcepcionesPropias e) {
			System.out.println(e);
			System.out.println("Programa terminado");
		}

	}

}
