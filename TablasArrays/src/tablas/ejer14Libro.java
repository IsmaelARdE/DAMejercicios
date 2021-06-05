package tablas;

import java.util.Scanner;

public class ejer14Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int numeros[] = new int[6];
		int n = 0;

		int t[] = { 22, 17, 1, 31, 14, 2 };

		System.out.println("Introduce tus 6 números para jugar la primitiva.");
		for (int i=0; i<numeros.length; i++ ) {

			numeros[i] = in.nextInt();
		}

		n = primitiva(numeros, t);

		if (n == 6) {
			System.out.println("HAS GANADO LA PRIMITIVA. ENORABUENA. "+n+" aciertos");
		} else {
			System.out.println("No premiado. Has acertado: "+n+" números");
		}

	}

	public static int primitiva(int[] apuesta, int[] t) {
		int aciertos = 0;
		for (int i=0; i<apuesta.length; i++) {
			if (t[i] == apuesta[i]) {
				System.out.println("Numero acertado: " + apuesta[i]);
				aciertos++;
			}
		}
		return aciertos;
	}
}
