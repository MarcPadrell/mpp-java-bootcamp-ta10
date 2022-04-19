package ex02;

import excepcionesCustom.ExcepcionesPropias;

/**
 * Clase para lanzar un objeto de la Excepcion Propia
 * @author marcp
 *
 */
public class ExcpecionApp {

	public static void main(String[] args) {
		
		String mensaje = "Excpeción capturada con mensaje: Esto es un objeto Exception";

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
