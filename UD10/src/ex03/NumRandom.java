package ex03;

/**
 * Clase que nos genera un numero aleatorio con los límites establecidos
 * @author marcp
 *
 */
public class NumRandom {
	
	private final int LIMITE_INF = 0;
	private final int LIMITE_SUP = 999;
	
	private int numero_random;
	
	// Constructor por defecto
	public NumRandom() {
		this.numero_random = numeroAleatorio(LIMITE_INF, LIMITE_SUP);
	}
	
	// Metodo para generar el metodo aleatorio
	private int numeroAleatorio(int inferior, int superior) {
		return (int) (Math.random() * (superior - inferior)) + inferior;
	}

	public int getNumero_random() {
		return numero_random;
	}

}
