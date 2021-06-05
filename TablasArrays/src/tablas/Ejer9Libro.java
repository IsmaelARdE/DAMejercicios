package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer9Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		double mediaAl = 0;
		int TAM = 5;
		int primerT[] = new int[TAM];
		int segundoT[] = new int[TAM];
		int tercerT[] = new int[TAM];
		int pos;

		for (int i = 0; i < TAM; i++) {

			System.out.println("Introducir notas del primer trimestre.");
			primerT[i] = in.nextInt();
			System.out.println("Introducir notas del segundo trimestre.");
			segundoT[i] = in.nextInt();
			System.out.println("Introducir notas del tercer trimestre.");
			tercerT[i] = in.nextInt();

		}

		System.out.println("Notas del primer trimestre: " + Arrays.toString(primerT));
		System.out.println("Notas del segundo trimestre: " + Arrays.toString(segundoT));
		System.out.println("Notas del tercero trimestre: " + Arrays.toString(tercerT));

		leerNotas(mediaAl, primerT);
		leerNotas(mediaAl, segundoT);
		leerNotas(mediaAl, tercerT);

		System.out.println("Elige el número de alumno del que deseas saber la media");
		pos = in.nextInt();

		if (pos >= 0) {
			mediaAl = 0;
			mediaAl = primerT[pos];
			mediaAl = mediaAl + segundoT[pos];
			mediaAl = mediaAl + tercerT[pos];
			mediaAl = mediaAl / 3;
			System.out.println("La media del alumno es: " + mediaAl);
		} else {
			System.out.println("ERROR; No existe ese número de alumno.");
		}

	}

	public static void leerNotas(double mediaAl, int[] t) {
		for (int i = 0; i < t.length; i++) {

			int nota = 0;

			nota = t[i];
			mediaAl = nota + mediaAl;

			if (i == t.length - 1) {

				mediaAl = mediaAl / 5;
				System.out.println("Media de alumnos del trimestre: " + mediaAl);
			}
		}
	}

}
