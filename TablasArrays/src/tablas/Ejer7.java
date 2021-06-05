package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   final int tam=6;
		int t1[] = new int[tam];
		int t2[] = new int[tam];
		

		Scanner in = new Scanner(System.in);

		System.out.println("Introduce la primera serie de 6 números.");
		for (int i = 0; i < t1.length; i++) {

			System.out.println("Introduzca número:");
			t1[i] = in.nextInt();

		}

		System.out.println("Introduce la segunda serie de 6 números.");
		for (int i = 0; i < t2.length; i++) {

			System.out.println("Introduzca número.");
			t2[i] = in.nextInt();
		}

		Arrays.sort(t1);
		Arrays.sort(t2);

		System.out.println("Tabla 1: " + Arrays.toString(t1));
		System.out.println("Tabla 2: " + Arrays.toString(t2));
		
		
		int tFinal[] = new int[tam*2];

		int indt1 = 1, indt2 = 1, indtFinal = 0;

		while (indt1 < tam && indt2< tam ) {

			if (t1[indt1] < t2[indt2]) {
				tFinal[indtFinal] = t1[indt1];
				indt1++;
			}

			else {

				tFinal[indtFinal] = t2[indt2];
				indt2++;
			}

			
			if(indt1== tam){
				while(indt2<tam) {
				tFinal[indtFinal]=t2[indt2];
				indt2++;
				indtFinal++;
				}
				
			}
			
			else {
				while(indt1<tam) {
					tFinal[indtFinal]=t1[indt1];
					indt1++;
					indtFinal++;
				}
			}
			
		}
		
		System.out.println("mostramos las dos tablas fusionadas: "+Arrays.toString(tFinal));

	}

}
