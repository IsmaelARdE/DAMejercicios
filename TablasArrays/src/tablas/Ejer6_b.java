package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer6_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int puntuacion[] = new int[8];

		for (int i = 0; i < 8; i++) {

			if (i <= 4) {
				System.out.println("Introduce la puntación");
				puntuacion[i] = in.nextInt();
			}

			else {
				System.out.println("Se unnen..");
				puntuacion[i] = in.nextInt();

				if (puntuacion[i] == -1) {
					puntuacion[i] = 0;
				}

			}

		}

		Arrays.sort(puntuacion);

		System.out.println(Arrays.toString(puntuacion));

	}

}
