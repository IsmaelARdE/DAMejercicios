package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer1Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tabla[]= new double[5];
		
		System.out.println("Introduce 5 números decimales.");
		
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<tabla.length; i++) {
			
			tabla[i]=in.nextDouble();
			
			
		}
		
		for(int i=0; i<tabla.length; i++) {
		
			System.out.println(tabla[i]);
		
		}
		
		System.out.println("Otra forma de mostrar la tabla.");
		
		System.out.println(Arrays.toString(tabla));
	}

}
