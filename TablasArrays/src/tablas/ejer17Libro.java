package tablas;

import java.util.Arrays;

public class ejer17Libro {
	public static void main(String[] args) {

		int tablaOriginal[] = { 3, 5, 1, 4 };

		int tablaIndices[] = new int[tablaOriginal.length];
		int numElem = tablaOriginal.length, n = 0;

		int copia[] = new int[tablaOriginal.length];

		int descendente[] = new int[tablaOriginal.length];

		copia = Arrays.copyOf(tablaOriginal, tablaOriginal.length);
		Arrays.sort(copia);

		for (int i = copia.length - 1; i >= 0; i--) {
			descendente[i] = copia[copia.length - i - 1];
		}
		System.out.println("Mostramos la tabla ordenada:");
		System.out.println(Arrays.toString(descendente));

		for (int i = 0; i < numElem; i++) {
			for (int j = 0; j < numElem; j++) {
				if (tablaOriginal[i] == descendente[j]) {
					tablaIndices[n] = j;
					n++;
				}
			}

		}

		System.out.println("Muestro la tabla original:");
		System.out.println(Arrays.toString(tablaOriginal));
		System.out.println(
				"Ahora muestro el índice de la tabla, es decir la posición que deberían llevar si a tabla esta ordenada:");
		System.out.println(Arrays.toString(tablaIndices));

	}
}
