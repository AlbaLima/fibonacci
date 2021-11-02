package fibonacci;

public class Fibonacci {

	public int metodoFibonacci(int limite) {
		if (limite < 2) {
			return limite;
		} else {
			return this.metodoFibonacci(limite - 1) + this.metodoFibonacci(limite - 2);
		}
	}

}
