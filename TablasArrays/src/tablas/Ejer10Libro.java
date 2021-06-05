package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, contP = 0, contI = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el número de longitud para la tabla. ");

		n = in.nextInt();

		System.out.println("La tabla tendrá una longitud de " + n);

		int t[] = new int[n];

		System.out.println("Ahora introduce los número enteros que ocuparán la tabla.");

		for (int i = 0; i <= t.length - 1; i++) {

			t[i] = in.nextInt();

		}

		System.out.println("Ya tenemos la tabla con estos números introducidos: " + Arrays.toString(t));

		// cuentos cuantos números pares e impares hay.
		for (int i = 0; i <= t.length - 1; i++) {

			if (t[i] % 2 == 0) {

				contP++;

			} else {

				contI++;
			}
		}

		// creo dos tablas con la longitud según los pares e impares k hay.
		int pares[] = new int[contP];
		int impares[] = new int[contI];

		// recorro la tabla t e introduzco según sean pares o impares en una u otra
		// tabla.

		int c = 0;
		int b=0;
		for (int j = 0; j < t.length; j++) {

			if (t[j] % 2 == 0) {

				pares[c] = t[j];
				c++;

			}

		}

		for (int x = 0; x < t.length; x++) {
			if (t[x] % 2 != 0) {
				impares[b] = t[x];
				b++;
			}

		}

		System.out.println("Tabla de los pares. " + Arrays.toString(pares));
		System.out.println("Tabla de los impares. " + Arrays.toString(impares));

	}

}
