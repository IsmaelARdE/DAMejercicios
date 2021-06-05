package tablas;

import java.util.Arrays;

public class Ejer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sin[], con[] = { 1, 2, 3, 2, 1, 3, 4, 2, 3, 5 };

		sin = sinRepetidos(con);
		System.out.println(Arrays.toString(sin));

	}

	public static int[] sinRepetidos(int[] t) {

		int copia[] = Arrays.copyOf(t, t.length);
		int i = 0;
		int numElem = copia.length;

		while (i < numElem) {

			int aBuscar = copia[i];
			int j = 0;

			while (j < i && copia[j] != aBuscar) {

				j++;
			}

			if (j < i) {
				copia[i] = copia[numElem - 1];
				numElem--;

			} else {
				i++;
			}
		}

		return Arrays.copyOf(copia, numElem);
	}

}
