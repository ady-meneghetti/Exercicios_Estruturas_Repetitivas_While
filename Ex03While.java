import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class Ex03While {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);

		int combustivel, gasolina, alcool, diesel;

		gasolina = 0;
		alcool = 0;
		diesel = 0;

		System.out.println("Digite o combustivel de preferencia: ");
		combustivel = teclado.nextInt();

		while (combustivel != 0) {
			
			combustivel = teclado.nextInt();

			if (combustivel < 0 || combustivel > 4) {
				System.out.println("Entrada Invalida");
			} else if (combustivel == 1) {
				gasolina+=1;
			} else if (combustivel == 2) {
				alcool+=1;
			} else if (combustivel == 3) {
				diesel+=1;
			} else {
				combustivel = 0;
			}

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Alcool: " + alcool);
		System.out.println("Dieses: " + diesel);

	}

}
