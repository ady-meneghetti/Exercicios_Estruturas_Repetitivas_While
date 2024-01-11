import java.util.Locale;
import java.util.Scanner;

public class Ex01while {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);

		int senha = 0;

		while (senha != 2002) {
			System.out.println("Digite sua senha de 4 dígitos: ");
			senha = teclado.nextInt();

			if (senha != 2002)
				System.out.println("Senha Inválida");

			else
				System.out.println("Acesso Permitido");
		}
	}
}
