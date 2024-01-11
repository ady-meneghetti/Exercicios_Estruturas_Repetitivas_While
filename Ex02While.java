import java.util.Locale;
import java.util.Scanner;

public class Ex02While {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);

		int x, y;
		String quadrante;
		x = 1;
		y = 1;
		quadrante = "";

		while (x != 0 && y != 0) {

			System.out.println("Digite valor de X: ");
			x = teclado.nextInt();

			System.out.println("Digite valor de Y: ");
			y = teclado.nextInt();

			if (x > 0 && y > 0)
				quadrante = "primeiro:Q1";

			if (x < 0 && y > 0)
				quadrante = "segundo:Q2";

			if (x < 0 && y < 0)
				quadrante = "terceiro:Q3";

			if (x > 0 && y < 0)
				quadrante = "quarto:Q4";

			else {
				quadrante = "-";
			}
		}

		System.out.println("Quadrante: " + quadrante);

	}
}
