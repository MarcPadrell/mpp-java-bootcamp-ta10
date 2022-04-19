package ex03;

public class NumRandom {
	
	private final int LIMITE_INF = 0;
	private final int LIMITE_SUP = 999;
	
	private int numero_random;

	public NumRandom() {
		this.numero_random = numeroAleatorio(LIMITE_INF, LIMITE_SUP);
	}
	
	private int numeroAleatorio(int inferior, int superior) {
		return (int) (Math.random() * (superior - inferior)) + inferior;
	}

	public int getNumero_random() {
		return numero_random;
	}

}
