
public class Base {
	private int a = 0, b = 0, c = 0, d = 0;
	private String res = "";

	public void calcular(int a, int b) {
		this.a = a;
		this.b = b;

		c = a % b;
		d = a / b;

		evaluar(c);

		while (d >= b) {
			c = d % b;
			d = d / b;
			evaluar(c);

		}
		evaluar(d);
		StringBuilder resultado = new StringBuilder(res).reverse();
		System.out.println(resultado);

	}

	public void evaluar(int x) {
		if (x == 10) {
			res += "A";
		} else if (x == 11) {
			res += "B";
		} else if (x == 12) {
			res += "C";
		} else if (x == 13) {
			res += "D";
		} else if (x == 14) {
			res += "E";
		} else if (x == 15) {
			res += "F";
		} else {
			res += x;
		}
	}

}
