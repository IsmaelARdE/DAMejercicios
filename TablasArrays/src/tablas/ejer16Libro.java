package tablas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejer16Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int numElem = 0, max = 0, min = 0, media = 0, n = 0;
		ArrayList<Integer> sueldos = new ArrayList<>();
		//Creamos un arrayList que va creciendo conforme introducimos los sueldos. Porque no es posible hacer eso con un array normal.

		int entrada = 0;

		while (entrada != -1) {

			System.out.println("Introduce un sueldo.");
			entrada = in.nextInt();

			if (entrada != -1) {
				numElem++;
				sueldos.add(entrada); //Este es el comando para añadir los sueldos desde la variable int en la k lo introduces.
			}

		}

		int[] lista = new int[numElem];

		for (n = 0; n < numElem; n++) {
			lista[n] = sueldos.get(n); //con este comando guardo en lista lo que hay en el arraylist sueldos.
		}

		Arrays.sort(lista); //ordeno lista

		int[] lista_ordenada = new int[numElem];

		for (int i = numElem - 1; i >= 0; i--) {
			lista_ordenada[i] = lista[numElem - i - 1];
			//como tiene k estar en orden decreciente creo lista_ordenada. Ahí guardo los sueldos de lista empezando del último hasta el primero.
		}

		System.out.println("Muestro los sueldos ordenados:");
		System.out.println(Arrays.toString(lista_ordenada));
		
		
		max=lista_ordenada[0];
		min=lista_ordenada[numElem-1];
		
		System.out.println("El sueldo mayor es: "+max+" y el sueldo menor es: "+min);
		
		for(int i=0; i<numElem; i++) {
			media=media+lista_ordenada[i];
		}
		
		media=media/numElem;
		
		System.out.println("La media total de los sueldos es: "+media);
		
	}

}
