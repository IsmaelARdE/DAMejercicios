package tablas;

import java.util.Arrays;

public class ejer12Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int t[][] = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				t[i][j]=i+j;
			}
			
		}
		
		//Para mostrar la tabla como una matriz tridimensional debo recorrerla de esta manera
		//Meto una impresión con salto de linea recorriendo
		System.out.println("Mostramos la tabla: ");
		for(int n=4; n>=0; n--) {
			System.out.println();
			for(int m=4; m>=0; m--) {
				System.out.print(t[n][m]+ " ");
			}
			
		}

	
	}
}
