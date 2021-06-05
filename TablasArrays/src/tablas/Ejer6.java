package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int puntuacion[] = new int[8];
		int a = 0;

		for (int i = 0; i <= 5; i++) {

			System.out.println("Introduce la puntación");
			a = in.nextInt();

			puntuacion[i] = a;

		}

		for (int i = 5; i < 8; i++) {
			System.out.println("Se añaden participantes nuevos?? Si no es así introducir -1.");
			a = in.nextInt();
			
			
			if (a == -1) {
				System.out.println("Terminó el torneo.");
				break;
			}

			
			puntuacion[i] = a;

		}

		Arrays.sort(puntuacion);

		System.out.println(Arrays.toString(puntuacion));

	}

}
