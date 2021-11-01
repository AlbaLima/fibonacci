package fibonnaci;

import java.util.Scanner;

public class Fibonnaci {

	public int metodoFibonacci(int limite) {
		int posicion1 = 0;
		int posicion2 = 1;
		int posicion3 = 0;
		for (int i = 1; i <= limite; i++) {
			posicion3 = posicion2 + posicion1;
			posicion1 = posicion2;
			posicion2 = posicion3;
		}

		return posicion3;

	}

}
