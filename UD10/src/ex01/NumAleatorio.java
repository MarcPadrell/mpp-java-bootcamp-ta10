package ex01;

/**
 * Clase que nos genera un numero aleatorio con los límites establecidos
 * @author marcp
 *
 */
public class NumAleatorio {
	
	private final int LIMITE_INF = 1;
	private final int LIMITE_SUP = 500;
	
	private int numero_random;

	public NumAleatorio() {
		this.numero_random = numeroAleatorio(LIMITE_INF, LIMITE_SUP);
	}
	
	private int numeroAleatorio(int inferior, int superior) {
		return (int) (Math.random() * (superior - inferior)) + inferior;
	}

	public int getNumero_random() {
		return numero_random;
	}

}
