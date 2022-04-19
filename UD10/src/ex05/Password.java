package ex05;

public class Password {

	// Constantes
	final private int LONGITUD = 8;

	// Atributos
	private int longitud;
	private String contrase�a;

	// Constructor por defecto
	public Password() {
		this.longitud = LONGITUD;
		this.contrase�a = "";
	}

	// Constructor creando la password aleatoria con la longitud indicada.
	public Password(int longitud, String[] array) {
		this.longitud = longitud;
		this.contrase�a = passwordRandom(longitud, array);
	}

	/**
	 * Funci�n para generar una contrase�a aleatoria con la longitud
	 */
	public String passwordRandom(int longitud, String[] array_contra) {

		String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String contra = "";
		String character = "";

		for (int i = 0; i < longitud; i++) {
			character = "" + banco.charAt((int) (Math.random() * 62));
			contra += character;
			array_contra[i] = contra;
			character = "";
		}

		return contra;
	}

	public boolean esFuerte(String[] array) {

		int cont_mayus = 0;
		int cont_minus = 0;
		int cont_num = 0;

		for (int i = 0; i < this.longitud; i++) {
			if (array[i].equals(array[i].toUpperCase())) {
				cont_mayus++;
			} else if (array[i].equals(array[i].toLowerCase())) {
				cont_minus++;
			} else {
				cont_num++;
			}
		}

		if (cont_mayus > 5 && cont_minus > 1 && cont_num > 5) {
			return true;
		} else {
			return false;
		}

	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}

}
