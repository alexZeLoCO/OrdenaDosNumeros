import java.util.Scanner;
public class OrdenaDosN�merosReales {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduzca un n�mero: ");
		double N1 = teclado.nextDouble();
		System.out.print("Introduzca un n�mero: ");
		double N2 = teclado.nextDouble();

		if (N1<N2) {
			System.out.printf("%f %f",N1,N2);
		} else { 
			System.out.printf("%f %f",N2,N1);

		}
	}
}