package excepcionesCustom;

public class ExcepcionesPropias extends Exception {

	private String mensaje;
	private int numero_random;

	public ExcepcionesPropias(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public ExcepcionesPropias(int numero_random) {
		super();
		this.numero_random = numero_random;
	}

	public String getMessage() {

		if (this.numero_random % 2 == 0) {
			return "Es par";
		} else {
			return "Es impar";
		}

	}

	@Override
	public String toString() {
		return mensaje;
	}

}
