package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer2Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num;
		
		System.out.println("Cu�ntos n�meros desea introducir????");
		
		
		Scanner in = new Scanner(System.in);
		
		num=in.nextInt();
		
		int tabla[]= new int[num];
		
		System.out.println("Ahora introduzca los n�meros.");
		
		for(int i=0; i<tabla.length; i++) {
			
			tabla[i]=in.nextInt();
			
		}
		
		
		for(int i=tabla.length-1; i>=0; i--) {
			
			System.out.println("Los n�meros introducidos en la tabla: "+tabla[i]);
		}
	}

}
